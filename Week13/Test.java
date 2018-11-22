import java.util.Scanner;

class Test{
	public static void main(String [] args)throws FileNotFounException{
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.print("x: ");
		x = s.nextInt();
		System.out.print("y: ");
		y = s.nextInt();
		
		File abcFile = new File("abc.txt");
		
		/*����ó��:
		-try-catch�� ���� ���� ó��
		-throws�� ���� Exception ���ѱ��
		*/
		try{
			Scanner fileScanner = new Scanner(abcFile);//���ܹ߻� ����/abc.txt�� �����ϱ�
			System.out.format("x/y = %d\n", x/y);//����(���α׷� ���൵�� �����ϴ� ����)�߻�: ArithmeticException �߻�
			System.out.format("x+y = %d\n", x+y);//try�� ������ ���� �ؿ� ������ ������ catch�ǰ� ��� ���� �ȵ�.
			System.out.format("x-y = %d\n", x-y);
		}catch(ArithmeticException ae){
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}catch(FileNotFoundException fnfe){
			System.out.println("abc.txt ������ ã�� �� �����ϴ�.");
		}
			System.out.format("x*y = %d\n", x*y);
	}
}