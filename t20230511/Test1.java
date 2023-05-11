package t20230511;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x 값:"); int x = stdIn.nextInt();
		System.out.print("y 값:"); int y = stdIn.nextInt();
		
		System.out.println("x*y ="+(x*y));
		System.out.println("x/y="+(x/y));
	}

}
