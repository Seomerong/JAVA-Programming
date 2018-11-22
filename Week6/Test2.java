//구구단
class Test2{
	public static void main(String [] args){
		int i,j,k;
		for(j=3;j<8;j++){
				System.out.printf("----%d단-----\t", j);
			}
		System.out.println();	
		for(i=1;i<=9;i++){	
			for(k=3;k<=7;k++){
				System.out.printf("%d * %d = %d\t", k, i, (k*i));	
			}
			System.out.println();
		}
	}
}