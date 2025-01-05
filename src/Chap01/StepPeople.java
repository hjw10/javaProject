package Chap01;

public class StepPeople {
	public static void main(String[] args) {
		int n = 8;
		for(int i = 1;i <=n;i++) {
			for(int a = n;a > i;a--) {
				System.out.print("     ");
			}
			System.out.print("  0  ******");
			for(int b = 1; b < 5*i-4;b++) {
				System.out.print(" ");
			}
			System.out.println("*");
			for(int a = n;a > i;a--) {
				System.out.print("     ");
			}
			System.out.print(" /|\\ *     ");
			for(int b = 1; b < 5*i-4;b++) {
				System.out.print(" ");
			}
			System.out.println("*");
			for(int a = n;a > i;a--) {
				System.out.print("     ");
			}
			System.out.print(" / \\ *     ");
			for(int b = 1; b < 5*i-4;b++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for(int i = 1;i <= 5*n+7;i++) {
		System.out.print("*");
		}
	}

}
