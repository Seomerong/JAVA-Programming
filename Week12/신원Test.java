import java.io.*;//��� Ŭ����
import java.util.Scanner;

class �ſ�Test{
	public static void main(String [] args) throws Exception{//�̰� �ϸ� try catch���� �ڵ� © �� ����
		File f = new File("�ſ�.txt");
		Scanner s = new Scanner(f);
		File f2 = new File("�ſ�.java");
		PrintWriter pw = new PrintWriter(f2);
		
		pw.println("�ſ�����");
		pw.println("=================================================");
		pw.println();
		while(s.hasNext()){//������ ���� ������ ����о��
			pw.format("����: %s, �̸�: %s, ����: %d, ������: %.2f", s.next(), s.next(), s.nextInt(), s.nextDouble());
			pw.println();
			pw.println();
		}
		s.close();
		pw.close();
		System.out.println("���� �ۼ� �Ϸ�!");
	}
}