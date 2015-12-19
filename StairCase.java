import java.io.*;
class StairCase	{
	public static void main(String[] args)throws IOException {
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int n = Integer.parseInt(in.readLine());
		int temp = n;
		for (int i = 1; i <= n; i++) {
			for (int k = temp-1; k > 0; k--) {
				System.out.print(" ");
			}
			temp--;
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}