import java.util.Scanner;
class Week4_1{
	public static void main(String [] args){
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		n = s.nextInt();
		if(n>=100){
			System.out.println("large");
		}
		else{
			System.out.println("small");
		}
	}
}