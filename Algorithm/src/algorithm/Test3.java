package algorithm;

/*
	문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. 
	str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
	예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
	// s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println(solution("-1 -1"));
	}
	
	public static String solution(String str) {
		String resultStr = "";
		
		String[] arr = str.split(" ");
		int min = Integer.parseInt(arr[0]);
		int max = Integer.parseInt(arr[0]);
		
		for(int i=0; i<arr.length; i++) {
			int val = Integer.parseInt(arr[i]);
			System.out.println("arr[i] : " + arr[i]);
			
			if(max < val) max = val;
			if(min > val) min = val;
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		resultStr = min + " " + max;
		return resultStr;
	}
}
