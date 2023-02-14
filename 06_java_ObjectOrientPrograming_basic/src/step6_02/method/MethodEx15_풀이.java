package step6_02.method;

import java.util.Scanner;

/*
 * # 숫자 이동하기 : 클래스 + 메서드
 * 1. 숫자 8은 캐릭터이다.
 * 2. 숫자 1을 입력하면, 캐릭터가 왼쪽으로 이동한다.
 * 3. 숫자 2를 입력하면, 캐릭터가 오른쪽으로이동한다.
 * 4. 좌우 끝에 도달했을 때 에러가 발생하지 않도록 예외처리를 해준다.
 */

class NumberGame_풀이{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int playerLocation = 4;
	
	void printPlay() {
		for (int i = 0; i < move.length; i++) {
			if(move[i] == 0) {
				System.out.print("[]");
			}
			else {
				System.out.print("옷");
			}
			
		}
		System.out.println();
	}//현재 move배열의 상태
	
	
	void showMenu() {
		System.out.println("1. 좌로 이동");
		System.out.println("2. 우로 이동");
		System.out.println("3. 프로그램 종료");
	}
	
	void moveLeft() {
		if(playerLocation>0) {
			move[playerLocation] = 0;
			move[playerLocation-1] = 8;
			playerLocation --;
		}
		
		else {
			System.out.println("더이상 왼쪽으로 갈 수 없습니다.");
		}
	} //좌로 이동했을 때
	
	void moveRight() {
		if(playerLocation<8) {
			move[playerLocation] = 0;
			move[playerLocation + 1] = 8;
			playerLocation++;
		}
		else{
			System.out.println("더이상 오른쪽으로 갈 수 없습니다.");
		}
	}
	
	
	void run() {
		while(true) {
			printPlay();
			showMenu();
			System.out.println("메뉴를 선택해주세요: ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				moveLeft();
			}
			
			else if(choice == 2) {
				moveRight();
			}
			
			else if(choice == 3) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
		}
	}
	
	
}

public class MethodEx15_풀이 {

	public static void main(String[] args) {
		
		NumberGame_풀이 g = new NumberGame_풀이();
		g.run();

	}

}
