import java.util.Scanner;
public class Ractangle{
	public static void main(String [] args){
		int a, b;
		double c, d;
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("사각형의 가로 크기: ");
		a = myScanner.nextInt();
		System.out.print("사각형의 세로 크기: ");
		b = myScanner.nextInt();
		
		c = a*b;
		d = 2*(a+b);
		System.out.println("사각형의 넓이: "+c);
		System.out.println("사각형의 둘레: "+d);
	}
}