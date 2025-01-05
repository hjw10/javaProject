package Chap01;

public class Calendar {	
	public static void main(String[] args){
		int days = 31;
		int firstSun = 3;
		int counts = 0;
		System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat  ");
		head_tail();
		System.out.print("|");
		if(firstSun != 1) {
			for(int i = 1;i <= 8-firstSun;i++) {
				System.out.print("      |");
				counts++;
			}
			for(int j = 1;j <= days;j++) {
				if(j <= 9) {
					System.out.print("   "+j+"  |");
					counts++;
				}
				else {
					System.out.print("  "+j+"  |");
					counts++;
				}
				if(counts%7 == 0 && j != days) {
					System.out.println();
				    System.out.print("|");
				}
			}
			for(;counts%7 != 0;counts++) {
				System.out.print("      |");
			}
		}
		else {
			for(int j = 1;j <= days;j++) {
				if(j <= 9) {
					System.out.print("   "+j+"  |");
					counts++;
				}
				else {
					System.out.print("  "+j+"  |");
					counts++;
				}
				if(counts%7 == 0 && j != days) {
					System.out.println();
					System.out.print("|");
				}
			}
			for(;counts%7 != 0;counts++) {
				System.out.print("      |");
			}
		}
		System.out.println();
		head_tail();
	}

    public static void head_tail() {
    	for(int i = 1;i <= 7;i++) {
    		System.out.print("+------");
    	}
    	System.out.println("+");
    }
}
