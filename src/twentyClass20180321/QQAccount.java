package twentyClass20180321;

import java.util.Arrays;
import java.util.Objects;

/**
 * 3.QQ账户
 * @author tangweijr
 * @since 20180326
 */
public class QQAccount {
    public static String client = "TIM";
    private final long UID;
    private String nickname;
    public String[] getFriendList() {
        return friendList;
    }
    private String[] friendList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QQAccount qqAccount = (QQAccount) o;
        return UID == qqAccount.UID &&
                Objects.equals(nickname, qqAccount.nickname) &&
                Arrays.equals(friendList, qqAccount.friendList);
    }

    @Override
    public String toString() {
        return "QQAccount{" +
                "UID=" + UID +
                ", nickname='" + nickname + '\'' +
                ", friendList=" + (friendList == null ? null : Arrays.asList(friendList)) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        QQAccount account = new QQAccount(this.UID,this.nickname,this.friendList.clone());
        return account;
    }

    @Override
    public int hashCode() {
        return (int) ((UID * 31 + nickname.hashCode()) * 31 + Arrays.hashCode(friendList));
    }

    public static void showCilent() {
        if (client.equals("TIM")) {
            System.out.println("通过TIM发送");
        } else if (client.equals("QQ")) {
            System.out.println("通过QQ发送");
        } else if (client.equals("iphone")) {
            System.out.println("通过IphoneQQ发送");
        }
    }

    /**
     * 设置朋友列表
     * @param friendList 朋友列表
     */
    public void setFriendList(String[] friendList) throws NoSuchFieldException {
        if (friendList != null) {
            this.friendList = friendList;
        } else {
            throw new NoSuchFieldException();
        }
    }

    /**
     * 构造器，转发
     * @param UID 一旦初始化，不能再改变
     */
    public QQAccount(long UID) {
        this(UID, null, null);
    }

    /**
     * 全参数构造器
     * @param UID UID
     * @param nickname 昵称
     * @param friendList 朋友列表
     */
    public QQAccount(long UID, String nickname, String[] friendList) {
        this.UID = UID;
        this.nickname = nickname;
        this.friendList = friendList;
    }

    /**
     * 获得QQ号码
     * @return
     */
    public long getUID() {
        return UID;
    }

    /**
     * 展示列表里所有的好友
     */
    public void showAllFriends() {
        System.out.println("User "+UID+", you firends List is");
        for (String s : friendList) {
            System.out.print(s+"\t");
        }
        System.out.println();
    }

}
