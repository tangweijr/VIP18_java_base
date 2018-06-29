package innerClass21080420;

public class AnnoyInnerClessTest {
    public static void main(String[] args) {
        PrintInfo printInfo=new PrintInfo() {
            @Override
            public void printInfo(String s) {
                System.out.println("常规方案：" + s);
            }
        };
        printInfo.printInfo("method 1");
        PrintInfo printInfo1 = (s -> System.out.println("Lambda表达式：" + s));
        printInfo1.printInfo("method 2");
    }
}
