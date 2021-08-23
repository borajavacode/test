package review.java.function;
import java.util.Scanner;
public class ForTest {
	public void test1() {
		for(int i = 0; i<5; i++) {
			System.out.println("안녕하세요");
		}
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까? ");
		int num = sc.nextInt();
		for(int i = 0;i<num;i++) {
			System.out.println("안녕하세요");
		}
	}
	public void test3() {
		System.out.println("2단 입니다.");
		for(int i = 1;i<=9;i++) {
			System.out.printf("2 * %d = %d\n",i,2*i);
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까? ");
		int dan = sc.nextInt();
		System.out.printf("%d단 입니다.\n",dan);
		for(int i = 1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0;i<5;i++) {
			System.out.print("정수값을 입력하세요 : ");
			sum += sc.nextInt();
			}
		System.out.printf("입력한 5개의 정수의 합 : %d",sum);
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		int sum =0;
		int start = num1>num2 ? num2 : num1 ;
		int end = num1<num2 ? num2 : num1 ; 
		for(int i = start; i<=end; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d",start,end,sum);
	}
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i =0;i<=num;i++) {
			if(i%2 ==0) {
			sum += i;
			}
		}
		System.out.printf("짝수들의 합은 : %d",sum);
	}
}
