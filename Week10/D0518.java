//3번째 성분을 13으로 변경
class D0518{
	public static void main(String [] args){
		int [] arr = {1,2,3,4,5};
		changeElt(arr[2]);
		System.out.println(arr[2]);
		changeElt(arr);
		System.out.println(arr[2]);
	}
	//3번째 성분을 13으로 변경하는 메소드1
	static void changeElt(int a){//a=3
		a = 13;//a=13
	}
	//3번째 성분을 13으로 변경하는 메소드2
	static void changeElt(int [] a){//메소드의 중복정의: 뒤에 매개변수 달라서 가능함
		a[2] = 13;
	}
}