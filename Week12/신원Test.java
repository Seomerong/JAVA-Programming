import java.io.*;//모든 클래스
import java.util.Scanner;

class 신원Test{
	public static void main(String [] args) throws Exception{//이거 하면 try catch없이 코드 짤 수 있음
		File f = new File("신원.txt");
		Scanner s = new Scanner(f);
		File f2 = new File("신원.java");
		PrintWriter pw = new PrintWriter(f2);
		
		pw.println("신원정보");
		pw.println("=================================================");
		pw.println();
		while(s.hasNext()){//다음에 뭐가 있으면 계속읽어라
			pw.format("국적: %s, 이름: %s, 나이: %d, 몸무게: %.2f", s.next(), s.next(), s.nextInt(), s.nextDouble());
			pw.println();
			pw.println();
		}
		s.close();
		pw.close();
		System.out.println("파일 작성 완료!");
	}
}