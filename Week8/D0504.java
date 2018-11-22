//1. 두 실수를 매개변수로 받아 두 수의 합을 출력하는 메소드
//2. 두 실수를 매개변수로 받아 두 수의 곱을 반환하는 메소드
//3. 두 문장을 매개변수로 받아 두 문장의 일치 여부 결과를 반환하는 메소드, 단 두 문장이 영문장일 경우 대소문자 무시

class D0504{
	//D0504 d0 = new D0504();적으면 
	
	public static void main(String [] args){
		printSum(3,4.2);
		System.out.printf("%.2f\n",mult(2,5.4));
		System.out.printf("abc","ABC");//d0.equals(~~)쓰면 호출가능
	}
	static boolean equals(String a, String b){//static안썼을때
		return a.equlalsIgnoreCase(b);
	}
	static void printSum(double a, double b){
		System.out.printf("%.2f\n", a+b);
	}
	static double mult(double a, double b){//main 이랑 같은 class에 있어서 static
		return a*b;
	}
	
}