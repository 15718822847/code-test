import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import jdk.nashorn.internal.parser.JSONParser;

public class test {

    public static void main(String[] args) {
        System.out.println("11");
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
        System.out.println(object);
    }
}
