import java.io.File;
import java.util.Date;
class FileTest{
	public static void main(String [] args){
		File f = new File("C:\\Program Files");//C:\Program Files 폴더를 객체화 시킴: 이 폴더는 f로 접근 가능
	    File f1 = new File("C:"+File.separator+"Program Files"+File.separator+"Java");//=>절대경로
		File f2 = new File("FileTest.class");//같은 폴더 내(FileTest와 같은 폴더 내)에 있다면 파일명.확장자로 접근 가능=>상대경로
		System.out.println(f.exists());
		System.out.println(f1.exists());
		Date d = new Date(f2.lastModified());
		System.out.println(d);
	}
}