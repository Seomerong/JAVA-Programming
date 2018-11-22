class TwoArray{
	public static void main(String [] args){
		//int [][] score = new int [3][5];
		int [][] score = {{100, 10, 90, 30},{40, 50, 100, 30}};//2행4열
		
		//행개수?
		System.out.println(score.length);//행개수
		System.out.println(score[0].length);//첫번째 행의 열 개수
		System.out.println(score[1].length);//두번째 행의 열 개수
		System.out.println(score[0].length);//열 개수(보통은 행들의 열 개수가 같으니깐)
		
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				System.out.printf("%d ",score[i][j]);
			}
			System.out.println();
		}
	}
}