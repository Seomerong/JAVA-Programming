class TwoArray{
	public static void main(String [] args){
		//int [][] score = new int [3][5];
		int [][] score = {{100, 10, 90, 30},{40, 50, 100, 30}};//2��4��
		
		//�ళ��?
		System.out.println(score.length);//�ళ��
		System.out.println(score[0].length);//ù��° ���� �� ����
		System.out.println(score[1].length);//�ι�° ���� �� ����
		System.out.println(score[0].length);//�� ����(������ ����� �� ������ �����ϱ�)
		
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				System.out.printf("%d ",score[i][j]);
			}
			System.out.println();
		}
	}
}