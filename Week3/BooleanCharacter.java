import java.util.Scanner;

public class BooleanCharacter{
	public static void main(String [] args){
		char a = 'h';// ���ڴ� ��������ǥ �ȿ� ���� �ϳ���!!!
		char b = '\uac00';// \n�� �����ڵ带 �ǹ�. ac00�� '��'�� �ǹ�
		String h = "hello";// ���ڿ��� ū����ǥ�ȿ�
		boolean b1 = true;
		boolean b2 = 3>4;
		
		System.out.println(b1+" "+b2);
		System.out.println(b);
		
		//1.ȭ���µ� �Է¹ް� �����µ� ����ϱ�
		double num1, num2;
		Scanner s = new Scanner(System.in);
		System.out.print("ȭ���µ��� �Է��ϼ���. ");
		num1 = s.nextDouble();
		num2 = (num1-32)*5/9;
		System.out.println("ȭ���µ� "+num1+"�� �����µ� "+num2+"�� ��Ÿ�� �� �ֽ��ϴ�.");
	}
}