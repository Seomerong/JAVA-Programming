//for�� ����ؼ� 1~10���
class ThreadTest{
	public static void main(String [] args)throws Exception{//thead.sleep ������ args)�ڿ� throws Exception ��

		for(int i=1;i<=10;i++){
			System.out.print(i+"\t");
			//1�� ����
			try{//Ȥ�� �̷���
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
			//���� ms�� 1�� �Ϸ��� 1000
		}
	}
	
}