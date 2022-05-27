package com.algorithm.test;

import java.util.Scanner;

/*
	Q.14 혜진풀이
	당신은 음식점의 계산을 도와주는 점원입니다. 카운터에는 거스름돈으로 사용할 500원, 100원, 50원,
	10원짜리 동전이 무한히 존재한다고 가정합니다. 손님에게 거슬러 주어야 할 돈이 N원일 때 거슬러 주어
	야 할 동전의 최소 개수를 구하세요. 단, 거슬러 줘야 할 돈 N은 항상 10의 배수입니다.
*/
public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("거슬러 줄 금액 입력 > ");
		String inputVal = sc.nextLine();
		int change = Integer.parseInt(inputVal);
		
		// 동전
		int obackWon = 500;
		int backWon = 100;
		int oshipWon = 50;
		int shipWon = 10;
		
		// 동전 개수
		int obackCnt = 0;
		int backCnt = 0;
		int oshipCnt = 0;
		int shipCnt = 0;
		
		
//		int change = 54210;		// 거스름돈 금액
		
		while(change != 0) {
			
			if(change % obackWon >= 0) {
				obackCnt = change / obackWon;
				change -= obackCnt * obackWon;
			}
			
			if(change % backWon >= 0) {
				backCnt = change / backWon;
				change -= backCnt * backWon;
			}
			
			if(change % oshipWon >= 0) {
				oshipCnt = change / oshipWon;
				change -= oshipCnt * oshipWon;
			}
			
			if(change % shipWon >= 0) {
				shipCnt = change / shipWon;
				change -= shipCnt * shipWon;
			}
		}
		
		System.out.println("500원 갯수 : " + obackCnt);
		System.out.println("100원 갯수 : " + backCnt);
		System.out.println("50원 갯수 : " + oshipCnt);
		System.out.println("10원 갯수 : " + shipCnt);
			
	}
}
