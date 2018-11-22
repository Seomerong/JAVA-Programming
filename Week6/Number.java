//최대공약수
import java.util.Scanner;
class Number{
	public static void main(String [] args){
		int x, y, tmp;
		Scanner s = new Scanner(System.in);
		System.out.print("두 수를 입력해주세요.");
		x = s.nextInt();
		y = s.nextInt();
		if(y>x){//x와 y를 교환하는 코드/ x=10, y=15
			tmp = x;// tmp =10
			x = y;// x = 15
			y = tmp;// y = 10
			//tmp는 나머지를 저장
		}
		while(true){
			tmp = x%y;
			x = y;
			y = tmp;
			if(tmp==0) break;
		}
		System.out.println("최대공약수는 "+x);
	}
}