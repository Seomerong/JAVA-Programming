//자전거 클래스
//필드: 바퀴수
//생성자: 바퀴수를 매개변수로 받아 필드 바퀴수를 초기화
//Object 클래스의 toString()메소드 재정의: 바퀴수 정보를 반환하도록
//Object 클래스의 equals()메소드 재정의: 바퀴수가 같으면 같은 자전거로 인식하도록 재정의
//두발자전거 2대, 네발자전거 1대 생성해서 toString()테스트
//equals() 메소드 테스트
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
		return "바퀴수는 "+wheel;
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