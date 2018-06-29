package twentyClass20180321;

import twentyClass20180321.twentyClassException.PriceException;

/**
 * 7.汽车
 * @author tangweijr
 * @since 20180326
 */
public class Car {
    public static String caizhi = "steel";
    private String brand;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Car) {
            Car that = (Car) o;
            return this.price == that.price && this.mileage == that.mileage && this.brand.equals(that.brand) && this.color.equals(that.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car's " +
                "brand is " + brand + '\'' +
                ", price is about" + price +
                ", color is" + color + '\'' +
                ", mileage was " + mileage;
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + (int) (price * 17 + mileage) * 17 + color.hashCode();
    }

    public double getPrice() {
        return price;
    }

    /**
     * 设置价格不能为负
     * @param price 价格
     */
    public void setPrice(double price) throws PriceException {
        if (price > 0) {
            this.price = price;
        } else {
            throw new PriceException();
        }
    }

    private double price;
    private String color;
    public double mileage;

    /**
     * 构造器，转发
     * @param brand 品牌
     * @param price 价格
     */
    public Car(String brand, double price) {
        this(brand, price, "Black", 0);
    }

    /**
     * 全参数构造器
     * @param brand 品牌
     * @param price 价格
     * @param color 颜色
     * @param mileage 里程
     */
    public Car(String brand, double price, String color, double mileage) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.mileage = mileage;
    }

    public static void show() {
        System.out.println("Car is made by " + caizhi);
    }

    /**
     * 点火
     * @return 返回点火方式
     */
    public String switchOnType() {
        if (brand.equals("BMW") || brand.equals("AUDI") || price > 40) {
            return "Electronic ignition";
        } else {
            return "Key ignition";
        }
    }

    /**
     * 喇叭声
     * @return
     */
    public String beepSound() {
        return "di~~~di~~~";
    }

    /**
     * 按照里程判断车的新旧程度
     * @return 判断结果
     */
    public String isNewCar() {
        System.out.print("Your total millages is " + mileage + ", ");
        if (mileage <= 0) {
            return "just buy, not run";
        }else if (mileage > 0 && mileage < 100) {
            return "just buy";
        } else if (mileage < 500) {
            return "using several times";
        } else if (mileage < 10000) {
            return "using one year";
        } else if (mileage < 30000) {
            return "using almost two years, attention to maintenance";
        } else if (mileage < 50000) {
            return "need first repair";
        } else if (mileage < 10000) {
            return "ennnnn, not easy to sell";
        } else {
            return "driving about 5-10 years";
        }
    }

    public static void main(String[] args) {
        Car.show();
        Car.caizhi = "suliao";
        Car.show();

        Car ford = new Car("ford",150000);
        ford.caizhi = "iron";
        ford.show();
        ford.mileage = 5000;
        System.out.println(ford.isNewCar());

        Car jeep = new Car("benz",50000);
        jeep.caizhi = "steel";
        jeep.show();
        jeep.mileage = 50000;
        System.out.println(jeep.isNewCar());
    }
}
