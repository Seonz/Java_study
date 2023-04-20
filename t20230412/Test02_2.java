package t20230412;

// 정숫값을 읽어서 절댓값을 표시 (방법2)

import java.util.Scanner;

public class Test02_2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		int n = stdIn.nextInt();
		int abs;
		
		if (n>=0)
			abs=n;
		else
			abs=n;
		System.out.println("절댓값은 "+abs+"입니다.");
	}

}
