package simplyFactory20180416.simplyFactorySeller;

/**
 * 公园售票员2.0
 * @author tangweijr
 */
public class ParkSellerVer2 extends ParkSeller implements Singable {

    @Override
    public void sing() {
        System.out.println("将公园的游玩信息编成了一首歌，唱出来");
    }

    /**
     * 匿名内部类，创建对象
     */
    public static SellerFactory2 factory=new SellerFactory2() {
        @Override
        public Seller getSeller(String keyWord) {
            return new ParkSellerVer2();
        }
    };
}
