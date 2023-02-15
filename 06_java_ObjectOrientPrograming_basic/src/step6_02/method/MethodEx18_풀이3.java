package step6_02.method;

import java.util.Random;
import java.util.Scanner;

class SpeedGame_풀이3 {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;

	//숫자 세팅하기
	
	void setNumber() {
		int k = 1;
		for(int i = 0; i<front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				front[i][j] = k++;
				
			}
		}
		for (int i = 0; i < back.length; i++) {
			for (int j = 0; j < back[i].length; j++) {
				back[i][j] = k++;
				
			}
			
		}
		
	}
	
	//카드 섞기 
	
	void suffleCard() {
		for (int i = 0; i < 1000; i++) {
			int xR = ran.nextInt(front.length);
			int yR = ran.nextInt(front[0].length);
			
			int tmp = front[0][0];
			front[0][0] = front[xR][yR];
			front[xR][yR] = tmp;
			
			
			tmp = back[0][0];
			back[0][0] = back[xR][yR];
			back[xR][yR] = tmp;
			
			
		}
	}
	
	//화면 출력하기
	
	
}



public class MethodEx18_풀이3 {

	public static void main(String[] args) {
		
		SpeedGame_풀이3 sg = new SpeedGame_풀이3();
		sg.run();

	}

}
