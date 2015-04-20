package git;


public class Node
{
	private int value;
	private int weight;
	private Node nextNode;
	
	public Node(int value,int weight)
	{
		this.value = value;
		this.weight = weight;
		nextNode = null;
	}

	public int getValue() {
		return value;
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
		this.value = value;
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
		result = "Vertex: " + value + " Weight: " + weight;
		return result;
	}
	
}
