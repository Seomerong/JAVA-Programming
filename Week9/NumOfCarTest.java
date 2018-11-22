//필드: 객체마다 개별적으로 저장
//객체들끼리 공유하는 필드: static
//메소드: 객체들끼리 공유: 클래스별로 하나의 코드 공유
//static method: 모든 객체들이 똑같은 결과를 출력할 경우 static으로 저장
//n번째자동차한테 몇대 냐고 물어도 이제까지 생성된 자동차 다 같은 대수로 말함

//자동차 클래스
//생성자: 색상, 연식 초기화하는 생성자
//이제까지 생산된 자동차 대수 저장하는 변수

//메인메소드
//자동차 몇대 생성 후 이제까지 생성된 자동차 몇대인지 출력
class Car{
	String color;
	int year;
	static int numOfCar;//앞에 static없으면 증가안함, 객체마다 개별적으로 저장되는것 이상함->static 붙여줘야함.
	                    //초기화 하지 않아도 됨.
	//색상 출력하는 메소드
    void printColor(){//결과가 객체마다 다르게 나올 경우 static을 붙이면x, 붙이면 밑에서 myCars[0].printColor()가 컴파일 안됨
		System.out.println("의 자동차의 색상은 "+this.color+"입니다.");
	}
	/*static void m1(){//static은 모든 객체마다 값이 같아야하는데 연식은 객체마다 다름. 그래서 static 붙이면 안됨.
	                  //따라서 static 메소드에서는 non-static 멤버 사용 불가.
		System.out.println("연식: "+year);
	}
	*/
	/*main이랑 붙은 메소드는 static씀 why?
	
	*/
	//이제까지 생산된 자동차 대수 출력하는 메소드
    static void printNumOfCars(){//static붙이면 객체가 없는 상황에서도 호출가능, 자동차 없어도 지금까지 생산된 대수 앎
		System.out.println("이제까지 생성된 자동차: "+numOfCar);//this.numOfCar하면 컴파일 안됨. 객체 없는대도 this쓰면 꼬임. 
	}
	Car(String color, int year){
		this.color = color;
		if(year<1900||year>2018)
			this.year = 2018;
		else
			this.year = year;//this():생성자호출, this.~~:자기 자신 참조
		numOfCar++;
	}
}
class NumOfCarTest{
	public static void main(String [] args){
		//static 변수는 클래스 이름으로 접근
		System.out.println("이제까지 생성된 자동차: "+Car.numOfCar); //numOfCar는 메인에 없는 변수->앞에 Car.붙여줌. 
		//객체들의 배열->for문써서 자동차 10대의 color,연식 출력가능하다.
		Car [] myCars = new Car[10]; //이 배열은 자동차 10대 저장 공간 만듦.
		//Car [] myCars ;이 배열은 자동차 여러대 저장 가능 
		               //정수 10개배열: int [] arr = new int[10];
	    //new Car() 디폴트생성자
		//myCars[0] = new Car();: 오류발생!
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
		System.out.println("이제까지 생성된 자동차: "+Car.numOfCar);
		for(int i=0;i<;i++)
		
		
	}
}