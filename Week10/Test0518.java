//������ �迭�� �Ű������� �޾� �ּڰ��� �ε����� ��ȯ�ϴ� �޼ҵ�
class Test0518{
	public static void main(String [] args){
		double [][] arr={{11,5,7,4},{10,3,4,2}};
		int [] index = indexOfMin(arr);
		System.out.printf("�ּڰ��� %d�� %d���� ��ġ\n", index[0], index[1]);//�ε����� ù��°(�ι�°)���п� row(col)
		System.out.printf("�ּڰ��� %d�� %d���� ��ġ\n", indexOfMin(arr)[0], indexOfMin(arr)[1]);
		//indexOfMin(arr)[1]:�޼ҵ带 ��ȯ�ϰ� ��ȯ�� ���� ù��° ������ �ҷ���, 
		`//indexOfMin(arr[1]):2���� �迭�� �谳������
	}
	static int [] indexOfMin(double [][] arr){//integer�� �迭�� ��ȯ
		double min = arr[0][0];
		int [] index = {0,0};//row=0, col=0//�ؿ� �ּ�ó���� row�� col�� �ѹ��� ��ȯ ���ϱ� ����
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(min>arr[i][j]){
				    min = arr[i][j];
				    index[0] = i;
					index[1] = j;
				}
			}
		}
		/*
		int row = 0, col = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(min>arr[i][j]){
				    min = arr[i][j];
				    row = i;
				    col = j;
			}
		}
		*/
		return index;
	}
}