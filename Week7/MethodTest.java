//���� �޼ҵ�
//�Ű����� int 2��, ��� print 
//      �Լ��� �Է�
//__��ȯŸ�� �޼ҵ��(�Ű�������)

//�Ű����� double 2��, �� double ��ȯ


class MethodTest{
    public static void main(String [] args){
        sum(2,3,4,6,123)
        
        sumAB(3,7);//�޼ҵ� ȣ��
        //System.out.println(sumAB2(3,7));
        int a = sumAB2(3,7);
        System.out.println(a);
        double d = sumABD(1.2,3.4);
        System.out.println(d);
    }
    void sum(int... a){//�Ű�����(������) ��� ��� ó�� ����
        //a=2,3,4,123
        //�Ű�����(������) ��� ��� ó�� ����
        int s =  0;//���� s�� ����
        for(int x: a){
            sum = sum + x;
        }//for-each��
        System.out.println(s);
    }
    static double sumABD(double a, double b){
        return a+b;
    }
    static int sumAB2(int a, int b){
        return a+b;//return �Լ��� �����(��ȯ��);
    }
    
    static void sumAB(int a, int b){//�޼ҵ� ����, �ۼ�
        System.out.printf("%d�� %d�� ���� %d�Դϴ�.\n", a, b, a+b);        
    }
}