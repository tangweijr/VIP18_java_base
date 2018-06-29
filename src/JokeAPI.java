import com.google.gson.Gson;

import java.io.*;
import java.net.URL;

public class JokeAPI {
    //内部类
    class Result {
        public String content;
        public String hashId;
        public long unixtime;
    }

    //API接口的json数据——>类
    public String reason;
    public Result[] result = new Result[2];
    public int error_code;


    public static final String APPKEY = "772a3d97580aa5cfb4b616777b3e14a9";

    public void randomJoke() throws Exception {
        //凯哥的代码
        URL url = new URL("http://v.juhe.cn/joke/randJoke.php?key=" + APPKEY);
        InputStream inputStream = url.openConnection().getInputStream();
        InputStreamReader bufferedInputStream = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(bufferedInputStream);
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);

            //Gson解析json数据，逐条打印
            Gson gson = new Gson();
            JokeAPI instanceJoke = gson.fromJson(line, JokeAPI.class);
            for (int i = 0; i < instanceJoke.result.length; i++) {
                //使用正则表达式分行
                System.out.println("No." + (i + 1) + "'s joke:\n\t" +
                        instanceJoke.result[i].content.replaceAll("\\s+", "\n\t"));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        JokeAPI test = new JokeAPI();
        test.randomJoke();
// 测试gson的基本用法
//        String test = "{\"reason\":\"success\"}";
//        Gson gson = new Gson();
//        BankTest test1 = gson.fromJson(test, BankTest.class);
//        System.out.println(test1.reason);
    }
}
