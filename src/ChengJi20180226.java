import java.util.Scanner;

enum ScoreLevel{
    A,B,C,D,E;
}

/**
 * 使用switch case进行简单的成绩判断
 * @since 20180226
 * @author tangweijr
 */
public class ChengJi20180226 {
    public static void main(String[] args) {
        System.out.print("请输入你的成绩：");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        switch (score/10) {
            case 10:
            case 9:
                System.out.println("成绩是" + ScoreLevel.A.toString());
                break;
            case 8:
                System.out.println("成绩是" + ScoreLevel.B.toString());
                break;
            case 7:
                System.out.println("成绩是" + ScoreLevel.C.toString());
                break;
            case 6:
                System.out.println("成绩是" + ScoreLevel.D.toString());
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("成绩是" + ScoreLevel.E.toString());
                break;
            default:
                System.out.println("输入数据不合法");
        }
    }
}
