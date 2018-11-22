//임금계산
import java.util.Scanner;
class Pay{
	public static void main(String [] args){
		int a, b;
		final int C = 5_000;
		Scanner s = new Scanner(System.in);
		System.out.print("일한 시간: ");
		a = s.nextInt();
		
		if(a<8){
			b = a*C;
		}
		else{
			b = (8*C)+(int)((a-8)*C*1.5);
		}
		
		System.out.printf("임금: "+b);	
	}
}