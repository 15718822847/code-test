import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class getNifInfo {
    public static void main(String[] args) throws IOException {
        //第一步：创建服务地址
        URL url = new URL("http://10.129.106.156:7003/sigt-external-api/ws/");
        //第二步：打开一个通向服务地址的连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //第三步：设置参数
        //3.1发送方式设置：POST必须大写
        connection.setRequestMethod("POST");
        //3.2设置数据格式：content-type
        connection.setRequestProperty("content-type", "text/xml;charset=utf-8");
        connection.setRequestProperty("Authorization", "Basic c2lndC5zZXRpYzpzM3QxYyEwMQ==");
        //Basic NzQwMTAxMDM2NDplZUZGZTVVYnlv
        //Basic c2lndC5zZXRpYzpzM3QxYyEwMQ==
        //3.3设置输入输出，因为默认新创建的connection没有读写权限，
        connection.setDoInput(true);
        connection.setDoOutput(true);

        //第四步：组织SOAP数据，发送请求
        String soapXML = getXML("LNIF", "34567545433");
        //将信息以流的方式发送出去
        OutputStream os = connection.getOutputStream();
        os.write(soapXML.getBytes());
        //第五步：接收服务端响应，打印
        int responseCode = connection.getResponseCode();
        if (200 == responseCode) {//表示服务端响应成功
        //获取当前连接请求返回的数据流
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            StringBuilder sb = new StringBuilder();
            String temp = null;
            while (null != (temp = br.readLine())) {
                sb.append(temp);
            }

            /**
             * 打印结果
             */
            System.out.println(sb.toString());

            is.close();
            isr.close();
            br.close();
        }
        os.close();
    }


    public static String getXML(String type, String nif) {

        /*String soapXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                +"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2003/XMLSchema-instance\" "
                +"xmlns:web=\"http://WebXml.com.cn/\"  "
                +"xmlns:xsd=\"http://www.w3.org/2003/XMLSchema\" "
                +"xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                +"<soap:Body>"
                +"<web:getMobileCodeInfo>"
                +phone
                +"</web:getMobileCodeInfo>"
                +"</soap:Body>"
                +"</soap:Envelope>";*/

        String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ws=\"http://tistech.co.ao/ws\">"
                + "<soapenv:Header/>"
                + "    <soapenv:Body>"
                + "        <ws:getTaxpayerRequest>"
                + "            <ws:tipoDocumento>" + type + "</ws:tipoDocumento>"
                + "            <ws:numeroDocumento>" + nif + "</ws:numeroDocumento>"
                + "        </ws:getTaxpayerRequest>"
                + "    </soapenv:Body>"
                + "</soapenv:Envelope>";
        return xml;
    }


}
