/*
973. K Closest Points to Origin

Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).

Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
*/
class KClosestPointstoOrigin {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int[][] res = new int[k][2];
        List<Node> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            list.add(new Node(i,temp));
        }
        Collections.sort(list);
        for(int i=0;i<k;i++){
            res[i][0] = points[list.get(i).index][0];
            res[i][1] = points[list.get(i).index][1];
        }
        return res;
    }
    class Node implements Comparable<Node>{
        int index;
        int dist;
        Node(int idx,int dist){
            this.index = idx;
            this.dist = dist;
        }
        @Override
	    public int compareTo(Node e) {
            if(this.dist<e.dist) return -1;
            else return 1;
	}
    }
}
/* Arrays Sort
Arrays.sort(points,  Comparator.comparingInt(o -> o[0] * o[0] + o[1] * o[1]));
        return Arrays.copyOfRange(points, 0, k);
*/
