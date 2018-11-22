# Scanner class
- 자바 라이브러리 중 하나로 java.util 패키지에 포함된다.
- 키보드나 파일로부터 데이터를 입력받을 때 사용된다.
### import java.util.Scanner;
: 컴파일러에게 프로그램이 Scanner class를 사용함을 알려준다.
### Scanner s = new Scanner(System.in);
: Scanner class의 객체를 생성한다.

<br /> 
<br /> 다음 예시를 통해 Scanner class의 사용을 알아보자.
<br /> 
<pre>import java.util.Scanner;
public class Print{ //클래스 이름(Print)의 첫글자(P)는 대문자로 쓴다. 이때 클래스이름이랑 파일이름이랑 같게 한다.
  public static void main(String [] args){
    int age;
    Scanner myScanner = new Scanner(System.in);
    System.out.print("나이: "); //print는 줄바꿈안하고 출력, println은 줄바꿈하고 출력
    age = myScanner.nextInt(); //아까 만든 스캐너한테 정수 하나를 입력받으라하고 그걸 age에 저장한다.
    System.out.println("나이: "+age); //출력
    }
  }</pre>
<br /> 실행창에는 사용자가 입력한 숫자가 출력된다.
<br /> 그외 더 자세한 내용은 첨부된 'java_2주차_이론'에 적혀있다.
