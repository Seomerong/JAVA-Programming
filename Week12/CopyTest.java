//파일 복사 프로그램
//java CopyTest 원본파일명 복사본파일명
import java.io.*;
import java.util.Scanner;

class CopyTest{
	public static void main(String [] args) throws Exception{//예외처리
		if(args.length<2){
			System.out.println("Usage: java CopyTest 원본파일명 복사본파일명");
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
		String st;
		
		while(s.hasNext()){
			st = s.nextLine();
			pw.println(st);
		}
		
		s.close();
		pw.close();
		
		System.out.println("파일 복사 완료!");
	}
}