//가전 제품 클래스
//에어컨, 보일러, TV, 냉장고, 가스렌지, 세탁기
abstract class 가전{
	void on(){//**가 켜집니다.
		System.out.println(this.getClass().getName()+"이(가) 켜집니다.");
	}
	void off(){//**가 꺼집니다.	
		System.out.println(this.getClass().getName()+"이(가) 꺼집니다.");
	}
}
//에어컨, 보일러, 가스렌지: 온도를 조절하는 기능을 가진 메소드 존재
//정수를 매개변수로 받아 그 온도로 조절하는 메소드
class 에어컨 extends 가전 implements Adjustable{
	public void adjust(int a){
		System.out.println(a+"로 온도 조절했습니다.");
	}
}
class 보일러 extends 가전 implements Adjustable{
	public void adjust(int a){
		System.out.println(a+"로 온도 조절했습니다.");
	}
}
class 가스렌지 extends 가전 implements Adjustable{
	public void adjust(int a){
		System.out.println(a+"로 온도 조절했습니다.");
	}
}

class TV extends 가전{}
class 냉장고 extends 가전{}
class 세탁기 extends 가전{}

interface Adjustable{
	//abstract void adjust(int a);
	void adjust(int a);//abstract 생략가능
}

class 가전테스트{
	public static void main(String [] args){
		가전 [] 내가전들 = {new 에어컨(), new 보일러(), new 가스렌지(), new TV(), new 냉장고(), new 세탁기()};
		for(가전 e : 내가전들){
			e.on();
			e.off();
		}
		//에어컨, 보일러, 가스렌지 모두 100도로 만들기
		Adjustable [] 온도조절가전들 = {new 에어컨(), new 보일러(), new 가스렌지()};
		for(Adjustable adj: 온도조절가전들) adj.adjust(100);
		/*
		((에어컨)내가전들[0]).adjust(100);
		((보일러)내가전들[1]).adjust(100);
		((가스렌지)내가전들[2]).adjust(100);
		*/
	}
}