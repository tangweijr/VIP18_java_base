package bank20180331;

/**
 * 接口，任何银行类都要实现该接口
 */
public interface Bank {
    void createAccount(String idName, int password, String personName);
    BankImpl.ID getID (String idName);
    void returnMoney (String idName,int password);
    void addMoney (String idName,int password, double money);
    void getMoney (String idName,int password, double money);
}
