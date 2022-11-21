package algorithm;
/*
	반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다. 
	
	실행 결과 예)           
	3 박수한번
	6 박수 한번
	9 박수 한번 
	.
	.
	.
	33 박수 두번
	.
	98 박수 한번
	99 박수 두번
*/
public class Test6 {
	public static void main(String[] args) {
		
		for(int i=1; i<100; i++) {
			int num = i;
			int cnt = 0;
			while(num != 0) {
				cnt = 0;
				int res = num % 10;
				if(res == 3 || res == 6 || res == 9) {
					cnt++;
				}
				num /= 10;
			}
			
			if(cnt == 1) {
				System.out.println(i + " 박수 한번");
			} else if(cnt == 2) {
				System.out.println(i + " 박수 두번");
			}
			
		}
		
	}
}
