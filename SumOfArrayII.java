//By: Max Gabel
public class SumOfArrayII 
{

	private int arraySize = 0;
	private static  double [] array = null;
	private int arrayNumbAmount = 0;
	
		public SumOfArrayII()
	    {
			
	    }
	    public SumOfArrayII(int arraySize)
	    {
	    	
	    	this.arraySize = arraySize;
	    	array = new double[arraySize];
	    }
	
	    public void setArraySize(int arraySize)
	    {
	    	this.arraySize = arraySize;
	    	
	    	if (array == null)
	    	{
	    		array = new double[arraySize];
	    	}
	    	
	    }
	    public int getArrayS()
	    {
	    	return arraySize;
	    }
	
	    public void addToArray(double v)
	    {
	    	
	    	if(arrayNumbAmount < array.length)
	    	{
	    		
	    		array[arrayNumbAmount] = v;
	    		
	    		arrayNumbAmount++;
	    	}
	    	else
	    	{
	    		System.out.println("Array is full; cannot add anymore to this object.");
	    	}
	    }
	    
	    @Override
	    public String toString()
	    {
	      double sum = 0.0;
	      
	    	for(int a = 0; a <arrayNumbAmount; a++)
	    	{
	    		sum += array[a];
	    	}
	    	
	      return "The sum of the array is " + sum;
	    }
	
}
