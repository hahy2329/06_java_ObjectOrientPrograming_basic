package step6_01.classObject;

/*
 * 
 * # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 * 		
 * */
class Product{
	
	String code ="0x";
	String name;
	int price;
	int deliveryPrice = 3000; // 배송비는 3,000원으로 기본
	
}




public class ClassEx02 {

	public static void main(String[] args) {
		
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.(접근제어자는 후에 자세히 공부)
	
		new Product();
		new Product();
		new Product();
		
		new Member();
		new Member();
		new Member();
		
	}

}
