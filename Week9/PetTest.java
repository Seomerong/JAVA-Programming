/*
������ 1����
����� 1����
�� 1����
������ 1����
�� 1����
�ֿϵ��� 5�������� �̸��� ���ض�!

������, �����, ��,������,�� Ŭ���� - �̸�, �̸��� ����ϴ� �޼ҵ�,
*/
class PetTest{
	public static void main(String [] args){
		Pet [] myPets = new Pet[5];//�� �ֿϵ������� �迭 
		myPets[0] = new Dog("�޷���");//new Dog();�� ����Ʈ �����ڷ� ������ X
		myPets[1] = new Cat("����");
		myPets[2] = new Bird("�޽�");
		myPets[3] = new Smoothskink("�޹�");
		myPets[4] = new Snake("�޿�");
		for(Pet myPet:myPets){//myPets: �޷���, ����, �޽�,...
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
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
	}	
}
class Dog extends Pet{//Pet�� ���� ������ �״�� �����ϰڴ�. extends�� PetŬ������ ��ӹްڴٴ� �ǹ�
}
//Pet: �θ� Ŭ����, ���� Ŭ����
//Dog: �ڽ� Ŭ����, ���� Ŭ����
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
		System.out.println("������ �̸��� "+name+"�Դϴ�.");
	}
}
class Cat{
	String name;
	Cat(String name){
		this.name = name;
	}
	void printName(){
		System.out.println("����� �̸��� "+name+"�Դϴ�.");
	}
}
class Bird{
	String name;
	Bird(String name){
		this.name = name;
	}
	void printName(){
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
	}
}
class Smoothskink{
	String name;
	Smoothskink(String name){
		this.name = name;
	}
	void printName(){
		System.out.println("������ �̸��� "+name+"�Դϴ�.");
	}
}
class Snake{
	String name;
	Snake(String name){
		this.name = name;
	}
	void printName(){
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
	}
}
*/