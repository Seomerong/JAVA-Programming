//�ִ�����
import java.util.Scanner;
class Number{
	public static void main(String [] args){
		int x, y, tmp;
		Scanner s = new Scanner(System.in);
		System.out.print("�� ���� �Է����ּ���.");
		x = s.nextInt();
		y = s.nextInt();
		if(y>x){//x�� y�� ��ȯ�ϴ� �ڵ�/ x=10, y=15
			tmp = x;// tmp =10
			x = y;// x = 15
			y = tmp;// y = 10
			//tmp�� �������� ����
		}
		while(true){
			tmp = x%y;
			x = y;
			y = tmp;
			if(tmp==0) break;
		}
		System.out.println("�ִ������� "+x);
	}
}