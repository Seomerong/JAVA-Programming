//���� �Է¹޾Ƽ� �״�� ����ϴ� ���α׷�: inputAge()���� ����
import java.util.Scanner;

class ThrowsTest2_2{
	public static void main(String [] args)throws NegativeAgeException, OverAgeException{
		inputAge();
		System.out.println("���α׷� ����!");
	}
    static void inputAge()throws NegativeAgeException, OverAgeException{
		Scanner s = new Scanner(System.in);
		System.out.print("����: ");
		int age = s.nextInt();
		//age�� ������� ���ܹ߻�, �ƴ϶�� �״�� ���̸� ���
		//����� ���� ����: �⺻������ �����ǰ� �ִ� ���ܰ� �ƴ϶� ����ڰ� ������ ����
		if(age<0) throw new NegativeAgeException();//throw�� ���ܰ� �߻��Ǿ����� JVM���� �˷���.
		else if(age>=300) throw new OverAgeException();
		else System.out.println("�Է��� ���̴� "+age+"�� �Դϴ�.");
	}
}
class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("���� ���� ����");// �� ���ܿ� ���� ����
	}
}
class OverAgeException extends Exception{
	OverAgeException(){
		super("300�� �̻� ���� ����");// �� ���ܿ� ���� ����
	}
}
//����� ���� ����: 300�� �̻��� ���̸� ���� ��� �߻��Ǵ� ����!