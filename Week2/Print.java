import java.util.Scanner;//scanner는 java 아래 util아래 존재. import java.util.Scanner를 구글에 검색하면 scanner에대한 설명 나옴

public class Print{//앞에 public은 안써도 되는 것, 클래스 이름(Print)의 첫글자(P)는 대문자로, 클래스이름이랑 파일이름이랑 같게
	public static void main(String [] args){ // []는 배열을 나타냄, 중간에 쓴다. string형 배열을 나타냄
	//String클래스는 많이 써서 자바에서 지정해놔서 import하지 않아도 됨. ###여기까지는 고정####
		int age;//나이 저장할 메모리 공간 확보: 변수 선언
		String name;//문자열을 입력 받을 대는 String형 변수로 선언, c에서는 char name[20];
		double height;//실수를 저장할 공간 확보: 실수형 변수 선언
		

		Scanner myScanner = new Scanner(System.in);//c에서는 scanf("%d",&age);로 썼었음. 근데 자바는 객체지향언어라 다르다
		//새롭게 스캐너 만듦, System.in=표준입력: 키보드 =>키보드로부터 입력받는 스캐너
		//스캐너 이름이 myScanner  변수명, 클래스명이 두단어 이상의 합성어(myScanner)일 경우 두번째 단어의 첫 문자(S)는 대문자로!
		System.out.print("나이: ");
		//print는 줄바꿈안하고 출력, println은 줄바꿈하고 출력, print에서 줄바꿈하고 싶으면 ("~~~\n")
		
		age = myScanner.nextInt();//아까 만든 스캐너한테 정수 하나를 입력받으라하고 그걸 age에 저장!
		
		System.out.print("키? ");
		height = myScanner.nextDouble();//그 다음 실수를 읽고 height에 저장.


		
		myScanner.nextLine();//버퍼 비우는 용도 => 2. 앞에 myScanner.nextLine();를 써주자.
		System.out.print("이름: ");
		name = myScanner.nextLine();//myScanner가 읽은 것을 name에다가 저장해라. 
                //nextLine은 Enter도 입력으로 여김 그래서 앞에서 정수를 누르고 enter를 누르면 입력으로 이해하고 
                  name을 적을 새도 없이 바로 실행됨.=> 1. nextLine대신 next로 쓰자.
		
		System.out.println("나이: "+age);//출력
		//System.out.println("이름은 "+name+"입니다.");
		System.out.printf("이름은 %s입니다.\n", name);//f는 formatted의 약자로 서식지정자로 사용가능. 입력받은 name 출력
		//위의것과 같은 결과를 도출함.
		System.out.printf("입력하신 키는 %f입니다.\n", height);
		
		System.out.println("JRE: 자바 실행 환경"); //출력
		System.out.println("JDK: 자바 개발 환경");
	}
	//Scanner(대문자 S를 사용해서 클래스임.)의 
	//1. 메소드(=함수)
	//2. 버퍼 정수int-서식지정자: %d 실수double-%(lf-다음에 알아보겠어용~~) 문자char-%c 문자열String-%s(기초자료형이 아니기 때문에 대문자S)
 	
}