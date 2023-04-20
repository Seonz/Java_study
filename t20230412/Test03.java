package t20230412;

/*2개의 양의 정숫값을 읽어서, 후자가 전자의 약수이면 "B는 A의 약수이다."라고 표시하고,
그렇지 않으면 "B는 A의 약수가 아니다."라고 표시하는 프로그램을 작성하자.*/

//읽은 정숫값이 약수인지 판별 (등가 연산자)

import java.util.Scanner;


public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("변수 A:"); int a = stdIn.nextInt();
		System.out.println("변수 B:"); int b = stdIn.nextInt();
		
		if (a%b==0)
			System.out.println("B는 A의 약수입니다.");
		else
			System.out.println("B는 A의 약수가 아닙니다.");
	}

}
