/*final �ʵ�: ���
      Ŭ����: ��ӺҰ�
	  �޼ҵ�: ������ �Ұ�
*/
/*
Ż��: �θ�
-�ʵ�: ������
-������: �������� �ʱ�ȭ �ϴ� ������

������: �ڽ�
-�ʵ�: ������
-������: �������� �ʱ�ȭ�ϴ� ������

�ڵ���: �ڽ�
-�ʵ�: ������, ������
-������: �������� �����縦 �Ű������� �޾� �ʱ�ȭ�ϴ� ������
*/
class Test8{
	public static void main(String [] args){
		Bike b1 = new Bike(3);//=�ڿ��� ���������� ���� = �տ��� ������ �̸��� b1�̶�� �ϴ°� 
		Vehicle b2 = new Bike(2); //�����ϴ�
		//���������� �ϳ��� �����ߴµ� �װ��� �̸��� b1�̰� Ż ���̴�.
		Bike b3 = new Bike(2);
		Vehicle c1 = new Car(6,"����");
		//��ĳ����, Vehicle�� ��ӹ޾ұ� ������ ������
		System.out.println(c1.wheel);//6
		//System.out.println(c1.OEM);//����
		//c1�� Ż ���ε� �ڵ����� ����Ű�� �ִ�.
		//�ٵ� c1�� �ʵ尡 wheel�� ���� OEM�� ������ ���� �ʾ� ���� �ȵ�.
		System.out.println(((Car)c1).OEM);//����//�ٿ�ĳ����:�����Ҽ��� ���Ҽ���
		
		Car c2 = new Car(4,"����");
		System.out.println(c2.wheel);//4
		System.out.println(c2.OEM);//����
		//�ݸ� c2�� Car�̱� ������ ����
		System.out.println("Ż ���� ��: "+Vehicle.numOfVehicle);
		System.out.println("c1, b1 ��: "+c1.equals(b1));//c1, b1��
	    
		Car myCar = (Car)c1;
		Bike myBike = (Bike)c1;
		
		Object o = new Stone();
		Stone s = new Stone();
		//��s�� b1������ ������ �� =>false
		System.out.println("s, b1��: "+b1.equals(s));//s, b1��
		//equals���� Object�޴´� �ؼ� s �޴� �� ������ ���� ����.
		//�׷��� ���⼭ this�� b1�� wheel�� ȣ��
		
		System.out.println(o instanceof Stone);//������ ����, true
		System.out.println(o instanceof Vehicle);//������ ����, false
		System.out.println(o instanceof Car);//������ ����, false
		System.out.println(b1 instanceof Stone);//������ ����, false
		System.out.println(b3 instanceof Vehicle);//������ ����, true
		//System.out.println(b3 instanceof Car);//������ �Ұ���
		
		//instanceof �׽�Ʈ
		System.out.print("���� ���� Ż���� ��: ");
		System.out.println(o instanceof Vehicle);//������ �����ϳ� false
		System.out.println(o instanceof Stone);//��
		//System.out.println(s instanceof Vehicle);//������ �Ұ�, ���� vehicle ��Ӱ��� ������ ������ ��ü�� �Ұ�
		System.out.println(b1 instanceof Vehicle);//true
		//System.out.println(b1 instanceof Car);//b1�� Car�̶� ��Ӱ��� ��� �����ϺҰ�
		//b1��� b2������ �����ϰ���
		Vehicle v = new Vehicle();
		System.out.println(v instanceof Car);//��Ӱ��谡 �־� �������� �����ϳ� false
	}
}
class Stone{//�ʵ�: ����
//������: ���Ǹ� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
//���ǰ� ���� ���̶�� ���� ���� �����ϵ��� equals �޼ҵ� ������
	Stone(){}
	int volume;
	Stone(int volume){
		this.volume=volume;
	}
	public boolean equals(Object o){//s.equals(b1)
		if(o instanceof Stone)
			return this.volume==((Stone)o).volume;
		else
			return false;
	}
	
}
class Vehicle{
	//equals()�޼ҵ� ������: �������� ���ٸ� ���� Ż������ ������
	
	public boolean equals(Object o){
		if (o instanceof Vehicle)//o�� Vehicle�� �����̶�� 
		    return this.wheel == ((Vehicle)o).wheel;//ĳ�����ϱ�
		else
			return false;//o�� Vehicle�� ������ �ƴϸ� false
	}
	
	int wheel;
	static int numOfVehicle;
	
	Vehicle(){
		numOfVehicle++;
	}
	Vehicle(int wheel){
		this();//numOfVehicle++; = Vehicle(); = this;
		this.wheel = wheel;
	}
	void goStraight(int dist){
		
	}
}

class Bike extends Vehicle{
	Bike(int wheel){
		super(wheel);
	}
}
class Car extends Vehicle{
	String OEM;
	Car(int wheel, String OEM){
		super(wheel);//Vehicla(wheel);//this.wheel = wheel;
		this.OEM = OEM;
	}
}