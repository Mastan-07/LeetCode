// class Solution {
//     public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
//         // Initialize pointers for both arrays
//         int i = 0, j = 0;
//         // List to store our merged results
//         List<int[]> resultList = new ArrayList<>();
        
//         // Traverse both arrays with two pointers
//         while (i < nums1.length && j < nums2.length) {
//             int id1 = nums1[i][0], val1 = nums1[i][1];
//             int id2 = nums2[j][0], val2 = nums2[j][1];
            
//             if (id1 < id2) {
//                 // Id1 is smaller, add it to result
//                 resultList.add(new int[]{id1, val1});
//                 i++;
//             } else if (id2 < id1) {
//                 // Id2 is smaller, add it to result
//                 resultList.add(new int[]{id2, val2});
//                 j++;
//             } else {
//                 // Ids are equal, sum the values
//                 resultList.add(new int[]{id1, val1 + val2});
//                 i++;
//                 j++;
//             }
//         }
        
//         // Add remaining elements from nums1, if any
//         while (i < nums1.length) {
//             resultList.add(nums1[i]);
//             i++;
//         }
        
//         // Add remaining elements from nums2, if any
//         while (j < nums2.length) {
//             resultList.add(nums2[j]);
//             j++;
//         }
        
//         // Convert List to array
//         int[][] result = new int[resultList.size()][2];
//         for (int k = 0; k < resultList.size(); k++) {
//             result[k] = resultList.get(k);
//         }
        
//         return result;
//     }
// }


class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1=nums1.length,n2=nums2.length,i=0,j=0;
        ArrayList<int []>ans=new ArrayList();
        while(i<n1&& j<n2){
            if(nums1[i][0]==nums2[j][0]){
                ans.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                ans.add(nums1[i]);
                i++;
            }
            else{
                ans.add(nums2[j]);
                j++;
            }
        }
        while(i<n1){
            ans.add(nums1[i++]);
        }
        while(j<n2){
            ans.add(nums2[j++]);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}