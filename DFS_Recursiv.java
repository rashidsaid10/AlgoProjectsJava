package Classes;

import java.util.ArrayList;

public class DFS_Recursiv {
    public static void main(String[] args) {

        System.out.println("Hello world from DFS");


        int v = 7;
        ArrayList<Integer>[] adj = new ArrayList[v];


        for (int i = 0; v > i; i++) {


            adj[i] = new ArrayList();

        }
        System.out.println(adj);


        adj[0].add(1);
        adj[0].add(2);
        adj[1].add(3);
        adj[1].add(4);
        adj[2].add(5);
        adj[2].add(6);


        for (int j = 0; v > j; j++) {


            System.out.println(j + ": " + adj[j]);
        }

        boolean[] visited = new boolean[v];


        DFSRec(adj, 0, visited);

    }


    static void DFSRec(ArrayList<Integer>[] adj, int node, boolean[] visited) {

        visited[node] = true;
        System.out.print(node);

        for (int neighbor : adj[node]) {
            if (visited[neighbor] == false) {
                DFSRec(adj, neighbor, visited);
            }
        }
    }
}

