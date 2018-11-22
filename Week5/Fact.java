//n!구하고 overflow발생하는 지점알아내기
import java.util.Scanner;
class Fact{
	public static void main(String [] args){
		int number, i, fact=1, fact2=1;
		Scanner s = new Scanner(System.in);
		System.out.print("number: ");
		number = s.nextInt();
		
		for(i=1;i<=number;i++){
			fact = fact * i;
			if(fact/i!=fact2){
				System.out.println(i+"!에서 overflow발생");
			}
			
			fact2 = fact;
		}
	}
}