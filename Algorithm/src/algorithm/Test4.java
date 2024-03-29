package algorithm;

/*
	int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
	만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
	[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
	(API를 사용하지 않는다. 알고리즘으로만 처리)
*/

public class Test4 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		int cnt = 0;
		
		int result = num;
		while(result != 0) {
			sum += result % 10;
			result /= 10;
			
			System.out.println("sum : " + sum);
		}
		
		System.out.println(num + "의 각 자리의 합은 " + sum + "입니다.");
		
	}		
}
