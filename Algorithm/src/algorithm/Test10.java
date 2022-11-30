package algorithm;

import java.util.Arrays;
import java.util.Collections;

/*
	과일 장수가 사과 상자를 포장하고 있습니다. 사과는 상태에 따라 1점부터 k점까지의 점수로 분류하며, 
	k점이 최상품의 사과이고 1점이 최하품의 사과입니다. 사과 한 상자의 가격은 다음과 같이 결정됩니다.
	한 상자에 사과를 m개씩 담아 포장합니다.
	상자에 담긴 사과 중 가장 낮은 점수가 p (1 ≤ p ≤ k)점인 경우, 사과 한 상자의 가격은 p * m 입니다.
	과일 장수가 가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산하고자 합니다.(사과는 상자 단위로만 판매하며, 남는 사과는 버립니다)
	예를 들어, k = 3, m = 4, 사과 7개의 점수가 [1, 2, 3, 1, 2, 3, 1]이라면, 
	다음과 같이 [2, 3, 2, 3]으로 구성된 사과 상자 1개를 만들어 판매하여 최대 이익을 얻을 수 있습니다.
	(최저 사과 점수) x (한 상자에 담긴 사과 개수) x (상자의 개수) = 2 x 4 x 1 = 8
	사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때, 
	과일 장수가 얻을 수 있는 최대 이익을 return하는 solution 함수를 완성해주세요.
 */
public class Test10 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] score = {1, 2, 3, 1, 2, 3, 1};
		
		solution.solution(3, 4, score);
	}
}

class Solution {
	public int solution(int k, int m, int[] score) {
		int answer = 0;	// 결과값
		
		// int[] -> Integer[]
		Integer[] scores = new Integer[score.length];
		for(int i=0; i<score.length; i++) scores[i] = score[i];
		
		// 배열 내림차순 정렬
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("scores : " + Arrays.toString(scores));
		
		int[] apples = new int[m];
		
		// m개의 사과를 한상자씩 포장 -> i+=m
		for(int i=0; i<scores.length; i+=m) {
			
			// 사과의 갯수가 모자를 때 반복문 중지
			if(scores.length - i < m) {
				break;
			} else {

				int index = 0;
				for(int j=i; j<i+m; j++) {
					apples[index] = scores[j];
					index++;
				}
				
				System.out.println("apples : " + Arrays.toString(apples));
				
				answer += apples[apples.length-1] * m;
				System.out.println("과일 장수가 얻을 수 있는 최대 이익 : " + answer);
			}
		}
		return answer;
	}
}

