import java.io.*;
class SumArray	{
	public static void main(String[] args)throws IOException {
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int n = Integer.parseInt(in.readLine());
		String arr[] = in.readLine().split(" ");
		if(arr.length != n)	{
			System.exit(1);
		}
		long sum = 0;
		for (String arr1 : arr) {
			sum = sum + Long.parseLong(arr1);
		}
		System.out.println(sum);
	}
}