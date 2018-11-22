//나이 입력받아서 그대로 출력하는 프로그램: inputAge()에서 구현
import java.util.Scanner;

class ThrowsTest2{
	public static void main(String [] args){//throws NegativeAgeException 방법2//main도 떠넘김->대신 맡을 데가 없어서 예외처리가 제대로 안됨.
		//inputAge();
		//직접처리 :방법1
		try{
			inputAge();//NegativeAgeException 예외가 발생할 수 있는 코드
		}catch(NegativeAgeException nae){
			nae.printStackTrace();//개발((테스트용))
			//System.out.println("나이는 음수일 수 없습니다!!");//배포용
		}
			System.out.println("프로그램 종료!");
	}
    static void inputAge()throws NegativeAgeException{
		Scanner s = new Scanner(System.in);
		System.out.print("나이: ");
		int age = s.nextInt();
		//age가 음수라면 예외발생, 아니라면 그대로 나이를 출려
		//사용자 정의 예외: 기본적으로 제공되고 있는 예외가 아니라 사용자가 정의한 예외
		if(age<0) throw new NegativeAgeException();//throw는 예외가 발생되었음을 JVM에게 알려줌.
		else System.out.println("입력한 나이는 "+age+"세 입니다.");
	}
}
class NegativeAgeException extends Exception{
	NegativeAgeException(){
		super("음수 나이 예외");// 이 예외에 대한 정보
	}
}