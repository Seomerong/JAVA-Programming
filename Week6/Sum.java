//����ڷκ��� ���� �Է¹ް� 1111�Է½� �Է��� ����
//�׸��� ���������� �Էµ� ������ ���� ���(��,������ �Էµ� 1111�� ����, 9�� ����� ����)
class Sum{
	public static void main(String [] args){
		int sum = 0;
		do{
			System.out.print("������ �Է��ϼ���: ");
			int number = s.nextInt();
			
			if(number%9==0){
				sum = sum;
			}
			else{
				sum+=number;
			}
		}while(number!=1111);
		System.out.print("��: "+(sum-1111));
	}
	
	/*while(true){
		System.out.print("����: ");
		input = s.nexInt();
		if(input==1111)break;
		//if(input%9!=0) sum = sum +input;
		if(input%9==0)continue;
		sum = sum + input;
	}
	*/
	}
}