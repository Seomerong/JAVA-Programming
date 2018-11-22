//이차원 배열을 매개변수로 받아 최솟값의 인덱스를 반환하는 메소드
class Test0518{
	public static void main(String [] args){
		double [][] arr={{11,5,7,4},{10,3,4,2}};
		int [] index = indexOfMin(arr);
		System.out.printf("최솟값은 %d행 %d열에 위치\n", index[0], index[1]);//인덱스의 첫번째(두번째)성분에 row(col)
		System.out.printf("최솟값은 %d행 %d열에 위치\n", indexOfMin(arr)[0], indexOfMin(arr)[1]);
		//indexOfMin(arr)[1]:메소드를 반환하고 반환한 값의 첫번째 성분을 불러옴, 
		`//indexOfMin(arr[1]):2차원 배열을 배개변수로
	}
	static int [] indexOfMin(double [][] arr){//integer형 배열을 반환
		double min = arr[0][0];
		int [] index = {0,0};//row=0, col=0//밑에 주석처리는 row와 col을 한번에 반환 못하기 때문
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