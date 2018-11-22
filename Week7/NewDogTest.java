class NewDog{
    private int full;//private을 저기전에는 외부에서 full에 막했는데 적으면 외부에서 full에 함부로  접근 못하게 함
    private int size;
    //size를 외부에서 설정할 수 잇는 setter를 작성
    //setter: 필드값을 설정하는 메소드, setXXXX 예)setSize, setFull...
    void setSize(int s){//강아지 사이즈를 설정하는 메소드
        size = s;
        if(s>100||s<1){//유효값이 아닌 경우 처리 루틴
            size = 5;
        }
        else{
            size = s;
        }
    }
    //getter: 외부에서 프라이빗한 필드값을 얻기 위해 작성하는 메소드
    //getXXXX, 예)getSize, getFull...
    int getSize(){//반환타입 여기서는 int
        return size;//return 메소드의 결과값(반환값);
        //return뒤에 알려주고 싶은것 작성 포만감을 알고싶으면 getFull return full
    }
    
    void eat(int feed){
        full = full+feed;
        System.out.println("배부르다!");
    }
    void play(){
        System.out.println("노니깐 재밌다!!");
    }
}
class NewDogTest{
    public static void main(String [] args){
        NewDog myDog = new NewDog();
        //myDog.full = -100; private때문에 이렇게 설정x
        myDog.setSize(-100000);
        //myDog.size = 10;이거는 쓸수x
        System.out.println(myDog.getSize());//함수이기 때문에 뒤에()
    }
}