import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graphy {
    private HashMap<String, Node> graph;

    /** OBS halvfärdig!
     *
     */

    private static class Node {
        Set<Node> edges = new HashSet<>();
        private String key;
        private String value;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
            edges = new HashSet<>();
        }

    }


}
