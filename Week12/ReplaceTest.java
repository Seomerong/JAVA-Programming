//java ReplaceTest 원본파일명(args[0]) 교체본파일명(args[1]) 구단어 신단어
import java.io.*;
import java.util.Scanner;

class ReplaceTest{
	public static void main(String [] args) throws FileNotFoundException{//예외처리, 그냥 exception적어도 됨
		if(args.length<2){
			System.out.println("Usage: java ReplaceTest 원본파일명 교체본파일명 구단어 신단어");
	        System.exit(1);
		}
	
		File original = new File(args[0]);
		//original 파일이 없는 경우 종료
		if(!original.exists()){
			System.out.println("원본파일이 존재하지 않아 프로그램 종료!");
			System.exit(2);
		}	
		File copy = new File(args[1]);
		//copy 파일이 이미 존재하는 경우 종료
		if(copy.exists()){
			System.out.println("복사본파일이 이미 존재해서 프로그램 종료!");
			System.exit(3);
		}
		
		Scanner s = new Scanner(original);
		PrintWriter pw = new PrintWriter(copy);
		String st, st1;
		
		while(s.hasNext()){
			st = s.nextLine();//st에서 구단어가 발견될 경우 신단어로 교체
			st1 = st.replaceAll(args[2], args[3]);
			pw.println(st1);
		}
		
		s.close();
		pw.close();
		
		System.out.format("%s를 %s로 교체 완료!\n", args[2], args[3]);
	}
}