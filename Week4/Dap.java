import java.util.Scanner;
class Dap{
	public static void main(String [] args){
		int userInput;
		int randomNumber = (int)(Math.random()*(100+1));
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 하나 입력하세요: ");
		userInput = s.nextInt();
		if(userInput == randomNumber){
			System.out.println("성공");
		}
		else if(userInput<randomNumber){
			System.out.println("dap보다 작습니다. dap은 "+randomNumber);
		}
		else{
			System.out.println("dap보다 큽니다. dap은 "+randomNumber);
		}
	}
}