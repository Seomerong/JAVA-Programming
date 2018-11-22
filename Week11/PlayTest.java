//첼로리스트, 피아니스트, 바이올리스트 클래스 만들기
//각각의 클래스는 연주하는 메소드를 가짐: "**를 연주합니다."를 출력
//상속(연주자 클래스를 상속받도록)을 사용하여 구현

//연주자들에게 지휘할 수 있는 지휘자 클래스 만들어서 연주하기!
//연주자를 매개변수로 받아 지휘하는 메소드
class Player{
	void play(){
		System.out.println("연주합니다.");
	}
}
class Cellist extends Player{
	@Override
	void play(){
		System.out.print("첼로를 ");
		super.play();
	}
}
class Pianist extends Player{
	@Override
	void play(){
		System.out.print("피아노를 ");
		super.play();
	}
}
class Violinist extends Player{
	@Override
	void play(){
		System.out.print("바이올린을 ");
		super.play();
	}
}
class PlayTest{
	public static void main(String [] args){
		Cellist c1 = new Cellist();
		Player c2 = new Cellist();//다형성: 한 객체가 여러이름으로 불리는 것
		
		Player [] players = {new Cellist(), new Cellist(), new Cellist(), new Pianist(), new Pianist(), new Violinist(), new Violinist(), new Violinist()};//각 연주자들 player에 넣고 한번에 지휘
		for(int i=0;i<players.length;i++){//for를 써서 더 간략하게
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
		//개별로 연주하는것
		/*Cellist c1 = new Cellist();
		Cellist c2 = new Cellist();
		Pianist p1 = new Pianist();
		c1.play();
		c2.play();
		p1.play();
		*/

	}
}