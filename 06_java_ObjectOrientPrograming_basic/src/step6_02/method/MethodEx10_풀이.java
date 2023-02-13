
package step6_02.method;


//23.02.13 12:30 ~ 12:41
class Ex10_풀이{
	
	int test1(int[] arr) { 
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4 ==0) {
				count++;
				
			}
			
		}
		
		return count; 
	}
	
	
	int[] test2(int[] arr) { 
		
		int cnt = test1(arr);
		int[] temp = new int[cnt];
		
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%4==0) {
				temp[j++] = arr[i];
			}
			
		}
		
		
		return temp; 
	}
}



public class MethodEx10_풀이 {

	public static void main(String[] args) {
		
		
			Ex10_풀이 e = new Ex10_풀이();
			
			int[] arr = {87, 12, 21, 56, 100};
			
			// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
			int cnt = e.test1(arr);
			System.out.println("cnt = " + cnt);
			
			// 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
			int[] temp = e.test2(arr);
			
			for (int i = 0; i < temp.length; i++) {
				System.out.print(temp[i] + " ");
				
			}
			
		


	}

}
