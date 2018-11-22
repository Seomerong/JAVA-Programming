class Stone{//class Stone extends Object�̶�� ��� ��
	int volume;
	Stone(){//����Ʈ ������
		
	}
	Stone(int volume){
		this.volume = volume;
	}
	void printName(){
		System.out.println(this.getClass().getName());//� Ŭ�����κ��� ����������� �˷��� �Ҷ� ����
	}
	@Override
	public String toString(){//��ü�� ������ ���ڿ��� ��ȯ, public �� ������ ���� ����(��Ű��)�������� ���� ����
		return "����";	
	}
	@Override
	public boolean equals(Object obj){//�� ��ü�� �Ű������� ���� obj�� ��ġ�ϸ� true, �ƴϸ� false
	    //������: ���ǰ� ������ ���� ���� ����
		return this.volume == ((Stone)obj).volume;//obj�� volume�̶�� �ʵ尡 ����->������ �Ұ���
		//s1���� equals�� �ҷ����� �ٲ�.==obj���� volume�ʵ带 ���� ���డ��
	}
}
class TestStone{
	public static void main(String [] args){
		Stone s1 = new Stone(3);
		Stone s2 = new Stone(5);
		
		System.out.println(s1.equals(s2));
		
		Stone s = new Stone();
		s.printName();
		System.out.println(s.toString());
		//1. Object Ŭ����(���� ����)�� toString()�޼ҵ尡 �����ϱ� ������ ȣ�� ����
		
	}
}