class Array{
	public static void main(String [] args){
		double [] dArray = new double[10];
		initArr(dArray);
		printArr(dArray);
		System.out.printf("��: %.2f\n",sumArr(dArray));
		System.out.printf("�ִ�: %.2f\n",maxEltOfArr(dArray));
		System.out.printf("�ִ��� �ε���: %d\n",indexOfMaxElt(dArray));
		shuffle(dArray);//���� ��
		printArr(dArray);//���
	}
	static void shuffle(double [] arr){
		//arr[0]<->arr[random]
		//arr[1]<->arr[random]
		//...
		//arr[������ ����]<->arr[random]
		double tmp;
		int r;
		//arr[i]<->arr[r]
		for(int i=0;i<arr.length;i++){
			r = (int)(Math.random()*arr.length);
			tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;

		}
	}
	static int indexOfMaxElt(double [] arr){
		double max = arr[0];//�ϴ��� ù��° ������ �ִ����� ����
		int index = 0;
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	static double maxEltOfArr(double [] arr){
		double max = arr[0];//�ϴ��� ù��° ������ �ִ����� ����
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]) max = arr[i];
		}
		return max;
	}
	static void initArr(double [] arr){
		for(int i= 0;i<arr.length;i++){
			arr[i] = Math.random()*(10+0);
		}
	}
	static void printArr(double [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.format("%.2f\t",arr[i]);
		}
	}
	static double sumArr(double [] arr){
		double s=0;
		for(int i=0;i<arr.length;i++){
			s = s + arr[i];
		}
		return s;
	}
}