class Solution {
    public int countCommas(int n) {
        int count=0,c=0;
        int p=n; 
        while(n>0){
            count++;
            n/=10;
        }
        if(count<4){
            return 0;
        }
        else{
           
            for(int i=1000;i<=p;i++)
            {
                c++;
            } 

                   }
                   return c;
    }
}