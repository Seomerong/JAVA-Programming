import java.util.Scanner;
public class Ractangle{
	public static void main(String [] args){
		int a, b;
		double c, d;
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("�簢���� ���� ũ��: ");
		a = myScanner.nextInt();
		System.out.print("�簢���� ���� ũ��: ");
		b = myScanner.nextInt();
		
		c = a*b;
		d = 2*(a+b);
		System.out.println("�簢���� ����: "+c);
		System.out.println("�簢���� �ѷ�: "+d);
	}
}