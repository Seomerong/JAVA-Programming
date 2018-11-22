class Animal{
    int age;
	Animal(int age){
		this.age=age;
		System.out.format("나이가 %d살인 동물 생성!!", age);
	}
	Animal(){
		System.out.println("동물 생성!!");
	}
	void sleep(){
		System.out.println("잔다!!sleep!!!");
	}
	void eat(){
		System.out.println("먹는다!!eat!!겁내 먹는다!!");
	}
}
//고양이: 나이, 색상: 5살의 검은 고양이 생성!!
class Cat extends Animal{
    //int age 적을필요x animal클래스에서 상속받았기 때문
	String color;
	Cat(int age, String color){
		super(age);//Animal(int age)메소드가 호출됨. 부모클래스에서 생성하도록 함.
		//super.age=age 는 잘 쓰지x 부모클래스를 침범하는 걸로 보임
		this.color=color;
		System.out.format("%s 색상의 냐옹이 생성!!", this.color);
	}
	Cat(){
		System.out.println("냐옹이 생성!!");
	}
	@Override//적지않아도 돌아감. 하지만 적으면 간편
	//재정의 sleep대신 slip이라고 잘못적으면 컴파일러가 보고 재정의 제대로 하라고 알려줌
	void sleep(){//잔다!!나는 꼬넁이!
		super.sleep();
		System.out.println("나는 꼬넁이!");
	}
	void play(){
		System.out.println("이야오오옹옹!!");
	}
}
class Dog extends Animal{
	Dog(){
		System.out.println("멍멍이 생성!!");
	}
	@Override//오버라이드(재정의): 부모 클래스의 메소드를 자식클래스에 맞게 수정!
	void sleep(){//잔다!!나는 멍멍이!
		super.sleep();//부모클래스 이름함부로 부르지 않아서 super 적음. dog클래스 생성자 생성할 때 this같은 개념. Animal.sleep 대신 super.sleep
		System.out.println("나는 멍멍이!");
		
	}
	void bark(){
		System.out.println("왈왈왈와ㅗ아롸와ㅏㅏ으르르르으를");
	}
	
}

class TestAnimal{
	public static void main(String [] args){
		Dog d = new Dog();
		d.sleep();
		Cat c = new Cat();
		c.sleep();
		new Cat(5,"검은");
	}
}