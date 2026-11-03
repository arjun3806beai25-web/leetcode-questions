class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> s1 = new HashSet<>();
    Set<Integer> s2 = new HashSet<>();

    for(int num : nums1){
        s1.add(num);
    }
    for(int nu :nums2){
        if(s1.contains(nu))
        s2.add(nu);
    }
    int[] result = new int[s2.size()];
    int k =0;
    for(int n :s2 ){
    result[k++] = n;}

    return result;
    

      
    
    }
}