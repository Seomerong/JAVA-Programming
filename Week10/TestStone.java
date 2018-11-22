class Stone{//class Stone extends Object이라고 적어도 됨
	int volume;
	Stone(){//디폴트 생성자
		
	}
	Stone(int volume){
		this.volume = volume;
	}
	void printName(){
		System.out.println(this.getClass().getName());//어떤 클래스로부터 만들어졌는지 알려고 할때 유용
	}
	@Override
	public String toString(){//객체의 정보를 문자열로 반환, public 안 적으면 같은 폴더(패키지)내에서만 접근 가능
		return "스톤";	
	}
	@Override
	public boolean equals(Object obj){//이 객체와 매개변수로 들어온 obj가 일치하면 true, 아니면 false
	    //재정의: 부피가 같으면 같은 돌로 인정
		return this.volume == ((Stone)obj).volume;//obj에 volume이라는 필드가 없음->컴파일 불가능
		//s1에서 equals를 불러오게 바꿈.==obj에서 volume필드를 만들어서 실행가능
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
		//1. Object 클래스(돌의 조상)에 toString()메소드가 존재하기 때문에 호출 가능
		
	}
}