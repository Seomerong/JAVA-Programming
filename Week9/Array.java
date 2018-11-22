class Array{
	public static void main(String [] args){
		double [][] arr = new double [3][2];
	    initArr(arr);
		printArr(arr);
		sumArr(arr);
		columnSumArr(arr);
		
	}
	static void initArr(double [][] arr){
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				arr[i][j] = Math.random()*(10+0);
			}
		}
	}
	static void printArr(double [][] arr){
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void sumArr(double [][] arr){
		for(int i=0;i<3;i++){
			double sum=0;
			for(int j=0;j<2;j++){
				sum = sum + arr[i][j];
			}
			System.out.println(i+"행의 합은 "+sum+"입니다.");
		}
	}
	static void columnSumArr(double [][] arr){
		for(int j=0;j<2;j++){
			double sum=0;
			for(int i=0;i<3;i++){
				sum = sum + arr[i][j];
			}
			System.out.println(j+"열의 합은 "+sum+"입니다.");
		}
	}
}