package LeetCode;

public class ReverseWord {

	 static String reverseWords(String s)
	    {
	        s=s.replaceAll(" +"," ");
	        String[] res=  s.split(" ");
	        int i=0,j=res.length-1;
	        
	        while(i<j)
	        {
	            String temp=res[i];
	            res[i]=res[j];
	            res[j]=temp;
	            i++;
	            j--;
	        }
	       StringBuilder ans= new StringBuilder();
	        for(int x=0;x<res.length;x++)
	        {
	            String a=res[x];
	            if(x==res.length-1)
	            {
	                ans.append(a);
	            }
	            else
	            {
	               ans.append(a+" "); 
	            }
	        }
	        
	        return ans.toString().trim();
	    }
	

	public static void main(String[] args) {

		String str = "My Name is Love";
		System.out.println(reverseWords(str));

	}

}
