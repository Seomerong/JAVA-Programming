//���Ʒ� ������ �ﰢ���� �¿� ������
import java.util.Scanner;
class LeftRight{
	public static void main(String [] args){
		int i, j, k;
		for(i=0;i<10;i++){
			for(j=0;j<i;j++){
				System.out.print(" ");
			}
			for(k=0;k<10-i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}