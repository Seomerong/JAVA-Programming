//Ŀ�ǵ���ο��� ���� �迭�� �Է¹޾� 
//�迭 ����ϴ� �޼ҵ�
//�迭�� �������� ���� �޼ҵ�
class Test{
	public static void main(String [] args){//java D0511 4 5 1 3 70 8 41-�� ������ args�� �޾ƾ���
		if(args.length==0){//�迭�� ���̴� length�ڿ� �Ұ�ȣX
		    System.out.println("�迭 ���Ұ� �������� �ʽ��ϴ�. ");
			return;
		}
		int [] arr = new int[args.length];//c������ �迭ũ�⸦ ������ �� �� ���µ� java�� ����
		for(int i=0;i<arr.length;i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		printArr(arr);
		clean(arr);
	}
	static void printArr(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.printf("%d ",arr[i]);
		}
		System.out.println();
		//for-each��
		//<����>�迭���̸� ���� ��: a.length�� ���� �ʾƵ� ��.
		//<����>�迭 ���� ������ �Ұ�.
		
		//for(�迭�� �ڷ��� ������:�迭��){�迭���� ó���� �ϵ�;}
		
		for(int x:arr){
			System.out.printf("%d ",x);//x�� ������ �������ʷ� ����}
		}
		System.out.println();
		/*
		for-each���� �ƴϿ��ٸ�
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]+1;
			System.out.printf("%d ", arr[i]);
		}
		*/
		
		//for-each�� ����ؼ� �迭 ���а��� 1�� ������Ű�� ���
		int tmp=0;
		for(int x:arr){
			x = x+1;
			//++x;
			System.out.printf("%d ",x);
		}
		System.out.println();
	}
	static void clean(int [] arr){
		int tmp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.printf("%d ",arr[i]);
		}
	}
}