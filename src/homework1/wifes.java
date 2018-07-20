package homework1;
import java.util.ArrayList;
import java.util.Random;


public class wifes {

	private static int maxNumOfWife = 4;//定义最多能产生的实例数量
	private static ArrayList<String> nameList = new ArrayList<String>();//每个老婆都有名字，使用一个ArrayList来容纳每个对象的私有属性
	private static ArrayList<wifes> wifeList = new ArrayList<wifes>();//定义一个列表，容纳所有的妻子实例
	private static int countNumOfWife = 0;//当前妻子的列号
	static{
		for(int i=0;i<maxNumOfWife;i++)
		{
			wifeList.add(new wifes("第"+(i+1)+"个wife"));
		}
	}
	public wifes(String name) {
		nameList.add(name);//传入妻子名称，建立一个妻子对象
	}
	public static wifes getInstance(){//随机获得一个妻子对象
		Random r = new Random();
		countNumOfWife = r.nextInt(maxNumOfWife);//随机拉出一个妻子
		return wifeList.get(countNumOfWife);
	}
	public static void say(){
		System.out.println(nameList.get(countNumOfWife));
	}
}

