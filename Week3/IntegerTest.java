public class IntegerTest{
	public static void main(String [] args){
		int a = 14, b = 8, c = -17;
		
		float f = 3.14F;//���� �߻�: 3.14(�⺻ Ÿ���� double�� ����)
		               //float�� ������ �ڷ�ս� �߻��ϱ� ����
		               //�ذ��� 1: casting(�ڷ���) float f = (float)3.14;
					   //�ذ��� 2: ���̻� ���̱� float f = 3.14F;
		System.out.format("%5.2f\n", f);
		double d = 3.14;
		System.out.format("%f\n", d);
		double e = 3.14f;//�սǹ߻�x=>��밡��
		System.out.format("%f\n", e);
		
		//a�� ���� ���: 10����(decimal), 8����(octal), 16����(hexadecimal)
		System.out.printf("%d %o %x \n", a, a, a); 
		System.out.printf("%d %1$o %1$x \n", a); //1$�� �տ� �ִ� ���� �������ڴ�.
		System.out.printf("%d %1$#o %1$#x \n", a);// #�� ���̸� �� �������� ǥ��/10������ �Ⱥ���
		
		//a, b, c�� ���
		System.out.printf("%5d\t%5d\t%5d\n", a ,b, c);//%d���̿� ���ڴ� ������ Ȯ���϶�� �� (3ĭ)14/������� �� �ټ�ĭ(Tab)(3ĭ)...
		System.out.format("%5d\t%5d\t%5d\n", a ,b, c);//������ printf()�� format()�̶� ���� ����. 
		                                              //�����ϰ� ��밡��
		System.out.format("%+5d\t%+5d\t%+5d\n", a ,b, c);//+: ��ȣǥ��
		System.out.format("%-5d\t%-5d\t%-5d\n", a ,b, c);//-: ��������
		System.out.format("%-+5d\t%-+5d\t%-+5d\n", a ,b, c);//��������&��ȣǥ��, -+������ ����
		/*������÷�� ���� �ø� ����Ȯ��*/
	}
}