//������ ���α׷��� �Ѵ� = ������ Ŭ������ �����
class Dog{//������ Ŭ���� = ������ ���赵
    //�Ӽ�: �ʵ�, ��� ����
    //������: 0~10 ��������
    int full;
    
    //����: �޼ҵ�, ��� �Լ�
    void eat(int feed){//�޼ҵ� ���: ���ľ�(public static) ��ȯŸ��(void) �޼ҵ��̸�(main)(�Ű�������(String [] args))//feed�� �μ�, �� �ƴϸ� �� ��������
        //�޼ҵ� �ٵ�: �Դ� ���� ���       
        full = full+feed;//���� ��ŭ �߰�
        System.out.println("��θ���!");

    
    }
    void play(){//void�� ��ȯŸ�� ������ ����
        System.out.println("��ϱ� ��մ�!!");
    }
}

class DogTest{//������ �׽�Ʈ�ϱ�
    public static void main(String [] args){
        int a=1;;//���� ����: ���� ���� ���� integer, double...
        Dog myDog;//���� ����: ������(�ּ�)�� ����
        myDog = new Dog();//������ ���� �յ� �Ѵ� Dog �̸��� myDog
                          // ������ ��ü, ������ �ν��Ͻ�
        
        Dog yourDog = new Dog();//������ ��ü �ϳ� �� ����
        
        yourDog.full = -100;
        System.out.println(yourDog.full);//�Ǹ� �ȵǴµ� �ȴ�.
        
        
       // myDog = null;//�������� ���� ���ֵ� �ȴ�.
        
        //1. ������ �������� ���Ƿ� �ʱ�ȭ(0�̻� 10������ ����)
        myDog.full = (int)(Math.random()*(11+0));
        
        //2. ������ ������ ���
        System.out.println(myDog.full);//.�� ~�Ǹ� ��Ÿ��
        
        //3. �������� 5�̻��̸� ����ְ�, �ƴ϶�� ���̸� �ش�.
        if(myDog.full>=5){
            myDog.play();
        }
        else{
            myDog.eat(5);//���̸� feed��ŭ �ְڴ�. ���⼭�� 5, 5�� ����
            System.out.println(myDog.full);
        }
    }
}
/*
������ �ҽ����� �ϳ��� Ŭ���� �ϳ����� �Ѵ�.
���⼭�� �����Ƽ�
�׷��� �̸��� main�� ����ִ�class�ɷ� �Ѵ�
*/

/*Ŭ������ ���赵 ��ü(instance)�� ���赵 ���� ������� ���� object
���� ��ü�� �����Ǵ��� �˾ƾ� ��
*/