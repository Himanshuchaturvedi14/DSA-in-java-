class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=n;
        int product=1;
        while(n!=0){
            int digit=n%10;
            sum+=digit ;
            product*=digit;
            n/=10;
        }
        if(p%(sum+product)!=0){
            return false;
        }
        else{
            return true;
        }

    }
}