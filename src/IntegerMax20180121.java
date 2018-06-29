public class IntegerMax20180121 {
    public static void main(String[] args) {
        // 获取int的最大值
        int k=Integer.MAX_VALUE;
        System.out.println(k);
        /*
        k+1实际是int类型的，编译过程中可能并不发生计算过程，编译器只看类型正确不正确
        但是在赋值过程中，数值越界，高位丢失了
        */
        int k1=k+1;
        System.out.println(k1);
        /*
        如果用long类型来接受，还是了发生数值越界，依然相当于用int赋值long
         */
        long k2=k+1;
        System.out.println(k2);
        /*
        如果强转在赋值呢？还是发生数值越界，相当于int强转long，然后再赋值long
         */
        long k3=(long)(k+1);
        System.out.println(k3);
        /*
        只有在运算的时候，就提升为long类型，才能计算除想要的结果
         */
        long k4=k+1L;
        System.out.println(k4);
        /*
        总结：1、编译的时候，有可能并没有计算；2、计算的时候，有可能使用了一个中间变量暂存计算的结果，然后再赋值
         */

    }
}
