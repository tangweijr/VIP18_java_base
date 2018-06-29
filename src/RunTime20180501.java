import java.io.IOException;

public class RunTime20180501 {
    public static void main(String[] args) throws IOException {
        // 打开记事本
        Process notepad = Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
        // 打开cmd，ping百度
        String[] cmdCommand = {"C:\\Windows\\System32\\cmd.exe", "/c", "start", "ping", "202.108.22.5"};
        Process cmd = Runtime.getRuntime().exec(cmdCommand);
        // 打开cmd，打开百度
        cmdCommand = new String[]{"C:\\Windows\\System32\\cmd.exe", "/c", "start", "http://www.baidu.com"};
        cmd = Runtime.getRuntime().exec(cmdCommand);
    }
}
