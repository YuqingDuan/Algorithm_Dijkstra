public class MatrixGraph {
    private int numVertexes;
    private int[] vertexArray;
    private int[][] adjacencyMatrix;
    private static final int MAX_WEIGHT = 65535;
    private boolean[] isVisited;

    public MatrixGraph(int numVertexes) {
        this.numVertexes = numVertexes;
        vertexArray = new int[numVertexes];
        adjacencyMatrix = new int[numVertexes][numVertexes];
        for (int i = 0; i < numVertexes; i++) {
            vertexArray[i] = i;
        }
        isVisited = new boolean[numVertexes];
    }

    public int getNumVertexes() {
        return numVertexes;
    }

    public void setNumVertexes(int numVertexes) {
        this.numVertexes = numVertexes;
    }

    public int[] getVertexArray() {
        return vertexArray;
    }

    public void setVertexArray(int[] vertexArray) {
        this.vertexArray = vertexArray;
    }

    public int[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public static int getMaxWeight() {
        return MAX_WEIGHT;
    }

    public boolean[] getIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean[] isVisited) {
        this.isVisited = isVisited;
    }

    public void createGraph() {
        int[] a1 = {0, 1, 5, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT};
        int[] a2 = {1, 0, 3, 7, 5, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT};
        int[] a3 = {5, 3, 0, MAX_WEIGHT, 1, 7, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT};
        int[] a4 = {MAX_WEIGHT, 7, MAX_WEIGHT, 0, 2, MAX_WEIGHT, 3, MAX_WEIGHT, MAX_WEIGHT};
        int[] a5 = {MAX_WEIGHT, 5, 1, 2, 0, 3, 6, 9, MAX_WEIGHT};
        int[] a6 = {MAX_WEIGHT, MAX_WEIGHT, 7, MAX_WEIGHT, 3, 0, MAX_WEIGHT, 5, MAX_WEIGHT};
        int[] a7 = {MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 3, 6, MAX_WEIGHT, 0, 2, 7};
        int[] a8 = {MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 9, 5, 2, 0, 4};
        int[] a9 = {MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 7, 4, 0};
        adjacencyMatrix[0] = a1;
        adjacencyMatrix[1] = a2;
        adjacencyMatrix[2] = a3;
        adjacencyMatrix[3] = a4;
        adjacencyMatrix[4] = a5;
        adjacencyMatrix[5] = a6;
        adjacencyMatrix[6] = a7;
        adjacencyMatrix[7] = a8;
        adjacencyMatrix[8] = a9;
    }
}
