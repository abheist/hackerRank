import java.io.*;
class PlusMinus	{
	public static void main(String[] args)throws IOException {
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int n, positive = 0, negative = 0, zero = 0;
		n = Integer.parseInt(in.readLine());
		String arr[] = in.readLine().split(" ");
		if(arr.length != n)	{
			System.exit(1);
		}
		for(String arr1 : arr)	{
			if(Integer.parseInt(arr1) == 0)	{
				zero++;
			}
			else if (Integer.parseInt(arr1) < 0) {
				negative++;
			}
			else	{
				positive++;
			}
		}
		float n1 = (float)n;
		System.out.println((positive/n1));
		System.out.println((negative/n1));
		System.out.println((zero/n1));
	}
}