/*
강아지 1마리
고양이 1마리
새 1마리
도마뱀 1마리
뱀 1마리
애완동물 5마리에게 이름을 말해라!

강아지, 고양이, 새,도마뱀,뱀 클래스 - 이름, 이름을 출력하는 메소드,
*/
class PetTest{
	public static void main(String [] args){
		Pet [] myPets = new Pet[5];//내 애완동물들의 배열 
		myPets[0] = new Dog("메롱이");//new Dog();인 디폴트 생성자로 받으면 X
		myPets[1] = new Cat("메주");
		myPets[2] = new Bird("메실");
		myPets[3] = new Smoothskink("메미");
		myPets[4] = new Snake("메옹");
		for(Pet myPet:myPets){//myPets: 메롱이, 메주, 메실,...
			myPet.printName();
		}
	}
}
class Pet{
	String name;
	Pet(String name){
		this.name = name;
	}
	void printName(){
		System.out.println("내 이름은 "+name+"입니다.");
	}	
}
class Dog extends Pet{//Pet에 들어가는 내용을 그대로 복사하겠다. extends는 Pet클래스를 상속받겠다는 의미
}
//Pet: 부모 클래스, 수퍼 클래스
//Dog: 자식 클래스, 서브 클래스
class Cat extends Pet{
}
class Bitf extends Pet{
}
class Smoothskink extends Pet{
}
class Snake extends Pet{
}
/*class Dog{
	String name;
	Dog(String name){
		this.name = name;
	}
	void printName(){
		System.out.println("강아지 이름은 "+name+"입니다.");
	}
}
class Cat{
	String name;
	Cat(String name){
		this.name = name;
	}
	void printName(){
		System.out.println("고양이 이름은 "+name+"입니다.");
	}
}
class Bird{
	String name;
	Bird(String name){
		this.name = name;
	}
	void printName(){
		System.out.println("새 이름은 "+name+"입니다.");
	}
}
class Smoothskink{
	String name;
	Smoothskink(String name){
		this.name = name;
	}
	void printName(){
		System.out.println("도마뱀 이름은 "+name+"입니다.");
	}
}
class Snake{
	String name;
	Snake(String name){
		this.name = name;
	}
	void printName(){
		System.out.println("뱀 이름은 "+name+"입니다.");
	}
}
*/