import java.util.Scanner;
class Star{
	public static void main(String [] args){
		int number, i, j, k;
		Scanner s = new Scanner(System.in);
		System.out.print("´Ü: ");
		number = s.nextInt();
		
		for(i=0;i<number;i++){
			for(k=0;k<number-i;k++){
				System.out.print(" ");
			}
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
		    System.out.println();
		}
		
		System.out.println();
		
		for(i=0;i<number;i++){
			for(j=0;j<number-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(i=1;i<=number;i++){
			for(j=1;j<=number-i;j++){
				System.out.print(" ");
			}
			for(k=1;k<=((i*2)-1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(i=0;i<number;i++){
			for(j=0;j<i;j++){
				System.out.print(" ");
			}
			for(k=0;k<number-i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}