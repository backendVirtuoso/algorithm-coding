import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static class Node {
        private int depth = 1;
        private Node parent = this; // 초기에는 자기 자신이 부모
        private long max;

        public Node(long value) {
            this.max = value;
        }

        public Node find() {
            // 경로 압축을 적용하여 부모를 찾아서 직접 연결
            if (parent != this) {
                parent = parent.find();
            }
            return parent;
        }

        public long getMax() {
            return find().max; // 부모를 찾아서 최대값을 반환
        }

        public void union(Node o) {
            Node root1 = find();
            Node root2 = o.find();

            if (root1 == root2) return; // 이미 같은 집합이면 종료

            // union by rank
            if (root1.depth > root2.depth) {
                root2.parent = root1;
            } else if (root1.depth < root2.depth) {
                root1.parent = root2;
            } else {
                root2.parent = root1;
                root1.depth++;
            }

            // 최대값 업데이트
            root1.max = Math.max(root1.max, root2.max);
            root2.max = root1.max; // 두 루트의 최대값을 동기화
        }
    }

    public long[] solution(long k, long[] roomNumbers) {
        List<Long> assigned = new ArrayList<>();
        Map<Long, Node> nodes = new HashMap<>();

        for (long number : roomNumbers) {
            if (nodes.containsKey(number)) {
                number = nodes.get(number).getMax() + 1; // 마지막 방 번호를 찾음
            }

            Node node = new Node(number);
            nodes.put(number, node);

            // 이전 방번호와 다음 방번호와 union
            if (nodes.containsKey(number - 1)) {
                node.union(nodes.get(number - 1));
            }
            if (nodes.containsKey(number + 1)) {
                node.union(nodes.get(number + 1));
            }

            assigned.add(number);
        }

        return assigned.stream().mapToLong(Long::longValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long k = 10;
        long[] roomNumbers = {1, 3, 4, 1, 3, 1};
        long[] result = solution.solution(k, roomNumbers);
        
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
    
    
}
/*
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public class Solution {
        private static class Node {
            private int depth = 1;
            private Node parent = this; // 초기에는 자기 자신이 부모
            private long max;

            public Node(long value) {
                this.max = value;
            }

            public Node find() {
                // 경로 압축을 적용하여 부모를 찾아서 직접 연결
                if (parent != this) {
                    parent = parent.find();
                }
                return parent;
            }

            public long getMax() {
                return find().max; // 부모를 찾아서 최대값을 반환
            }

            public void union(Node o) {
                Node root1 = find();
                Node root2 = o.find();

                if (root1 == root2) return; // 이미 같은 집합이면 종료

                // union by rank
                if (root1.depth > root2.depth) {
                    root2.parent = root1;
                } else if (root1.depth < root2.depth) {
                    root1.parent = root2;
                } else {
                    root2.parent = root1;
                    root1.depth++;
                }

                // 최대값 업데이트
                root1.max = Math.max(root1.max, root2.max);
                root2.max = root1.max; // 두 루트의 최대값을 동기화
            }
        }

        public long[] solution(long k, long[] roomNumbers) {
            List<Long> assigned = new ArrayList<>();
            Map<Long, Node> nodes = new HashMap<>();

            for (long number : roomNumbers) {
                if (nodes.containsKey(number)) {
                    number = nodes.get(number).getMax() + 1; // 마지막 방 번호를 찾음
                }

                Node node = new Node(number);
                nodes.put(number, node);

                // 이전 방번호와 다음 방번호와 union
                if (nodes.containsKey(number - 1)) {
                    node.union(nodes.get(number - 1));
                }
                if (nodes.containsKey(number + 1)) {
                    node.union(nodes.get(number + 1));
                }

                assigned.add(number);
            }

            return assigned.stream().mapToLong(Long::longValue).toArray();
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            long k = 10;
            long[] roomNumbers = {1, 3, 4, 1, 3, 1};
            long[] result = solution.solution(k, roomNumbers);

            for (long num : result) {
                System.out.print(num + " ");
            }
        }
    }

*/