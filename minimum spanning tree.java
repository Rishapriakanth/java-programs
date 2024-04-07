import java.util.Scanner;

class Graph {
    public int V;
    public int[][] graph;

     Graph(int vertices) {
        V = vertices;
        graph = new int[V][V];
    }

    int minKey(int key[], Boolean mstSet[]) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    int primMST() {
        int[] key = new int[V];
        int[] parent = new int[V];
        Boolean[] mstSet = new Boolean[V];

        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        int sum = 0;
        for (int i = 1; i < V; i++) {
            sum += graph[i][parent[i]];
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Graph g = new Graph(n);
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            g.graph[u][v] = w;
            g.graph[v][u] = w;
        }
        System.out.println(g.primMST());
    }
}
