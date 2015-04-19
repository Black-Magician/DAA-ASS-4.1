package git;


public class AdjacencyList
{
	private Node[] AL;	
	
	public AdjacencyList(int numVerticies)
	{
		AL = new Node[numVerticies];
	}
	
	public Node[] getAdList()
	{
		return AL;
	}
	public Node getVertexatIndex(int index)
	{
		return AL[index];
	}
	public void addVertex(int index, int value, int weight)
	{
		Node temp = getVertexatIndex(index);
		while(temp.getNextNode()!=null)
		{
			temp = temp.getNextNode();
		}
		Node newNode = new Node(value,weight);
		temp.setNextNode(newNode);
	}
}
