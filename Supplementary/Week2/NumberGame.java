import java.util.Scanner;
public class NumberGame{
	public static void main(String [] args){
		int a, b=0, i;
		a = (int)(Math.random()*100)+1;
		Scanner input = new Scanner(System.in);
		
		for(i=1;a!=b;i++){
			System.out.print("������? : ");
			b = input.nextInt();
			if(a>b){
			System.out.println("������ ������ �����ϴ�.");
			}
			else if(a<b){
			System.out.println("������ ������ �����ϴ�.");
			}
			else{
			System.out.printf("�����Դϴ�! �õ�Ƚ�� = %d\n",i);
			}
		}
	}
}