# 클래스
- **객체를 만드는 설계도로 그에 속한 객체를 인스턴스라고 부른다.**
##### 클래스의 구조
<pre>class 클래스이름{
  int field; // 필드 정의(객체 속성 나타냄)
  void method(parameter){
    ...
  }
}</pre>
<pre>class Box{
  int height;
  int length;
  int width;
  int volume(){
    return width*length*height;
  }
}</pre>
  - **객체: 상태와 동작을 가지고 있는 것**
    - 상태: 객체의 특징값(속성)
    - 동작: 객체가 취할 수 있는 동작
    ##### 객체의 생성
    <pre>Car myCar; // 참조변수 선언
    myCar = new Car(); // 객체 생성, 참조값 myCar에 저장</pre>
    ##### 객체의 필드와 메소드 접근
    - 도트연산자(.)를 사용
     <pre>myCar.speed = 100;
    // myCar가 참조하는 객체로부터 speed라는 필드에 접근</pre>
# 메소드
- **객체가 할 수 있는 기능을 나타낸다.**
- **클래스 안에 포함된 함수라고 볼 수 있다.**
#### 메소드 호출
<pre>class MethodTest{
    public static void main(String [] args){
        sumAB(3,7);//메소드 호출
    static void sumAB(int a, int b){//메소드 구현, 작성
        System.out.printf("%d와 %d의 합은 %d입니다.\n", a, b, a+b);        
    }
}</pre>
- **중복메소드: 메소드 이름은 같으나 매개변수가 다른것**
