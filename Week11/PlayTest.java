//ÿ�θ���Ʈ, �ǾƴϽ�Ʈ, ���̿ø���Ʈ Ŭ���� �����
//������ Ŭ������ �����ϴ� �޼ҵ带 ����: "**�� �����մϴ�."�� ���
//���(������ Ŭ������ ��ӹ޵���)�� ����Ͽ� ����

//�����ڵ鿡�� ������ �� �ִ� ������ Ŭ���� ���� �����ϱ�!
//�����ڸ� �Ű������� �޾� �����ϴ� �޼ҵ�
class Player{
	void play(){
		System.out.println("�����մϴ�.");
	}
}
class Cellist extends Player{
	@Override
	void play(){
		System.out.print("ÿ�θ� ");
		super.play();
	}
}
class Pianist extends Player{
	@Override
	void play(){
		System.out.print("�ǾƳ븦 ");
		super.play();
	}
}
class Violinist extends Player{
	@Override
	void play(){
		System.out.print("���̿ø��� ");
		super.play();
	}
}
class PlayTest{
	public static void main(String [] args){
		Cellist c1 = new Cellist();
		Player c2 = new Cellist();//������: �� ��ü�� �����̸����� �Ҹ��� ��
		
		Player [] players = {new Cellist(), new Cellist(), new Cellist(), new Pianist(), new Pianist(), new Violinist(), new Violinist(), new Violinist()};//�� �����ڵ� player�� �ְ� �ѹ��� ����
		for(int i=0;i<players.length;i++){//for�� �Ἥ �� �����ϰ�
			players[i].play();
		}
		/*
		Cellist [] c ={new Cellist(), new Cellist(), new Cellist()};
		Pianist [] p ={new Pianist(), new Pianist()};
		Violinist [] v = {new Violinist, new Violinist(), new Violinist()};
		for(Cellist cellist: c){
			cellist.play();
		}
		for(Pianist cellist: p){
			cellist.play();
		}
		for(Violinist cellist: v){
			cellist.play();
		}
		*/
		//������ �����ϴ°�
		/*Cellist c1 = new Cellist();
		Cellist c2 = new Cellist();
		Pianist p1 = new Pianist();
		c1.play();
		c2.play();
		p1.play();
		*/

	}
}