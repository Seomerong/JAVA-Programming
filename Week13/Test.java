import java.util.Scanner;

class Test{
	public static void main(String [] args)throws FileNotFounException{
		int x, y;
		Scanner s = new Scanner(System.in);
		System.out.print("x: ");
		x = s.nextInt();
		System.out.print("y: ");
		y = s.nextInt();
		
		File abcFile = new File("abc.txt");
		
		/*예외처리:
		-try-catch를 통해 직접 처리
		-throws를 통해 Exception 떠넘기기
		*/
		try{
			Scanner fileScanner = new Scanner(abcFile);//예외발생 가능/abc.txt가 없으니깐
			System.out.format("x/y = %d\n", x/y);//예외(프로그램 실행도중 말생하는 오류)발생: ArithmeticException 발생
			System.out.format("x+y = %d\n", x+y);//try에 나누기 문장 밑에 넣으면 위에서 catch되고 얘는 실행 안됨.
			System.out.format("x-y = %d\n", x-y);
		}catch(ArithmeticException ae){
			System.out.println("0으로는 나눌 수 없습니다.");
		}catch(FileNotFoundException fnfe){
			System.out.println("abc.txt 파일을 찾을 수 없습니다.");
		}
			System.out.format("x*y = %d\n", x*y);
	}
}