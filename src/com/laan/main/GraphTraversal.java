import java.util.*;

public class GraphTraversal {
    private Map<Character, LinkedHashSet<Character>> adjacencyList = new HashMap<>();

    public void addEdge(char from, char to) {
        adjacencyList.computeIfAbsent(from, k -> new LinkedHashSet<>()).add(to);
    }

    public void dfs(char start) {
        Set<Character> visited = new LinkedHashSet<>();
        Stack<Character> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            char current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                adjacencyList.getOrDefault(current, new LinkedHashSet<>())
                        .forEach(stack::push);
            }
        }
        System.out.println("DFS Order: " + visited);
    }

    public void bfs(char start) {
        Set<Character> visited = new LinkedHashSet<>();
        Queue<Character> queue = new LinkedList<>();
        queue.offer(start);

        while (!queue.isEmpty()) {
            char current = queue.poll();
            if (!visited.contains(current)) {
                visited.add(current);
                adjacencyList.getOrDefault(current, new LinkedHashSet<>())
                        .forEach(queue::offer);
            }
        }
        System.out.println("BFS Order: " + visited);
    }

    public static void main(String[] args) {
        GraphTraversal graph = new GraphTraversal();
        graph.addEdge('A', 'C');
        graph.addEdge('A', 'B');
        graph.addEdge('A', 'D');
        graph.addEdge('B', 'A');
        graph.addEdge('B', 'C');
        graph.addEdge('B', 'E');
        graph.addEdge('B', 'G');
        graph.addEdge('C', 'A');
        graph.addEdge('C', 'B');
        graph.addEdge('C', 'D');
        graph.addEdge('D', 'C');
        graph.addEdge('D', 'A');
        graph.addEdge('E', 'G');
        graph.addEdge('E', 'F');
        graph.addEdge('E', 'B');
        graph.addEdge('F', 'G');
        graph.addEdge('F', 'E');
        graph.addEdge('G', 'F');
        graph.addEdge('G', 'B');
        graph.addEdge('G', 'E');

        graph.dfs('A');
        graph.bfs('A');
    }
}
