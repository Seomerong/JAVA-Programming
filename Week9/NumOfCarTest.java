//�ʵ�: ��ü���� ���������� ����
//��ü�鳢�� �����ϴ� �ʵ�: static
//�޼ҵ�: ��ü�鳢�� ����: Ŭ�������� �ϳ��� �ڵ� ����
//static method: ��� ��ü���� �Ȱ��� ����� ����� ��� static���� ����
//n��°�ڵ������� ��� �İ� ��� �������� ������ �ڵ��� �� ���� ����� ����

//�ڵ��� Ŭ����
//������: ����, ���� �ʱ�ȭ�ϴ� ������
//�������� ����� �ڵ��� ��� �����ϴ� ����

//���θ޼ҵ�
//�ڵ��� ��� ���� �� �������� ������ �ڵ��� ������� ���
class Car{
	String color;
	int year;
	static int numOfCar;//�տ� static������ ��������, ��ü���� ���������� ����Ǵ°� �̻���->static �ٿ������.
	                    //�ʱ�ȭ ���� �ʾƵ� ��.
	//���� ����ϴ� �޼ҵ�
    void printColor(){//����� ��ü���� �ٸ��� ���� ��� static�� ���̸�x, ���̸� �ؿ��� myCars[0].printColor()�� ������ �ȵ�
		System.out.println("�� �ڵ����� ������ "+this.color+"�Դϴ�.");
	}
	/*static void m1(){//static�� ��� ��ü���� ���� ���ƾ��ϴµ� ������ ��ü���� �ٸ�. �׷��� static ���̸� �ȵ�.
	                  //���� static �޼ҵ忡���� non-static ��� ��� �Ұ�.
		System.out.println("����: "+year);
	}
	*/
	/*main�̶� ���� �޼ҵ�� static�� why?
	
	*/
	//�������� ����� �ڵ��� ��� ����ϴ� �޼ҵ�
    static void printNumOfCars(){//static���̸� ��ü�� ���� ��Ȳ������ ȣ�Ⱑ��, �ڵ��� ��� ���ݱ��� ����� ��� ��
		System.out.println("�������� ������ �ڵ���: "+numOfCar);//this.numOfCar�ϸ� ������ �ȵ�. ��ü ���´뵵 this���� ����. 
	}
	Car(String color, int year){
		this.color = color;
		if(year<1900||year>2018)
			this.year = 2018;
		else
			this.year = year;//this():������ȣ��, this.~~:�ڱ� �ڽ� ����
		numOfCar++;
	}
}
class NumOfCarTest{
	public static void main(String [] args){
		//static ������ Ŭ���� �̸����� ����
		System.out.println("�������� ������ �ڵ���: "+Car.numOfCar); //numOfCar�� ���ο� ���� ����->�տ� Car.�ٿ���. 
		//��ü���� �迭->for���Ἥ �ڵ��� 10���� color,���� ��°����ϴ�.
		Car [] myCars = new Car[10]; //�� �迭�� �ڵ��� 10�� ���� ���� ����.
		//Car [] myCars ;�� �迭�� �ڵ��� ������ ���� ���� 
		               //���� 10���迭: int [] arr = new int[10];
	    //new Car() ����Ʈ������
		//myCars[0] = new Car();: �����߻�!
		myCars[0] = new Car("blue", 2010);
		myCars[0].printColor();
		myCars[0].printNumOfCars();
		myCars[1] = new Car("red", 2018);
		myCars[1].printColor();
		myCars[1].printNumOfCars();
		myCars[2] = new Car("white", 1998);
		myCars[2].printColor();
		myCars[0].printNumOfCars();
		myCars[1].printNumOfCars();
		Car.printNumOfCars();
		System.out.println("�������� ������ �ڵ���: "+Car.numOfCar);
		for(int i=0;i<;i++)
		
		
	}
}