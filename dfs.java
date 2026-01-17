 import java.util.*;
 
 public class Graph{
	 
	 private int V;
	 private LinkedList<Integer>[] adj;
	 
	 Graph(int v){
		 V=v;
		 adj = new LinkedList[V];
		 for(int i =0;i<adj.length;i++){
			 
			 adj[i]= new LinkedList<>();
			 
		 } 
	 }
	 
	 void addEdge(int v, int w){
		 adj[v].add(w);
	 }
	 
	 void DFS(int n){
		 
		 Stack<Integer> stack = new Stack<>();
		 
		 boolean visit[] = new boolean[V];
		 
		 stack.push(n);
		 int a=0;
		 
		 while(!stack.empty()){
		
			n=stack.peek();
			stack.pop();
			if(!visit[n]){
				System.out.print(n+" ");
				visit[n]=true;
			}
			
			for(int i=0;i<adj[n].size();i++){
				
				a=adj[n].get(i);
				if(!visit[a]){
					
					stack.push(a);

				}
			}
		 }
		 
	 }
	 
	 public static void main(String arg[]){
		 
		 Graph d = new Graph(6);
        
        d.addEdge(0,1);
        d.addEdge(0,2);
        d.addEdge(0,3);
        d.addEdge(1,3);
        d.addEdge(1,4);
        d.addEdge(2,5);
        
        d.DFS(0);
	 }
 }