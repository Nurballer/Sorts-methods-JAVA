from collections import deque

graph = {
    'A': ['C', 'B', 'D'],
    'B': ['A', 'C', 'E', 'G'],
    'C': ['A', 'B', 'D'],
    'D': ['C', 'A'],
    'E': ['G', 'F', 'B'],
    'F': ['G', 'E'],
    'G': ['F', 'B', 'E']
}

def dfs(graph, start):
    visited = []
    stack = [start]

    while stack:
        vertex = stack.pop()
        if vertex not in visited:
            visited.append(vertex)
            # Add neighbors in reverse order to visit them in the correct order
            stack.extend(graph[vertex])

    return visited


def bfs(graph, start):
    visited = []
    queue = deque([start])

    while queue:
        vertex = queue.popleft()
        if vertex not in visited:
            visited.append(vertex)
            queue.extend(graph[vertex])

    return visited

dfs_result = dfs(graph, 'A')
bfs_result = bfs(graph, 'A')

print("DFS Order: ", dfs_result)
print("BFS Order: ", bfs_result)
