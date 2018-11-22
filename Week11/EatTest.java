//강아지
//메소드: 음식을 매개변수로 받아 그 음식을 먹는 메소드
//음식 클래스
//햄버거클래스, 피자클래스, 딸기클래스, 콜라클래스
class Dog{
	void eat(Food f){
		System.out.println(f.getClass().getName()+"를 먹습니다.");
	}
	/*
	다형성 사용하지 X
	void eat(햄버거 h){
		System.out.println("햄버거를 먹습니다.");
	}
	void eat(피자 p){
		System.out.println("피자를 먹습니다.");
	}
	...
	*/
}
class Food{}
class 햄버거 extends Food{}
class 아이스크림 extends Food{}
class 피자 extends Food{}
class 딸기 extends Food{}
class 콜라 extends Food{}
class EatTest{
	public static void main (String [] args){
		햄버거 h = new 햄버거();
		피자 p = new 피자();
		딸기 d = new 딸기();
		콜라 c = new 콜라();
		아이스크림 i = new 아이스크림();
		
		Dog myDog = new Dog();
		myDog.eat(h);//햄버거를 먹습니다.
		myDog.eat(p);
		myDog.eat(d);
		myDog.eat(c);
		myDog.eat(i);
	}
}