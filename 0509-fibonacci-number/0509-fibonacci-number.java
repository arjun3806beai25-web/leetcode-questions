class Solution {
    public int fib(int n) {
       if(n<=1){
        return n;
       }
       int p1 = 0;
       int p2 = 1;
       int p =0;
       for(int i =2;i<=n;i++){
        p = p1+p2;
        p1 = p2;
        p2 = p;
        
       }
       return p;
    
    }
}