package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

//23.2.9 13:26 ~ 13:45
class Ex04_풀이 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}



public class ClassEx04_풀이 {

	public static void main(String[] args) {
		Ex04_풀이 e = new Ex04_풀이();
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		for (int i = 0; i < e.hakbuns.length; i++) {
			e.scores[i] = ran.nextInt(100)+1; 
			
		}
		System.out.println("scores배열의 점수");
		for (int i = 0; i < e.scores.length; i++) {
			System.out.print(e.scores[i]+ " ");
			
		}
		System.out.println();
		
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			sum += e.scores[i];
			
		}
		
		System.out.println("총점 : "+ sum);
		avg = sum / 5;
		System.out.println("평균 : " + avg);
		
		
		System.out.println();
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		int count= 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			if(e.scores[i] >=60) {
				count++;
			}
			
		}
		
		System.out.println("합격 수: " + count+"명");
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.println("인덱스를 입력해주세요: ");
		int idx = scan.nextInt();
		
		for (int i = 0; i < e.scores.length; i++) {
			if(i==idx) {
				System.out.println("성적 : " + e.scores[idx]);
			}
			
		}
		System.out.println();
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.println("성적을 입력해주세요: ");
		int userNum = scan.nextInt();
		
		for (int i = 0; i < e.scores.length; i++) {
			if(e.scores[i] == userNum) {
				System.out.println("인덱스: " + i);
			}
			
		}
		
		System.out.println();
		
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		System.out.println("학번을 입력해주세요: ");
		int studentCode = scan.nextInt();
		
		for (int i = 0; i < e.hakbuns.length; i++) {
			if(e.hakbuns[i] == studentCode) {
				System.out.println("성적: " + e.scores[i]);
			}
			
		}
		System.out.println();
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.println("학번을 입력해주세요: ");
		int code = scan.nextInt();
		
		int count1 =-1;
			
		
		
			for (int i = 0; i < e.hakbuns.length; i++) {
				if(e.hakbuns[i] ==code) {
					count1 = i;
				}
				
			}
			
			if(count1 == -1) {
				System.out.println("해당학번은 존재하지 않습니다.");
			}
			
			else {
				System.out.println("성적: " + e.scores[count1]);
			}
			
			System.out.println();
			
		
				
				
		
		
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
			
			int maxNum = 0;
			int count2 =0;
			
			
			for (int i = 0; i < e.scores.length; i++) {
				if(e.scores[i] > maxNum) {
					maxNum = e.scores[i];
					count2 = e.hakbuns[i];		
				}
				
			}
			
			System.out.println(count2 +"번" + "("+maxNum+")" );
			
			

	}

}
