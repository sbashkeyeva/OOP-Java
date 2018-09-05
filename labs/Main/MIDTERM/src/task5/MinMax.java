package task5;

public class MinMax {
	static class Pair{
		public int min, max;
		public Pair()
		{
			min=Integer.MAX_VALUE;
			max=Integer.MIN_VALUE;
		}
		public Pair(int x,int y)
		{
			this.min=x;
			this.max=y;
		}
		public String toString()
		{
			return min+ " " +max;
		}
	}
	
	static Pair minmax(int values[])
	{
		Pair p=new Pair();
		
		for(int i=0;i<values.length;i++)
		{
			if(values[i]>p.max)
			{
				p.max=values[i];
			}
			if(values[i]<p.min)
			{
				p.min=values[i];
			}
			
		}
		return p;
	}
	
	

}
