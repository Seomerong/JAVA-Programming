//가전 제품 클래스
//에어컨, 보일러, TV, 냉장고, 가스렌지, 세탁기
//생성자: 가격을 매개변수로 받아 필드 가격을 그 갑승로 초기화하는 생성자
//toString()메소드 재정의: 나느 **가격의 ***입니다: 예시 나는 100만원의 에어컨입니다.
imort java.util.Arrays;

class 가전 implements Comparable{
	int price;
	public int compareTo(Object e){
		//비교하는 메소드
		//이 객체의 가격과 매개변수의 가격을 비교해서 이 객체의 가격이 높으면 1을, 낮으면 -1, 같으면 0을 반환하도록 작성
		if(e instanceof 가전){
			if(this.price<((가전)e).price) return -1;
			else if(this.price>((가전)e).price) return 1;
			else return 0;
		}
		else return -100;//e가 가전이 아닌경우
	}
	가전(int price){
		this.price = price;
	}
	void on(){//**가 켜집니다.
		System.out.println(this.getClass().getName()+"이(가) 켜집니다.");
	}
	void off(){//**가 꺼집니다.	
		System.out.println(this.getClass().getName()+"이(가) 꺼집니다.");
	}
	public String toString(){
		return String.format("%d만원짜리 %s입니다.", price, this.getClass().getName());
	}
}

class 에어컨 extends 가전{
	에어컨(int price){
		super(price);
	}
}
class 보일러 extends 가전{
	보일러(int price){
		super(price);
	}
}
class 가스렌지 extends 가전{
	가스렌지(int price){
		super(price);
	}
}
class TV extends 가전{
	TV(int price){
		super(price);
	}
}
class 냉장고 extends 가전{
	냉장고(int price){
		super(price);
	}
}
class 세탁기 extends 가전{
	세탁기(int price){
		super(price);
	}
}

class 가전Test{
	public static void main(String [] args){
		가전 [] 내가전들 = {new 에어컨(100), new 보일러(500), new 가스렌지(20), new TV(1000), new 냉장고(300), new 세탁기(200)};
		for(가전 e: 내가전들) System.out.println(e);
		int a = 내가전들[4].compareTo(내가전들[0]);
		if(a==-1) System.out.println("에어컨 승! 에어컨이 더 비쌈.");
		else if(a==0) System.out.println("무승부! 가격동일");
		else System.out.prinltn("냉장고 승! 냉장고가 더 비쌈.");
		
		//Arrays.sort(배열);
		Arrays.sort(내가전들);
		for(가전 e: 내가전들) System.out.println(e);
		
		
	}
}