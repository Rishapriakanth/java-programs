import java.util.*;
import java.io.*;

public class Main {
    public static void dfsTraversal(int[][] graph, int V) {
        boolean[] visited = new boolean[V];
       
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfsUtil(graph, i, visited);
            }
        }
        System.out.println();
    }

    public static void dfsUtil(int[][] graph, int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(current + " ");
       
        for (int i = 0; i < graph[current].length; i++) {
            if (graph[current][i] == 1 && !visited[i]) {
                dfsUtil(graph, i, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
       
        int[][] graph = new int[v][v];

        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        dfsTraversal(graph, v);
    }
}