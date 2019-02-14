/**
 * Use Dijkstra algorithm to find the shortest path in a graph.
 *
 * @author Yuqing Duan
 * @date 02/15/2019
 */
public class Dijkstra {
    private static final int MAX_VERTEX_NUM = 9;
    private static final int MAX_WEIGHT = 65535;
    // record the sum of the length of the shortest path from V0 to Vx vertex
    private int shortestPathTable[] = new int[MAX_VERTEX_NUM];

    public void getShortestPath(MatrixGraph graph) {
        int min;
        // the index of element with the smallest value in shortestPathTable but it's shortest path has not decided yet
        int k = 0;
        boolean isGetPath[] = new boolean[MAX_VERTEX_NUM];

        // initialize the shortestPathTable
        for (int v = 0; v < graph.getNumVertexes(); v++) {
            shortestPathTable[v] = graph.getAdjacencyMatrix()[0][v];
        }
        shortestPathTable[0] = 0;
        isGetPath[0] = true;

        // core code
        // find the element with the smallest value in shortestPathTable but it's shortest path has not decided yet
        for (int v = 1; v < graph.getNumVertexes(); v++) {
            min = MAX_WEIGHT;
            for (int w = 0; w < graph.getNumVertexes(); w++) {
                if (!isGetPath[w] && shortestPathTable[w] < min) {
                    k = w;
                    min = shortestPathTable[w];
                }
            }
            // change flag value
            isGetPath[k] = true;
            // update the elements in shortestPathTable
            for (int x = 0; x < graph.getNumVertexes(); x++) {
                if (!isGetPath[x] && (min + graph.getAdjacencyMatrix()[k][x] < shortestPathTable[x])) {
                    shortestPathTable[x] = min + graph.getAdjacencyMatrix()[k][x];
                }
            }
        }

        // print results
        for (int i = 0; i < shortestPathTable.length; i++) {
            System.out.println("The shortest path from V0 to V" + i + " is: " + shortestPathTable[i] + " units");
        }
    }

    public static void main(String[] args) {
        MatrixGraph graph = new MatrixGraph(MAX_VERTEX_NUM);
        graph.createGraph();
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.getShortestPath(graph);
    }
}
