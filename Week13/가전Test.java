//���� ��ǰ Ŭ����
//������, ���Ϸ�, TV, �����, ��������, ��Ź��
//������: ������ �Ű������� �޾� �ʵ� ������ �� ���·� �ʱ�ȭ�ϴ� ������
//toString()�޼ҵ� ������: ���� **������ ***�Դϴ�: ���� ���� 100������ �������Դϴ�.
imort java.util.Arrays;

class ���� implements Comparable{
	int price;
	public int compareTo(Object e){
		//���ϴ� �޼ҵ�
		//�� ��ü�� ���ݰ� �Ű������� ������ ���ؼ� �� ��ü�� ������ ������ 1��, ������ -1, ������ 0�� ��ȯ�ϵ��� �ۼ�
		if(e instanceof ����){
			if(this.price<((����)e).price) return -1;
			else if(this.price>((����)e).price) return 1;
			else return 0;
		}
		else return -100;//e�� ������ �ƴѰ��
	}
	����(int price){
		this.price = price;
	}
	void on(){//**�� �����ϴ�.
		System.out.println(this.getClass().getName()+"��(��) �����ϴ�.");
	}
	void off(){//**�� �����ϴ�.	
		System.out.println(this.getClass().getName()+"��(��) �����ϴ�.");
	}
	public String toString(){
		return String.format("%d����¥�� %s�Դϴ�.", price, this.getClass().getName());
	}
}

class ������ extends ����{
	������(int price){
		super(price);
	}
}
class ���Ϸ� extends ����{
	���Ϸ�(int price){
		super(price);
	}
}
class �������� extends ����{
	��������(int price){
		super(price);
	}
}
class TV extends ����{
	TV(int price){
		super(price);
	}
}
class ����� extends ����{
	�����(int price){
		super(price);
	}
}
class ��Ź�� extends ����{
	��Ź��(int price){
		super(price);
	}
}

class ����Test{
	public static void main(String [] args){
		���� [] �������� = {new ������(100), new ���Ϸ�(500), new ��������(20), new TV(1000), new �����(300), new ��Ź��(200)};
		for(���� e: ��������) System.out.println(e);
		int a = ��������[4].compareTo(��������[0]);
		if(a==-1) System.out.println("������ ��! �������� �� ���.");
		else if(a==0) System.out.println("���º�! ���ݵ���");
		else System.out.prinltn("����� ��! ����� �� ���.");
		
		//Arrays.sort(�迭);
		Arrays.sort(��������);
		for(���� e: ��������) System.out.println(e);
		
		
	}
}