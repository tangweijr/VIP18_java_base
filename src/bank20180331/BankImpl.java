package bank20180331;

/**
 * 银行系统的实现类
 */
public class BankImpl implements Bank {
    public class ID {
        String idName;
        int password;
        String personName;
        double totalMoney;

        /**
         * 构造器
         * @param idName id
         * @param password 密码
         * @param personName 姓名
         */
        public ID(String idName, int password, String personName) {
            this.idName = idName;
            this.password = password;
            this.personName = personName;
            this.totalMoney = 0;
        }
    }
    public String bankName;
    public int bankId;
    public ID[] ids;

    /**
     * 构造器
     * @param bankName 银行名称
     * @param bankId   银行ID
     * @param maxIdsNumber 最大账户数量
     */
    public BankImpl(String bankName, int bankId, int maxIdsNumber) {
        this.bankName = bankName;
        this.bankId = bankId;
        ids = new ID[maxIdsNumber];
    }

    /**
     * 创建账户
     * @param idName     id
     * @param password   密码
     * @param personName 用户姓名
     */
    public void createAccount(String idName, int password, String personName) {
        ID id = new ID(idName, password, personName);
        //记录银行是否已经满了
        boolean isFull = false;
        //记录账户是否存在
        boolean isExist = false;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == null) {
                ids[i] = id;
                isFull = true;
                isExist = true;
                break;
            } else if (ids[i].idName.equals(idName)) {
                isFull = true;
                isExist = false;
                break;
            }
        }

        if (isExist && isFull) {
            System.out.println("Account created success!");
            System.out.println("Your name is " + id.personName + ", and your id is " + id.idName + ". Please remember it!");
        } else if (!isFull) {
            System.out.println("Sorry, this bank is full.");
        } else if (!isExist) {
            System.out.println("Sorry, this account is already exist.");
        }
    }

    /**
         * 查找账户
         * @param idName 账户
         * @return ID对象
         */
    public ID getID (String idName){
            ID zhanghu = null;
            //从头到尾找
            for (int i = 0; i < ids.length; i++) {
                //如果为null，表示已经到最后一个
                if ((ids[i] != null) && ids[i].idName.equals(idName)) {
                    zhanghu = ids[i];
                }
            }
            return zhanghu;
        }

    /**
         * 查找账户
         * @param idName id
         * @param password 密码
         */
    public void returnMoney (String idName,int password){
            ID zhanghu = getID(idName);
            if (zhanghu == null) {
                System.out.println("Id is not exist!");
            } else {
                if (zhanghu.password == password) {
                    System.out.println("Total have " + zhanghu.totalMoney + " yuan.");
                } else {
                    System.out.println("password is wrong!");
                }
            }
        }

    /**
         * 存款
         * @param idName id
         * @param password 密码
         * @param money 金额
         */
    public void addMoney (String idName,int password, double money){
            ID zhanghu = getID(idName);
            if (zhanghu == null) {
                System.out.println("Id is not exist!");
            } else {
                if (zhanghu.password == password) {
                    zhanghu.totalMoney += money;
                    System.out.println("Total have " + zhanghu.totalMoney + " yuan.");
                } else {
                    System.out.println("password is wrong!");
                }
            }
        }

    /**
         * 取钱
         * @param idName id
         * @param password 密码
         * @param money 金额
         */
    public void getMoney (String idName,int password, double money){
            ID zhanghu = getID(idName);
            if (zhanghu == null) {
                System.out.println("Id is not exist!");
            } else {
                if (zhanghu.password == password) {
                    if (zhanghu.totalMoney >= money) {
                        zhanghu.totalMoney -= money;
                        System.out.println("Total have " + zhanghu.totalMoney + " yuan.");
                    } else {
                        System.out.println("Money is not enough.");
                    }
                } else {
                    System.out.println("password is wrong!");
                }
            }
        }
}
