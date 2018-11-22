import java.util.Scanner;
public class ArrayTest2{
	public static void main(String [] args){
		int[] a = new int[5];
		int sum = 0, i ,j;
		for(i=0;i<5;i++){
			System.out.print("성적을 입력하시요: ");
			Scanner s = new Scanner(System.in);
			a[i] = s.nextInt();
		}
		for(j=0;j<5;j++){
			sum = sum + a[j];
		}
		
		System.out.println("평균성적은 "+sum/5+"입니다.");
	}
}