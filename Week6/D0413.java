//���� 79: ����ڿ��� �ѹ����� ���� ���߱� ����
import java.util.Scanner;
class D0413{
	public static void main(String [] args){
		int jungdap = 79, usr, tries = 0;
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.print("����: ");
			usr = s.nextInt();
			tries++;
			
			if(usr>jungdap) System.out.println("������ �� �� �۽��ϴ�.");
			else if(usr<jungdap) System.out.println("������ �� �� Ů�ϴ�.");
			else break;//�ݺ��� ����������
		}while(usr!=jungdap);
			
			System.out.println("�����Դϴ�.");
			System.out.println(tries+"��");
	}
}