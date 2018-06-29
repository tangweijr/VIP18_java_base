/**
 * 多态练习
 * @author web
 * @since 20180412
 */
class A{
    public String show(D obj) {
        return "A and D";
    }
    public String show(A obj) {
        return "A and A";
    }
}

class B extends A {
    public String show(B obj) {
        return "B and B";
    }

    /**
     * 参数类型相同，重写A类的方法
     * @param obj
     * @return
     */
    @Override
    public String show(A obj) {
        return "B and A";
    }
}

class C extends B {

}

class D extends B {

}

public class polyDemo20180412 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();

        /*
         a1类型为A，b类型为B，B继承于A，调用方法为A.show(A obj)，此时A obj应用多态
         打印A and A
          */
        System.out.println("1--"+a1.show(b));
        /*
         a1类型为A，c类型为C，C继承于B，B继承于A，调用方法为A.show(A obj)，此时A obj应用多态
         打印A and A
          */
        System.out.println("2--"+a1.show(c));
        /*
         a1类型为A，d类型为D，调用方法为A.show(D obj)
         打印A and D
          */
        System.out.println("3--"+a1.show(d));
        /*
        a2类型为A，A a2 = new B()，b类型为B，B继承于A，调用方法A.show(A obj)，此时A obj应用多态
        由于方法发生重写，优先调用子类方法，也就是B.show(A obj)
        打印B and A
         */
        System.out.println("4--"+a2.show(b));
        /*
        a2类型为A，A a2 = new B()，c类型为C，C继承于B，B继承于A，调用方法A.show(A obj)，此时A obj应用多态
        由于方法发生重写，优先调用子类方法，也就是B.show(A obj)
        打印B and A
         */
        System.out.println("5--"+a2.show(c));
        /*
        a2类型为A，A a2 = new B()，d类型为D，调用方法A.show(D obj)
        打印A and D
         */
        System.out.println("6--"+a2.show(d));
        /*
        b类型为B，调用方法B.show(B obj)
        打印B and B
         */
        System.out.println("7--"+b.show(b));
        /*
        b类型为B，c类型为C，C继承于B，调用方法B.show(B obj)，此时B obj应用多态
        打印B and B
         */
        System.out.println("8--"+b.show(c));
        /*
        b类型为B，d类型为D，子类可以调用父类方法，调用方法A.show(D obj)
        打印A and D
         */
        System.out.println("9--"+b.show(d));
    }
}
