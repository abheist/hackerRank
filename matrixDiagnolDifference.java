import java.util.*;
class DiagnolDifference	{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
		int firstDiagnol = 0, secondDiagnol = 0;
		for (int i = 0; i < n; i++) {
			firstDiagnol = firstDiagnol + arr[i][i];
		}
		int temp = n-1;
		for (int i = 0; i < n; i++) {
			secondDiagnol = secondDiagnol + arr[i][temp];
			temp--;
		}
		int difference = firstDiagnol - secondDiagnol;
		if (difference < 0) {
			difference = difference * (-1);
		}
		System.out.println(difference);
	}
}