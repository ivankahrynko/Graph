import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public  class Gr{
   
    public static HashMap<String, List<String>> graph=new HashMap<String, List<String>>();
    @SuppressWarnings("rawtypes")
	public ArrayList<Generic> id=new ArrayList<Generic>();
    public void addNode(String Node) 
    {
            graph.put(Node, new ArrayList<String>()); 
            id.add(new Generic<String>(Node));
        
    }

    public boolean hasNode(String Node) 
    {
        return graph.containsKey(Node);
    }

    public boolean hasEdge(String nod1, String nod2) 
    {
        if (!hasNode(nod1)) return false;
        List<String> edges=graph.get(nod1);
        return Collections.binarySearch(edges, nod2)!=-1;
    }
    
    public void addEdge(String nod1, String nod2) 
    {
        if(!hasEdge(nod1,nod2))
        {
        	if (!hasNode(nod1)) 
        	{
        		addNode(nod1); 
        		id.add(new Generic<String>(nod1));
        	}
        	if (!hasNode(nod2)) 
        	{
        		addNode(nod2); 
        		id.add(new Generic<String>(nod2));
        	}
        	List<String> edg1=graph.get(nod1);
        	List<String> edg2=graph.get(nod2);
        	edg1.add(nod2);
        	edg2.add(nod1);
        	Collections.sort(edg1);
        	Collections.sort(edg2);
        }
    }
  
    public void Output()
    {
        for (@SuppressWarnings("rawtypes") Map.Entry entry : graph.entrySet()) 
        {
            System.out.println(entry.getKey() + " friend with -> " + entry.getValue());
        }
    }
    
    Scanner scan=new Scanner(System.in);
    public void Search() 
    {
        int k=scan.nextInt();
        System.out.println("Vertex with id "+k+" -> "+id.get(k-1).getob());
    }
}
