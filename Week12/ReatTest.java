//���Ͽ� �ִ� ���� �о��
import java.util.Scanner;
import java.io.*;//��� Ŭ������ import�ϰڴ�.
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
			System.out.println("score.txt�� �������� �ʾ� ���α׷��� �����մϴ�.");
			System.exit(1);
		}
		int i=0;
		try{
			Scanner s = new Scanner(f);//f���� �о���ڴ�.
			//������ ���������� ����ؼ� �о��.
			while(s.hasNext()==true){//==true���� ��� ����
				students[i].name = s.next();//next�ϸ� ù��° �ٸ�
				students[i].age = s.nextInt();//���� age�� ����
				students[i].score = s.nextDouble();//���� score�� ����
				i++;
			}
			s.close();
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		for(i=0;i<students.length;i++){
			System.out.format("�̸�: %s, ����: %d, ����: :%.1f\n", students[i].name, students[i].age, students[i].score);
		}
	}
}