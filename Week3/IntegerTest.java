public class IntegerTest{
	public static void main(String [] args){
		int a = 14, b = 8, c = -17;
		
		float f = 3.14F;//에러 발생: 3.14(기본 타입이 double로 간주)
		               //float에 넣으면 자료손실 발생하기 때문
		               //해결방법 1: casting(자료형) float f = (float)3.14;
					   //해결방법 2: 접미사 붙이기 float f = 3.14F;
		System.out.format("%5.2f\n", f);
		double d = 3.14;
		System.out.format("%f\n", d);
		double e = 3.14f;//손실발생x=>사용가능
		System.out.format("%f\n", e);
		
		//a를 세번 출력: 10진수(decimal), 8진수(octal), 16진수(hexadecimal)
		System.out.printf("%d %o %x \n", a, a, a); 
		System.out.printf("%d %1$o %1$x \n", a); //1$는 앞에 있는 것을 가져오겠다.
		System.out.printf("%d %1$#o %1$#x \n", a);// #을 붙이면 몇 진수인지 표현/10진수는 안붙임
		
		//a, b, c를 출력
		System.out.printf("%5d\t%5d\t%5d\n", a ,b, c);//%d사이에 숫자는 간격을 확보하라는 뜻 (3칸)14/여기까지 총 다섯칸(Tab)(3칸)...
		System.out.format("%5d\t%5d\t%5d\n", a ,b, c);//아직은 printf()랑 format()이랑 거의 같다. 
		                                              //동등하게 사용가능
		System.out.format("%+5d\t%+5d\t%+5d\n", a ,b, c);//+: 부호표시
		System.out.format("%-5d\t%-5d\t%-5d\n", a ,b, c);//-: 왼쪽정렬
		System.out.format("%-+5d\t%-+5d\t%-+5d\n", a ,b, c);//왼쪽정렬&부호표시, -+순서는 무관
		/*서식지첨자 과제 올림 과제확인*/
	}
}