public class Mobile
{
	public static void main(String[]args)
	{
		///INT
		int[] values = {10,56,89,76,73,34,67,23};
		for(int i=values.length-1;i>=0;i--)
		{
			System.out.println("reverse values are " +values[i]);
		
		}
		
		for(int i=(values.length-1)/2; i<values.length; i++)
		{
			System.out.println("middle to rightside values " +values[i]);
		}
		for (int i=(values.length-1)/2; i>=0; i--)
		{
			System.out.println("middle to leftside values " +values[i]);
		}
		
		for(int i=0; i<values.length; i++)
		
			if(values[i]%2==0)
			{
				System.out.println("even values are " +values[i]);
	
			}
			
        for(int i=0; i<values.length; i++)
		
			if(values[i]%2!=0)
			{
				System.out.println("odd values are " +values[i]);
	
			}
			
			int sum=0;		
		for (int i=0; i<values.length;i++)
		sum = sum+values[i];
		{
			System.out.println("sum value is " +sum);
	
		}
		
		///FLOAT
		float[] numbers = {2.4f,67.5f, 23.8f,4.6f,65.7f,87.6f,5.8f,6.6f};
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.println("reverse numbers are " +numbers[i]);
		
		}
		
		for(int i=(numbers.length-1)/2; i<numbers.length; i++)
		{
			System.out.println("middle to rightside numbers " +numbers[i]);
		}
		for (int i=(numbers.length-1)/2; i>=0; i--)
		{
			System.out.println("middle to leftside numbers " +numbers[i]);
		}
		
	
		for(int i=0; i<numbers.length; i++)
		
			if(numbers[i]%2==0)
			{
				System.out.println("even numbers are " +numbers[i]);
	
			}
			
        for(int i=0; i<numbers.length; i++)
		
			if(numbers[i]%2!=0)
			{
				System.out.println("odd numbers are " +numbers[i]);
	
			}
			
		float sum1=0;		
		for (int i=0; i<numbers.length;i++)
		sum1 = (sum1+numbers[i]);
		{
			System.out.println("sum value is " +sum1);
	
		}
		
		///long
		long[] val = {123452l,123456l,89076l,890755l,4567834l,87964l,987654l,897654l};
		for(int i=val.length-1;i>=0;i--)
		{
			System.out.println("reverse values are " +val[i]);
		
		}
		
		for(int i=(val.length-1)/2; i<val.length; i++)
		{
			System.out.println("middle to rightside values " +val[i]);
		}
		for (int i=(val.length-1)/2; i>=0; i--)
		{
			System.out.println("middle to leftside values " +val[i]);
		}
		
		for(int i=0; i<val.length; i++)
		
			if(val[i]%2==0)
			{
				System.out.println("even values are " +val[i]);
	
			}
			
        for(int i=0; i<val.length; i++)
		
			if(val[i]%2!=0)
			{
				System.out.println("odd values are " +val[i]);
	
			}
			
		long sum2=0;		
		for (int i=0; i<val.length;i++)
		sum2 = sum2+val[i];
		{
			System.out.println("sum value is " +sum2);
	
		}
		
		///double
		double[] val1 = {23.67890534d,67.78907654d,78.9086543d,3.456732d,65.8746532d,4.8907653d,34.567890d,36.876543d};
		for(int i=val1.length-1;i>=0;i--)
		{
			System.out.println("reverse values are " +val1[i]);
		
		}
		
		for(int i=(val1.length-1)/2; i<val1.length; i++)
		{
			System.out.println("middle to rightside values " +val1[i]);
		}
		for (int i=(val1.length-1)/2; i>=0; i--)
		{
			System.out.println("middle to leftside values " +val1[i]);
		}
		
		for(int i=0; i<val1.length; i++)
		
			if(val1[i]%2==0)
			{
				System.out.println("even values are " +val1[i]);
	
			}
			
        for(int i=0; i<val1.length; i++)
		
			if(val1[i]%2!=0)
			{
				System.out.println("odd values are " +val1[i]);
	
			}
			
			double sum3=0;		
		for (int i=0; i<val1.length;i++)
		sum3 = sum3+val1[i];
		{
			System.out.println("sum value is " +sum3);
	
		}
		
		///byte
		
		byte[] values1 = {(byte)34,(byte)60,(byte)78,(byte)63,(byte)84,(byte)94,(byte)93,(byte)74};
		for(int i=values1.length-1;i>=0;i--)
		{
			System.out.println("reverse values are " +values1[i]);
		
		}
		
		for(int i=(values1.length-1)/2; i<values1.length; i++)
		{
			System.out.println("middle to rightside values " +values1[i]);
		}
		for (int i=(values1.length-1)/2; i>=0; i--)
		{
			System.out.println("middle to leftside values " +values1[i]);
		}
		
		for(int i=0; i<values1.length; i++)
		
			if(values1[i]%2==0)
			{
				System.out.println("even values are " +values1[i]);
	
			}
			
        for(int i=0; i<values1.length; i++)
		
			if(values1[i]%2!=0)
			{
				System.out.println("odd values are " +values1[i]);
	
			}
			
		int sum4=0;		
		for (int i=0; i<values1.length;i++)
		sum4 = (sum4+values1[i]);
		{
			System.out.println("sum value is " +sum4);
	
		}
		
	}
}