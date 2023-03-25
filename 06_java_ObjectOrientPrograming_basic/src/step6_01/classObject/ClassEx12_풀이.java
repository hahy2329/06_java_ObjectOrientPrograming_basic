package step6_01.classObject;

import java.util.Scanner;

/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */


class Ex12_풀이{
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
}



public class ClassEx12_풀이 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex12_풀이 e = new Ex12_풀이();
		
		
		for (int i = 0; i < e.game.length; i++) {
			for (int j = 0; j < e.game[i].length; j++) {
				e.game[i][j] = "[ ]";
			}
		}
		
		
		
		while(true) {
		
			for (int i = 0; i < e.game.length; i++) {
				for (int j = 0; j < e.game[i].length; j++) {
					System.out.print(e.game[i][j] + " ");
				}
				System.out.println();
				
			}
			System.out.println();
			
			if(e.win == 1) {
				System.out.println("[p1]승리");
				break;
			}
			else if(e.win == 2) {
				System.out.println("[p2]승리");
				break;
			}
			
			if(e.win==0 && e.turn ==9) {
				System.out.println("비겼다.");
				break;
			}
			
			if(e.turn % 2 == 0) {
				
				System.out.println("[p1]y좌표 입력: ");
				int y = scan.nextInt();
				System.out.println("[p1]x좌표 입력: ");
				int x = scan.nextInt();
				
				if(e.game[y][x].equals("[ ]")) {
					e.game[y][x] ="[o]";
					e.turn +=1;
							
				}
			}
			else if(e.turn %2 == 1) {
				System.out.println("[p2]y좌표 입력 : ");
				int y = scan.nextInt();
				System.out.println("[p2]x좌표 입력 : ");
				int x = scan.nextInt();
				
				if(e.game[y][x].equals("[ ]")) {
					e.game[y][x] = "[x]";
					e.turn +=1;
				}
			}
			
			for (int i = 0; i < e.game.length; i++) {
				if (e.game[i][0].equals("[o]") && e.game[i][1].equals("[o]") && e.game[i][2].equals("[o]")) e.win = 1;				
				if (e.game[i][0].equals("[x]") && e.game[i][1].equals("[x]") && e.game[i][2].equals("[x]")) e.win = 2;
			}//가로 방향으로 빙고인지
			
			for (int i = 0; i < e.game.length; i++) {
				if(e.game[0][i].equals("[o]") && e.game[1][i].equals("[o]") && e.game[2][i].equals("[o]")) e.win = 1;
				if(e.game[0][i].equals("[x]") && e.game[1][i].equals("[x]") && e.game[2][i].equals("[x]")) e.win = 2;
			}
			
			if (e.game[0][0].equals("[o]") && e.game[1][1].equals("[o]") && e.game[2][2].equals("[o]")) e.win = 1;
			if (e.game[0][0].equals("[x]") && e.game[1][1].equals("[x]") && e.game[2][2].equals("[x]")) e.win = 2;
			
			if (e.game[0][2].equals("[o]") && e.game[1][1].equals("[o]") && e.game[2][0].equals("[o]")) e.win = 1;
			if (e.game[0][2].equals("[x]") && e.game[1][1].equals("[x]") && e.game[2][0].equals("[x]")) e.win = 2;
			
			
			
		}
		scan.close();
		
	}

}
