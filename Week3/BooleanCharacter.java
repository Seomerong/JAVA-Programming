import java.util.Scanner;

public class BooleanCharacter{
	public static void main(String [] args){
		char a = 'h';// 문자는 작은따옴표 안에 문자 하나만!!!
		char b = '\uac00';// \n는 유니코드를 의미. ac00은 '가'를 의미
		String h = "hello";// 문자열은 큰따옴표안에
		boolean b1 = true;
		boolean b2 = 3>4;
		
		System.out.println(b1+" "+b2);
		System.out.println(b);
		
		//1.화씨온도 입력받고 섭씨온도 출력하기
		double num1, num2;
		Scanner s = new Scanner(System.in);
		System.out.print("화씨온도를 입력하세요. ");
		num1 = s.nextDouble();
		num2 = (num1-32)*5/9;
		System.out.println("화씨온도 "+num1+"는 섭씨온도 "+num2+"로 나타낼 수 있습니다.");
	}
}