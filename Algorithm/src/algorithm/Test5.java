package algorithm;

/*
	1~10000사이에 8이 몇번 나오는가?
	
	정답 ) 4000
	힌트 ) 8838 = 3개...
*/

public class Test5 {
	public static void main(String[] args) {
		
		int cnt = 0;	// 정답 변수.

		for(int i=1; i<10000; i++) {
			System.out.println("i : " + i);
			
			int num = i;
			while(num != 0) {
				if(num % 10 == 8) {	// 10씩 나누어 나머지가 8이라면
					cnt++;
					System.out.println(cnt);
				}
				
				num/= 10;
			}
		}
		
		System.out.println("1~10000 사이의 8의 갯수는 " + cnt + "번");
		
		
	}
}
