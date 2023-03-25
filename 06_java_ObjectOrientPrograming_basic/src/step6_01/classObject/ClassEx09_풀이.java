package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */


class Ex09_풀이{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}


public class ClassEx09_풀이 {

	public static void main(String[] args) {		
		
		Ex09_풀이 card = new Ex09_풀이();
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int size = card.front.length;
		
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(size);
			int temp = card.front[0];
			card.front[0] = card.front[r];
			card.front[r] = temp;
		}
		
		while(true) {
			
			for (int i = 0; i < size; i++) {
				if(card.front[i]==1) System.out.print("o\t");
				else if(card.front[i]==2) System.out.print("□\t");
				else if(card.front[i]==3) System.out.print("△\t");
				else if(card.front[i]==4) System.out.print("♧\t");
				else if(card.front[i]==5) System.out.print("◐\t");
			}
			
			System.out.println();
			
			
			for (int i = 0; i < size; i++) {
				if(card.back[i]==1) System.out.print("o\t");
				else if(card.back[i]==2) System.out.print("□\t");
				else if(card.back[i]==3) System.out.print("△\t");
				else if(card.back[i]==4) System.out.print("♧\t");
				else if(card.back[i]==5) System.out.print("◐\t");
				else System.out.print("x\t");
			}
			System.out.println();
			
			if(card.answerCnt ==5) break;
			
			System.out.println("인덱스1 입력 : ");
			int idx1 = scan.nextInt();
			
			System.out.println("인덱스2 입력 : ");
			int idx2 = scan.nextInt();
			
			
			if(card.front[idx1] == card.front[idx2]) {
				card.back[idx1] = card.front[idx1];
				card.back[idx2] = card.front[idx2];
				card.answerCnt++;
			}
			
		}
		scan.close();
	}

}
