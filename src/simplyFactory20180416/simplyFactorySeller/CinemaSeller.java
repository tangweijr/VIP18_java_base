package simplyFactory20180416.simplyFactorySeller;

/**
 * 电影院售票员
 * @author tangweijr
 */
public class CinemaSeller implements Seller {
//    // 私有化构造器，不可以随意创建对象
//    private CinemaSeller() {
//
//    }

    @Override
    public void introduce() {
        System.out.println("介绍电影资讯");
    }

    @Override
    public void giveTicket() {
        System.out.println("把电影票打印出来");
    }

    @Override
    public void receiveMoney() {
        System.out.println("收款，用来获取电影票");
    }

    /**
     * 匿名内部类，创建对象
     */
    public static SellerFactory2 factory=new SellerFactory2() {
        @Override
        public Seller getSeller(String keyWord) {
            return new CinemaSeller();
        }
    };
}
