package review.java.function;
import java.util.Scanner;
public class IfTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 놀이공원 프로그램 ======");
		System.out.print("입장하실 총 인원은 몇명입니까? : ");
		int total = sc.nextInt();
		System.out.print("어른은 몇명입니까?(1인당 15000원) : ");
		int adult = sc.nextInt();
		System.out.print("아이는 몇명입니까?(1인당 5000원) : ");
		int kid = sc.nextInt();
		int sum = (15000*adult)+(5000*kid);
		if(total == (adult + kid)) {
			System.out.printf("지불하실 총 금액은 %d원 입니다.\n",sum);
		}else {
			System.out.println("인원수가 맞지 않습니다.");
		}
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 퀴즈 프로그램 =======");
		System.out.println("첫번째 퀴즈");
		System.out.print("사과는 영어로 무엇일까요(1.apple,2.스티브 잡스)? : ");
		int ans1 = sc.nextInt();
		int count = 0;
		if(ans1 == 1) {
			System.out.println("정답!!!");
			count++;
		}else {
			System.out.println("땡!!");
		}
		System.out.println("두번쨰 퀴즈");
		System.out.print("바나나는 길어 길으면 기차 기차는 (1.비싸,2.빨라)? : ");
		int ans2 = sc.nextInt();
		if(ans2 == 2) {
			System.out.println("정답!!!");
			count++;
		}else {
			System.out.println("땡!!");
		}
		System.out.printf("총 %d문제를 맞췄습니다.\n",count);
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 심리테스트 ========");
		System.out.print("당신은 술을 좋아하십니까(1.yes,2.no)? : ");
		int ans1 = sc.nextInt();
		if(ans1 == 1) {
			System.out.print("당신은 담배를 피웁니까(1.yes,2.no)? : ");
			int ans2 = sc.nextInt();
			if(ans2 ==1) {
				System.out.println("담배는 건강에 좋지 않습니다.");
			}else {
				System.out.println("술은 간에 좋지 않습니다.");
			}
		}else {
			System.out.print("당신은 이성친구가 있습니까(1.yes,2.no) : ");
			int ans3 = sc.nextInt();
			if(ans3 == 1) {
				System.out.println("올..ㅋ");
			}else {
				System.out.println("힘내요ㅠㅠ");
			}
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 대/소문자 변환 프로그램 =====");
		System.out.print("문자입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println("===== 결과 =====");
		if(ch>='a' && ch<='z') {
			System.out.println("소문자로 입력하였습니다.");
			ch = (char)(ch-32);
			System.out.println("대문자로 변환 : "+ch);
		}else if(ch>='A' && ch<='Z') {
			System.out.println("대문자로 입력하였습니다.");
			ch = (char)(ch+32);
			System.out.println("소문자로 변환 : "+ch);
		}else {
			System.out.println("잘못입력하셨습니다. 영문자를 입력해주세요.");
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		System.out.println("===== 결과 =====");
		if(num ==0 || (num%3 !=0 && num%4 !=0)) {
			System.out.printf("[%d]은(는) 3의 배수도 4의 배수도 아닙니다.",num);
		}else if(num%3 == 0 && num%4 ==0 ) {
			System.out.printf("[%d]은(는) 3의 배수면서 4의 배수입니다.",num);
		}else if(num%3 == 0) {
			System.out.printf("[%d]은(는) 3의 배수입니다.",num);
		}else if(num%4 == 0 ) {
			System.out.printf("[%d](은)는 4의 배수입니다.",num);
		}
	}
}
