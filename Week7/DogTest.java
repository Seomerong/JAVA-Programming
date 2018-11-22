//강아지 프로그래밍 한다 = 강아지 클래스를 만든다
class Dog{//강아지 클래스 = 강아지 설계도
    //속성: 필드, 멤버 변수
    //포만감: 0~10 정수형태
    int full;
    
    //동작: 메소드, 멤버 함수
    void eat(int feed){//메소드 헤드: 수식어(public static) 반환타입(void) 메소드이름(main)(매개변수들(String [] args))//feed는 인수, 가 아니면 다 지역변수
        //메소드 바디: 먹는 동작 기술       
        full = full+feed;//먹은 만큼 추가
        System.out.println("배부르다!");

    
    }
    void play(){//void는 반환타입 아직은 없움
        System.out.println("노니깐 재밌다!!");
    }
}

class DogTest{//강아지 테스트하기
    public static void main(String [] args){
        int a=1;;//기초 변수: 실제 값이 저장 integer, double...
        Dog myDog;//참조 변수: 참조값(주소)이 저장
        myDog = new Dog();//강아지 생성 앞뒤 둘다 Dog 이름은 myDog
                          // 강아지 객체, 강아지 인스턴스
        
        Dog yourDog = new Dog();//강아지 객체 하나 더 생성
        
        yourDog.full = -100;
        System.out.println(yourDog.full);//되면 안되는데 된다.
        
        
       // myDog = null;//내강아지 이제 없애도 된다.
        
        //1. 강아지 포만감을 임의로 초기화(0이상 10이하의 정수)
        myDog.full = (int)(Math.random()*(11+0));
        
        //2. 강아지 포만감 출력
        System.out.println(myDog.full);//.은 ~의를 나타냄
        
        //3. 포만감이 5이상이면 놀아주고, 아니라면 먹이를 준다.
        if(myDog.full>=5){
            myDog.play();
        }
        else{
            myDog.eat(5);//먹이를 feed만큼 주겠다. 여기서는 5, 5는 인자
            System.out.println(myDog.full);
        }
    }
}
/*
원래는 소스파일 하나에 클래스 하나여야 한다.
여기서는 귀찮아서
그래서 이름은 main이 들어있는class걸로 한다
*/

/*클래스는 설계도 객체(instance)는 설계도 따라 만들어진 실제 object
언제 객체가 생성되는지 알아야 함
*/