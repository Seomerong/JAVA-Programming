//�������: 4���� �����ڷ����+���� �ǽ��������
class StringTest{
	public static void main(String [] args){
		int sum=0, sum2=0;
		String st = "No new is good news!";
		System.out.println("���� st�� ����: "+st.length());
		//���� st�� ����
		System.out.println("���� st�� 6��° ����: "+st.charAt(5));
		//���� st�� ����
		
		
		//1.st���� 'w'�� ����?

		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='w'){
				sum++;
			}
		}
		System.out.println("'w'�� ������ "+sum);
		//2.st���� 'n','N'�� ����?
		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='n'||st.charAt(i)=='N'){
				sum2++;
			}
		}
		System.out.println("'n','N'�� ������ "+sum2);
	}
}