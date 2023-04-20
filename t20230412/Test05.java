package t20230412;
/* 정숫값을 읽어 부호 (양수/음수/0)를 판정하는 프로그램을 작성하자.
 * 읽은 정숫값의 부호 (양수/음수/0)를 판정해서 표시
 */

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn= new Scanner(System.in);
		
		System.out.println("정숫값:");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.println("값이 양수입니다.");
		else if(n<0)
			System.out.println("값이 음수입니다.");
		else
			System.out.println("값이 0입니다.");

	}

}
