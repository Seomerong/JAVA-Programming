//���簢�� ���� ��� ���μ��� �Է¹ޱ�
//��, ���� ���� �� �ϳ��� ������ ����� �ɶ����� �ݺ��Է�
import java.util.Scanner;
class Rac{
	public static void main(String [] args){
	int width, height;
	Scanner s = new Scanner(System.in);
	
	while(true){
		System.out.print("����: ");
		width = s.nextInt();
		if(width>0) break;
	}
	while(true){
		System.out.print("����: ");
		height = s.nextInt();
		if(height>0) break;
	}
	System.out.printf("���̴� %d�Դϴ�.\n", (width*height));
	}
}