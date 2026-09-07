class Solution {
    public boolean isvowel(char ch){
     // return "aeiou"indexof(ch)!=-1;
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) {
        int left=0;
        int count=0;
        int max=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
         
             if(isvowel(s.charAt(left))){
                count--;
             }
             left++;
                       if (isvowel(s.charAt(i))) {
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}