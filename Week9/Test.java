//커맨드라인에서 정수 배열을 입력받아 
//배열 출력하는 메소드
//배열을 오름차순 정렬 메소드
class Test{
	public static void main(String [] args){//java D0511 4 5 1 3 70 8 41-이 수들을 args에 받아야함
		if(args.length==0){//배열의 길이는 length뒤에 소괄호X
		    System.out.println("배열 원소가 존재하지 않습니다. ");
			return;
		}
		int [] arr = new int[args.length];//c에서는 배열크기를 변수로 둘 수 없는데 java는 가능
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
		//for-each문
		//<장점>배열길이를 몰라도 됨: a.length를 쓰지 않아도 됨.
		//<단점>배열 성분 변경은 불가.
		
		//for(배열의 자료형 변수명:배열명){배열에서 처리할 일들;}
		
		for(int x:arr){
			System.out.printf("%d ",x);//x의 값들이 차례차례로 적힘}
		}
		System.out.println();
		/*
		for-each문이 아니였다면
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]+1;
			System.out.printf("%d ", arr[i]);
		}
		*/
		
		//for-each문 사용해서 배열 성분값을 1씩 증가시키고 출력
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