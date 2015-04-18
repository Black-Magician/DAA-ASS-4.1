public class MinHeap
{
	private int[] Heap;
    private int numItems;
    private int maxsize;
 
    private static final int FRONT = 1;
 
    public MinHeap(int maxsize)
    {
        this.maxsize = maxsize;
        numItems = 0;
        Heap = new int[maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }
 
    private int parent(int pos)
    {
        return pos / 2;
    }
 
    private int leftChild(int pos)
    {
        return (2 * pos);
    }
 
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
 
    private boolean isLeaf(int pos)
    {
        if (pos >=  (numItems / 2)  &&  pos <= numItems)
        { 
            return true;
        }
        return false;
    }
 
    private int swap(int first, int second)
    {
        int swap;
        swap = Heap[first];
        Heap[first] = Heap[second];
        Heap[second] = swap;
        return second;
    }//returns the index that the item was placed into
 
    private void trickleDown(int pos)
    {
        if (!isLeaf(pos))
        { 
            if ( Heap[pos] > Heap[leftChild(pos)]  || Heap[pos] > Heap[rightChild(pos)])
            {
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)])
                {
                    swap(pos, leftChild(pos));
                    trickleDown(leftChild(pos));
                }else
                {
                    swap(pos, rightChild(pos));
                    trickleDown(rightChild(pos));
                }
            }
        }
    }
 
    public void insert(int element)
    {
        Heap[++numItems] = element;
        int current = numItems;
 
        while (Heap[current] < Heap[parent(current)])
        {
            swap(current,parent(current));
            current = parent(current);
        }	
    } 
     
    public void minHeap()
    {
        for (int pos = (numItems / 2); pos >= 1 ; pos--)
        {
            trickleDown(pos);
        }
    }
 
    public boolean deleteMin()
    {// swap the last node in the heap for the first, deleting the first. set the last node to 0, to avoid copying it. decrement size. trickle down.
    	Heap[1]= Heap[numItems];
    	Heap[numItems]= 0;
    	numItems--;
    	trickleDown(1);
    	
    	return true;
    }//returns true if min was removed successfully, false otherwise
    
    public int decreaseKey(int index, int value) throws HeapException
    {
    	if((index < 0 || index > numItems)|| value < 0)
    	{
    		throw new HeapException("input error on decreaseKey");
    	}
    	int result = 0;
    	
    	
    	return result;
    }//decreases to value the priority of the item in the specified index
    //and returns the index in the array where the item ended up
    
    public int remove()
    {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[numItems--]; 
        trickleDown(FRONT);
        return popped;
    }
    public boolean isEmpty()
    {
    	if (numItems==0)
    		return true;
    	return false;
    }
	public String DisplayArray()
	{ 
		String rString= "The Array Contains:";
		for (int i=1;i<this.numItems+1;i++)
		{
			rString =(rString +" "+ Heap[i] );
		}
		return rString;
	}
	
}
