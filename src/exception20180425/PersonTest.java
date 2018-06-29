package exception20180425;

import java.io.*;

/**
 * 异常的测试类
 */
public class PersonTest {
    public static void main(String[] args) throws IOException {
        // 输入数据
        Person tw = new Person();
        FileOutputStream fileOutputStream = new FileOutputStream("log.txt");
        try {
            tw.setName("tangweijr");
            tw.setName("麦唐");
//            姓名格式不正确
//            tw.setName("麦唐jr");
        } catch (NameFormatException e) {
            e.printStackTrace();
            throw new IOException();
        }
        try {
            tw.setIdentityCard("320107198911111111");
//            身份证格式不正确
//            tw.setIdentityCard("32010719891111");
        } catch (IDFormatException e) {
            e.printStackTrace();
            throw new IOException();
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tw);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }

        // 取出数据并打印出来
        FileInputStream fileInputStream = new FileInputStream("log.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person getFromFile = null;
        try {
            getFromFile = (Person) objectInputStream.readObject();
            System.out.println(getFromFile.getName());
            System.out.println(getFromFile.getIdentityCard());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            objectInputStream.close();
        }
    }
}
