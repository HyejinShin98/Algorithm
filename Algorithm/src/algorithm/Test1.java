package algorithm;

import java.util.Arrays;
import java.util.Scanner;

/*
 *	n를 입력받아 n이하의 홀수를 배열로 리턴하는 함수를 입력하시오. 
 */
public class Test1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n을 입력하시오");
		int n = sc.nextInt();
		
		System.out.println(Arrays.toString(solution(n)));
	}
	
	public static int[] solution(int n) {
		int length = 0;
		
		if(n % 2 == 0) length = n/2;			// n이 짝수 n = 10 -> 1, 3, 5, 7, 9 총 5개
		else length = (int)Math.floor(n/2) + 1; // n이 홀수 n = 9 -> 1, 3, 5, 7, 9 총 5개
		//System.out.println("length : " + length);
		
		int[] arr = new int[length];
		
		int arrIndex = 0;
		for(int i=1; i<=n; i++) {
			if(i % 2 == 1) { // i가 홀수라면
				arr[arrIndex] = i;
				System.out.println("arr[" + arrIndex + "] : " + i);
				arrIndex++;
			}
		}
		Arrays.sort(arr);
		return arr;
	}
}

