//������
//�޼ҵ�: ������ �Ű������� �޾� �� ������ �Դ� �޼ҵ�
//���� Ŭ����
//�ܹ���Ŭ����, ����Ŭ����, ����Ŭ����, �ݶ�Ŭ����
class Dog{
	void eat(Food f){
		System.out.println(f.getClass().getName()+"�� �Խ��ϴ�.");
	}
	/*
	������ ������� X
	void eat(�ܹ��� h){
		System.out.println("�ܹ��Ÿ� �Խ��ϴ�.");
	}
	void eat(���� p){
		System.out.println("���ڸ� �Խ��ϴ�.");
	}
	...
	*/
}
class Food{}
class �ܹ��� extends Food{}
class ���̽�ũ�� extends Food{}
class ���� extends Food{}
class ���� extends Food{}
class �ݶ� extends Food{}
class EatTest{
	public static void main (String [] args){
		�ܹ��� h = new �ܹ���();
		���� p = new ����();
		���� d = new ����();
		�ݶ� c = new �ݶ�();
		���̽�ũ�� i = new ���̽�ũ��();
		
		Dog myDog = new Dog();
		myDog.eat(h);//�ܹ��Ÿ� �Խ��ϴ�.
		myDog.eat(p);
		myDog.eat(d);
		myDog.eat(c);
		myDog.eat(i);
	}
}