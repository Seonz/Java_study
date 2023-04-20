package t20230412;

/* 입력한 정숫값이 5로 나누어 떨어지면 "이 값은 5로 나누어집니다." 라고 표시하고 
 * 그렇지 않으면 "이 값은 5로 나누어지지 않습니다." 라고 표시하는 프로그램을 작성하자.
 * -> 음수를 입력한 경우에는 "음의 정숫값을 입력했습니다." 라고 표시할 것.
 * 
 * 읽은 정숫값이 양의 정수이면 5로 나누어 떨어지는지 여부를 표시 
 */

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("정숫값:");
		int n = stdIn.nextInt();
		
		if (n>0)
			if (n%5==0)
				System.out.println("이 값은 5로 나누어집니다.");
			else
				System.out.println("이 값은 5로 나누어지지 않습니다.");
		else
			System.out.println("음의 정숫값을 입력했습니다.");
		

	}

}
