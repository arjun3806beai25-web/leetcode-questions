class Solution {
    public int pivotInteger(int n) {
       int sum = n*(n+1)/2;
       int first = 0;
       
        for(int i = 1;i<=n;i++){
          first+=i;
          int last = sum - (first - i);
        if(first == last)
        return i;
        } 
      

        
      return -1;
       
    }
}