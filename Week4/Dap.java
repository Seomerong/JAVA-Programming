import java.util.Scanner;
class Dap{
	public static void main(String [] args){
		int userInput;
		int randomNumber = (int)(Math.random()*(100+1));
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �ϳ� �Է��ϼ���: ");
		userInput = s.nextInt();
		if(userInput == randomNumber){
			System.out.println("����");
		}
		else if(userInput<randomNumber){
			System.out.println("dap���� �۽��ϴ�. dap�� "+randomNumber);
		}
		else{
			System.out.println("dap���� Ů�ϴ�. dap�� "+randomNumber);
		}
	}
}