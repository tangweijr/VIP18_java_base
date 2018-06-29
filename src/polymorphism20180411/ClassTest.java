package polymorphism20180411;

import java.util.ArrayList;

/**
 * 测试类
 */
public class ClassTest {
	public static void main(String[] args) {
	    //创建对象，使用多态
        System.out.println("New object using polymorphism: ");
		Cycle uc = new Unicycle();
        Cycle bc = new Bicycle();
        Cycle tc = new Tricycle();
		//判断子类类型，输出车轮数量
		Cycle.ride(uc);
		Cycle.ride(bc);
		Cycle.ride(tc);
		
		//Cycle数组
        System.out.println("Arrays: ");
        Cycle[] cycles = {new Bicycle(), new UniBicycle(), new Tricycle()};
        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();

        //Bicycle数组
        Bicycle[] bicycles = {new Bicycle(), new UniBicycle()};
        bicycles[0].speed();
        bicycles[1].speed();

        //Cycle集合
        System.out.println("ArraysList: ");
        ArrayList<Cycle> cycleArrayList = new ArrayList<>();
        cycleArrayList.add(new Bicycle());
        cycleArrayList.add(new UniBicycle());
        cycleArrayList.add(new Tricycle());
        cycleArrayList.get(0).balance();
        cycleArrayList.get(1).balance();
        cycleArrayList.get(2).balance();

        //Bicycle集合
        ArrayList<Bicycle> bicycleArrayList = new ArrayList<>();
        bicycleArrayList.add(new Bicycle());
        bicycleArrayList.add(new UniBicycle());
        bicycleArrayList.get(0).speed();
        bicycleArrayList.get(1).speed();


//		不可以从父类转产子类，即不可以向下转型，或调用方法
//		UniBicycle b1=(UniBicycle)new Bicycle();
//		b1.balance();
	}

}
