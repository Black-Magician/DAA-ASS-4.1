package git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MST 
{

	 protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 private static String checkString = "";
	 private static MinHeap heap;
	public static void main(String args[])
	{
		
	}
	
	public static void readInput() throws IOException
	{
		int numVerticies;
		int numEdges;
		System.out.println("What is the number of verticies in the graph?");
		checkString = br.readLine();
		numVerticies = Integer.parseInt(checkString);
		System.out.println("What is the number of edges in this graph?");
		checkString = br.readLine();
		numEdges = Integer.parseInt(checkString);
		
	}
	
}
