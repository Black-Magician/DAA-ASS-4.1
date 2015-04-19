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
	
	public Node getNextatVertex(int index)
	{
		return AL[index].getNextNode();
	}
	
	public Node getVertexatIndex(int index)
	{
		return AL[index];
	}
	
	
	
	
	
	
	
	
	
	
	
}
