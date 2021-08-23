package review.java.function;

public class ForStar {
	public void star1() {
		for(int i=0;i<5;i++) {
			System.out.print("*");
		}
	}
	public void star2() {
		for(int i = 0;i<5;i++) {
			System.out.println("*");
		}
	}
	public void star3() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void star4() {
		for(int i=1;i<6;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public void star5() {
		for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void star6() {
		for(int i=1;i<6;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
	public void star7() {
		for(int i=5;i>0;i--) {
			for(int j=0;j<5;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
	public void star8() {
		for(int i =1;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void star9() {
		for(int i=1;i<6;i++) {
			for(int j=6;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void star10() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int l=5;l>i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
