//�ڵ��� ���� �ʱ� �հݿ���
import java.util.Scanner;
class NestedIf{
	public static void main(String [] args){
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.print("������� ���� �Է�(1��: 1, 2��: 2): ");
		a = s.nextInt();
		
		System.out.print("�ʱ� ������� ����:");
		b = s.nextInt();
		
		if(a == 1){
			if(b>=70){
			System.out.println("1�� ���� ���� �հ�");
			}
			else{
			System.out.println("1�� ���� ���� ���հ�");
			}
		}
		else if(a == 2){
			if(b>=60){
			System.out.println("2�� ���� ���� �հ�");
			}
			else{
			System.out.println("2�� ���� ���� ���հ�");
			}
		}
	}
}
/*
������� ������ String���� �����ÿ���
String a;
a = s.nextLine();

if(a.equals("1��"))//�Է��� ���� a�� �������x "1��"�� �ּҰ� a�� ����ǰ� ��
if(a=="1��")(x)://������ �������� == �� �� ��쿡�� ���� �񱳸� ���� �ʰ�, ������(�ּ�)��

Ȥ�� 
if(a.charAt(0)=='1')

*/