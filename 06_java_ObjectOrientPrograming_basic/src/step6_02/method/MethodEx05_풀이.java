package step6_02.method;

import java.util.Scanner;


//23.2.10 13:10 ~ 13:23
class Ex05_풀이{

	Scanner scan = new Scanner(System.in);
	void test1() {
		
		int[] arr = new int[5];
		int sum =0;
		int count =1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = count;
			
			sum += arr[i];
			count++;
		}
		System.out.println(sum);
		
		
	}
	
	void test2() {
		int maxNum = 0;
		int count = 0;
		
		int[] arr = new int[3];
		
		while(count<3) {
			System.out.println("값을 입력해주세요: ");
			int user = scan.nextInt();
			arr[count] = user;
			count ++;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(maxNum <arr[i]) {
				maxNum = arr[i];
			}
			
		}
		
		System.out.println("최대값 : " + maxNum);
		scan.close();
	}
	
}


public class MethodEx05_풀이 {

	public static void main(String[] args) {
		
		
		
		
			Ex05_풀이 e = new Ex05_풀이();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		


	}

}
