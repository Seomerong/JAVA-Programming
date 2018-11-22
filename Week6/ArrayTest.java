class ArrayTest{
	public static void main(String [] args){
		int [] intArr = {1, 2, 3, 5, 7, 9};
		double [] dbleArray = {2.3, 4.1, 3.14};
		String[] st = {"Hi", "Hello", "abc"};
		
		if(args.length<2){//프로그램 종료
			return;
		}
		System.out.println(args[0]);//command line에서 입력을 받음
		System.out.println(args[1]);
		//args: 커맨드 라인에서 클래스 명 뒤에 적는 문자열들의 배열명
		//커맨드라인에서 입력받으시오.
		
		System.out.println(args[0]+args[1]);//34로 출력: 문자열들로 인식해서

		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		System.out.println(Double.parseDouble(args[0])+Double.parseDouble(args[1]));
		//Integer.parseInt("3"): 문자열 "3"을 숫자 3으로 변경
		//Double.parseDouble();
		
		
		/*
		System.out.println(st[2]);
		for (int i=0;i<st.length;i++){//괄호빼줌
			System.out.println(st[i]);
		}
		
		//length
		//배열명.length
		//문자열.length()
		
		System.out.println(intArr[5]);
		System.out.println(intArr.length);
		//배열의 길이는 괄호가 없이(메소드x) length 
		for(int i=0;i<dbleArray.length;i++){
			System.out.println(dbleArray[i]);
		}
		System.out.println(st[2]);
		*/
		}
}