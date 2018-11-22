//for문 사용해서 1~10출력
class ThreadTest{
	public static void main(String [] args)throws Exception{//thead.sleep 쓸려면 args)뒤에 throws Exception 씀

		for(int i=1;i<=10;i++){
			System.out.print(i+"\t");
			//1초 쉬기
			try{//혹은 이렇게
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
			//단위 ms라서 1초 하려면 1000
		}
	}
	
}