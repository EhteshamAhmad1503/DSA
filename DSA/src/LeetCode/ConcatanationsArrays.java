package LeetCode;

public class ConcatanationsArrays 
{
	 static int[] getConcatenation(int[] nums)
    {
	 int[] ans = new int[2*nums.length];
     for(int i = 0;i < nums.length; i++)
     {
         ans[i] = nums[i];
         ans[i+nums.length]=nums[i];
     }
     for(int item:ans)
     {
    	System.out.print(item+" "); 
     }
      return ans;
  }
	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		getConcatenation(arr);
		
	}

}
