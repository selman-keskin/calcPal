package palindromic;

public class Main {
	
	public static boolean isPal(long num) 
	{
		String numStr = Long.toString(num);
		String rNumStr = "";
		
		boolean result = false;
		
		for (int i = numStr.length() - 1; i >= 0 ; --i)
			rNumStr += numStr.charAt(i);
		
		//System.out.println(numStr + "," + rNumStr);
		try 
		{
			if (Long.parseLong(numStr) == Long.parseLong(rNumStr))
				result = true;
			else  
				result = false;
		}catch (NumberFormatException e) {
            //System.err.println("Unable to format. " + e);
        }
		return result;
		
	}
	
	public static void calcPal(int rangeMin, int rangeMax)
	{
		long maxp = 0, maxq = 0, maxP = 0;
        for (int p = rangeMax; p > rangeMin; p--)
	        for (int q = rangeMax; q > rangeMin; q--)
	        {
	            long P = p * q;
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
		calcPal(10, 99);
		calcPal(100, 999);
		calcPal(9000, 9999);
		calcPal(99000, 99999);
		calcPal(990000, 999999);

	}

}
