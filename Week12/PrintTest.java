//���� ���: ���α׷� ����� ���Ͽ� ���� : PrintWriter
//Hello, it's me �� ���Ͽ� ���!
import java.io.*;
import java.util.Scanner;

class PrintTest{
	public static void main(String [] args){
		File f = new File("abc.txt");
		//������ �̹� ������ ��� ���α׷� ����
		if(f.exists()==true){
			System.out.println("abc.txt ������ �̹� �����ؼ� ���α׷��� �����մϴ�.");
			//return;
			System.exit(1);
		}
		String name;
		int age;
		Scanner s = new Scanner(System.in);
		System.out.print("�̸�: ");
		name = s.nextLine();
		System.out.print("����: ");
		age = s.nextInt();
		
		try{//������ �߻��� ���� ������ �����غ���.
			PrintWriter pw = new PrintWriter(f);//���� ����Ϸ��� printwriter���
			
			pw.println("Hello, it's me");
			pw.println("�̸�: "+name+", ����: "+age);
			pw.close();//printwriter�� �����ϸ� ������ ������ ���� ���� �ݴ´�.
			/*pw.close();�� �� ���
			try(PrintWriter pw = new PrintWriter(f);){
				pw.println("Hello, it's me");
				pw.println("�̸�: "+name+", ����: "+age);
			}
			�̷��� �ص� ���డ��
			*/
		}catch(FileNotFoundException e){//���ܰ� �߻��ϸ� ��ڴ�./���� ���� �߻��ߴ��� ���� �������� �׳� Exception e
		//�ƴϸ� �����߻����� ������ ������ �˾Ƽ� 
			e.printStackTrace();
		}
		
	}
}