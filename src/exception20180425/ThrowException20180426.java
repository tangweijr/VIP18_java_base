package exception20180425;

public class ThrowException20180426 {
    public static void main(String[] args) {
        // NullPointerException
//        try {
//            String s = null;
//            s.toString();
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }

//         ClassCastException
        System.out.println(1);
        try {
            System.out.println(2);
            String s = "123";
            Integer integer = (Integer) (Object) s;
            System.out.println(3);
            try {
                System.out.println(4);
                int[] i = {1, 2};
                System.out.println(i[4]);
                System.out.println(5);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(6);
                e.printStackTrace();
                System.out.println(7);
            }
            System.out.println(8);
        } catch (ClassCastException e) {
            System.out.println(9);
            e.printStackTrace();
            System.out.println(10);
        }
        System.out.println(11);

        // ArrayIndexOutOfBoundsException
//        try {
//            int[] i = {1, 2};
//            System.out.println(i[4]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }

        // NumberFormatException
//        try {
//            String s = "abc123";
//            Integer.parseInt(s);
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//        }

        // OutOfMemoryError
//        try {
//            int[] ints = new int[1024 * 1024 * 1024 * 4];
//        } catch (OutOfMemoryError e) {
//            e.printStackTrace();
//        }

    }
}
