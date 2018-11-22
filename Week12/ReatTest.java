//파일에 있는 내용 읽어보기
import java.util.Scanner;
import java.io.*;//모든 클래스를 import하겠다.
class Student{
	String name;
	int age;
	double score;
}
class ReadTest{
	public static void main(String [] args){
		File f = new File("score.txt");
		Student [] students = {new Student(), new Student()};
		
		if(f.exists()==false){
			System.out.println("score.txt이 존재하지 않아 프로그램을 종료합니다.");
			System.exit(1);
		}
		int i=0;
		try{
			Scanner s = new Scanner(f);//f에서 읽어오겠다.
			//파일이 끝날때까지 계속해서 읽어옴.
			while(s.hasNext()==true){//==true빼도 상관 없음
				students[i].name = s.next();//next하면 첫번째 줄만
				students[i].age = s.nextInt();//나이 age에 저장
				students[i].score = s.nextDouble();//점수 score에 저장
				i++;
			}
			s.close();
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		for(i=0;i<students.length;i++){
			System.out.format("이름: %s, 나이: %d, 학점: :%.1f\n", students[i].name, students[i].age, students[i].score);
		}
	}
}