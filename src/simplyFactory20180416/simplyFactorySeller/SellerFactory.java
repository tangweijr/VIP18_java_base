package simplyFactory20180416.simplyFactorySeller;

/**
 * 售票员工厂的接口
 * @author tangweijr
 */
public interface SellerFactory {
    Seller getSeller(String keyWord);
}
