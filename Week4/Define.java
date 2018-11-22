import java.util.Scanner;
class Define{
	public static void main(String [] args){
		int a;
		String b;
		Scanner s = new Scanner(System.in);
		System.out.print("int형 정수를 하나 입력받으세요: ");
		a = s.nextInt();
		b = ((a&(1<<31))==(1<<31)) ? "음수" : "양수";
		System.out.print(b);
	}
}