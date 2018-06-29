package simplyFactory20180416.simplyFactorySeller;

/**
 * 公园售票员
 * @author tangweijr
 */
public class ParkSeller implements Seller {
//    // 私有化构造器，不可以随意创建对象
//    private ParkSeller() {
//
//    }

    @Override
    public void introduce() {
        System.out.println("介绍公园的情况");
    }

    @Override
    public void giveTicket() {
        System.out.println("打印公园门票，并盖上纪念章");
    }

    @Override
    public void receiveMoney() {
        System.out.println("收款，用来获取公园门票");
    }

    /**
     * 匿名内部类，创建对象
     */
    public static SellerFactory2 factory=new SellerFactory2() {
        @Override
        public Seller getSeller(String keyWord) {
            return new ParkSeller();
        }
    };
}
