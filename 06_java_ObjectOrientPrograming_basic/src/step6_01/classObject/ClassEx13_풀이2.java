package step6_01.classObject;
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

import java.util.Random;
import java.util.Scanner;

class Ex13_풀이2{
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
}



public class ClassEx13_풀이2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex13_풀이2 e = new Ex13_풀이2();
		
		for (int i = 0; i < e.SIZE; i++) {
			e.front[i] = i+1;
			e.back[i] = i+10;
		}
		
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(e.SIZE);
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}
		
		int gameNum1 = 1;
		
		while(true) {
			for (int i = 0; i < e.SIZE; i++) {
				if(e.front[i] ==0 ) System.out.print("\t");
				else System.out.print(e.front[i] + "\t");
				
				if(i%3==2) System.out.println();
			}
			System.out.println();
			
			if(gameNum1 == 19) {
				System.out.println("게임 종료");
				break;
			}
			
			System.out.println("입력 : ");
			int idx = scan.nextInt();
			
			if(e.front[idx] == gameNum1) {
				if(1<=gameNum1 && gameNum1 <= e.SIZE) {
					e.front[idx] = e.back[idx];
				}
				
				else if(e.SIZE< gameNum1 && gameNum1<=18) {
					e.front[idx] = 0;
				}
				gameNum1++;
			}
			
		}
	}

}
