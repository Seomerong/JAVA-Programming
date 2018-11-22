class Animal{
    int age;
	Animal(int age){
		this.age=age;
		System.out.format("���̰� %d���� ���� ����!!", age);
	}
	Animal(){
		System.out.println("���� ����!!");
	}
	void sleep(){
		System.out.println("�ܴ�!!sleep!!!");
	}
	void eat(){
		System.out.println("�Դ´�!!eat!!�̳� �Դ´�!!");
	}
}
//�����: ����, ����: 5���� ���� ����� ����!!
class Cat extends Animal{
    //int age �����ʿ�x animalŬ�������� ��ӹ޾ұ� ����
	String color;
	Cat(int age, String color){
		super(age);//Animal(int age)�޼ҵ尡 ȣ���. �θ�Ŭ�������� �����ϵ��� ��.
		//super.age=age �� �� ����x �θ�Ŭ������ ħ���ϴ� �ɷ� ����
		this.color=color;
		System.out.format("%s ������ �Ŀ��� ����!!", this.color);
	}
	Cat(){
		System.out.println("�Ŀ��� ����!!");
	}
	@Override//�����ʾƵ� ���ư�. ������ ������ ����
	//������ sleep��� slip�̶�� �߸������� �����Ϸ��� ���� ������ ����� �϶�� �˷���
	void sleep(){//�ܴ�!!���� ������!
		super.sleep();
		System.out.println("���� ������!");
	}
	void play(){
		System.out.println("�̾߿����˿�!!");
	}
}
class Dog extends Animal{
	Dog(){
		System.out.println("�۸��� ����!!");
	}
	@Override//�������̵�(������): �θ� Ŭ������ �޼ҵ带 �ڽ�Ŭ������ �°� ����!
	void sleep(){//�ܴ�!!���� �۸���!
		super.sleep();//�θ�Ŭ���� �̸��Ժη� �θ��� �ʾƼ� super ����. dogŬ���� ������ ������ �� this���� ����. Animal.sleep ��� super.sleep
		System.out.println("���� �۸���!");
		
	}
	void bark(){
		System.out.println("�пппͤǾƷֿͤ���������������");
	}
	
}

class TestAnimal{
	public static void main(String [] args){
		Dog d = new Dog();
		d.sleep();
		Cat c = new Cat();
		c.sleep();
		new Cat(5,"����");
	}
}