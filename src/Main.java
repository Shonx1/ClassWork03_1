import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("�������� �����:");
		int a = in.nextInt();
		
		if (a<0 && a%2==0) {
			System.out.println("����� �����������.");
		}else if (a<0 && a%2==1) {
			System.out.println("������� �����������.");
		}else if (a>0 && a%2==0) {
			System.out.println("����� �����������.");
		}else if (a<0 && a%2==1) {
			System.out.println("�������  �����������.");
		}else{
			System.out.println("����.");
	}
	}

}
