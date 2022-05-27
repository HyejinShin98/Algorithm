package com.algorithm.test;
/*
	Q.13
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
public class Test1 {
	public static void main(String[] args) {
		
		int num = 0;
		int cnt = 0;
		
		for(int i=1; i<=99; i++) {
			
			num = i;	// 새 변수에 i값 담아주기
			
			// 자릿수 값 구하기 반복문
			while(num != 0) {
				
				if(num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {	
					cnt++;		// 3, 6, 9가 포함 될 시 cnt++;
				}
				
				num /= 10;
			}
			
			
			if(cnt == 2) {
				System.out.println(i + " 박수 두번");
			} else if(cnt == 1) {
				System.out.println(i + " 박수 한번");
			}
			
			cnt = 0;	// cnt 값 초기화
		}
	}
}
