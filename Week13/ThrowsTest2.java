//���� �Է¹޾Ƽ� �״�� ����ϴ� ���α׷�: inputAge()���� ����
import java.util.Scanner;

class ThrowsTest2{
	public static void main(String [] args){//throws NegativeAgeException ���2//main�� ���ѱ�->��� ���� ���� ��� ����ó���� ����� �ȵ�.
		//inputAge();
		//����ó�� :���1
		try{
			inputAge();//NegativeAgeException ���ܰ� �߻��� �� �ִ� �ڵ�
		}catch(NegativeAgeException nae){
			nae.printStackTrace();//����((�׽�Ʈ��))
			//System.out.println("���̴� ������ �� �����ϴ�!!");//������
		}
			System.out.println("���α׷� ����!");
	}
    static void inputAge()throws NegativeAgeException{
		Scanner s = new Scanner(System.in);
		System.out.print("����: ");
		int age = s.nextInt();
		//age�� ������� ���ܹ߻�, �ƴ϶�� �״�� ���̸� ���
		//����� ���� ����: �⺻������ �����ǰ� �ִ� ���ܰ� �ƴ϶� ����ڰ� ������ ����
		if(age<0) throw new NegativeAgeException();//throw�� ���ܰ� �߻��Ǿ����� JVM���� �˷���.
		else System.out.println("�Է��� ���̴� "+age+"�� �Դϴ�.");
	}
}
class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("���� ���� ����");// �� ���ܿ� ���� ����
	}
}