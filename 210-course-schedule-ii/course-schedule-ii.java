class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //Intializing in degrees
        List<List<Integer>> graph = new ArrayList<>();
        int inDeg[] = new int[numCourses];
        for(int i = 0 ; i < numCourses;i++){
            graph.add(new ArrayList<>());
        }
        //Build graph
        for(int prereq[] : prerequisites){
            int course = prereq[0];
            int pre = prereq[1];
            graph.get(pre).add(course);
            inDeg[course]++;
        }
        //Intializing BFS
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < numCourses;i++){
            if(inDeg[i] == 0){
                queue.offer(i);
            }
        }
        //Topological Sort
        int order[] = new int[numCourses];
        int index = 0;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            order[index++] = curr;
            for(int neigh : graph.get(curr)){
                inDeg[neigh]--;
                if(inDeg[neigh] == 0){
                    queue.offer(neigh);
                }
            }
        }
        //Retruning empty array
        if(index != numCourses){
            return new int[0];
        }
        return order;
    }
}