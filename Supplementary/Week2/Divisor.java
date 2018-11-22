import java.util.Scanner;
public class Divisor{
	public static void main(String [] args){
		int num, i;
		
		Scanner input = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		num = input.nextInt();
		
		System.out.println("100의 약수는 다음과 같습니다.");
		for(i=1;i<=num;i++){
			if(num%i==0){
			System.out.printf("%d ",i);
			}
		}
	}
}