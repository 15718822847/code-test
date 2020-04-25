import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.HashMap;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        /*System.out.println("11");
        String a = "";
        if (a == null || a.isEmpty()) {
            System.out.println("---");
        }
        String url = "http://10.129.105.142:7003/user-portal-api/auth/auth_user";
        String result = HttpClientUtil.doGet(url);
        JsonObject object = (JsonObject) new JsonParser().parse(result);
        JsonElement code = object.get("code");
        JsonElement res = object.get("result");
        JsonObject object1 =  object.getAsJsonObject("result");
        JsonElement username = object1.get("username");
        System.out.println(object);*/
        //HashMap hashMap = new HashMap();
        //hashMap.
        /*Map<String, String> a = new HashMap<String, String>() {{
            put("a","b");
        }
        };*/
        /*Map<String, String> a = new HashMap<String, String>();
        Map<String, String> b = new HashMap<String, String>();
        b.put("a","b");
        a.putAll(b);
        Map map = MapPut.getHash((mp)->mp.put("a", "b").put("c", "d").putImpl("1","2"));
        map.toString();*/

        String a = "CN:100,CN-1:200,CN-1:200,V%:0.5";
        int x = a.lastIndexOf(",");
        String back = a.substring(x);
        String front = a.substring(0,x);
        int xx = front.lastIndexOf(",");
        String front1 = front.substring(0,xx);
        String result = front1+back;
        System.out.println(result);
    }
}
