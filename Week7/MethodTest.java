//계산기 메소드
//매개변수 int 2개, 결과 print 
//      함수의 입력
//__반환타입 메소드명(매개변수들)

//매개변수 double 2개, 합 double 반환


class MethodTest{
    public static void main(String [] args){
        sum(2,3,4,6,123)
        
        sumAB(3,7);//메소드 호출
        //System.out.println(sumAB2(3,7));
        int a = sumAB2(3,7);
        System.out.println(a);
        double d = sumABD(1.2,3.4);
        System.out.println(d);
    }
    void sum(int... a){//매개변주(정수형) 몇개든 모두 처리 가능
        //a=2,3,4,123
        //매개변수(정수형) 몇개든 모두 처리 가능
        int s =  0;//합을 s에 저장
        for(int x: a){
            sum = sum + x;
        }//for-each문
        System.out.println(s);
    }
    static double sumABD(double a, double b){
        return a+b;
    }
    static int sumAB2(int a, int b){
        return a+b;//return 함수의 결과값(반환값);
    }
    
    static void sumAB(int a, int b){//메소드 구현, 작성
        System.out.printf("%d와 %d의 합은 %d입니다.\n", a, b, a+b);        
    }
}