class NewDog{
    private int full;//private�� ���������� �ܺο��� full�� ���ߴµ� ������ �ܺο��� full�� �Ժη�  ���� ���ϰ� ��
    private int size;
    //size�� �ܺο��� ������ �� �մ� setter�� �ۼ�
    //setter: �ʵ尪�� �����ϴ� �޼ҵ�, setXXXX ��)setSize, setFull...
    void setSize(int s){//������ ����� �����ϴ� �޼ҵ�
        size = s;
        if(s>100||s<1){//��ȿ���� �ƴ� ��� ó�� ��ƾ
            size = 5;
        }
        else{
            size = s;
        }
    }
    //getter: �ܺο��� �����̺��� �ʵ尪�� ��� ���� �ۼ��ϴ� �޼ҵ�
    //getXXXX, ��)getSize, getFull...
    int getSize(){//��ȯŸ�� ���⼭�� int
        return size;//return �޼ҵ��� �����(��ȯ��);
        //return�ڿ� �˷��ְ� ������ �ۼ� �������� �˰������ getFull return full
    }
    
    void eat(int feed){
        full = full+feed;
        System.out.println("��θ���!");
    }
    void play(){
        System.out.println("��ϱ� ��մ�!!");
    }
}
class NewDogTest{
    public static void main(String [] args){
        NewDog myDog = new NewDog();
        //myDog.full = -100; private������ �̷��� ����x
        myDog.setSize(-100000);
        //myDog.size = 10;�̰Ŵ� ����x
        System.out.println(myDog.getSize());//�Լ��̱� ������ �ڿ�()
    }
}