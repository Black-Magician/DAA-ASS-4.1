import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Menu 
{
	 protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 private static String checkString = "";
	
	 public static void main(String args[]) throws IOException
	 {
		 boolean done = false;
		 do
		 {
			 System.out.println("Select from the following menu: "
					 + "\n1. Check if MinHeap is empty."
					 + "\n2. Insert key in MinHeap."
					 + "\n3. Delete min key from MinHeap."
					 + "\n4. Decrease key in MinHeap."
					 + "\n5. Display items in MinHeap in array order."
					 + "\n6. Exit program.");
			 System.out.println("Make your menu selection now: ");
			 
			 checkString = br.readLine();
			 System.out.println(checkString);
			 switch (checkString)
			 {
			
			 }//end switch
			 
		 }
		 while(done != true);
	 }
}	




