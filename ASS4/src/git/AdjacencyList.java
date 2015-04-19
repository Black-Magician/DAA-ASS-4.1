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
}
