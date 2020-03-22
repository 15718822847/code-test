import java.util.Base64;

public class byteToString {

    public static String bToS(String username, String password) throws Exception {
        Base64.Encoder encoder = Base64.getEncoder();
        String text = username+":"+password;
        byte[] textByte = text.getBytes();
        String base64 = encoder.encodeToString(textByte);
        byte[] enCode = EncriptaDecripta.encrypt(base64, "0123456789pstkey");
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i=0, len=enCode.length; i<len; i++) {
            sb.append(enCode[i]+",");
        }
        String a =sb.toString();
        String result = sb.toString().substring(0,a.length()-1)+"]";
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) throws Exception{
        //5000004251:11111111  [124,-19,29,57,-19,-16,44,-37,-69,86,98,-116,-93,84,-84,-93,-117,-6,-31,36,-103,-40,31,114,84,94,64,3,60,-80,18,-11]
        //5417481440:s1gtU@t   [55,-97,-66,2,-22,-112,99,-36,-92,-93,76,-75,65,-90,20,-25,53,-94,-4,-16,-82,-94,-20,-99,-74,-86,-53,-3,-24,-22,39,67]
        bToS("5417481440","s1gtU@t");

    }
}
