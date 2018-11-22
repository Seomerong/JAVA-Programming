import java.util.Scanner;
public class DoubleFloat{
	public static void main(String [] args){
		char gender;//변수 선언
		float f = 0.1f, f100 = 0, f10000 = 0;
		double d = 0.1, d100 = 0, d10000 = 0;
		
		//f(0.1)을 100번 더하기! = 10
		/*f100 = f100 + f; // f100 = 0.1
		f100 = f100 + f; // f100 = 0.2
		f100 = f100 + f; // f100 = 0.3
		f100 = f100 + f; // f100 = 0.4*/
		
		/*for(초기화;조건;증감문){
			반복할 문장
		}*/
		for(int i=0;i<100;i++){//선언과 초기화 같이 실행
			f100 = f100 + f;
		}
		System.out.println(f100);
		
		//1.d를 100번 더하기 = d100
		//2.f   10000        = f10000  
		//3.d   10000        = d10000
		for(int i=0;i<100;i++){
			d100 = d100 + d;
		}
		System.out.println(d100);
		//double타입이 좀더 정확하게 값이 나옴
		for(int i=0;i<10000;i++){
			f10000 = f10000 + f;
		}
		System.out.println(f10000);
		for(int i=0;i<10000;i++){
			d10000 = d10000 + d;
		}
		System.out.println(d10000);
		//계산할수록 오차 늘음
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("성별(f/m): ");
		//gender = s.next(); 이렇게 하면 버퍼오류
		gender = s.next().charAt(0);// 0번째 위치하는 문자를 gender에 넣겠다.
		                            // 배열에서 맨앞에 index는 0번째
									// (2)하면 세번째문자를 넣음.
		System.out.println("성별은 "+gender+"입니다.");
	}
}