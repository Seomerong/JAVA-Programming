//if���� ���� ���� �ʱ�ȭ
import java.util.Scanner;
class IfExample{
	public static void main(String [] args){//���ǹ��� ���� �ʱ�ȭ
		int input, b;
		Scanner s = new Scanner(System.in);
		System.out.print("������ ���� �ϳ��� �Է��ϼ���: ");
		input = s.nextInt();
		
		if(input>0){
			b = 1;
		}
		else if(input<0){
			b = -1;
		}
		else{
			b = 0;
		}
		/*
		else if(input==0){
			b = 0;
		}
		�̷��� �ϸ� ������ ���
		else if�� �� �Է¹޴��� ��.
		���ǹ��� ���� ������ �ʱ�ȭ �Ϸ��� else�� ��������
		*/
		System.out.println(b);
	}
}