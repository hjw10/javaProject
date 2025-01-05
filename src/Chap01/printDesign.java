package Chap01;

public class printDesign {
	public static void main(String[] args)
	{
		int k=5;
		for(int i=1;i<=k;i++) {
			for(int n=k+1-i;n>0;n--) {
				System.out.print("-");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(2*i-1);
			}
			for(int n=k+1-i;n>0;n--) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

}
