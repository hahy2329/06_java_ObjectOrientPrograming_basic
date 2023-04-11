package step6_01.classObject;

import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */


class Ex05_풀이{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}



public class ClassEx05_풀이 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		Ex05_풀이 mega = new Ex05_풀이();
		mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if		(choice == 1) {
				
				int sum = 0;
				for (int i = 0; i < mega.arScore.length; i++) {
					System.out.print(mega.arScore[i] + " ");
				}
				
				
				
			}
			else if (choice == 2) {
				
				int max = 0;
				int num = 0;
				
				for (int i = 0; i < mega.arScore.length; i++) {
					if(max<mega.arScore[i]) {
						max = mega.arScore[i];
						num = i;
					}
				}
				
				System.out.println("1등 학생의 성적은 " + mega.arScore[num]+"점 입니다.");
				
				
			}
			else if (choice == 3) {
				int min =mega.arScore[0];
				int num2 = 0;
				
				for (int i = 0; i < mega.arScore.length; i++) {
					if(min > mega.arScore[i]) {
						min = mega.arScore[i];
						num2 = i;
					}
				}
				
				System.out.println("꼴등 학생의 성적은 " + mega.arScore[num2]+"점 입니다.");
				
				
				
			}
			else if (choice == 4) {
				System.out.println("성적을 확인 할 학생의 학번을 입력해주세요.");
				int studentNum = scan.nextInt();
				int idx = -1;
				
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if(studentNum == mega.arHakbun[i]) {
						idx = i;
					}
				}
				
				if(idx!=-1) {
					System.out.println("입력하신 학번의 성적은 " + mega.arScore[idx]+"점 입니다.");
				}
				
				else {
					System.out.println("존재하지 않은 학번입니다.");
				}
				
				
				
				
				
			}
			
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
			
			
			
		}

	}

}
