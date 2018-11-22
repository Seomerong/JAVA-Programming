
//윤년
import java.util.Scanner;
class Test3{
	public static void main(String [] args){
		int year, month;
		Scanner s = new Scanner(System.in);
		System.out.print("몇 년: ");
		year = s.nextInt();
		System.out.print("몇 월: ");
		month = s.nextInt();
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d년 %d월은 31일까지 있습니다.\n", year, month);
			break;
			case 4: case 6: case 9: case 11:
			System.out.printf("%d년 %d월은 30일까지 있습니다.\n", year, month);
			break;
			case 2:
			if(((year%4==0)&&(year%100!=0))||(year%400==0)){
				System.out.printf("%d년 %d월은 29일까지 있습니다.\n", year, month);
			}
			else{
				System.out.printf("%d년 %d월은 28일까지 있습니다.\n", year, month);
			}
			break;
			default:
			System.out.println("그런 달은 없습니다.");
		}
	}
}