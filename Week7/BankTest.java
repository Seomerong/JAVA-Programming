/*
1. ���ڿ��� �Ű������� �޾� ���� ������ ����ϴ� �޼ҵ�
2. ���ڿ��� �Ű������� �޾� ���� ������ ��ȯ�ϴ� �޼ҵ�
3. ���� Ŭ���� �����
  �ʵ�: �ܰ�(private)
  �޼ҵ�:
  -money�� ���� setter, getter
  -����()
  -���()
 4. ��� ��ġ ���� �Ǵ��ϴ� �޼ҵ�
  -����� �޼ҵ�ȿ� ���ǰ� �Ǿ�����.
  -�Ű������� ���ڿ��� �ް�, �� ���ڿ��� ����� ��ġ�ϴ����� �Ǵ��ϰ�, �� ����� ��ȯ
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
    int getMoney(){//money�� �ڷ����� int, ��ȯ���� �־ int�� ����
        return money;
    }
    int save(int m){
        money = money + m;
        return money;
    }
    void withdraw(int m){//return���� ��ȯ�ϴ� ���� ��� void
        money = money - m;
        System.out.printf("%d���� ����ؼ� %d���� ���ҽ��ϴ�.\n", m, money);
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