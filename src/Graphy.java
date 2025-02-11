import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graphy {
    private HashMap<String, Node> graph = new HashMap<>();

    private static class Node {
        Set<Node> edges = new HashSet<>();
        private String key;
        private String name;

        Node(String key, String name) {
            this.key = key;
            this.name = name;
            edges = new HashSet<>();
        }
    }

    public void addNode(String key, String name) {
        graph.put(key, new Node(key, name));
    }

    public void addEdge(String key1, String key2) {
        Node thisNode = graph.get(key1);
        Node edgeNode = graph.get(key2);

        if (!thisNode.edges.contains(edgeNode)) {

            thisNode.edges.add(edgeNode);
        }
    }

    @Override
    public String toString() {
        String ret = "";
        for (String key: graph.keySet()) {
            ret += "\n" + graph.get(key).name + " ==> ";
            for (Node n: graph.get(key).edges) {
                ret += n.name + " ";
            }
        }
        return ret + "\n";
    }

}
