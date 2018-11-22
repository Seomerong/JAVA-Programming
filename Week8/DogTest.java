/*
field- ����(int), �̸�(Sirng), ũ��(double):1-10
method-toString():�������� ������ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
*/

class Dog{
	private int age;
	private String name;
	private double size;
	
	//setter�� ������ ��� �ʵ尪�� �����ϴ� ����
	//�����ڴ� ��ü�� ������ �� �ʵ尪�� ����
	//setter�� ������ ���Ŀ� �ʵ尪�� �����ϰų� �����ϴ� ���
	
	/*
	������
	-�޼ҵ�-��ȯ Ÿ���̾��� �޼ҵ�
	-�޼ҵ���� Ŭ������� ��ġ
	-��ü�� �ʵ带 �ʱ�ȭ(������ ���� ó������ ����)
	*/
	
	public String toString(){//toString�� �⺻ ���� �޼ҵ�
		return String.format("�̸�:  %s, ����: %d, ũ��: %.2f", name, age, size);
		//return "�̸�:  "+name+", ����: "+age+", ũ��: "+size;
	}
	//����Ʈ ������
	Dog(){//������ Ŭ������ ������
		/*
		name = "������";
		age = 3;
		size = 5.0;
		*/
		this("������",3,5.0);
		}
	//�̸��� �ʱ�ȭ�ϴ� ������
	Dog(String n){
		name = n;
	}
	//�̸��� ���̸� �ʱ�ȭ �ϴ� ������
    Dog(String n, int age){
		this(n);//this = �� ��ü
		if(age<0||age>100) this.age=5;
		else this.age = age;
	}
	//�̸�, ����, ũ�⸦ �ʱ�ȭ�ϴ� ������
	Dog(String n, int age, double size){
		this(n, age);//�̸��� ���̴� �ʱ�ȭ
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
		//cos(0)���� � Math ��ü���� ����ϵ� ����� ����
		//cos(0)���� � ��ü���� ȣ���ص� ���� ����� ������ �޼ҵ带 static �޼ҵ��� ��: ������ �޼ҵ�
		
		//toString()�޼ҵ�� �ϴ� ���� ��ü�� ������ ����ϴ� �Ϸ� ����������, ��ü�� ���� ����� �ٸ�
		Dog myDog = new Dog("��������",10,15);
		//System.out.println(myDog.toString());//System.out,println(myDog);��� ���� ���
		System.out.println(myDog);
		
		Dog yourDog = new Dog();
		System.out.println(yourDog.toString());//mathŬ������ �ٸ��� mydog����� yourdog����� �ٸ� �� �ִ�
		
		//��� �����ڸ� ����ؼ� ������ 4���� �����
		Dog dog3 = new Dog("�ǻ�",10000);
		System.out.println(dog3);
		
		Dog dog4 = new Dog("�۸���",10000);
		System.out.println(dog4);
		
		
		Cat cat = new Cat();
		System.out.println(cat);
		System.out.println(cat.toString());
	}
}