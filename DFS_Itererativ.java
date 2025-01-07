package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class DFS_Itererativ {

    public static void main(String[] args) {
        System.out.println("Hello world from the DFSLetterIterative");

        HashMap<String, ArrayList<String>> adj = new HashMap<>();
        
        adj.put("A", new ArrayList<>());
        adj.put("B", new ArrayList<>());
        adj.put("C", new ArrayList<>());
        adj.put("D", new ArrayList<>());
        adj.put("E", new ArrayList<>());
        adj.put("F", new ArrayList<>());
        adj.put("G", new ArrayList<>());

        // Kanten hinzufügen
        adj.get("A").add("B");
        adj.get("A").add("C");
        adj.get("B").add("D");
        adj.get("B").add("E");
        adj.get("C").add("F");
        adj.get("E").add("G");

        // Graph ausgeben
        for (String key : adj.keySet()) {
            System.out.println(key + ": " + adj.get(key));
        }
// Start der DFSIterativ Mehtode:
        DFSIterative("A", adj);
    }

    // Iterative Methode für die Tiefensuche
    static void DFSIterative(String start, HashMap<String, ArrayList<String>> adj) {
        HashMap<String, Boolean> visited = new HashMap<>();

        // Initialisiere alle Knoten als unbesucht
        for (String key : adj.keySet()) {
            visited.put(key, false);
        }

        Stack<String> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            String node = stack.pop();

            if (visited.get(node) == false) {
                visited.put(node, true);
                System.out.print(node + " ");
                // Nachbarn hinzufügen (umgekehrte Reihenfolge für korrekte Reihenfolge)
                ArrayList<String> neighbors = adj.get(node);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    String neighbor = neighbors.get(i);
                    if (visited.get(neighbor) == false) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}
