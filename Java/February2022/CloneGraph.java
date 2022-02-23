/*
23:2:2022 : 133. Clone Graph


Given a reference of a node in a connected undirected graph.

Return a deep copy (clone) of the graph.

Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.


// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class CloneGraph {
    private Node BFS(Node node) {
        HashMap<Node, Node> hMap = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        if(node != null) {
            hMap.put(node, new Node(node.val));
            q.add(node);
        }
        while(!q.isEmpty()) {
            Node currNode = q.remove();
            for(Node adj : currNode.neighbors) {
                if(!hMap.containsKey(adj)) {
                    hMap.put(adj, new Node(adj.val));
                    q.add(adj);
                }
                hMap.get(currNode).neighbors.add(hMap.get(adj));
            }
        }
        return hMap.get(node);
    }
    public Node cloneGraph(Node node) {
        return BFS(node);
    }
}
