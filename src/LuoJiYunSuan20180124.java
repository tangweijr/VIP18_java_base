public class LuoJiYunSuan20180124 {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        int c=90,d=100;
        System.out.println((c+=10) == d);
        System.out.println(c-- == d);
        System.out.println(++c == d);
        System.out.println(c+1 == ++d);
        System.out.println(!a&&b);
        System.out.println(b||d+10>=110);
        System.out.println(b&&d+10>=110);
        System.out.println(!b&&d+10>=110);
        System.out.println(c>d&&a!=b);

    }
}
