package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
//		�������� ��������, ����� ��������� �� ����������� 
//		�� ������� ����� � ������� 3�4. �������� ������ �� ������.

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