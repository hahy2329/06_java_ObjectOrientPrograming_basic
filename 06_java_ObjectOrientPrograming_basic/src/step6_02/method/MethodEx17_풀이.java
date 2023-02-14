package step6_02.method;

import java.util.Scanner;

//# 틱택토

class TicTacToe_풀이{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		// 1[turn1승리] 2[turn2승리]
	
	// game 배열을 공백(" ")으로 초기화 (초기화하지 않을 경우 null 값)
	
	void setGame() {
		
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j] = " ";
				
				
				
			}
			
		}
	}
	
	
	void showGame() {
		System.out.println("== 틱택톡 ==");
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				System.out.print("[" + game[i][j] + "]");
				
			}
			System.out.println();
		}
		System.out.println("============");
	}
	
	void choiceIdx() {
		
		if(turn %2 == 0) {
			System.out.println("[1턴] y인덱스 입력: ");
			int yIdx = scan.nextInt();
			System.out.println("[1턴]x인덱스 입력 : ");
			int xIdx = scan.nextInt();
			
			if(game[yIdx][xIdx].equals(" ")) {
				game[yIdx][xIdx] = "O";
				turn +=1;
			}
			
			else {
				System.out.println("잘못 입력 했습니다.");
			}
		}
		
		else if(turn % 2 == 1) {
			System.out.println("[2턴]y인덱스 입력 : ");
			int yIdx = scan.nextInt();
			System.out.println("[2턴]x인덱스 입력 : ");
			int xIdx = scan.nextInt();
			
			if(game[yIdx][xIdx].equals(" ")) {
				game[yIdx][xIdx] = "X";
				turn +=1;
			}
			else {
				System.out.println("잘못 입력 했습니다.");
			}
			
		}
	}
	
	void exitWidth() {
		for (int i = 0; i < game.length; i++) {
			if(game[0][0].equals("O") && game[1][1].equals("O"))
			
		}
	}
	
	
}


public class MethodEx17_풀이 {

	public static void main(String[] args) {
		
		TicTacToe_풀이 tic = new TicTacToe_풀이();
		tic.run();

	}

}
