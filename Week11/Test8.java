/*final 필드: 상수
      클래스: 상속불가
	  메소드: 재정의 불가
*/
/*
탈것: 부모
-필드: 바퀴수
-생성자: 바퀴수를 초기화 하는 생성자

자전거: 자식
-필드: 바퀴수
-생성자: 바퀴수를 초기화하는 생성자

자동차: 자식
-필드: 바퀴수, 제조사
-생성자: 바퀴수와 제조사를 매개변수로 받아 초기화하는 생성자
*/
class Test8{
	public static void main(String [] args){
		Bike b1 = new Bike(3);//=뒤에는 세발자전거 생성 = 앞에는 자전거 이름은 b1이라고 하는거 
		Vehicle b2 = new Bike(2); //가능하다
		//세발자전거 하나를 생성했는데 그것의 이름은 b1이고 탈 것이다.
		Bike b3 = new Bike(2);
		Vehicle c1 = new Car(6,"현대");
		//업캐스팅, Vehicle을 상속받았기 때문에 가능함
		System.out.println(c1.wheel);//6
		//System.out.println(c1.OEM);//현대
		//c1은 탈 것인데 자동차를 가르키고 있다.
		//근데 c1은 필드가 wheel만 있지 OEM을 가지고 있지 않아 접근 안됨.
		System.out.println(((Car)c1).OEM);//현대//다운캐스팅:성립할수도 안할수도
		
		Car c2 = new Car(4,"벤츠");
		System.out.println(c2.wheel);//4
		System.out.println(c2.OEM);//벤츠
		//반면 c2는 Car이기 때문에 가능
		System.out.println("탈 것의 수: "+Vehicle.numOfVehicle);
		System.out.println("c1, b1 비교: "+c1.equals(b1));//c1, b1비교
	    
		Car myCar = (Car)c1;
		Bike myBike = (Bike)c1;
		
		Object o = new Stone();
		Stone s = new Stone();
		//돌s와 b1자전거 같은지 비교 =>false
		System.out.println("s, b1비교: "+b1.equals(s));//s, b1비교
		//equals에서 Object받는다 해서 s 받는 거 까지는 무리 없음.
		//그런데 저기서 this는 b1의 wheel을 호출
		
		System.out.println(o instanceof Stone);//컴파일 가능, true
		System.out.println(o instanceof Vehicle);//컴파일 가능, false
		System.out.println(o instanceof Car);//컴파일 가능, false
		System.out.println(b1 instanceof Stone);//컴파일 가능, false
		System.out.println(b3 instanceof Vehicle);//컴파일 가능, true
		//System.out.println(b3 instanceof Car);//컴파일 불가능
		
		//instanceof 테스트
		System.out.print("물건 돌과 탈것의 비교: ");
		System.out.println(o instanceof Vehicle);//컴파일 가능하나 false
		System.out.println(o instanceof Stone);//참
		//System.out.println(s instanceof Vehicle);//컴파일 불가, 돌과 vehicle 상속관계 없으면 컴파일 자체가 불가
		System.out.println(b1 instanceof Vehicle);//true
		//System.out.println(b1 instanceof Car);//b1은 Car이랑 상속관계 없어서 컴파일불가
		//b1대신 b2넣으면 컴파일가능
		Vehicle v = new Vehicle();
		System.out.println(v instanceof Car);//상속관계가 있어 컴파일은 가능하나 false
	}
}
class Stone{//필드: 부피
//생성자: 부피를 매개변수로 받아 초기화하는 생성자
//부피가 같은 돌이라면 같은 돌로 간주하도록 equals 메소드 재정의
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
	//equals()메소드 재정의: 바퀴수가 같다면 같은 탈것으로 재정의
	
	public boolean equals(Object o){
		if (o instanceof Vehicle)//o가 Vehicle의 일종이라면 
		    return this.wheel == ((Vehicle)o).wheel;//캐스팅하기
		else
			return false;//o가 Vehicle의 일종이 아니면 false
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