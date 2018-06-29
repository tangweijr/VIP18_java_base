public class StringTest {
    public static void main(String[] args) {
        String a="凯哥A";
        String b="凯哥B";
        System.out.println(a.equals(b));
        byte[] bytes={-17,81};
        System.out.println((bytes[0] & 0xff) << 0);
        System.out.println((bytes[1] & 0xff) << 8);
        System.out.println((char) ((bytes[0] & 0xff) << 0 | (bytes[1] & 0xff) << 8));
    }
}
