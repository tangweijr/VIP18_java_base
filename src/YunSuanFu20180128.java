import java.util.ArrayList;
import java.util.Arrays;

/**
 * 这个一个用来测试各种运算符符号的类，用6个静态方法，描述了6类操作符的基本用法
 *
 * @author 麦唐
 */
public class YunSuanFu20180128 {
    static void aboutFuZhi() {
        /*
        赋值运算符
         */

        System.out.println("赋值运算符的基本操作：");
        byte bTest = 0;
        short sTest = 0;
        int iTest = 0;
        long lTest, lTest2, lTest3;// 连续申请多个变量
        float fTest = 0.0f;
        double dTest = 0.0;
        // 单个赋值
        sTest = bTest;
        iTest = sTest;
        // 连续赋值
        iTest = sTest = bTest;
        // 小类型赋值给大的可以，反过来会报错
        lTest = iTest;
//        iTest=lTest;// require int, found long
        dTest = fTest;
//        fTest=dTest;// require double, found float
        // 变量没有初始化，不能参与运算
        float fTest2;
//        fTest=fTest2;// not initialized
//        System.out.println(fTest2);// 也不可以打印
    }

    static void aboutSuanShu() {
        /*
        算数运算符
         */

        System.out.println("算数运算符的基本操作：");
        // 分母不能为0
//        dTest=10/0; // java.lang.ArithmeticException: / by zero
//        dTest=10%0；// java.lang.ArithmeticException: / by zero
        // * /优先级高于+ -
        System.out.print("3*4-6*2+4 = ");
        System.out.println(3 * 4 - 6 * 2 + 4);
        // 取余数，与数学中定义一致
        System.out.println("10%3 = " + 10 % 3);
        int index = 0;
        // ++在前，先运算再拿值
        System.out.println(++index);
        // ++在后，先拿值再运算
        System.out.println(index++);
        System.out.println(index);
    }

    static void aboutFuHe() {
        /*
        复合运算符
         */

        System.out.println("复合运算符的基本操作：");
        byte fuhe = 100;
//        fuhe=fuhe+10;// 报错，require byte, found int
        // 相当于fuhe=(byte)(fuhe+10);
        fuhe += 10;
        System.out.println("fuhe = " + fuhe);
        fuhe -= 10;
        System.out.println("fuhe = " + fuhe);
        fuhe *= 2;// 强制转换，及时越界也不会报错
        System.out.println("fuhe = " + fuhe);
        fuhe /= 2;
        System.out.println("fuhe = " + fuhe);
        fuhe %= 3;
        System.out.println("fuhe = " + fuhe);
        // 除了++ --，其他运算符都是待等式计算完成后再拿值的
        System.out.print("fuhe += 10\tprint = \t");
        System.out.println(fuhe += 100);
        fuhe = 0;
        fuhe += 1.5 * 4;
        System.out.println("fuhe = " + fuhe);
    }

    static void aboutGuanXi() {
        /*
        关系运算符
         */

        System.out.println("关系运算符的基本操作：");
        System.out.println("3>4 is " + (3 > 4));
        System.out.println("3<4 is " + (3 > 4));
        System.out.println("3==4 is " + (3 == 4));
        System.out.println("3!=4 is " + (3 != 4));
        System.out.println("3>=4 is " + (3 >= 4));
        System.out.println("3<=4 is " + (3 <= 4));
    }

    static void aboutLuoJi() {
         /*
        逻辑运算符
         */

        System.out.println("逻辑运算符的基本操作：");
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("true&&true = " + (b1 && b1));
        System.out.println("true&&false = " + (b1 && b2));
        // 如果第一个值是false，直接短路，不运算第二个值了，直接给false
        System.out.println("false&&true = " + (b2 && b1));
        System.out.println("false&&false = " + (b2 && b2));
        // 如果第一个值是true，直接短路，不运算第二个值了，直接给true
        System.out.println("true||true = " + (b1 || b1));
        System.out.println("true||false = " + (b1 || b2));
        System.out.println("false||true = " + (b2 || b1));
        System.out.println("false||false = " + (b2 || b2));
        System.out.println("!true = " + !b1);
        System.out.println("!false = " + !b2);

        System.out.println("逻辑运算符的课堂练习：");
        boolean a = true;
        boolean b = false;
        int c = 90, d = 100;
        // System.out.println(c+=10 == d);
        System.out.println((c += 10) == d);
        // 结果：true，此时c=100，d=100
        System.out.println(c-- == d);
        // 结果：true，先取值后自减少，此时c=99，d=100
        System.out.println(++c == d);
        // 结果：true，先自增后取值，此时c=100，d=100
        System.out.println(c + 1 == ++d);
        // 结果：true，d先自增，c先加1，再对比，此时d=101
        System.out.println(!a && b);
        // 结果：false
        System.out.println(b || d + 10 >= 110);
        // 结果：true，b=false，继续判断第二个值，d+10=111>110
        System.out.println(b && d + 10 >= 110);
        // 结果：false，b=false，不用判断第二个值了
        System.out.println(!b && d + 10 >= 110);
        // 结果：true，!b=true，继续判断第二个值，d+10=111>110
        // System.out.println(c>b&&a!=b);
        System.out.println(c > d && a != b);
        // 结果：false
    }

    static void aboutWei() {
        /*
        位运算符，对每个单独的二进制位进行操作
         */

        System.out.println("位运算符的的基本操作：");
        // 与，两者都是1则为1
        System.out.format("6 change to binary is: %5s\n", Integer.toBinaryString(6));
        System.out.format("9 change to binary is: %5s\n", Integer.toBinaryString(9));
        System.out.println("6&9 = " + (6 & 9) + " and binary is:\t" + Integer.toBinaryString(6 & 9));
        // 或，两个只要有一个是1则为1
        System.out.println("6|9 = " + (6 | 9) + " and binary is:\t" + Integer.toBinaryString(6 | 9));
        // 取反，0变1,1变0
        System.out.println("~6 = " + (~6) + " and binary is:\t" + Integer.toBinaryString(~6));
        // 异或，相等就是false，不等就是true
        System.out.println("6^9 = " + (6 ^ 9) + " and binary is:\t" + Integer.toBinaryString(6 ^ 9));
        // 将二进制向左边进行移动，向最后加0
        System.out.println("6<<2 = " + (6 << 2) + " and binary is:\t" + Integer.toBinaryString(6 << 2));
        // 将二进制向右边进行移动，正数前面加0，负数前面加1
        System.out.println("280>>2 = " + (280 >> 2) + " and binary is:\t" + Integer.toBinaryString(280 >> 2));
        System.out.println("-280>>2 = " + (-280 >> 2) + " and binary is:\t" + Integer.toBinaryString(-280 >> 2));
        // 无符号右移
        System.out.println("-280>>2 = " + (-280 >>> 2) + " and binary is:\t" + Integer.toBinaryString(-280 >>> 2));
        // 可以和复合运算符一起进行强制类型转换
        byte byteTest = 90;
//        byteTest=byteTest>>2;//报错，不能从int转到byte
        byteTest >>= 2;//通过强制类型装换，可以通过编译
    }

    public static void main(String[] args) {
        aboutFuZhi();
        aboutSuanShu();
        aboutFuHe();
        aboutGuanXi();
        aboutLuoJi();
        aboutWei();
        String a="abcabcadeafg";
        String b=a.replace("abc","");
        System.out.println((a instanceof String)? new ArrayList<>(Arrays.asList(a.split("a"))):b);
    }
}
