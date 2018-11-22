# 생성자
- **객체가 생성될 때 필드에게 초기값을 제공하는 메서드**
- **메소드명이 클래스명과 같다.**
- **반환 타입이 없다.**
- **접근 지정자는 public이다.**
<pre>class Dog{
  ...
	//디폴트 생성자
	Dog(){ // 강아지 클래스의 생성자
		this("개똥이",3,5.0);
		}
	Dog(String n){ // 이름을 초기화하는 생성자
		name = n;
	}
	//이름과 나이를 초기화 하는 생성자
    Dog(String n, int age){
		this(n);//this = 이 객체
		if(age<0||age>100) this.age=5;
		else this.age = age;
	}
	//이름, 나이, 크기를 초기화하는 생성자
	Dog(String n, int age, double size){
		this(n, age); // 이름과 나이는 초기화
		if(size<1||size>10) this.size=5;
		else this.size = size;
	}
}</pre>
**생성자가 하나라도 정의되어 있으면 디폴트 생성자는 만들어 지지 않는다.**
#### 생성자 호출
- this()를 사용해 호출한다.
<pre>public class Car{
  ...
  public Car(String c, int s, int g){ // 첫번째 생성자
    ...
    }
  public Car(String c){//parameter하나인 생성자
    this(c,0,1); // 첫번째 생성자 호출
  }
}</pre>
