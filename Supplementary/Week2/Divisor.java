import java.util.Scanner;
public class Divisor{
	public static void main(String [] args){
		int num, i;
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���: ");
		num = input.nextInt();
		
		System.out.println("100�� ����� ������ �����ϴ�.");
		for(i=1;i<=num;i++){
			if(num%i==0){
			System.out.printf("%d ",i);
			}
		}
	}
}