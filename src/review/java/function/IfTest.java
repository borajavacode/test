package review.java.function;
import java.util.Scanner;
public class IfTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== ���̰��� ���α׷� ======");
		System.out.print("�����Ͻ� �� �ο��� ����Դϱ�? : ");
		int total = sc.nextInt();
		System.out.print("��� ����Դϱ�?(1�δ� 15000��) : ");
		int adult = sc.nextInt();
		System.out.print("���̴� ����Դϱ�?(1�δ� 5000��) : ");
		int kid = sc.nextInt();
		int sum = (15000*adult)+(5000*kid);
		if(total == (adult + kid)) {
			System.out.printf("�����Ͻ� �� �ݾ��� %d�� �Դϴ�.\n",sum);
		}else {
			System.out.println("�ο����� ���� �ʽ��ϴ�.");
		}
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= ���� ���α׷� =======");
		System.out.println("ù��° ����");
		System.out.print("����� ����� �����ϱ��(1.apple,2.��Ƽ�� �⽺)? : ");
		int ans1 = sc.nextInt();
		int count = 0;
		if(ans1 == 1) {
			System.out.println("����!!!");
			count++;
		}else {
			System.out.println("��!!");
		}
		System.out.println("�ι��� ����");
		System.out.print("�ٳ����� ��� ������ ���� ������ (1.���,2.����)? : ");
		int ans2 = sc.nextInt();
		if(ans2 == 2) {
			System.out.println("����!!!");
			count++;
		}else {
			System.out.println("��!!");
		}
		System.out.printf("�� %d������ ������ϴ�.\n",count);
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= �ɸ��׽�Ʈ ========");
		System.out.print("����� ���� �����Ͻʴϱ�(1.yes,2.no)? : ");
		int ans1 = sc.nextInt();
		if(ans1 == 1) {
			System.out.print("����� ��踦 �ǿ�ϱ�(1.yes,2.no)? : ");
			int ans2 = sc.nextInt();
			if(ans2 ==1) {
				System.out.println("���� �ǰ��� ���� �ʽ��ϴ�.");
			}else {
				System.out.println("���� ���� ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.print("����� �̼�ģ���� �ֽ��ϱ�(1.yes,2.no) : ");
			int ans3 = sc.nextInt();
			if(ans3 == 1) {
				System.out.println("��..��");
			}else {
				System.out.println("������Ф�");
			}
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ��/�ҹ��� ��ȯ ���α׷� =====");
		System.out.print("�����Է� : ");
		char ch = sc.next().charAt(0);
		System.out.println("===== ��� =====");
		if(ch>='a' && ch<='z') {
			System.out.println("�ҹ��ڷ� �Է��Ͽ����ϴ�.");
			ch = (char)(ch-32);
			System.out.println("�빮�ڷ� ��ȯ : "+ch);
		}else if(ch>='A' && ch<='Z') {
			System.out.println("�빮�ڷ� �Է��Ͽ����ϴ�.");
			ch = (char)(ch+32);
			System.out.println("�ҹ��ڷ� ��ȯ : "+ch);
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�. �����ڸ� �Է����ּ���.");
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
		System.out.println("===== ��� =====");
		if(num ==0 || (num%3 !=0 && num%4 !=0)) {
			System.out.printf("[%d]��(��) 3�� ����� 4�� ����� �ƴմϴ�.",num);
		}else if(num%3 == 0 && num%4 ==0 ) {
			System.out.printf("[%d]��(��) 3�� ����鼭 4�� ����Դϴ�.",num);
		}else if(num%3 == 0) {
			System.out.printf("[%d]��(��) 3�� ����Դϴ�.",num);
		}else if(num%4 == 0 ) {
			System.out.printf("[%d](��)�� 4�� ����Դϴ�.",num);
		}
	}
}
