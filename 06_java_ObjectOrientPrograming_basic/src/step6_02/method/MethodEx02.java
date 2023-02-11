package step6_02.method;

import java.io.FileWriter;
import java.io.IOException;



/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 		- 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있다.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 )
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */

class MethodType {
	String abc; // 클래스 안에서만 맘대로 쓰일수 있는 변수
	// 입력값도 없고 결과값도 없는 경우
	void type00() {
		System.out.println("========");
		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 개인정보조회");
		System.out.println("4. 개인정보수정");
		System.out.println("5. 종료");
		System.out.println();
		
	}
	
	
	// 입력값은 있고 결과값은 없는 경우
	void type10(String fileName) { // 매개변수(밖에서 받아오는것)
		String data = "["+fileName+"]"; // 지역변수(메서드 안에서만 사용하는 변수)
		
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// 입력값은 없고 결과값은 있는 경우
	double type01() {
		return 3.141592;
	}
	
	
	
	// 입력값과 결과값이 모두 있는 경우
	int type11(String birth) {
		String temp = birth.substring(0,4);
		int age = 2023 - Integer.parseInt(temp)+1;
		return age;
	}
	
	
}


public class MethodEx02 {

	public static void main(String[] args) {

		MethodType test = new MethodType();
		// 입력값도 없고 결과값도 없는 경우
		test.type00();
		System.out.println();
		
		
		
		// 입력값은 있고 결과값은 없는 경우
		test.type10("팀버너스리.txt");
		test.type10("데니스리치.txt");
		test.type10("제임스고슬링.txt");
		//test.type10('C'); // 에러 (파라미터의 타입 불일치)
		//test.type10(100); //에러(파라미터의 타입 불일치)
		//test.type10("파일1.text", "파일2.text");//에러(파라미터의 개수 불일치) -> 개수가 3~4개등도 안됨! 오로지 한개로 정의했기 때문!
		System.out.println();
		
		// 입력값은 없고 결과값은 있는 경우
		
		System.out.println("PI : " +  test.type01());
		
		double pi = test.type01();
		System.out.println("PI : " + pi);
		System.out.println();
		
		
		
		
		// 입력값과 결과값이 모두 있는 경우
		System.out.println(test.type11("19800101"));
		int result = test.type11("19900101");
		System.out.println(result);
		
		
		
		if(test.type11("20230101")==1) {
			System.out.println("1살");
		}
		
	}

}


