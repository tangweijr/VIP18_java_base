package simplyFactory20180416.simplyFactorySeller;

/**
 * 售票员工厂的1.0版本，通过输入字符串来判断new的对象
 * @author tangweijr
 */
public class SellerFactoryImpl implements SellerFactory {

    @Override
    public Seller getSeller(String keyWord) {
        if (keyWord.equals("电影")) {
            return new CinemaSeller();
        } else if (keyWord.equals("公园")) {
            return new ParkSeller();
        } else if (keyWord.equals("公园2")) {
            return new ParkSellerVer2();
        } else if (keyWord.equals("图书")) {
            return new BookSeller();
        }
        return null;
    }
}
