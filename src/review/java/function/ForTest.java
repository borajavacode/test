package review.java.function;
import java.util.Scanner;
public class ForTest {
	public void test1() {
		for(int i = 0; i<5; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ����Ͻðڽ��ϱ�? ");
		int num = sc.nextInt();
		for(int i = 0;i<num;i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}
	public void test3() {
		System.out.println("2�� �Դϴ�.");
		for(int i = 1;i<=9;i++) {
			System.out.printf("2 * %d = %d\n",i,2*i);
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ����Ͻðڽ��ϱ�? ");
		int dan = sc.nextInt();
		System.out.printf("%d�� �Դϴ�.\n",dan);
		for(int i = 1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n", dan,i,dan*i);
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0;i<5;i++) {
			System.out.print("�������� �Է��ϼ��� : ");
			sum += sc.nextInt();
			}
		System.out.printf("�Է��� 5���� ������ �� : %d",sum);
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		int sum =0;
		int start = num1>num2 ? num2 : num1 ;
		int end = num1<num2 ? num2 : num1 ; 
		for(int i = start; i<=end; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d�� ������ �� : %d",start,end,sum);
	}
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i =0;i<=num;i++) {
			if(i%2 ==0) {
			sum += i;
			}
		}
		System.out.printf("¦������ ���� : %d",sum);
	}
}
