package LeetCode;

public class CountPrimes {
	
    static int countPrimes(int n)
    {
        boolean[] primes = new boolean[n];

        for (int i = 2; i * i < n; i++)
        {
            if (!primes[i])
            {
                for (int j = i; j * i < n; j++) 
                {
                    primes[j * i] = true;
                }
            }
        }

        int Count = 0;
  
        for (int i = 2; i < n; i++)
        {
            if(!primes[i]) 
            {
                Count++;
            }
        }
        return Count;
    }


	public static void main(String[] args) {
		
		int num=10;
		System.out.println(countPrimes(num));
				
	}

}
