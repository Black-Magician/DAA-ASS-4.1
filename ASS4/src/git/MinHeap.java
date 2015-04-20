package git;

public class MinHeap
{
	private int[] minHeap;
    private int numItems;
 
    private static final int FRONT = 1;
 
    public MinHeap(int maxsize)
    {
        numItems = 0;
        minHeap = new int[maxsize + 1];
        minHeap[0] = Integer.MIN_VALUE;
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
        swap = minHeap[first];
        minHeap[first] = minHeap[second];
        minHeap[second] = swap;
        return second;
    }//returns the index that the item was placed into
 
    private void trickleDown(int index)
    {
        if (!isLeaf(index))
        { 
            if ( minHeap[index] > minHeap[leftChild(index)]  
            		|| minHeap[index] > minHeap[rightChild(index)])
            {
                if (minHeap[leftChild(index)] < minHeap[rightChild(index)])
                {
                    swap(index, leftChild(index));
                    trickleDown(leftChild(index));
                }else
                {
                    swap(index, rightChild(index));
                    trickleDown(rightChild(index));
                }
            }
        }
    }
 
    public void insert(int item) 
    {
        minHeap[++numItems] = item;
        int current = numItems;
 
        while (minHeap[current] < minHeap[parent(current)])
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
    	minHeap[1]= minHeap[numItems];
    	minHeap[numItems]= 0;
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
    	minHeap[index] = value;
    	//i really don't know how to work this method could you look at this matt -- joe
    	int result = 0;
    	
    	
    	return result;
    }//decreases to value the priority of the item in the specified index
    //and returns the index in the array where the item ended up
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
			rString =(rString +" "+ minHeap[i] );
		}
		return rString;
	}
	
}
