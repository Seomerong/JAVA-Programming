//Random number ����
//1.Math Ŭ���� ���(java.lang.Math)
//2.
import java.util.Scanner;
class RandomNumber{
	public static void main(String [] args){
		double randomNumber = Math.random();
		System.out.println(randomNumber);
		
		//1. 0�̻� 13�̸��� �Ǽ��� ����
        double a = (double)(Math.random()*13);		
		System.out.println(a);
		System.out.println(Math.random()*13);
		
		//2. 0�̻� 13������ ������ ����
		int b = (int)(Math.random()*13);
		System.out.println(b);
		System.out.println((int)(Math.random()*14));//13���Ϸ� �ϰ� ���� 14��
		
		//3. 7�̻� 23�̸��� ������ ����
		int c = (int)(Math.random()*(23+7));
		System.out.println(c);
		System.out.println((int)(Math.random()*16)+7);
		
		//4. ���� �������� �Է¹޾� �� �ѷ��� ���� ���
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("���� �������� �Է��ϼ���: ");
		num = s.nextInt();
		System.out.println("���� �ѷ���"+2*num*Math.PI+"�Դϴ�.");
		System.out.println("���� ���̴� "+2*2*Math.PI+"�Դϴ�.");
	}
}