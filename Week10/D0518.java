//3��° ������ 13���� ����
class D0518{
	public static void main(String [] args){
		int [] arr = {1,2,3,4,5};
		changeElt(arr[2]);
		System.out.println(arr[2]);
		changeElt(arr);
		System.out.println(arr[2]);
	}
	//3��° ������ 13���� �����ϴ� �޼ҵ�1
	static void changeElt(int a){//a=3
		a = 13;//a=13
	}
	//3��° ������ 13���� �����ϴ� �޼ҵ�2
	static void changeElt(int [] a){//�޼ҵ��� �ߺ�����: �ڿ� �Ű����� �޶� ������
		a[2] = 13;
	}
}