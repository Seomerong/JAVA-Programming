import java.io.File;
import java.util.Date;
class FileTest{
	public static void main(String [] args){
		File f = new File("C:\\Program Files");//C:\Program Files ������ ��üȭ ��Ŵ: �� ������ f�� ���� ����
	    File f1 = new File("C:"+File.separator+"Program Files"+File.separator+"Java");//=>������
		File f2 = new File("FileTest.class");//���� ���� ��(FileTest�� ���� ���� ��)�� �ִٸ� ���ϸ�.Ȯ���ڷ� ���� ����=>�����
		System.out.println(f.exists());
		System.out.println(f1.exists());
		Date d = new Date(f2.lastModified());
		System.out.println(d);
	}
}