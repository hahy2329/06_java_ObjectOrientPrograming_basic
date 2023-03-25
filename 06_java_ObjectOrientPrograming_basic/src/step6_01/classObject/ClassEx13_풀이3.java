package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */


class Ex13_풀이3{
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
}



public class ClassEx13_풀이3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex13_풀이3 a = new Ex13_풀이3();
		
		for (int i = 0; i < a.SIZE; i++) {
			a.front[i] = 1 + i;
			a.back[i] = 10 + i;
		}
		
		
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(a.SIZE);
			
			int temp = a.front[0];
			a.front[0] = a.front[r];
			a.front[r] = temp;
		}
		int gameNum2 = 1;
		
		while(true) {
			for (int i = 0; i < a.SIZE; i++) {
				if(a.front[i] == 0) System.out.print("\t");
				else System.out.print(a.front[i]+"\t");
				
				if(i%3==2)	System.out.println();
			}
			System.out.println();
			
			
			
			
			if(gameNum2 == 19) {
				System.out.println("게임 종료");
				break;
			}
			
			System.out.println("인덱스 입력 : ");
			int idx = scan.nextInt();
			
			if(a.front[idx] == gameNum2) {
				if(1<=gameNum2 && gameNum2 <=a.SIZE) {
					a.front[idx] = a.back[idx];
				}
				else if(a.SIZE< gameNum2 && gameNum2<=18) {
					a.front[idx] = 0;
				}
				gameNum2++;
			}
			
			
		}
		
	}

}
