package step6_02.method;


//this : 객체(오브젝트, 인스턴스)자신



class Zealot{
	//클래스 프로퍼티(멤버변수)에는 this가 붙어 있고 생략이 가능하다.
	
	int shiled = 60;
	int hp = 100;
	
	void ShowStatus() {
		// int moveSpeed;  메서드의 지역변수(메서드 안에서만 쓰는 변수)
		// int shiled = 100; 메서드의 지역변수 이므로 출력문에다가는 this를 꼭 붙여줘야 멤버변수 값이 나옴
		System.out.println("this: " + this);
		System.out.println("shield: " + this.shiled );
		System.out.println("hp: " + this.hp );
		System.out.println();
		
	}
}

public class MethodEx04 {

	public static void main(String[] args) {
		
		
		Zealot z1 = new Zealot();
		System.out.println(z1);
		z1.shiled = 0;
		z1.ShowStatus();
		
		Zealot z2 = new Zealot();
		System.out.println(z2);
		z2.shiled = 0;
		z2.hp = 0;
		z2.ShowStatus();
		
		Zealot z3 = new Zealot();
		System.out.println(z3);
		z3.ShowStatus();
		
		
		
	}

}
