package t20230417;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("점수를 입력하시오. : ");
		int score =stdIn.nextInt();
		
		if (score >= 90)
			System.out.print(score + "점은 A등급 입니다.");		
		else if (score >= 80 && score <=89)
			System.out.print(score + "점은 B등급 입니다.");		
		else if (score >= 70 && score <=79)
			System.out.print(score + "점은 C등급 입니다.");		
		else if (score >= 60 && score <=69)
			System.out.print(score + "점은 D등급 입니다.");
		else
			System.out.print(score + "점은 F등급 입니다.");
	
		
	}

}