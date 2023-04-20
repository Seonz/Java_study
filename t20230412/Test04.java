package t20230412;

/* 논리 부정 연산자(!)를 사용해서 수정하자.
 * 가져운 정수 값은 약 몇인지 여부 (논리 부정 연산자)
 */
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn =new Scanner(System.in);
		
		System.out.print("변수 A: "); int a= stdIn.nextInt();
		System.out.print("변수 B: "); int b= stdIn.nextInt();
		
		if(!(a% b==0))
			System.out.println("B는 A의 약수가 아닙니다.");
		else
			System.out.println("B는 A의 약수입니다.");
	}

}
