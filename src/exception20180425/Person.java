package exception20180425;

import java.io.Serializable;

/**
 * 人，每个人可以有不同的银行卡
 */
public class Person implements Serializable {
    private String name;
    private String identityCard;
    private transient String password;

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameFormatException {
        //英文名字
        if (name.length()>0 && name.matches("([a-z]+){1,2}[a-z]+")) {
            this.name = name;
            //中文名字
        } else if (name.length() > 0 && name.matches("[\\u4e00-\\u9fa5]{2,6}")) {
            this.name = name;
        } else {
            throw new NameFormatException();
        }
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) throws IDFormatException {
        if (identityCard.length() == 18) {
            if (identityCard.matches("\\d{18}") || identityCard.matches("\\d{17}[xX]")) {
                this.identityCard = identityCard;
            }
        } else {
            throw new IDFormatException();
        }
    }
}
