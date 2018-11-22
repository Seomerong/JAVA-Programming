/*
1. 문자열을 매개변수로 받아 역순 문장을 출력하는 메소드
2. 문자열을 매개변수로 받아 역순 문장을 반환하는 메소드
3. 통장 클래스 만들기
  필드: 잔고(private)
  메소드:
  -money에 대한 setter, getter
  -저금()
  -출금()
 4. 비번 일치 여부 판단하는 메소드
  -비번은 메소드안에 정의가 되어있음.
  -매개변수로 문자열을 받고, 그 문자열이 비번과 일치하는지를 판단하고, 그 결과를 반환
 */
class Bank{
    private int money;
    void setMoney(int m){
        if(m<0){
            money = 1000;
        }
        else{
            money = m;
        }
    }
    int getMoney(){//money의 자료형은 int, 반환값이 있어서 int로 설정
        return money;
    }
    int save(int m){
        money = money + m;
        return money;
    }
    void withdraw(int m){//return으로 반환하는 값이 없어서 void
        money = money - m;
        System.out.printf("%d원을 출금해서 %d원이 남았습니다.\n", m, money);
    }
}
 class BankTest{
    public static void main(String [] args){
        Bank myBank = new Bank();
        myBank.setMoney(100000);
        System.out.println(myBank.getMoney());
        myBank.save(300000);
        System.out.println(myBank.getMoney());
        myBank.withdraw(150000);
    }
}