# 상속
- **장점**
  - 기존 클래스의 필드와 메소드를 재사용한다.
  - 복잡한 것도 순식간에 작성할 수 있다.
  - 코드의 중복을 줄일 수 있다.
- **상속의 사용**
<pre>class Animal{
  int age;
  ...
  void sleep(){
    ...
  }
}
class Cat extends Animal{ // Animal을 상속받는 Cat
  ... // int age;적을 필요없다.
}</pre>
# 재정의
- **서브클래스가 필요에 따라 상속된 메소드를 다시 정의하는 것**
- **재정의의 사용**
<pre>class Cat extends Animal{
  ...
  @Override // 적지않아도 프로그램은 돌아가나 적으면 간편하다.
  void sleep(){
    super.sleep();
    ...
  }
}</pre>
