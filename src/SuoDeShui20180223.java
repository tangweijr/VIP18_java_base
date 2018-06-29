import java.util.Scanner;

/**
 * 2.练习个人所得税例题，两个版本 1是没有进行else优化的，2是优化的版本  写到熟练为止
 * 3.写一个超速罚款例题  超速多少罚多少  (提示百分比)
 * 4.写一个记时停车例题   1小时 5块   2小时15块  3小时35块  4小时候以上 低于24小时 按天收取  一天是100元
 * 5.写一个年龄阶段例题，比方说 10岁是儿童
 * @author tangweijr
 * @since 20180223
 */
public class SuoDeShui20180223 {
    /*
    个人所得税，没有进行else优化的
     */
    public static void GeRenSuoDeShui(double salary) {
        if (salary < 0) {
            System.err.println("salary is error!");
        }
        double kouchu = salary - 3500;
        if (kouchu < 0) {
            System.out.println("no tex!");
        } else {
            if (kouchu <= 1500) {
                System.out.println("tex: " + kouchu * 0.03);
            } else {
                if (kouchu <= 4500) {
                System.out.println("tex: " + (kouchu * 0.1 - 105));
                } else {
                    if (kouchu <= 9000) {
                        System.out.println("tex: " + (kouchu * 0.2 - 555));
                    } else {
                        if (kouchu <= 35000) {
                            System.out.println("tex: " + (kouchu * 0.25 - 1055));
                        } else {
                            if (kouchu <= 55000) {
                                System.out.println("tex: " + (kouchu * 0.3 - 2755));
                            } else {
                                System.out.println("tex: " + (kouchu * 0.45 - 13505));
                            }
                        }
                    }
                }
            }
        }
    }

    /*
    个人所得税，进行else优化的
     */
    public static void GeRenSuoDeShui_YouHua(double salary) {
        if (salary < 0) {
            System.err.println("salary is error!");
        }
        double kouchu = salary - 3500;
        if (kouchu < 0) {
            System.out.println("no tex!");
        } else if (kouchu <= 1500) {
            System.out.println("tex: " + kouchu * 0.03);
        } else if (kouchu <= 4500) {
            System.out.println("tex: " + (kouchu * 0.1 - 105));
        } else if (kouchu <= 9000) {
            System.out.println("tex: " + (kouchu * 0.2 - 555));
        } else if (kouchu <= 35000) {
            System.out.println("tex: " + (kouchu * 0.25 - 1055));
        } else if (kouchu <= 55000) {
            System.out.println("tex: " + (kouchu * 0.3 - 2755));
        } else {
            System.out.println("tex: " + (kouchu * 0.45 - 13505));
        }
    }

    /*
    超速罚款
     */
    public static void ChaoSuFaKuan(int limitSpeed, double speed) {
        if (limitSpeed < speed && limitSpeed >= 0 && speed >= 0) {
            double rate = (speed - limitSpeed) / limitSpeed * 100;
            if (rate < 10) {
                System.out.println("just warning");
            } else {
                if (limitSpeed < 50) {
                    if (rate < 20) {
                        System.out.println("speed exceed " + rate + "%, and fine 50 yuan");
                    } else if (rate < 50) {
                        System.out.println("speed exceed " + rate + "%, and fine 100 yuan");
                    } else if (rate < 70) {
                        System.out.println("speed exceed " + rate + "%, and fine 300 yuan");
                    } else {
                        System.out.println("speed exceed " + rate + "%, and fine 500 yuan");
                    }
                } else if (limitSpeed <= 80) {
                    if (rate < 20) {
                        System.out.println("speed exceed " + rate + "%, and fine 100 yuan");
                    } else if (rate < 50) {
                        System.out.println("speed exceed " + rate + "%, and fine 150 yuan");
                    } else if (rate < 70) {
                        System.out.println("speed exceed " + rate + "%, and fine 500 yuan");
                    } else {
                        System.out.println("speed exceed " + rate + "%, and fine 1000 yuan");
                    }
                } else if (limitSpeed <= 100) {
                    if (rate < 20) {
                        System.out.println("speed exceed " + rate + "%, and fine 150 yuan");
                    } else if (rate < 50) {
                        System.out.println("speed exceed " + rate + "%, and fine 200 yuan");
                    } else if (rate < 70) {
                        System.out.println("speed exceed " + rate + "%, and fine 1000 yuan");
                    } else {
                        System.out.println("speed exceed " + rate + "%, and fine 1500 yuan");
                    }
                } else {
                    if (rate < 50) {
                        System.out.println("speed exceed " + rate + "%, and fine 200 yuan");
                    } else if (rate < 70) {
                        System.out.println("speed exceed " + rate + "%, and fine 1500 yuan");
                    } else {
                        System.out.println("speed exceed " + rate + "%, and fine 2000 yuan");
                    }
                }
            }
        } else {
            System.err.println("limitSpeed or speed error!");
        }
    }

    /*
    停车费
     */
    public static void TingCheFei(int hours) {
        if (hours <= 1) {
            System.out.println("you have pay 5 yuan");
        } else if (hours <= 2) {
            System.out.println("you have pay 15 yuan");
        } else if (hours <= 3) {
            System.out.println("you have pay 35 yuan");
        } else if (hours <= 24) {
            System.out.println("you have pay 100 yuan");
        } else {
            int day=hours/24;
            int leftHours=hours%24;
            System.out.println("you have pay "+ day*100 +" yuan, because hours>=24, and");
            TingCheFei(leftHours);
        }
    }

    /*
    年龄阶段
     */
    public static void NianLingPanDuan(int age) {
        if (age < 0 || age >= 150) {
            System.err.println("age error");
        } else if (age < 1) {
            System.out.println("baby");
        } else if (age < 12) {
            System.out.println("child");
        } else if (age < 22) {
            System.out.println("teenager");
        } else if (age < 60) {
            System.out.println("adult");
        } else {
            System.out.println("old man");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input you salary: ");
        double num = input.nextDouble();
        GeRenSuoDeShui(num);
        System.out.println("please input you salary: ");
        num = input.nextDouble();
        GeRenSuoDeShui_YouHua(num);
        System.out.println("please input you speed: ");
        num = input.nextDouble();
        ChaoSuFaKuan(110,num);
        System.out.println("please input hours: ");
        int num2 = input.nextInt();
        TingCheFei(num2);
        System.out.println("please input age: ");
        num2 = input.nextInt();
        NianLingPanDuan(num2);
    }
}
