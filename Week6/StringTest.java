//시험범위: 4주차 강의자료까지+오늘 실습내용까지
class StringTest{
	public static void main(String [] args){
		int sum=0, sum2=0;
		String st = "No new is good news!";
		System.out.println("문장 st의 길이: "+st.length());
		//문장 st의 길이
		System.out.println("문장 st의 6번째 문자: "+st.charAt(5));
		//문장 st의 길이
		
		
		//1.st에서 'w'의 개수?

		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='w'){
				sum++;
			}
		}
		System.out.println("'w'의 개수는 "+sum);
		//2.st에서 'n','N'의 개수?
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='n'||st.charAt(i)=='N'){
				sum2++;
			}
		}
		System.out.println("'n','N'의 개수는 "+sum2);
	}
}