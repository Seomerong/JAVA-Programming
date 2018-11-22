//���� ��ǰ Ŭ����
//������, ���Ϸ�, TV, �����, ��������, ��Ź��
abstract class ����{
	void on(){//**�� �����ϴ�.
		System.out.println(this.getClass().getName()+"��(��) �����ϴ�.");
	}
	void off(){//**�� �����ϴ�.	
		System.out.println(this.getClass().getName()+"��(��) �����ϴ�.");
	}
}
//������, ���Ϸ�, ��������: �µ��� �����ϴ� ����� ���� �޼ҵ� ����
//������ �Ű������� �޾� �� �µ��� �����ϴ� �޼ҵ�
class ������ extends ���� implements Adjustable{
	public void adjust(int a){
		System.out.println(a+"�� �µ� �����߽��ϴ�.");
	}
}
class ���Ϸ� extends ���� implements Adjustable{
	public void adjust(int a){
		System.out.println(a+"�� �µ� �����߽��ϴ�.");
	}
}
class �������� extends ���� implements Adjustable{
	public void adjust(int a){
		System.out.println(a+"�� �µ� �����߽��ϴ�.");
	}
}

class TV extends ����{}
class ����� extends ����{}
class ��Ź�� extends ����{}

interface Adjustable{
	//abstract void adjust(int a);
	void adjust(int a);//abstract ��������
}

class �����׽�Ʈ{
	public static void main(String [] args){
		���� [] �������� = {new ������(), new ���Ϸ�(), new ��������(), new TV(), new �����(), new ��Ź��()};
		for(���� e : ��������){
			e.on();
			e.off();
		}
		//������, ���Ϸ�, �������� ��� 100���� �����
		Adjustable [] �µ����������� = {new ������(), new ���Ϸ�(), new ��������()};
		for(Adjustable adj: �µ�����������) adj.adjust(100);
		/*
		((������)��������[0]).adjust(100);
		((���Ϸ�)��������[1]).adjust(100);
		((��������)��������[2]).adjust(100);
		*/
	}
}