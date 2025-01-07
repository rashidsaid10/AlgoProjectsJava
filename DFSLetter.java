package Classes;

import java.util.ArrayList;
import java.util.HashMap;

public class DFSLetter {

    public static void main(String[] args) {
        System.out.println("Hello world from the DFSLetter");

        HashMap<String, ArrayList<String>> adj = new HashMap<String, ArrayList<String>>();

        adj.put("A", new ArrayList<>());
        adj.put("B", new ArrayList<>());
        adj.put("C", new ArrayList<>());
        adj.put("D", new ArrayList<>());
        adj.put("E", new ArrayList<>());
        adj.put("F", new ArrayList<>());
        adj.put("G", new ArrayList<>());


        adj.get("A").add("B");
        adj.get("A").add("C");
        adj.get("B").add("D");
        adj.get("B").add("E");
        adj.get("C").add("F");
        adj.get("E").add("G");


        for(String key : adj.keySet()){

            System.out.println(key + ": "+ adj.get(key));
        }

       HashMap<String, Boolean> visited = new HashMap<String, Boolean>();

        visited.put("A", false);
        visited.put("B", false);
        visited.put("C", false);
        visited.put("D", false);
        visited.put("E", false);
        visited.put("F", false);
        visited.put("G",false);

        DFSRec("A", visited, adj);
        }

      static void DFSRec(String node, HashMap<String, Boolean> visited, HashMap<String,  ArrayList<String>> adj){

        System.out.print(node+ " ");
        visited.put(node, true);

            for(String neighbor : adj.keySet()){

                if (visited.get(neighbor) == false){

                    DFSRec(neighbor, visited, adj);
                }
            }
    }
}
