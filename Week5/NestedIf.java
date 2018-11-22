//자동차 면허 필기 합격여부
import java.util.Scanner;
class NestedIf{
	public static void main(String [] args){
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.print("면허시험 종류 입력(1종: 1, 2종: 2): ");
		a = s.nextInt();
		
		System.out.print("필기 면허시험 점수:");
		b = s.nextInt();
		
		if(a == 1){
			if(b>=70){
			System.out.println("1종 면허 시험 합격");
			}
			else{
			System.out.println("1종 면허 시험 불합격");
			}
		}
		else if(a == 2){
			if(b>=60){
			System.out.println("2종 면허 시험 합격");
			}
			else{
			System.out.println("2종 면허 시험 불합격");
			}
		}
	}
}
/*
면허시험 종류를 String으로 받을시에는
String a;
a = s.nextLine();

if(a.equals("1종"))//입력한 것은 a에 저장되지x "1종"의 주소가 a에 저장되게 됨
if(a=="1종")(x)://참조형 변수에서 == 을 쓸 경우에는 내용 비교를 하지 않고, 참조값(주소)비교

혹은 
if(a.charAt(0)=='1')

*/