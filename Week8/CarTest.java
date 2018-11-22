class Car{
	int age;//연식
	static int numOfCar;//이제까지 생산된 자동차 대수
	//연식을 매개변수로 받아 초기화 하는 생성자
	Car(int age){
		this.age = age;
		numOfCar++;
	}
	
	//자동차가 한대 생성될 때마다 numOfCar가 하나씩 증가
	
}
class CarTest{
	public static void main(String [] args){
		Car c1 = new Car(2010);
		Car c2 = new Car(2018);
		
		System.out.println("이제까지 생산된 자동차 대수: "+Car.numOfCar);//c1이 아니라 Car로 써야함
	}
}