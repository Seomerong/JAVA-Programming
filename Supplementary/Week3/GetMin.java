public class GetMin{
	public static void main(String [] args){
		int min, i;
		int[] s = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		min = s[0];
		for(i=1;i<10;i++){
			if(min < s[i]){
				min = min;
			}
			else{
				min = s[i];
			}
		}
		System.out.print("최소값은 "+min);
	}
}