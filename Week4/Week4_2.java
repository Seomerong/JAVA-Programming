import java.util.Scanner;
class Week4_2{
	public static void main(String [] args){
		int size;
		Scanner s = new Scanner(System.in);
		System.out.print("컵의 사이즈를 입력하세요: ");
		size = s.nextInt();
		if(size<100){
			System.out.println("small");
		}
		else if(size>=100&&size<200){
			System.out.println("medium");
		}
		else{
			System.out.println("large");
		}
	}
}