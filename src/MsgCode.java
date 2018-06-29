import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 短信发送
 */
public class MsgCode {

    public void sendYzm(String phoneNumber,String code) throws Exception {
        URL url=new URL("http://v.juhe.cn/sms/send?mobile="+phoneNumber
                +"&tpl_id=52299&tpl_value=%23code%23%3D"+code+"&key=b0812580c365cf1a06939bfe4fb79ab0");
        InputStream inputStream=url.openConnection().getInputStream();
        InputStreamReader bufferedInputStream=new InputStreamReader(inputStream);
        BufferedReader bufferedReader=new BufferedReader(bufferedInputStream);
        String line=null;
        while((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }

    }

    public void sendYue(String phoneNumber,String yue){

    }


    public static void main(String[] args) throws Exception {

        MsgCode msgCode=new MsgCode();
        msgCode.sendYzm("13913008396","看你能不能收到(by tangwei)");


    }
}
