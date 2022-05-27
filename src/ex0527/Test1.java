package ex0527;

import java.util.Scanner;

/*
	B - 역방향 
	
	문제 설명
	정수 L, R, 그리고 영문 소문자로 구성된 문자열 S가 주어진다.
	L번째부터 R번째까지의 문자를 그 순서대로 반대로 바꾼 후 문자열을 인쇄하라.
	
	제약
	S는 영문 소문자로 구성된다.
	1≤∣S∣≤105 (|S|는 S의 길이이다.)
	 L과 R은 정수이다.
	1≤L≤R≤∣S∣
	
	입력
	입력은 다음 형식의 표준입력으로 제공된다.
	L R
	S
	
	출력
	명시된 문자열을 인쇄한다.
*/
public class Test1 {
	public static void main(String[] args) {
		
		StrChanger changer = new StrChanger();
		changer.changeStr();
	}
}

class StrChanger {
	
	public void changeStr() {
		inputValue();
	}
	
	private void inputValue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해주세요.");
		
		String input = sc.nextLine();
		String[] values = input.split(" ");
		
		int inputL = Integer.parseInt(values[0]);
		int inputR = Integer.parseInt(values[1]);
		String inputS = sc.nextLine();
		
		changeStr(inputL, inputR, inputS);
	}
	
	private void changeStr(int inputL, int inputR, String inputS) {
		
		String resultStr = "";	// 바뀐 문자열 결과
		int changeNum = inputR;	// 초기화 - 바뀔 맨 뒷번째 글자 몇번째 글자인지 담아줌
		
		for(int i=0; i<inputS.length(); i++) {
			
			int index = i+1;	
			// i+1 가 L과 R 사이 숫자라면 true 반환 (1이면 0번째 숫자이기때문에 +1) 
			boolean isChangeChar = index >= inputL && index <= inputR ? true : false;
			
			if(isChangeChar) {
				changeNum--;	// 수를 뒤에서부터 한자리씩 빼줌 (그 다음글자 바꿔야 됨~!)
				resultStr += inputS.charAt(changeNum);
			} else {
				resultStr += inputS.charAt(i);
			}
		}
		System.out.println(resultStr);	// 결과 출력
	}
	
}