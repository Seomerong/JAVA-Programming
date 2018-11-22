import java.util.Scanner;
public class NumberGame{
	public static void main(String [] args){
		int a, b=0, i;
		a = (int)(Math.random()*100)+1;
		Scanner input = new Scanner(System.in);
		
		for(i=1;a!=b;i++){
			System.out.print("정답은? : ");
			b = input.nextInt();
			if(a>b){
			System.out.println("제시한 정수가 낮습니다.");
			}
			else if(a<b){
			System.out.println("제시한 정수가 높습니다.");
			}
			else{
			System.out.printf("정답입니다! 시도횟수 = %d\n",i);
			}
		}
	}
}