package step6_02.method;
//23.2.10 13:29 ~ 13:35

class Ex07_풀이 {
	
	void printEvenOrOdd(int x) {
		if(x %2 ==0) {
			System.out.println("짝수");
		}
		if(x %2 == 1) {
			System.out.println("홀수");
		}
	}
	void getAvgBetweenValues(int x, int y) {
		int sum = 0;
		int avg = 0;
		
		for (int i = x; i <= y; i++) {
			sum += i;
			
		}
		avg = sum / 10;
		System.out.println(avg);
		
		
	}

	void printPrimeNums(int primeNumber) {
		
		
		for (int i = 2; i <= primeNumber; i++) {
			int count = 0;
			for (int j = 1; j <=i ; j++) {
				if(i%j==0){
					count++;
				}
				
			}
			if(count == 2) {
				System.out.print(i + " ");
			}
			
		}
	}
}


public class MethodEx07_풀이 {

	public static void main(String[] args) {
		
		
			Ex07_풀이 e = new Ex07_풀이();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.getAvgBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);
		



	}

}
