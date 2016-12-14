import java.util.Scanner;
public class Main{

    private static Scanner scan;

	public static void main(String[] add) 
    {
        scan = new Scanner(System.in);
        Gr g=new Gr();
        String Node;
        
//Ввід вершин та ребер
        System.out.println("Enter Vertex and edge");
        int v=scan.nextInt();
        int e=scan.nextInt();
//Ввід вершин
        System.out.println("Enter Vertex");
        for(int i=0; i<v; i++) 
        {
        	Node=scan.next();
            g.addNode(Node);
        }
//Ввід ребер
        System.out.println("Enter Edge");
        for(int i=0; i<e; i++) 
        {
        	String nod1=scan.next();
        	String nod2=scan.next();  
        	g.addEdge(nod1, nod2);
        }
        boolean z=true;
        while(z) 
        {
        	System.out.println("1-Output connection");
        	System.out.println("2-Search node ID");
        	int k=scan.nextInt();
        	if (k==1)
        	{ 
        		g.Output();
        	} 
        	else
        	{
        		if(k==2)
        	{
        		g.Search();
        	} 
        		else
        		{
        			 z=false;
        		}
        	}  
        }   	 
    } 
}
