package palindromic;

public class Main {
	
	public static boolean isPal(long num) 
	{
	    String numStr = Long.toString(num);
	    StringBuilder sb = new StringBuilder(numStr);
	    String rNumStr = sb.reverse().toString();

	    return numStr.equals(rNumStr);	
	}
	
	public static void calcPal(int rangeMin, int rangeMax)
	{
		long maxp = 0, maxq = 0, maxP = 0;
        for (int p = rangeMax; p >= rangeMin; p--)
	        for (int q = p; q >= rangeMin; q--)
	        {
	            long P = p * q;
	            if (P % 11 != 0)
	            	continue;
	            else
	            	if (isPal(P))
	            		if (P > maxP)
	            		{
	            			maxp = p; maxq = q; maxP = P;
	            		}
	        }
		System.out.println(maxp + "*" + maxq + "=" + maxP);
	}
	
	public static void main(String[] args) 
	{
		calcPal(90, 99);
		calcPal(900, 999);
		calcPal(9000, 9999);
		calcPal(90000, 99999);
		calcPal(900000, 999999);
	}

}
