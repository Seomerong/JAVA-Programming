class ArrayTest{
	public static void main(String [] args){
		int [] intArr = {1, 2, 3, 5, 7, 9};
		double [] dbleArray = {2.3, 4.1, 3.14};
		String[] st = {"Hi", "Hello", "abc"};
		
		if(args.length<2){//���α׷� ����
			return;
		}
		System.out.println(args[0]);//command line���� �Է��� ����
		System.out.println(args[1]);
		//args: Ŀ�ǵ� ���ο��� Ŭ���� �� �ڿ� ���� ���ڿ����� �迭��
		//Ŀ�ǵ���ο��� �Է¹����ÿ�.
		
		System.out.println(args[0]+args[1]);//34�� ���: ���ڿ���� �ν��ؼ�

		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		System.out.println(Double.parseDouble(args[0])+Double.parseDouble(args[1]));
		//Integer.parseInt("3"): ���ڿ� "3"�� ���� 3���� ����
		//Double.parseDouble();
		
		
		/*
		System.out.println(st[2]);
		for (int i=0;i<st.length;i++){//��ȣ����
			System.out.println(st[i]);
		}
		
		//length
		//�迭��.length
		//���ڿ�.length()
		
		System.out.println(intArr[5]);
		System.out.println(intArr.length);
		//�迭�� ���̴� ��ȣ�� ����(�޼ҵ�x) length 
		for(int i=0;i<dbleArray.length;i++){
			System.out.println(dbleArray[i]);
		}
		System.out.println(st[2]);
		*/
		}
}