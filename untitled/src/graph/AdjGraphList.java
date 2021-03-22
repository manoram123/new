package graph;

import queuebylinklist.Queue;

import java.util.*;

public class AdjGraphList{
    int vertex = 5;
    LinkList list[] = new LinkList[vertex];

    AdjGraphList(){
        for(int i=0; i<vertex; i++){
            list[i] = new LinkList();
        }
    }

    public void addEdge(int source, int destination){
        list[source].addNode(destination);
        list[destination].addNode(source);

    }

    public void printGraph(){
        System.out.println("Printing the Graph: ");
        for(int i=0; i<vertex; i++){
            System.out.print(i+" is connected to: ");
            if(list[i].size()>0){
                for(int j=0;j<list[i].size();j++){
                    System.out.print(list[i].getIndex(j)+" ");
                }
            }
            System.out.println();
        }
    }

    public List<Integer> getAdjNode(int val){

        List<Integer> adjlist = new ArrayList<>();
        for(int i=0; i<list[val].size();i++){
           adjlist.add(list[val] .getIndex(i));
        }
        return adjlist;
    }

    public void BFS(int rootNode){
        boolean visited[] = new boolean[vertex];
        Queue q = new Queue();
        q.enqueue(rootNode);
        visited[rootNode] = true;
        while(q.size() != 0){
          int x = q.dequeue();
            System.out.println(x);
            Iterator<Integer> iterator = getAdjNode(x).iterator();
            while(iterator.hasNext()){
                int val = iterator.next();
                if(!visited[val]) {
                    q.enqueue(val);
                    visited[val] = true;
                }
            }
        }
    }
    public void DepthForSearch(int rootnode){
        boolean [] visited = new boolean[vertex];
        DFS(rootnode,visited);
    }

    public void DFS(int rootnode,boolean visited[]){
        visited[rootnode]=true;
        System.out.println(rootnode);
      Iterator<Integer> iterator= getAdjNode(rootnode).iterator();
      while(iterator.hasNext()) {
          int adjval = iterator.next();
          if(!visited[adjval]){
              DFS(adjval,visited);
          }
      }
    }

    public void findShortestPath(int source, int destination){

        boolean []visited = new boolean[vertex];
        int []previousPath = new int[vertex];
        int []minDistance = new int[vertex];

        for(int i=0; i<vertex; i++){
            minDistance[i] = Integer.MAX_VALUE;
            previousPath[i] = -1;

        }

        minDistance[source] = 0;
        visited[0] = true;

        Queue q = new Queue();
        q.enqueue(source);

        while(q.size() != 0) {
            int u = q.dequeue();
            Iterator<Integer> iterator = getAdjNode(u).iterator();
            while (iterator.hasNext()) {
                int v = iterator.next();

                if (!visited[v]) {
                    int newDistance = minDistance[u] + 1;
                    minDistance[v] = newDistance;
                    previousPath[v] = u;
                    visited[v] = true;
                    q.enqueue(v);
                }
            }
        }
            System.out.println("Minimum Distance from source to destination: "+minDistance[destination]);

            LinkList path = new LinkList();
            path.addNode(destination);

            int crawl = destination;

            while(previousPath[crawl] != -1){
                crawl = previousPath[crawl];
                path.addNode(crawl);
            }

            System.out.println("The shortest path is:");
            for(int i=path.size()-1; i>=0; i--){
                System.out.print(path.getIndex(i)+"  ");
            }
    }
}
