import java.util.Scanner;
class Define{
	public static void main(String [] args){
		int a;
		String b;
		Scanner s = new Scanner(System.in);
		System.out.print("int�� ������ �ϳ� �Է¹�������: ");
		a = s.nextInt();
		b = ((a&(1<<31))==(1<<31)) ? "����" : "���";
		System.out.print(b);
	}
}