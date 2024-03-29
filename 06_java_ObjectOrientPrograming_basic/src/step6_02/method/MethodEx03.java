package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */
class ReturnEx{
	void setScore1(int score1) {
		score1 = 100;
	}
	
	int setScore2(int score2) {
		score2 = 100;
		
		return score2;
		
	}
	
	int testReturn() {
		
		System.out.println("리턴 전 명령어1");
		System.out.println("리턴 전 명령어2");
		System.out.println("리턴 전 명령어3");
		//return 1,2,3,4,5; return은 only one(복수 x) 
		return 0;
		
		
		/*if(){
		 * return 0;
		 * 
		 * }
		 * else{
		 * 	return 1;
		 * 
		 * }
		 * -> if~else 방식은 가능 왜냐, return이 참, 거짓일 때 하나씩 실행되기 때문.
		 * 
		 * */
		
		/*
		System.out.println("리턴 후 명령어1");
		System.out.println("리턴 후 명령어2");
		System.out.println("리턴 후 명령어3");
		
		*/ //return을 만나는 순간 메서드는 종료된다.
	}
	
}





public class MethodEx03 {

	public static void main(String[] args) {
		ReturnEx test = new ReturnEx();
		
		int score1 = 87;
		
		System.out.println("메서드 호출 전: "+score1);
		
		test.setScore1(score1);

		System.out.println("메서드 호출 후: "+score1);
		
		int score2 = 87;
		
		System.out.println("메서드 호출 전: "+score2);
		
		score2 = test.setScore2(score2);
		
		System.out.println("메서드 호출 후: "+score2);
		
		
	}

}
