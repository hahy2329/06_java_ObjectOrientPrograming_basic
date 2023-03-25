package step6_01.classObject;

import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */


class Ex10_풀이 {
	String name = "";		// 가게 이름
	
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	
	int[] arCount = new int[4];
	
	int total = 0;
}


public class ClassEx10_풀이 {

	public static void main(String[] args) {
		Ex10_풀이 store = new Ex10_풀이();
		
		store.name = "롯데리아";
		Scanner scan = new Scanner(System.in);
		int menuSel = 0;
		
		while(true) {
			if(store.total ==4) {
				break;
			}
			for (int i = 0; i < store.arMenu.length; i++) {
				System.out.println(i+"번째 : "+ store.arMenu[i]);
			}
			
			System.out.println("메뉴를 택해주세요 : ");
			menuSel = scan.nextInt();
			
			for (int i = 0; i < store.arMenu.length; i++) {
				if(menuSel == i) {
					store.arCount[i] +=1;
					store.total +=1;
				}
			}
			
			
		}
		
		int sum = 0;
		for (int i = 0; i < store.arCount.length; i++) {
			if(store.arCount[i]!=0) {
				sum+=store.arPrice[i] * store.arCount[i];
			}
		}
		
		System.out.println("계산 도와드릴게요.");
		int money = scan.nextInt();
		
		if(money >=sum) {
			System.out.println("   " + store.name + "   ");
			System.out.println("------------------------");
			System.out.println("ITEM QTY AMT");
			System.out.println(store.arMenu[0] + " " + store.arCount[0]+ " " + store.arPrice[0]*store.arCount[0]);
			System.out.println(store.arMenu[1] + " " + store.arCount[1]+ " " + store.arPrice[1]*store.arCount[1]);
			System.out.println(store.arMenu[2] + " " + store.arCount[2]+ " " + store.arPrice[2]*store.arCount[2]);
			System.out.println(store.arMenu[3] + " " + store.arCount[3]+ " " + store.arPrice[3]*store.arCount[3]);
			System.out.println("-------------------------");
			System.out.println("합계금액              "+ sum);
			System.out.println("받은금액              "+ money);
			System.out.println("-------------------------");
			System.out.println("잔      돈         " + (money - sum));
			
			
			
		}
		
		
		
	}

}
