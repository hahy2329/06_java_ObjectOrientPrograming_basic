package step6_01.classObject;
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.util.Scanner;


class Ex11_풀이{
	String name = "";
	
	String[] arAcc = new String[5];
	String[] arPw  = new String[5];
	int[] arMoney  = new int[5];
	
	int accCnt = 0;
	int identifier = -1;
}


public class ClassEx11_풀이 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex11_풀이 e = new Ex11_풀이();
		e.name = "Mega Bank";
		
		while (true) {
			
//			System.out.println("[" + e.name + "]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				System.out.println("[회원가입]id를 입력해주세요 : ");
				String id = scan.next();
				
				System.out.println("[회원가입]pw를 입력해주세요 : ");
				String pw = scan.next();
				
				e.arAcc[e.accCnt] = id;
				e.arPw[e.accCnt] = pw;
				e.arMoney[e.accCnt] +=1000;
				e.accCnt++;
				
			}
			else if (sel == 2) {
				if(e.identifier!=-1) {
					System.out.println("[회원탈퇴]회원탈퇴를 진행하겠습니다.");
					
					
					String[] id = e.arAcc;
					String[] pw = e.arPw;
					int[] money = e.arMoney;
					
					e.arAcc = new String[e.accCnt-1];
					e.arPw = new String[e.accCnt-1];
					e.arMoney = new int[e.accCnt-1];
					
					int j = 0;
					for (int i = 0; i < e.accCnt; i++) {
						if(i != e.identifier) {
							e.arAcc[j++] = id[i];
							e.arPw[j++] = pw[i];
							e.arMoney[j++] = money[i];
						}
					}
					id = null;
					pw = null;
					money = null;
					System.out.println(e.arAcc[e.identifier]+"님 정상적으로 회원탈퇴 되셨습니다.");
					e.identifier = -1;
					e.accCnt --;
					
					
					
					
				}
				
				else {
					System.out.println("로그인 후 이용해주시길 바랍니다.");
					
				}
			}
			else if (sel == 3) {
				if(e.identifier==-1) {
					System.out.println("[로그인]id를 입력해주세요 : ");
					String id = scan.next();
					
					System.out.println("[로그인]pw를 입력해주세요 : ");
					String pw = scan.next();
					
					for (int i = 0; i < e.accCnt; i++) {
						if(id.equals(e.arAcc[i]) && pw.equals(e.arPw[i])){
							e.identifier = i;
						}
					}
					if(e.identifier!=-1) {
						System.out.println(e.arAcc[e.identifier]+"님 로그인 성공!");
					}
					else {
						System.out.println("id 또는 pw를 다시 확인해주세요.");
						continue;
					}
				}
				
				else {
					System.out.println("이미 로그인 중입니다.");
				}
			}
			else if (sel == 4) {
				if(e.identifier!=-1) {
					e.identifier = -1;
					System.out.println("[로그아웃]정상적으로 로그아웃 되었습니다.");
				}
				else {
					System.out.println("로그인 후 이용하시길 바랍니다.");
				}
				
			}
			else if (sel == 5) {
				
				if(e.identifier!=-1) {
					System.out.println("[입금]입금 할 금액을 입력해주시길 바랍니다.");
					int money = scan.nextInt();
					
					e.arMoney[e.identifier] +=money;
					System.out.println("정상적으로 입금이 완료되었습니다.");
				}
				else {
					System.out.println("로그인 후 이용가능합니다.");
				}
			}
			else if (sel == 6) {
				if(e.identifier !=-1) {
					System.out.println("[이체]이체할 상대방의 id를 입력해주세요.");
					String id = scan.next();
					
					int idx = -1;
					for (int i = 0; i < e.accCnt; i++) {
						if(id.equals(e.arAcc[i])) {
							idx = i;
						}
					}
					if(idx!=-1) {
						System.out.println("[이체]이체할 금액을 입력해주세요.");
						int money = scan.nextInt();
						
						if(e.arMoney[e.identifier]>=money) {
							e.arMoney[e.identifier] -=money;
							e.arMoney[idx] +=money;
							System.out.println("정상적으로 이체가 완료되었습니다.");
						}
						else {
							System.out.println("[오류]현재 금액이 부족합니다.");
						}
						
					}
					
					else {
						System.out.println("[메세지]상대방의 id를 다시 입력해주세요.");
					}
				}
				else {
					System.out.println("로그인 후 이용가능합니다.");
				}
				
			}
			else if (sel == 7) {
				if(e.identifier!=-1) {
					System.out.println("[잔액조회]현재 " + e.arAcc[e.identifier]+"님의 "
							+ "소지하고 계신 금액은 " + e.arMoney[e.identifier]+"원 입니다.");
				}
				else {
					System.out.println("로그인 후 이용가능합니다.");
				}
				
				
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}		
		scan.close();
	}
	

}
