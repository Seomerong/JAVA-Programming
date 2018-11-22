class Fruit{
	void print(){
		System.out.print("���� ");
	}
}
class Apple extends Fruit{
	@Override
	void print(){
		super.print();
		System.out.println("���");
	}
}
class Pear extends Fruit{
    @Override
	void print(){
		super.print();
		System.out.println("��");
	}
}
class Grape extends Fruit{
    @Override
	void print(){
		super.print();
		System.out.println("����");
	}
}
class FruitTest{
	public static void main(String [] args){
		Fruit [] f ={new Grape(), new Apple(), new Pear()};
		for(int i=0;i<f.length;i++)
			f[i].print();
	}
}