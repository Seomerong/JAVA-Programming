//나이 입력받아서 그대로 출력하는 프로그램: inputAge()에서 구현
import java.util.Scanner;

class ThrowsTest2_2{
	public static void main(String [] args)throws NegativeAgeException, OverAgeException{
		inputAge();
		System.out.println("프로그램 종료!");
	}
    static void inputAge()throws NegativeAgeException, OverAgeException{
		Scanner s = new Scanner(System.in);
		System.out.print("나이: ");
		int age = s.nextInt();
		//age가 음수라면 예외발생, 아니라면 그대로 나이를 출려
		//사용자 정의 예외: 기본적으로 제공되고 있는 예외가 아니라 사용자가 정의한 예외
		if(age<0) throw new NegativeAgeException();//throw는 예외가 발생되었음을 JVM에게 알려줌.
		else if(age>=300) throw new OverAgeException();
		else System.out.println("입력한 나이는 "+age+"세 입니다.");
	}
}
class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("음수 나이 예외");// 이 예외에 대한 정보
	}
}
class OverAgeException extends Exception{
	OverAgeException(){
		super("300세 이상 나이 예외");// 이 예외에 대한 정보
	}
}
//사용자 정의 예외: 300세 이상의 나이를 가질 경우 발생되는 예외!