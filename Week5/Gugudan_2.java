import java.util.Scanner;
class Gugudan_2{
	public static void main(String [] args){
		int number, i, j;
		Scanner s = new Scanner(System.in);
		System.out.print("출력할 단: ");
		number = s.nextInt();
		for(i=1;i<10;i++){
			System.out.printf("%d * %d = %d\n", number, i, number*i);
		}
	}
}