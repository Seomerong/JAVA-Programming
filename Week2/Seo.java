import java.util.Scanner;
public class Seo{
	public static void main(String [] args){
		int age;
		String name;
		double height;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("����: ");
		age = myScanner.nextInt();
		
		System.out.print("Ű? ");
		height = myScanner.nextDouble();
		
		myScanner.nextLine();
		System.out.print("�̸�: ");
		name = myScanner.nextLine();
		
		System.out.println("����: "+age);
		System.out.printf("�̸��� %s�Դϴ�.\n", name);
		System.out.printf("�Է��Ͻ� Ű�� %.1f�Դϴ�.\n", height);
		
		System.out.println("JRE: �ڹ� ���� ȯ��");
		System.out.println("JDK: �ڹ� ���� ȯ��");
	}
}