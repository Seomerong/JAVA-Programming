//�� ���� ���� �����ﰢ�� �����
import java.util.Scanner;
class RightTriangleDan{
	public static void main(String [] args){
		int number, i, j;
		Scanner s = new Scanner(System.in);
		System.out.println("��: ");
		number = s.nextInt();
		for(i=0;i<number;i++){
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
		System.out.printf("\n");
		}
		
	}
}