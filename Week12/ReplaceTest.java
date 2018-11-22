//java ReplaceTest �������ϸ�(args[0]) ��ü�����ϸ�(args[1]) ���ܾ� �Ŵܾ�
import java.io.*;
import java.util.Scanner;

class ReplaceTest{
	public static void main(String [] args) throws FileNotFoundException{//����ó��, �׳� exception��� ��
		if(args.length<2){
			System.out.println("Usage: java ReplaceTest �������ϸ� ��ü�����ϸ� ���ܾ� �Ŵܾ�");
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
		String st, st1;
		
		while(s.hasNext()){
			st = s.nextLine();//st���� ���ܾ �߰ߵ� ��� �Ŵܾ�� ��ü
			st1 = st.replaceAll(args[2], args[3]);
			pw.println(st1);
		}
		
		s.close();
		pw.close();
		
		System.out.format("%s�� %s�� ��ü �Ϸ�!\n", args[2], args[3]);
	}
}