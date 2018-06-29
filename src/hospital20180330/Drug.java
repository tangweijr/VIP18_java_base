package hospital20180330;

import java.util.ArrayList;

/**
 * 药品，保存药品的基本信息
 */
public class Drug {
    public static ArrayList<Drug> drugArrayList = new ArrayList<>();

    //静态块，随机生成一些药品
    static {
        //添加一些药品
        drugArrayList.add(new Drug("诺氟沙星", 1.25, 25));
        drugArrayList.add(new Drug("吗丁啉", 0.05, 15));
        drugArrayList.add(new Drug("阿斯匹林", 1, 32));
        drugArrayList.add(new Drug("板蓝根", 5, 18));
        drugArrayList.add(new Drug("扑尔敏", 0.8, 21));
        drugArrayList.add(new Drug("甲硝唑", 1.3, 18));
        drugArrayList.add(new Drug("那他霉素", 0.5, 45));
        drugArrayList.add(new Drug("可的松", 0.04, 39));
        drugArrayList.add(new Drug("苯扎氯铵", 0.01, 35));
        drugArrayList.add(new Drug("利拉萘酯", 1.1, 102));
        drugArrayList.add(new Drug("阿德福韦", 0.85, 84));
        drugArrayList.add(new Drug("两性霉素b", 0.3, 71));
        drugArrayList.add(new Drug("伊达比星", 2.5, 265));

    }

    public String name;
    public double content;
    public double price;
    public boolean hasPay;
    public boolean hasTake;

    /**
     * 构造器
     * @param name 名称
     * @param content 每片/粒的药物含量，gram
     * @param price 价格，yuan
     */
    public Drug(String name, double content, double price) {
        this.name = name;
        this.content = content;
        this.price = price;
        this.hasPay = false;
        this.hasTake = false;
    }

    /**
     * 打印确认药物的基本信息
     */
    public void showInfo() {
        System.out.println("\t请仔细检查药物信息！");
        System.out.println("\t药物名称：" + name);
        System.out.println("\t每片含量：" + content + "克");
        System.out.println("\t价格为：" + price + "元");
    }
}
