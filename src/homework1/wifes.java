package homework1;
import java.util.ArrayList;
import java.util.Random;


public class wifes {

	private static int maxNumOfWife = 4;//��������ܲ�����ʵ������
	private static ArrayList<String> nameList = new ArrayList<String>();//ÿ�����Ŷ������֣�ʹ��һ��ArrayList������ÿ�������˽������
	private static ArrayList<wifes> wifeList = new ArrayList<wifes>();//����һ���б��������е�����ʵ��
	private static int countNumOfWife = 0;//��ǰ���ӵ��к�
	static{
		for(int i=0;i<maxNumOfWife;i++)
		{
			wifeList.add(new wifes("��"+(i+1)+"��wife"));
		}
	}
	public wifes(String name) {
		nameList.add(name);//�����������ƣ�����һ�����Ӷ���
	}
	public static wifes getInstance(){//������һ�����Ӷ���
		Random r = new Random();
		countNumOfWife = r.nextInt(maxNumOfWife);//�������һ������
		return wifeList.get(countNumOfWife);
	}
	public static void say(){
		System.out.println(nameList.get(countNumOfWife));
	}
}

