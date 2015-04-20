package git;


public class Node
{
	private int key;
	private int weight;
	private Node nextNode;
	
	public Node(int key,int weight)
	{
		this.key = key;
		this.weight = weight;
		nextNode = null;
	}

	public int getValue() {
		return key;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public void setValue(int value) {
		this.key = value;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public String toString()
	{
		String result;
		result = "Vertex: " + key + " Weight: " + weight;
		return result;
	}
	
}
