class ����{
	void print(){
		System.out.print("���� "+this.getClass().getName()+"\n");
	}
}
class ��� extends ����{}
class �� extends ����{}
class ���� extends ����{}
class FruitTest_2{
	public static void main(String [] args){
		���� [] fr ={new ���(), new ��(), new ����()};
		for(���� f:fr)
			f.print();
	}
}