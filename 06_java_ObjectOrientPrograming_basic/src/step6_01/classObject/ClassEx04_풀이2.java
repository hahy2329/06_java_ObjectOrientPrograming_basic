package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

class Ex04_풀이3 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}



public class ClassEx04_풀이2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		
		
		Ex04_풀이3 s1 = new Ex04_풀이3();
		for (int i = 0; i < s1.scores.length; i++) {
			s1.scores[i] = ran.nextInt(100)+1;
		}
		
		for (int i = 0; i < s1.scores.length; i++) {
			System.out.print(s1.scores[i] + " ");
		}
		System.out.println();
		
		
		
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		int sum = 0;
		float avg = 0;
		
		for (int i = 0; i < s1.scores.length; i++) {
			sum += s1.scores[i];
		}
		
		avg = sum / s1.scores.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		int count = 0;
		for (int i = 0; i < s1.scores.length; i++) {
			if(s1.scores[i]>=60) {
				System.out.println(s1.hakbuns[i]+"번째님 합격!");
				count ++;
			}
		}
		
		System.out.println("합격자 수 : " + count+"명 입니다.");
		System.out.println();
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.println("인덱스를 입력해주세요 : ");
		int user = scan.nextInt();
		
		for (int i = 0; i < s1.scores.length; i++) {
			if(user==i) {
				System.out.println("인덱스 입력 : " + user + "성적 : " + s1.scores[user]);
			}
		}
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		
		System.out.println("성적을 입력해주세요 : ");
		int user1 = scan.nextInt();
		
		for (int i = 0; i < s1.scores.length; i++) {
			if(user1 == s1.scores[i]) {
				System.out.println("성적 입력 : " + user1 + "인덱스 : " + i);
			}
		}
		
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		
		
		
		System.out.println("학번을 입력해주세요 : ");
		int studentNum = scan.nextInt();
		
		for (int i = 0; i < s1.hakbuns.length; i++) {
			if(studentNum == s1.hakbuns[i]) {
				System.out.println("학번 : " + studentNum + "성적 : " + s1.scores[i]);
			}
		}
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.println("학번을 입력해주세요 : ");
		int studentNum1 = scan.nextInt();
		int count2 = 0;
		
		for (int i = 0; i < s1.hakbuns.length; i++) {
			if(studentNum1 == s1.hakbuns[i]) {
				count2 = i;
				
			}
			
		}
		
		if(count2 !=0) {
			System.out.println("학번 입력 : " + s1.hakbuns[count2] + "성적 : " + s1.scores[count2]);
		}
		else {
			System.out.println(studentNum1+"은 없는 학번입니다.");
		}
		
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		
		int top =0;
		int userTop=0;
		
		for (int i = 0; i < s1.scores.length; i++) {
			if(top<s1.scores[i]) {
				top = s1.scores[i];
				userTop=i;
			}
		}
		
		System.out.println("최고로 점수가 높은 학생의 학번은 " +s1.hakbuns[userTop] +"(" + top+"점)");

	}

}
