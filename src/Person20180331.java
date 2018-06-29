/**
 * 人的类，在set中加入验证代码
 */
public class Person20180331 {
    private String name;
    private String sex;
    private int age;
    private double height;
    private String identityCard;
    private String phoneNumber;
    private String address;

    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     * @param name 姓名
     */
    public void setName(String name) {
        //英文名字
        if (name.length()>0 && name.matches("([A-Z][a-z]+ ){1,2}[A-Z][a-z]+")) {
            this.name = name;
            //中文名字
        } else if (name.length() > 0 && name.matches("[\\u4e00-\\u9fa5]{2,6}")) {
            this.name = name;
        } else {
            System.out.println("姓名格式不正确");
        }
    }

    public String getSex() {
        return sex;
    }

    /**
     * 设置性别，进行字符串匹配的验证
     * @param sex 性别
     */
    public void setSex(String sex) {
        if (sex.equals("男") || sex.equalsIgnoreCase("male")) {
            this.sex = sex;
        } else if (sex.equals("女") || sex.equalsIgnoreCase("female")) {
            this.sex = sex;
        } else {
            System.out.println("输入性别不合法");
        }
    }

    public int getAge() {
        return age;
    }

    /**
     * 设置年龄，进行大小匹配的验证
     * @param age 年龄
     */
    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("输入年龄不合法");
        }
    }

    public double getHeight() {
        return height;
    }

    /**
     * 设置身高，进行大小匹配
     * @param height 身高
     */
    public void setHeight(double height) {
        if (height > 0 && height < 2.3) {
            this.height = height;
        } else {
            System.out.println("输入身高不合法");
        }
    }

    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * 设置身份证，进行正则表达式的匹配
     * @param identityCard 身份证号码
     */
    public void setIdentityCard(String identityCard) {
        if (identityCard.length() == 18) {
            if (identityCard.matches("\\d{18}") || identityCard.matches("\\d{17}[xX]")) {
                this.identityCard = identityCard;
            } else {
                System.out.println("身份证格式不正确");
            }
        } else {
            System.out.println("身份证长度不正确，重新输入");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号，通过正则表达式进行匹配
     * @param phoneNumber 手机号
     */
    public void setPhoneNumber(String phoneNumber) {
        //甚至可以写出详细的号段
        if (phoneNumber.matches("1\\d{10}")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("手机号码格式不正确");
        }
    }

    public String getAddress() {
        return address;
    }

    /**
     * 设置地址，通过正则表达式进行匹配
     * @param address 地址
     */
    public void setAddress(String address) {
        if (address.matches("(\\S+省)?\\S+市\\S+[区|县]\\S+街道")) {
            this.address = address;
        } else {
            System.out.println("地址格式不正确");
        }
    }
}
