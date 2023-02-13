
package step6_02.method;

import java.util.Random;
import java.util.Scanner;

//23.2.10 13:42 ~ 14:00
class Ex09_풀이3 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int [] scores) {
		for (int i = 0; i < scores.length; i++) {
			scores[i] = ran.nextInt(100)+1;
			System.out.print(scores[i]+ " ");
		}
		
		System.out.println();
		
	}
	
	
	//문제 2)
	void printSumAndAverage (int [] scores) {
		int sum = 0;
		double avg = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = sum/5;
		System.out.println(sum);
		System.out.println(avg);
		
		
		
	}
	
	
	//문제 3)
	void printWinner (int [] scores) {
		int count = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]>60) {
				count++;
			}
		}
		System.out.println("합격자 수 : "+count+"명");
		
	}
	
	//문제 4)
	void printScore1 (int [] scores) {
		System.out.println("인덱스를 입력해주세요: ");
		int userNum = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if(i == userNum) {
				System.out.println("성적 : " + scores[i]+"점");
			}
		}
		
	}
	
	//문제 5)
	void printScore2 (int [] scores) {
		System.out.println("성적을 입력해주세요: ");
		int userScore = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] == userScore) {
				System.out.println("인덱스 번호: " + i);
			}
		}
		System.out.println();
		
	}
	
	//문제 6)
	void printScore3(int [] hakbuns, int [] scores) {
		
		System.out.println("학번을 입력해주세요: ");
		int userCode = scan.nextInt();
		boolean isRun = false;
		
		for (int i = 0; i < hakbuns.length; i++) {
			if(hakbuns[i]==userCode) {
				System.out.println("학번 " + hakbuns[i]+"님의 성적은 " + scores[i]+"점 입니다.");
				isRun = true;
			}
			
			
		}
		if(isRun == false) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}
		
		
		
		
	}
	
	
	//문제 7)
	void printNumberOne (int [] hakbuns, int [] scores) {
		int maxNum = 0;
		int idx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if(maxNum< scores[i]) {
				maxNum = scores[i];
				idx = i;
			}
		}
		
		System.out.println("1등 학생의 인덱스는 " +idx+"번째이며, 성적은 "+maxNum+"점 입니다." );
		
		
	}
	
}



public class MethodEx09_풀이3 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09_풀이3 test = new Ex09_풀이3();
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		test.setRandomValuesinArray(scores);
		
		//배열은 주소를 넘기기 때문에 메서드 상에 매개변수로 넘겨서 실행해도 여기서랑 같이 변경됨.
		//변수는 값만 넘기는것이므로 메서드 상이랑 여기랑은 다름 배열은 같음!!
		
		
	
		
		
		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		test.printSumAndAverage(scores);
		

		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		test.printWinner(scores);

		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		test.printScore1(scores);
		

		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		test.printScore2(scores);

		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		test.printScore3(hakbuns, scores);
		

		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		test.printNumberOne(hakbuns, scores);
		

	}

}
