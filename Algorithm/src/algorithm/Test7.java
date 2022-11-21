package algorithm;

import java.util.Scanner;

/*
	당신은 음식점의 계산을 도와주는 점원입니다. 카운터에는 거스름돈으로 사용할 500원, 100원, 50원,
	10원짜리 동전이 무한히 존재한다고 가정합니다. 손님에게 거슬러 주어야 할 돈이 N원일 때 거슬러 주어
	야 할 동전의 최소 개수를 구하세요. 단, 거슬러 줘야 할 돈 N은 항상 10의 배수입니다.
	
	거스름돈 문제 : 그리디 알고리즘(탐욕법) 무조건 큰것부터 빼기(거슬러주기)
*/

public class Test7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("거스름돈을 입력하세요.");
		int change = Integer.parseInt(sc.nextLine());
		int cnt = 0;
		
		// 동전의 최소 갯수 구하기
		while(change >= 500) {
			change -= 500;
			cnt++;
		}
		
		while(change >= 100) {
			change -= 100;
			cnt++;
		}
		
		while(change >= 50) {
			change -= 50;
			cnt++;
		}
		
		while(change >= 10) {
			change -= 10;
			cnt++;
		}
		
		System.out.println("동전의 최소 갯수 : " + cnt);
	}
}
