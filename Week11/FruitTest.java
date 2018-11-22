class Fruit{
	void print(){
		System.out.print("나는 ");
	}
}
class Apple extends Fruit{
	@Override
	void print(){
		super.print();
		System.out.println("사과");
	}
}
class Pear extends Fruit{
    @Override
	void print(){
		super.print();
		System.out.println("배");
	}
}
class Grape extends Fruit{
    @Override
	void print(){
		super.print();
		System.out.println("포도");
	}
}
class FruitTest{
	public static void main(String [] args){
		Fruit [] f ={new Grape(), new Apple(), new Pear()};
		for(int i=0;i<f.length;i++)
			f[i].print();
	}
}