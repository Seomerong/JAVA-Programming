import java.util.Scanner;
public class Score2Grade{
	public static void main(String [] args){
		int score;
		char grade;
		
		Scanner myScanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		score = myScanner.nextInt();
		
		if (score >= 90){
			grade = 'A';
		}
		else if (score < 90 && score >= 80){ss
			grade = 'B';
		}
		else if (score < 80 && score >= 70){
			grade = 'C';
		}
		else if (score < 70 && score >= 60){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		System.out.printf("����: %c\n", grade);	
	}
}