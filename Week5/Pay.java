//�ӱݰ��
import java.util.Scanner;
class Pay{
	public static void main(String [] args){
		int a, b;
		final int C = 5_000;
		Scanner s = new Scanner(System.in);
		System.out.print("���� �ð�: ");
		a = s.nextInt();
		
		if(a<8){
			b = a*C;
		}
		else{
			b = (8*C)+(int)((a-8)*C*1.5);
		}
		
		System.out.printf("�ӱ�: "+b);	
	}
}