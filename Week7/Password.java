/*
 4. 비번 일치 여부 판단하는 메소드
  -비번은 메소드안에 정의가 되어있음.
  -매개변수로 문자열을 받고, 그 문자열이 비번과 일치하는지를 판단하고, 그 결과를 반환
*/
class Password{
    public static void main(String [] args){
        System.out.println(pw("java"));
        System.out.println(pw("Java"));
    }
    static boolean pw(String s){
        String password = "Java";
        return password.equals(s);
    }
}