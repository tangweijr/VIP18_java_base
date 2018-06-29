package simplyFactory20180416.simplyFactorySeller;

/**
 * 测试类
 */
public class SimpleFactoryTest {
    /**
     * 创建seller对象并打印
     * @param sellerFactory2 实现接口的类
     * @return 返回seller对象
     */
    static Seller createSeller(SellerFactory2 sellerFactory2) {
        Seller s = sellerFactory2.getSeller("");
        System.out.println("\t" + s.getClass().getSimpleName());
        s.introduce();
        s.receiveMoney();
        s.giveTicket();
        return s;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        /*
        第1种使用方案，通过传入字符串进行类的创建
         */
        System.out.println("\n第1种使用方案，通过传入字符串进行类的创建\n");
        Seller seller1=new SellerFactoryImpl().getSeller("电影");
        System.out.println("\t"+seller1.getClass().getSimpleName());
        seller1.introduce();
        seller1.receiveMoney();
        seller1.giveTicket();
        Seller seller2=new SellerFactoryImpl().getSeller("公园");
        System.out.println("\t"+seller2.getClass().getSimpleName());
        seller2.introduce();
        seller2.receiveMoney();
        seller2.giveTicket();
        Singable seller3 = (Singable) new SellerFactoryImpl().getSeller("公园2");
        System.out.println("\t"+seller3.getClass().getSimpleName());
        seller3.sing();
        Seller seller11=new SellerFactoryImpl().getSeller("图书");
        System.out.println("\t"+seller11.getClass().getSimpleName());
        seller11.introduce();
        seller11.receiveMoney();
        seller11.giveTicket();

        /*
        第2种使用方案，通过传入字符串进行类的创建
         */
        System.out.println("\n第2种使用方案，通过匿名内部类进行类的创建\n");
        createSeller(CinemaSeller.factory);
        createSeller(ParkSeller.factory);
        createSeller(BookSeller.factory);
        Seller temp = createSeller(ParkSellerVer2.factory);
        ((Singable) temp).sing();
    }
}
