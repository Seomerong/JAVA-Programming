//������ Ŭ����
//�ʵ�: ������
//������: �������� �Ű������� �޾� �ʵ� �������� �ʱ�ȭ
//Object Ŭ������ toString()�޼ҵ� ������: ������ ������ ��ȯ�ϵ���
//Object Ŭ������ equals()�޼ҵ� ������: �������� ������ ���� �����ŷ� �ν��ϵ��� ������
//�ι������� 2��, �׹������� 1�� �����ؼ� toString()�׽�Ʈ
//equals() �޼ҵ� �׽�Ʈ
//heyjk90@gmail.com

class Bike{
    int wheel;
    Bike(){
		
	}
    Bike(int wheel){
		if(wheel<0||wheel>5)
			this.wheel = 4;
		else
			this.wheel = wheel;
	}
	@Override
	public String toString(){
		return "�������� "+wheel;
	}
	@Override
	public boolean equals(Object obj){
		return this.wheel == ((Bike)obj).wheel;
	}
}
class BikeTest{
	public static void main(String[]args){
		Bike b1 = new Bike(2);
		Bike b2= new Bike(2);
		Bike b3 = new Bike(4);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println(b2.equals(b3));
	}
}