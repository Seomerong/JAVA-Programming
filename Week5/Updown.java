//삼각형 위아래 뒤집기
import java.util.Scanner;
class Updown{
	public static void main(String [] args){
		int i, j;
		for(i=0;i<10;i++){
			for(j=0;j<10-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}