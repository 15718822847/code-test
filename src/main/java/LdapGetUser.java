import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.*;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class LdapGetUser {

    public LdapGetUser(String dn, String employeeID) {
        int[] a = new int[12];
        Integer[] b = new Integer[5];
        b[2] = 4;
        a[1] = 2;
        a[5] = 2;
        System.out.println(a);

        int i = 0;
        for (int j=0;j<a.length;j++) {
            if (j+2<a.length) {
                if (a[j]+ a[j+1] + a[j+2] == 0) {
                    i++;
                }
            }

        }
        System.out.println(i);
        //init();
        // add();//添加节点
        // delete("ou=hi,dc=example,dc=com");//删除"ou=hi,dc=example,dc=com"节点
        // renameEntry("ou=new,o=neworganization,dc=example,dc=com","ou=neworganizationalUnit,o=neworganization,dc=example,dc=com");//重命名节点"ou=new,o=neworganization,dc=example,dc=com"
        //searchInformation("ou=People,dc=oud,dc=minfin,dc=lan", "",
         //"objectClass=person");//遍历所有根节点
       // modifyInformation(dn, employeeID);// 修改
       //  Ldapbyuserinfo("guob");//遍历指定节点的分节点
       // close();
    }

    DirContext dc = null;
    String root = "dc=oud,dc=minfin,dc=lan"; // LDAP的根节点的DC

    public void init() {
        Hashtable env = new Hashtable();
            String LDAP_URL = "ldap://10.129.105.128:1389/"; // LDAP访问地址
            String adminName = "cn=Directory Manager"; // 注意用户名的写法：domain\User或
            String adminPassword = "Passw0rd2017"; // 密码
            env.put(Context.INITIAL_CONTEXT_FACTORY,
                         "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, LDAP_URL);
            env.put(Context.SECURITY_AUTHENTICATION, "simple");
            env.put(Context.SECURITY_PRINCIPAL, adminName);
            env.put(Context.SECURITY_CREDENTIALS, adminPassword);
            try {
                    dc = new InitialDirContext(env);// 初始化上下文
                    System.out.println("认证成功");// 这里可以改成异常抛出。
                } catch (javax.naming.AuthenticationException e) {
                    System.out.println("认证失败");
                } catch (Exception e) {
                    System.out.println("认证出错：" + e);
                }
        }


    public void Ldapbyuserinfo(String userName) {
             // Create the search controls
             SearchControls searchCtls = new SearchControls();
             // Specify the search scope
             searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
             // specify the LDAP search filter
             String searchFilter = "sAMAccountName=" + userName;
             // Specify the Base for the search 搜索域节点
             String searchBase = "dc=oud,dc=minfin,dc=lan";
             int totalResults = 0;
             String returnedAtts[] = { "url", "whenChanged", "employeeID", "name",
                          "userPrincipalName", "physicalDeliveryOfficeName",
                          "departmentNumber", "telephoneNumber", "homePhone", "mobile",
                          "department", "sAMAccountName", "whenChanged", "mail" }; // 定制返回属性

             searchCtls.setReturningAttributes(returnedAtts); // 设置返回属性集

             // searchCtls.setReturningAttributes(null); // 不定制属性，将返回所有的属性集

             try {
                     NamingEnumeration answer = dc.search(searchBase, searchFilter,
                                 searchCtls);
                     if (answer == null || answer.equals(null)) {
                 System.out.println("answer is null");
             } else {
                 System.out.println("answer not null");
             }
         while (answer.hasMoreElements()) {
                 SearchResult sr = (SearchResult) answer.next();
                 System.out
                         .println("************************************************");
                 System.out.println("getname=" + sr.getName());
                 Attributes Attrs = sr.getAttributes();
                 if (Attrs != null) {
                         try {

                                 for (NamingEnumeration ne = Attrs.getAll(); ne
                                         .hasMore();) {
                                                Attribute Attr = (Attribute) ne.next();
                                                System.out.println("AttributeID="
                                                             + Attr.getID().toString());
                                                // 读取属性值
                                                for (NamingEnumeration e = Attr.getAll(); e
                                                        .hasMore(); totalResults++) {
                                                    String user = e.next().toString(); // 接受循环遍历读取的userPrincipalName用户属性
                                                    System.out.println(user);
                                                }
                                                // System.out.println(" ---------------");
                                                // // 读取属性值
                                                // Enumeration values = Attr.getAll();
                                                // if (values != null) { // 迭代
                                                // while (values.hasMoreElements()) {
                                                // System.out.println(" 2AttributeValues="
                                                // + values.nextElement());
                                                // }
                                                // }
                                                // System.out.println(" ---------------");
                                            }
                                } catch (NamingException e) {
                                    System.err.println("Throw Exception : " + e);
                                     }
                     }
                 }
                     System.out.println("Number: " + totalResults);
                 } catch (Exception e) {
                     e.printStackTrace();
                     System.err.println("Throw Exception : " + e);
                 }
         }

    public void searchInformation(String base, String scope, String filter) {
         SearchControls sc = new SearchControls();
         if (scope.equals("base")) {
                 sc.setSearchScope(SearchControls.OBJECT_SCOPE);
             } else if (scope.equals("one")) {
                 sc.setSearchScope(SearchControls.ONELEVEL_SCOPE);
             } else {
                 sc.setSearchScope(SearchControls.SUBTREE_SCOPE);
             }
         NamingEnumeration ne = null;
         try {
                 ne = dc.search(base, filter, sc);
             int i = 0;
             int j = 0;
                 // Use the NamingEnumeration object to cycle through
                 // the result set.
                 while (ne.hasMore()) {
                         System.out.println();
                         SearchResult sr = (SearchResult) ne.next();
                         String name = sr.getName();
                         if (base != null && !base.equals("")) {
                           System.out.println("entry: " + name + "," + base);
                       } else {
                           System.out.println("entry: " + name);
                       }

                   Attributes at = sr.getAttributes();
                   NamingEnumeration ane = at.getAll();

                   while (ane.hasMore()) {

                           Attribute attr = (Attribute) ane.next();
                           String attrType = attr.getID();
                  NamingEnumeration values = attr.getAll();
                  Vector vals = new Vector();
                  // Another NamingEnumeration object, this time
                  // to iterate through attribute values.
                  while (values.hasMore()) {
                      j++;
                          Object oneVal = values.nextElement();
                          if (oneVal instanceof String) {
                                  System.out.println(attrType + ": "
                                                  + (String) oneVal);
                              } else {
                                  System.out.println(attrType + ": "
                                                  + new String((byte[]) oneVal));
                              }
                                       }
                               }
                   System.out.println("-------------------------------------------"+i);
                     System.out.println("-------------------------------------------"+j);
                      }
                  } catch (Exception nex) {
                      System.err.println("Error: " + nex.getMessage());
                      nex.printStackTrace();
                  }
        }
    public void close() {
        if (dc != null) {
                try {
                        dc.close();
                    } catch (NamingException e) {
                        System.out.println("NamingException in close():" + e);
                    }
            }



}
    public static void main(String[] args) {
        new LdapGetUser("CN=RyanHanson", null);
    }
}
