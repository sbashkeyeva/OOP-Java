import java.util.Vector;
public class MyVector extends MyCollection {
	private int[] x;
	public MyVector()
	{
		x=new int[100000];
		size=0;
	}
	public MyVector(int[] x)
	{
		this();
		size=x.length;
		for(int i=0;i<size;i++)
		{
			this.x[i]=x[i];
		}
	}
	
	@Override
	public void add(int element) {
		// TODO Auto-generated method stub
		x[size]=element;
		size++;
	}

	@Override
	public void add(int index, int element) {
		// TODO Auto-generated method stub
		if(index<size) {
			for(int i=index;i<size;i++)
			{
				int tmp=x[index];
				x[index]=x[i+1];
				x[i+1]=tmp;
			}
			x[index]=element;
			size++;
		}
		else {
			System.out.println("Wrong");
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		size=0;
		
	}

	@Override
	public boolean contains(int o) {
		// TODO Auto-generated method stub
		return indexOf(o)!=-1;
	}

	@Override
	public int get(int index) {
		// TODO Auto-generated method stub
		return x[index];
	}

	@Override
	public int indexOf(int o) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
			if(x[i]==o)
				return i;
		return -1;
	}

	@Override
	public void insertElementAt(int element, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		int n=0;
		
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		if(index<size)
		{
			for(int i=size;i>=index;i--) {
				int pos=x[index];
				x[index]=x[i+1];
				x[i+1]=pos;
			}
			size--;
		}
		else {
			System.out.print("Wrong");
		}
	}

	@Override
	public void remove(int element) {
		// TODO Auto-generated method stub
		for(int i=0;i<size-1;i++)
		{
			if(x[i]==element)
			{
				x[i]=(Integer) null;
				break;
			}
		}
	}

	@Override
	public void removeAll(int element) {
		// TODO Auto-generated method stub
		for(int i=0;i<size-1;i++)
		{
			if(x[i]==element) x[i]=(Integer) null;
		}
	}

	@Override
	public void reserve() {
		// TODO Auto-generated method stub
		int[] y=new int[size];
		for(int i=0;i<size-1;i++)
		{
			y[i]=x[i];
		}
		for(int i=size-1;i>=0;i--)
		{
			x[i]=y[size -i-1];
		}
	}

	@Override
	public void set(int index, int element) {
		// TODO Auto-generated method stub
		if(index<size)
			x[index]=element;
		else
		{
			System.out.println("Wrong");
		}

		
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				if(x[j]<=x[i]) {
					int pos=x[i];
					x[i]=x[j];
					x[j]=pos;
				}
			}
		}
	}

	@Override
	public void toArray() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String pos= "";
		for(int i=0;i<size;i++)
			pos=pos+x[i]+" ";
		return pos;
	}
	

}
