//if문을 통해 변수 초기화
import java.util.Scanner;
class IfExample{
	public static void main(String [] args){//조건문을 통한 초기화
		int input, b;
		Scanner s = new Scanner(System.in);
		System.out.print("임의의 정수 하나를 입력하세요: ");
		input = s.nextInt();
		
		if(input>0){
			b = 1;
		}
		else if(input<0){
			b = -1;
		}
		else{
			b = 0;
		}
		/*
		else if(input==0){
			b = 0;
		}
		이렇게 하면 에러가 뜬다
		else if라 더 입력받는줄 앎.
		조건문을 통해 변수를 초기화 하려면 else로 끝내야함
		*/
		System.out.println(b);
	}
}