import java.util.Scanner;
public class DoubleFloat{
	public static void main(String [] args){
		char gender;//���� ����
		float f = 0.1f, f100 = 0, f10000 = 0;
		double d = 0.1, d100 = 0, d10000 = 0;
		
		//f(0.1)�� 100�� ���ϱ�! = 10
		/*f100 = f100 + f; // f100 = 0.1
		f100 = f100 + f; // f100 = 0.2
		f100 = f100 + f; // f100 = 0.3
		f100 = f100 + f; // f100 = 0.4*/
		
		/*for(�ʱ�ȭ;����;������){
			�ݺ��� ����
		}*/
		for(int i=0;i<100;i++){//����� �ʱ�ȭ ���� ����
			f100 = f100 + f;
		}
		System.out.println(f100);
		
		//1.d�� 100�� ���ϱ� = d100
		//2.f   10000        = f10000  
		//3.d   10000        = d10000
		for(int i=0;i<100;i++){
			d100 = d100 + d;
		}
		System.out.println(d100);
		//doubleŸ���� ���� ��Ȯ�ϰ� ���� ����
		for(int i=0;i<10000;i++){
			f10000 = f10000 + f;
		}
		System.out.println(f10000);
		for(int i=0;i<10000;i++){
			d10000 = d10000 + d;
		}
		System.out.println(d10000);
		//����Ҽ��� ���� ����
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("����(f/m): ");
		//gender = s.next(); �̷��� �ϸ� ���ۿ���
		gender = s.next().charAt(0);// 0��° ��ġ�ϴ� ���ڸ� gender�� �ְڴ�.
		                            // �迭���� �Ǿտ� index�� 0��°
									// (2)�ϸ� ����°���ڸ� ����.
		System.out.println("������ "+gender+"�Դϴ�.");
	}
}