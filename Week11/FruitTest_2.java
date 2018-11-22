class 과일{
	void print(){
		System.out.print("나는 "+this.getClass().getName()+"\n");
	}
}
class 사과 extends 과일{}
class 배 extends 과일{}
class 포도 extends 과일{}
class FruitTest_2{
	public static void main(String [] args){
		과일 [] fr ={new 사과(), new 배(), new 포도()};
		for(과일 f:fr)
			f.print();
	}
}