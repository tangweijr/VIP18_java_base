package bank20180331;

import java.util.Scanner;

/**
 * 银行测试类
 * @author tangweijr
 */
public class BankTest {
	/**
	 * 内部类，为实现信息选择
	 */
	public static class Selector{
		/**
		 * 打印信息
		 */
		void printInfo() {
			System.out.println("\nThis a mini banksoft system for test:");
			System.out.println("Please enter number to select function:");
			System.out.println("1\tCreate an account:");
			System.out.println("2\tReturn total money in your account:");
			System.out.println("3\tAdd money to your account:");
			System.out.println("4\tGet money from your account:");
			System.out.println("5\tExit:");
		}

		/**
		 * 开户
		 * @param bank 银行对象
		 * @param scanner Scanner对象
		 */
		void createAccount(BankImpl bank, Scanner scanner) {
			System.out.println("Please enter your account:");
			String account= scanner.next();
			System.out.println("Please enter your password:");
			int password= scanner.nextInt();
			System.out.println("Please enter your name:");
			String name= scanner.next();
			bank.createAccount(account, password, name);
		}
		/**
		 * 总额
		 * @param bank 银行对象
		 * @param scanner Scanner对象
		 */
		void totalMoney(BankImpl bank, Scanner scanner) {
			System.out.println("Please enter your account:");
			String account= scanner.next();
			System.out.println("Please enter your password:");
			int password= scanner.nextInt();
			bank.returnMoney(account, password);
		}
		/**
		 * 存钱
		 * @param bank 银行对象
		 * @param scanner Scanner对象
		 */
		void addMoney(BankImpl bank, Scanner scanner) {
			System.out.println("Please enter your account:");
			String account= scanner.next();
			System.out.println("Please enter your password:");
			int password= scanner.nextInt();
			System.out.println("Please enter add money:");
			double money= scanner.nextDouble();
			bank.addMoney(account, password, money);
		}
		/**
		 * 取钱
		 * @param bank 银行对象
		 * @param scanner Scanner对象
		 */
		void getMoney(BankImpl bank, Scanner scanner) {
			System.out.println("Please enter your account:");
			String account= scanner.next();
			System.out.println("Please enter your password:");
			int password= scanner.nextInt();
			System.out.println("Please enter add money:");
			double money= scanner.nextDouble();
			bank.getMoney(account, password, money);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankImpl njbk=new BankImpl("BankImpl of nanjing",1,100);
		BankTest.Selector selector = new Selector();
		while (true) {
			selector.printInfo();
			int selectnum = input.nextInt();
			if (selectnum == 1) {
				//Create an account
				selector.createAccount(njbk, input);
			} else if (selectnum == 2) {
				//Return total money in your account
				selector.totalMoney(njbk, input);
			} else if (selectnum == 3) {
				//Add money to your account
				selector.addMoney(njbk, input);
			} else if (selectnum == 4) {
				//Get money from your account
				selector.getMoney(njbk, input);
			} else {
				//Exit
				System.out.println("Tanks for your use~");
				break;
			}
		}
	}
}
