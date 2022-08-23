package IID_Arrays;
 
public class PrintWave {
	public static int R = 3;
	public static int C = 3;

	static int[] WavePrint(int m, int n, int[][] arr) {

		 int [] ans= new int[m*n];
		 int k=0;
		for (int j = 0; j < n; j++)
		{

			if (j % 2 == 0)
			{
				for (int i = 0; i < m; i++)
				{
					 ans[k]=arr[i][j];
					 k++;
					
				}
			} 
			else
			{
				for (int i = m - 1; i >= 0; i--)
				{
					ans[k]=arr[i][j];
					k++;
					
				}
			}
		}
		 return ans;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, {4, 5, 6 }, {7,8, 9 } };
		int arr1[]=WavePrint(R, C, arr);
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		

	}
}