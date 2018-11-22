//파일 출력: 프로그램 결과를 파일에 저장 : PrintWriter
//Hello, it's me 를 파일에 출력!
import java.io.*;
import java.util.Scanner;

class PrintTest{
	public static void main(String [] args){
		File f = new File("abc.txt");
		//파일이 이미 존재할 경우 프로그램 종료
		if(f.exists()==true){
			System.out.println("abc.txt 파일이 이미 존재해서 프로그램을 종료합니다.");
			//return;
			System.exit(1);
		}
		String name;
		int age;
		Scanner s = new Scanner(System.in);
		System.out.print("이름: ");
		name = s.nextLine();
		System.out.print("나이: ");
		age = s.nextInt();
		
		try{//문제가 발생할 수도 있으나 실행해본다.
			PrintWriter pw = new PrintWriter(f);//파일 출력하려면 printwriter사용
			
			pw.println("Hello, it's me");
			pw.println("이름: "+name+", 나이: "+age);
			pw.close();//printwriter로 접근하면 무조건 파일은 열고 나면 닫는다.
			/*pw.close();안 쓸 경우
			try(PrintWriter pw = new PrintWriter(f);){
				pw.println("Hello, it's me");
				pw.println("이름: "+name+", 나이: "+age);
			}
			이렇게 해도 실행가능
			*/
		}catch(FileNotFoundException e){//예외가 발생하면 잡겠다./무슨 오류 발생했는지 적기 귀찮으면 그냥 Exception e
		//아니면 오류발생문제 일일이 적던지 알아서 
			e.printStackTrace();
		}
		
	}
}