
//����
import java.util.Scanner;
class Test3{
	public static void main(String [] args){
		int year, month;
		Scanner s = new Scanner(System.in);
		System.out.print("�� ��: ");
		year = s.nextInt();
		System.out.print("�� ��: ");
		month = s.nextInt();
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d�� %d���� 31�ϱ��� �ֽ��ϴ�.\n", year, month);
			break;
			case 4: case 6: case 9: case 11:
			System.out.printf("%d�� %d���� 30�ϱ��� �ֽ��ϴ�.\n", year, month);
			break;
			case 2:
			if(((year%4==0)&&(year%100!=0))||(year%400==0)){
				System.out.printf("%d�� %d���� 29�ϱ��� �ֽ��ϴ�.\n", year, month);
			}
			else{
				System.out.printf("%d�� %d���� 28�ϱ��� �ֽ��ϴ�.\n", year, month);
			}
			break;
			default:
			System.out.println("�׷� ���� �����ϴ�.");
		}
	}
}