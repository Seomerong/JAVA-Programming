//직사각형 넓이 출력 가로세로 입력받기
//단, 가로 세로 중 하나라도 음수면 양수가 될때까지 반복입력
import java.util.Scanner;
class Rac{
	public static void main(String [] args){
	int width, height;
	Scanner s = new Scanner(System.in);
	
	while(true){
		System.out.print("가로: ");
		width = s.nextInt();
		if(width>0) break;
	}
	while(true){
		System.out.print("세로: ");
		height = s.nextInt();
		if(height>0) break;
	}
	System.out.printf("넓이는 %d입니다.\n", (width*height));
	}
}