package t20230412;

/*
 * 2개의 변수 a,b에 값을 읽어서 a, b의 대소 관계를 다음과 같이 표시하는 프로그램을 작성하자.
 * "a가 크다.","b가 크다.","a와 b가 같다."
 * 
 * 읽은 정숫값의 대소 관계를 표시
 */

import java.util.Scanner;

public class Test06_1 {

	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		
		System.out.print("변수 a: "); int a=stdIn.nextInt();
		System.out.print("변수 b: "); int b=stdIn.nextInt();
		
		if (a>b)
			System.out.println("a가 크다.");
		else if (a<b)
			System.out.println("b가 크다.");
		else
			System.out.println("a와 b가 같다.");

	}

}
