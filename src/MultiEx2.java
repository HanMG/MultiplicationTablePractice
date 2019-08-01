/*
 * 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
 * 예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다. 
 * 팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.
 */

import java.util.Scanner;
public class MultiEx2 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter Number: "); 
		String input = scan.nextLine(); // 값을 입력
		String[] splitedValue = input.split(","); // 사용자가 입력한 값을 쉼표(,)를 기준으로 분리한다.
		int i,j =0; // 반복문 변수 초기화
		int first = Integer.parseInt(splitedValue[0]); // 앞부분의 문자열을 숫자로 변환
		int second = Integer.parseInt(splitedValue[1]); // 뒷부분의 문자열을 숫자로 변환
		
		for(i=1; i<(first+1); i++) {
			for(j=1; j<(second+1); j++) {
				System.out.println(i +" * "+ j +" = "+ i*j );	
			}			
		}	
		
	}
}
