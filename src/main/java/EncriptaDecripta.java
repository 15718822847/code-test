import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;

public class EncriptaDecripta {

    static String IV = "ABCDEFGHIJKLMNAA";
    static String encryptKey = "0123456789pstkey";

/*    public static void main(String [] args) {

        try {

            try {
                // 巴西公司的portal 传过来的值就是这种格式。
                String s3 = "[15,31,-109,38,100,-35,12,103,92,47,107,63,-51,-5,46,111,-33,82,90,-26,101,6,21,-3,-107,110,110,-115,-67,101,-42,115]";

                // 二进制字符串转换为base64
                String textodecriptado = decrypt(receiveParam(s3), encryptKey);
                //textodecriptado 时base64 加密过的用户名和密码。
                // 使用代码解密base64 的textodecriptado 。 关于base64解密网上有很多例子， 不再说明。

                System.out.println(textodecriptado);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }*/

    public static byte[] encrypt(String textopuro, String chaveencriptacao) throws Exception {
        Cipher encripta = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        SecretKeySpec key = new SecretKeySpec(chaveencriptacao.getBytes("UTF-8"), "AES");
        encripta.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(IV.getBytes()));
        return encripta.doFinal(textopuro.getBytes());
    }

    public static String decrypt(byte[] textoencriptado, String chaveencriptacao) throws Exception{
        Cipher decripta = Cipher.getInstance("AES/CBC/PKCS5Padding", "SunJCE");
        SecretKeySpec key = new SecretKeySpec(chaveencriptacao.getBytes(), "AES");
        decripta.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(IV.getBytes()));
        return new String(decripta.doFinal(textoencriptado));
    }

    private static byte[] receiveParam(String response){
        String[] byteValues = response.substring(1, response.length() - 1).split(",");
        byte[] bytes = new byte[byteValues.length];

        for (int i=0, len=bytes.length; i<len; i++) {
            bytes[i] = Byte.parseByte(byteValues[i].trim());
        }

        return bytes;
    }

}