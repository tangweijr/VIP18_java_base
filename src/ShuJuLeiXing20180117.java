public class ShuJuLeiXing20180117 {
    public static void main(String[] args) {

        // exercise 2
        System.out.println("Exercise 2 as following:");
        byte b=10;
        short s=10;
        int i=65500;
        long l=10_0000_0000;
        final char C='c';
        final float F=1.1f;
        final double D=2.2;
        final boolean BO;
        BO=true;
        System.out.println("byte b="+b);
        System.out.println("short s="+s);
        System.out.println("int i="+i);
        System.out.println("long l="+l);
        System.out.println("final char C="+C);
        System.out.println("final float F="+F);
        System.out.println("final double D="+D);
        System.out.println("final boolean BO="+BO);

        // exercise 3
        System.out.println("\nExercise 3 as following:");
        double d1=12345.6789;
        float f1=(float)d1;
        double d2=f1;
        System.out.println("double d1="+d1+", float f1="+f1+", double d2="+d2);

        // exercise 4
        System.out.println("\nExercise 4 as following:");
        char c1='A';
        System.out.println("char c1="+c1);
        System.out.println("char c1 convert to int="+(int)c1);
        int c2=97;
        System.out.println("int c2="+c2);
        System.out.println("int c2 convert to char="+(char)c2);
        boolean b2=false;
        System.out.println("boolean b2="+b2);

        // exercise 5
        System.out.println("\nExercise 5 as following:");
        short ss=(short) 100000;// force convert to short
        byte bb=(byte) 128;// force convert to byte
        int ii=90;
        long ll=9988967785678L;// plus L at the end
        float ff=1.5f+0.5f;
        float ff2=(float) (1.5+0.5);
        double dd=99999999.555555;
        char cc=65;
        char ccc=63+'A';
        final int KK;// change kk to KK
        KK=100;// delete L, or force convert to int
//      KK=(int) 100
        // final, can't assignment again
//      KK=0;
        boolean bb2=true;//true or false
        short sss=(short)10;// short range: -2^15 ~ +2^15-1
//      short sss=10;
        System.out.println("short ss="+ss);// force convert
        System.out.println("byte bb="+bb);// force convert
        System.out.println("int ii="+ii);
        System.out.println("long ll="+ll);
        System.out.println("float ff="+ff+", float ff2="+ff2);
        System.out.println("double dd="+dd);
        System.out.println("char cc="+cc+", char ccc="+ccc);
        System.out.println("final int KK="+KK);
        System.out.println("boolean bb2="+bb2);
        System.out.println("short sss="+sss);

    }
}
