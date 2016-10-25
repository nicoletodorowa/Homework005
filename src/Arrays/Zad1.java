package Arrays;

public class Zad1 {
public static void main(String[] args) {
	
	int[][] arr = {
			{2,84,3,92,5},
			{7,16,8,29,100}
			};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if(arr[i][j] % 2 ==0){
				System.out.println(arr[i][j]);
			}
		}
	}
}

}
