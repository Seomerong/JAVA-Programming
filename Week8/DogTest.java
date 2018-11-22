/*
field- 나이(int), 이름(Sirng), 크기(double):1-10
method-toString():강아지의 정보를 문자열로 반환하는 메소드
*/

class Dog{
	private int age;
	private String name;
	private double size;
	
	//setter와 생성자 모두 필드값을 설정하는 역할
	//생성자는 객체가 생성될 때 필드값을 설정
	//setter는 생성된 이후에 필드값을 설정하거나 변경하는 기능
	
	/*
	생성자
	-메소드-반환 타입이없는 메소드
	-메소드명이 클래스명과 일치
	-객체의 필드를 초기화(변수에 값을 처을으로 대입)
	*/
	
	public String toString(){//toString은 기본 제공 메소드
		return String.format("이름:  %s, 나이: %d, 크기: %.2f", name, age, size);
		//return "이름:  "+name+", 나이: "+age+", 크기: "+size;
	}
	//디폴트 생성자
	Dog(){//강아지 클래스의 생성자
		/*
		name = "개똥이";
		age = 3;
		size = 5.0;
		*/
		this("개똥이",3,5.0);
		}
	//이름을 초기화하는 생성자
	Dog(String n){
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
		this(n, age);//이름과 나이는 초기화
		if(size<1||size>10) this.size=5;
		else this.size = size;
	}
}
class Cat{}
class DogTest{
	public static void main(String [] args){
		Math call = new Math();
		System.out.println(call.sin(0));
		
		Math cal2 = new Math();
		System.out.println(cal2.sin(0));
		
		System.out.println(Math.cos(0));
		//cos(0)은ㅇ 어떤 Math 객체에서 계산하든 결과가 동일
		//cos(0)같이 어떤 객체에서 호출해도 같은 결과가 나오는 메소드를 static 메소드라고 함: 정적인 메소드
		
		//toString()메소드는 하는 일은 객체의 정보를 출력하는 일로 고정되지만, 객체에 따라 결과가 다름
		Dog myDog = new Dog("내강아지",10,15);
		//System.out.println(myDog.toString());//System.out,println(myDog);적어도 같은 결과
		System.out.println(myDog);
		
		Dog yourDog = new Dog();
		System.out.println(yourDog.toString());//math클래스와 다르게 mydog결과와 yourdog결과가 다를 수 있다
		
		//모든 생성자를 사용해서 강아지 4마리 만들기
		Dog dog3 = new Dog("뽀삐",10000);
		System.out.println(dog3);
		
		Dog dog4 = new Dog("멍멍이",10000);
		System.out.println(dog4);
		
		
		Cat cat = new Cat();
		System.out.println(cat);
		System.out.println(cat.toString());
	}
}