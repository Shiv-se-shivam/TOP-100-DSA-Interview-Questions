public class Graph{
	
	private int V;
	private LinkedList<Integer>[] adj;
	
	Graph(int v){
		
		V=v;
		adj[] = LinkedList[V];
		
		for(int i=0;i<adj.length;i++){
			
			adj[i]=new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
		
	}
	
	void BFS(int n){
		
		boolean visit[] = new boolean[V];
		
		Queue<Integer> q = new LinkedList<>();
		
		visit[n]=true;
		q.add(n);
		int a=0;
		
		while(q.size()!=0){
		
			n=q.poll();
			System.out.print(n+" ");
			
			for(int i=0;i<adj[n].size();i++){
				a=adj[n].get(i);
				if(!visit[a]){
					
					q.add(a);
					visit[a]=true;
				}
			}

		}		
	}
public static void main(String args[])
    {
        Graph graph = new Graph(6);
 
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);
 
        System.out.println("The Breadth First Traversal of the graph is as follows :");
 
        graph.BFS(0);
    }
}