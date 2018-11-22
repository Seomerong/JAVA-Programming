//사용자로부터 정수 입력받고 1111입력시 입력을 멈춤
//그리고 이제까지의 입력된 수들의 합을 출력(단,마지막 입력된 1111은 제외, 9의 배수도 제외)
class Sum{
	public static void main(String [] args){
		int sum = 0;
		do{
			System.out.print("정수를 입력하세요: ");
			int number = s.nextInt();
			
			if(number%9==0){
				sum = sum;
			}
			else{
				sum+=number;
			}
		}while(number!=1111);
		System.out.print("합: "+(sum-1111));
	}
	
	/*while(true){
		System.out.print("정수: ");
		input = s.nexInt();
		if(input==1111)break;
		//if(input%9!=0) sum = sum +input;
		if(input%9==0)continue;
		sum = sum + input;
	}
	*/
	}
}