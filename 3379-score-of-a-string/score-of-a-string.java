class Solution {
    public int scoreOfString(String s) {
        int str=0;
        for(int i=0;i<s.length()-1;i++){
            str+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return str;
    }
}