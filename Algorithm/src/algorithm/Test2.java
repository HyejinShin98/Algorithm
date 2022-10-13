package algorithm;

import java.util.Arrays;
/*
	최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
	정수 배열 array가 매개변수로 주어질 때, 
	최빈값을 return 하도록 solution 함수를 완성해보세요. 
	최빈값이 여러 개면 -1을 return 합니다. 
 */
public class Test2 {
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,3,3,4};
		System.out.println("최빈값 : " + solution(arr));
	}
	
	public static int solution(int[] arr) {
		int resultVal = 0;	// 최빈값
		
		Arrays.sort(arr);	// 정렬
		
		int cnt = 0;
		int maxCnt = 0;
		for(int i=0; i<arr.length; i++) {
			cnt = 1;	// 기본 갯수 1개
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					//arr[j] = -1;	// 중복카운트 방지 배열 값 -1로 바꿔주기
					cnt++;
				}
			}
			
			//System.out.println("max : " + maxCnt);
			//System.out.println("cnt : " + cnt);
			
			if(maxCnt == cnt) {
				resultVal = -1;		
			}
			
			if(maxCnt < cnt) {
				maxCnt = cnt;
				resultVal = arr[i];
			}
		}
		
		return resultVal; 
	}
}
