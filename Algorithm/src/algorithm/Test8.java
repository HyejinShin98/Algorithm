package algorithm;

import java.util.Scanner;

/*
Q.<문제> 1이 될 때까지: 문제 설명	
	• 어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 합니다. 
	단, 두번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있습니다.
	1. N에서 1을 뺍니다.
	2. N을 K로 나눕니다.
	• 예를 들어 N이 17, K가 4라고 가정합시다. 
	이때 1번의 과정을 한 번 수행하면 N은 16이 됩니다. 
	이후에 2번의 과정을 두 번 수행하면 N은 1이 됩니다. 
	결과적으로 이 경우 전체 과정을 실행한 횟수는 3이 됩니다. 
	이는 N을 1로 만드는 최소 횟수입니다.
	• N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 
	최소 횟수를 구하는 프로그램을 작성하세요.
	
	입력 조건 : 1 <= N <= 100000 , 2 <= K <= 100000 , N과 K는 자연수
*/

public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N을 입력하시오");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("K를 입력하시오");
		int k = Integer.parseInt(sc.nextLine());
		
		int cnt = 0;	// 답 횟수 변수

		while(n != 1) {
			
			if(n % k == 0) {
				n /= k;
			} else {
				n -= 1;
			}
			
			cnt++;
		}
		
		System.out.println(cnt + "번");
		
	}
}
