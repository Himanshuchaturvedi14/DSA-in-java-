class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer>  map=new HashMap<>();
        int left=0,maxf=0;
        for(int h=0;h<fruits.length;h++){
            map.put(fruits[h],map.getOrDefault(fruits[h],0)+1);
                   while (map.size() > 2) {

                int fruit = fruits[left];

                map.put(fruit, map.get(fruit) - 1);

                if (map.get(fruit) == 0) { 
                    map.remove(fruit);
                }

                left++;
            }
                maxf= Math.max(maxf, h - left + 1);
        }

        return maxf;
    }
}