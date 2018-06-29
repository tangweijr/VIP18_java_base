/**
 * 对象的使用
 * @author tangweijr
 * @since 20180324
 */
public class ObjectUsage20180323 {
    String name;
    InnerObject[] ios = new InnerObject[5];

    public static void main(String[] args) {

        // 类中使用属性对象
        ObjectUsage20180323 ous = new ObjectUsage20180323();
        for (int i = 0; i < ous.ios.length; i++) {
            ous.ios[i] = new InnerObject();
            ous.ios[i].name = i+"";
            System.out.println(ous.ios[i].name);
        }

        // 对象数组的使用
        ObjectUsage20180323[] test = new ObjectUsage20180323[5];
        for (int i = 0; i < test.length; i++) {
            test[i] = new ObjectUsage20180323();
            for (int j = 0; j < test[i].ios.length; j++) {
                test[i].ios[j] = new InnerObject();
                test[i].ios[j].name = i * j + "";
                System.out.print(test[i].ios[j].name+"\t");
            }
            System.out.println();
        }
    }
}

class InnerObject {
    String name;
    static int indexCount=0;
}