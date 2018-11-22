//Random number 생성
//1.Math 클래스 사용(java.lang.Math)
//2.
import java.util.Scanner;
class RandomNumber{
	public static void main(String [] args){
		double randomNumber = Math.random();
		System.out.println(randomNumber);
		
		//1. 0이상 13미만의 실수형 난수
        double a = (double)(Math.random()*13);		
		System.out.println(a);
		System.out.println(Math.random()*13);
		
		//2. 0이상 13이하의 정수형 난수
		int b = (int)(Math.random()*13);
		System.out.println(b);
		System.out.println((int)(Math.random()*14));//13이하로 하고 싶음 14로
		
		//3. 7이상 23미만의 정수형 난수
		int c = (int)(Math.random()*(23+7));
		System.out.println(c);
		System.out.println((int)(Math.random()*16)+7);
		
		//4. 원의 반지름을 입력받아 원 둘레와 넓이 출력
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요: ");
		num = s.nextInt();
		System.out.println("원의 둘레는"+2*num*Math.PI+"입니다.");
		System.out.println("원의 넓이는 "+2*2*Math.PI+"입니다.");
	}
}