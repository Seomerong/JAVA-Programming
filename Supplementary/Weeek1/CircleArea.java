import java.util.Scanner;
public class CircleArea{
	public static void main(String [] args){
		int a;
		double b;
		Scanner myScanner = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���: ");
		a = myScanner.nextInt();
		b = a*a*3.14;
		System.out.printf(""+b);
	}
}