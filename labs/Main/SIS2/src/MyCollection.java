

public abstract class MyCollection {
	public int size;
	public abstract void add(int element);
	public abstract void add(int element,int index);
	public abstract void clear();
	public abstract boolean contains(int o);
	public abstract int get(int index);
	public abstract int indexOf(int o);
	public abstract void insertElementAt(int element,int index);
	public abstract boolean isEmpty();
	public abstract void removeAt(int index);
	public abstract void remove(int element);
	public abstract void removeAll(int element);
	public abstract void reserve();
	public abstract void set(int index,int element);
	public abstract void size();
	public abstract void sort();
	public abstract void toArray();
	public abstract String toString(); 
	
}
