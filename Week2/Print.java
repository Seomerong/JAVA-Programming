import java.util.Scanner;//scanner�� java �Ʒ� util�Ʒ� ����. import java.util.Scanner�� ���ۿ� �˻��ϸ� scanner������ ���� ����

public class Print{//�տ� public�� �Ƚᵵ �Ǵ� ��, Ŭ���� �̸�(Print)�� ù����(P)�� �빮�ڷ�, Ŭ�����̸��̶� �����̸��̶� ����
	public static void main(String [] args){ // []�� �迭�� ��Ÿ��, �߰��� ����. string�� �迭�� ��Ÿ��
	//StringŬ������ ���� �Ἥ �ڹٿ��� �����س��� import���� �ʾƵ� ��. ###��������� ����####
		int age;//���� ������ �޸� ���� Ȯ��: ���� ����
		String name;//���ڿ��� �Է� ���� ��� String�� ������ ����, c������ char name[20];
		double height;//�Ǽ��� ������ ���� Ȯ��: �Ǽ��� ���� ����
		

		Scanner myScanner = new Scanner(System.in);//c������ scanf("%d",&age);�� �����. �ٵ� �ڹٴ� ��ü������� �ٸ���
		//���Ӱ� ��ĳ�� ����, System.in=ǥ���Է�: Ű���� =>Ű����κ��� �Է¹޴� ��ĳ��
		//��ĳ�� �̸��� myScanner  ������, Ŭ�������� �δܾ� �̻��� �ռ���(myScanner)�� ��� �ι�° �ܾ��� ù ����(S)�� �빮�ڷ�!
		System.out.print("����: ");
		//print�� �ٹٲ޾��ϰ� ���, println�� �ٹٲ��ϰ� ���, print���� �ٹٲ��ϰ� ������ ("~~~\n")
		
		age = myScanner.nextInt();//�Ʊ� ���� ��ĳ������ ���� �ϳ��� �Է¹������ϰ� �װ� age�� ����!
		
		System.out.print("Ű? ");
		height = myScanner.nextDouble();//�� ���� �Ǽ��� �а� height�� ����.


		
		myScanner.nextLine();//���� ���� �뵵 => 2. �տ� myScanner.nextLine();�� ������.
		System.out.print("�̸�: ");
		name = myScanner.nextLine();//myScanner�� ���� ���� name���ٰ� �����ض�. 
                //nextLine�� Enter�� �Է����� ���� �׷��� �տ��� ������ ������ enter�� ������ �Է����� �����ϰ� 
                  name�� ���� ���� ���� �ٷ� �����.=> 1. nextLine��� next�� ����.
		
		System.out.println("����: "+age);//���
		//System.out.println("�̸��� "+name+"�Դϴ�.");
		System.out.printf("�̸��� %s�Դϴ�.\n", name);//f�� formatted�� ���ڷ� ���������ڷ� ��밡��. �Է¹��� name ���
		//���ǰͰ� ���� ����� ������.
		System.out.printf("�Է��Ͻ� Ű�� %f�Դϴ�.\n", height);
		
		System.out.println("JRE: �ڹ� ���� ȯ��"); //���
		System.out.println("JDK: �ڹ� ���� ȯ��");
	}
	//Scanner(�빮�� S�� ����ؼ� Ŭ������.)�� 
	//1. �޼ҵ�(=�Լ�)
	//2. ���� ����int-����������: %d �Ǽ�double-%(lf-������ �˾ƺ��ھ��~~) ����char-%c ���ڿ�String-%s(�����ڷ����� �ƴϱ� ������ �빮��S)
 	
}