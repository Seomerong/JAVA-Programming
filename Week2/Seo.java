import java.util.Scanner;
public class Seo{
	public static void main(String [] args){
		int age;
		String name;
		double height;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("나이: ");
		age = myScanner.nextInt();
		
		System.out.print("키? ");
		height = myScanner.nextDouble();
		
		myScanner.nextLine();
		System.out.print("이름: ");
		name = myScanner.nextLine();
		
		System.out.println("나이: "+age);
		System.out.printf("이름은 %s입니다.\n", name);
		System.out.printf("입력하신 키는 %.1f입니다.\n", height);
		
		System.out.println("JRE: 자바 실행 환경");
		System.out.println("JDK: 자바 개발 환경");
	}
}