//정답 79: 사용자에게 한번만에 정답 맞추기 게임
import java.util.Scanner;
class D0413{
	public static void main(String [] args){
		int jungdap = 79, usr, tries = 0;
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.print("정답: ");
			usr = s.nextInt();
			tries++;
			
			if(usr>jungdap) System.out.println("정답은 좀 더 작습니다.");
			else if(usr<jungdap) System.out.println("정답은 좀 더 큽니다.");
			else break;//반복문 빠져나오기
		}while(usr!=jungdap);
			
			System.out.println("정답입니다.");
			System.out.println(tries+"번");
	}
}