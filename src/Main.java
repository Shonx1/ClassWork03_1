import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Въведете число:");
		int a = in.nextInt();
		
		if (a<0 && a%2==0) {
			System.out.println("Четно отрицателно.");
		}else if (a<0 && a%2==1) {
			System.out.println("Нечетно отрицателно.");
		}else if (a>0 && a%2==0) {
			System.out.println("Четно положително.");
		}else if (a<0 && a%2==1) {
			System.out.println("Нечетно  положително.");
		}else{
			System.out.println("НУла.");
	}
	}

}
