/*
 * 자바지기 강의 과제 1
 * 사용자가 입력한 값에 따라 크기가 다른 구구단을 께산해 출력
 * 예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.
 */

import java.util.Scanner;
public class MultiEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j = 0;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter Number: ");
		int input = scan.nextInt();
		
		for(i=1; i<(input+1); i++) {
			for(j=1; j<(input+1); j++) {
				System.out.println(i +" * "+ j +" = "+ i*j );	
			}			
		}	
		
	}
}
