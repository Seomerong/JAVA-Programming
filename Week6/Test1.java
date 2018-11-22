//커맨드라인 연산
class Test1{
	public static void main(String [] args){
		if(args.length<2) return;
		
		System.out.println(Integer.parseInt(args[0])*Integer.parseInt(args[1]));
	}
}