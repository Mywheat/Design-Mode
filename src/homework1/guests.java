package homework1;

public class guests {
	public static void main(String[] args) {
		int guestNum = 8;
		for (int i = 0; i < guestNum; i++) {
			wifes h = wifes.getInstance();
			System.out.print("��" + (i + 1) + "�����˻������: ");
			h.say();
		}
	}
}
