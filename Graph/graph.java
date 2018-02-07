import java.util.LinkedList;

public class graph
{
  static class graph{
    int V;
    LinkedList<Integer> adjListArray[];

    graph(int V){
      this.V = V;
      adjListArray = new LinkedList<>();
    }
  }
}

static void addEdge(graph graph, int src, int dest)
{
  graph.adjListArray[src].addFirst(dest);
  graph.adjListArray[dest].addFirst(src);
}

static void printGraph(graph graph)
{
  for (int v = 0;v < graph.V ; V++ )
   {
    System.out.println("Adjacency list of vertex "+ v);
           System.out.print("head");
           for(Integer pCrawl: graph.adjListArray[v])
           {
               System.out.print(" -> "+pCrawl);
            }
          System.out.println();
  }
}

public static void main(String args[])
    {
        // create the graph given in above figure
        int V = 5;
        graph g = new graph(V);
        addEdge(g, 0, 1);
        addEdge(g, 0, 4);
        addEdge(g, 1, 2);
        addEdge(g, 1, 3);
        addEdge(g, 1, 4);
        addEdge(g, 2, 3);
        addEdge(g, 3, 4);

        // print the adjacency list representation of
        // the above graph
        printGraph(g);
