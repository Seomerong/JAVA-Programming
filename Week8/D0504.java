//1. �� �Ǽ��� �Ű������� �޾� �� ���� ���� ����ϴ� �޼ҵ�
//2. �� �Ǽ��� �Ű������� �޾� �� ���� ���� ��ȯ�ϴ� �޼ҵ�
//3. �� ������ �Ű������� �޾� �� ������ ��ġ ���� ����� ��ȯ�ϴ� �޼ҵ�, �� �� ������ �������� ��� ��ҹ��� ����

class D0504{
	//D0504 d0 = new D0504();������ 
	
	public static void main(String [] args){
		printSum(3,4.2);
		System.out.printf("%.2f\n",mult(2,5.4));
		System.out.printf("abc","ABC");//d0.equals(~~)���� ȣ�Ⱑ��
	}
	static boolean equals(String a, String b){//static�Ƚ�����
		return a.equlalsIgnoreCase(b);
	}
	static void printSum(double a, double b){
		System.out.printf("%.2f\n", a+b);
	}
	static double mult(double a, double b){//main �̶� ���� class�� �־ static
		return a*b;
	}
	
}