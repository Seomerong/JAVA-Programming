//���� ���� ���α׷�
//java CopyTest �������ϸ� ���纻���ϸ�
import java.io.*;
import java.util.Scanner;

class CopyTest{
	public static void main(String [] args) throws Exception{//����ó��
		if(args.length<2){
			System.out.println("Usage: java CopyTest �������ϸ� ���纻���ϸ�");
	        System.exit(1);
		}
	
		File original = new File(args[0]);
		//original ������ ���� ��� ����
		if(!original.exists()){
			System.out.println("���������� �������� �ʾ� ���α׷� ����!");
			System.exit(2);
		}	
		File copy = new File(args[1]);
		//copy ������ �̹� �����ϴ� ��� ����
		if(copy.exists()){
			System.out.println("���纻������ �̹� �����ؼ� ���α׷� ����!");
			System.exit(3);
		}
		
		Scanner s = new Scanner(original);
		PrintWriter pw = new PrintWriter(copy);
		String st;
		
		while(s.hasNext()){
			st = s.nextLine();
			pw.println(st);
		}
		
		s.close();
		pw.close();
		
		System.out.println("���� ���� �Ϸ�!");
	}
}