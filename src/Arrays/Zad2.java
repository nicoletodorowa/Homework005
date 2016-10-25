package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
//		Напишете програма, която позволява на потребителя 
//		да попълва масив с размери 3х4. Изведете масива на екрана.

		Scanner sc = new Scanner(System.in);
		int [][] array = new int [3][4];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					System.out.println("Input value ");
					array [i][j] = sc.nextInt();
				}
			}
		sc.close();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}