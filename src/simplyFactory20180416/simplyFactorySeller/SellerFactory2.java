package simplyFactory20180416.simplyFactorySeller;

/**
 * 售票员工厂的接口，V2版本
 * @author tangweijr
 */
public interface SellerFactory2 extends SellerFactory{
    Seller getSeller(String keyWord);
}
