package simplyFactory20180416.simplyFactorySeller;

/**
 * 图书售票员
 * @author tangweijr
 */
public class BookSeller implements Seller {
    @Override
    public void introduce() {
        System.out.println("介绍图书馆的相应信息");
    }

    @Override
    public void giveTicket() {
        System.out.println("把买书的小票打印出来，凭书取票");
    }

    @Override
    public void receiveMoney() {
        System.out.println("收款，用来买书");
    }

    /**
     * 匿名内部类，创建对象
     */
    public static SellerFactory2 factory=new SellerFactory2() {
        @Override
        public Seller getSeller(String keyWord) {
            return new BookSeller();
        }
    };
}
