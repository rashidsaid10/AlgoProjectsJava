package Classes;

import java.util.ArrayList;
import java.util.HashMap;

public class HashTables_and_DSA {
    public static void main(String[] args) {
        System.out.println("Hello world from the HAshtables");
        HashMap<String, Integer> empIds = new HashMap<>();


        empIds.put("Rashid", 6989458);
        empIds.put("Gacal", 787887);
        empIds.put("Gaarhaye", 87878);
        empIds.put("Muhubo", 874887);


       /* for(Map.Entry<String, Integer> entry: empIds.entrySet()){
            System.out.println("Key: "+ entry.getKey() + ". Value: " + entry.getValue());



*/

        System.out.println(empIds.containsKey("Gaarhay"));
        for (String key : empIds.keySet()) {

            System.out.println("Key: " + "Value: " + empIds.get(key));
        }



        HashMap<String, ArrayList<String>> adj = new HashMap<String, ArrayList<String>>();

        adj.put("A", new ArrayList<>());
        adj.put("A", new ArrayList<>());
        adj.put("B", new ArrayList<>());
        adj.put("B", new ArrayList<>());
        adj.put("C", new ArrayList<>());
        adj.put("C", new ArrayList<>());
        adj.put("D", new ArrayList<>());
        adj.put("E", new ArrayList<>());
        adj.put("F", new ArrayList<>());

        System.out.println(adj);

        adj.get("A").add("B");
        adj.get("A").add("B");
        adj.get("B").add("C");
        adj.get("B").add("D");




        for(String key : adj.keySet()){

            System.out.println(key+ ":"+ adj.get(key));
        }


    }

}
