package review.java.function;

public class ForExam {
	public void exam1() {
		for(int i = 0; i<5; i++) {
			System.out.print("*");
		}
	}
	public void exam2() {
		for(int i =0; i<5; i++) {
			System.out.println("*");
		}
	}
	public void exam3() {
		for(int i = 0; i<5; i++) {
			for(int j=0;j<5;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	public void exam4() {
		for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public void exam5() {
		for(int i =1;i<6;i++) {
			for(int j=1;j<6;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void exam6() {
		for(int i = 1;i<6;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
	public void exam7() {
		for(int i = 9;i>4;i--) {
			for(int j = 4;j>=0;j--) {
				System.out.print(i-j);
			}
			System.out.println();
		}
	}
	public void exam8() {
		for(int i = 1;i<6;i++) {
			for(int j = 0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void exam9() {
		for(int i=5;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void exam10() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}for(int k=4;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void exam11() {
		for(int i = 5;i>0;i--) {
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}for(int k=5;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void exam12() {
		for(int i = 0; i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		for(int i = 5;i>=0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void exam13() {
		for(int i = 5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =1;i<5;i++) {
			for(int j = 0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void exam14() {
		
	}
}
