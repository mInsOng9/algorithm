import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Hashtable<Integer,Integer> table=new Hashtable<>();
        //Step01:count the frequency
        for(int num:nums)
            table.put(num,table.getOrDefault(num,0)+1);
        
        //Step02:sort
        List<int[]> array=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:table.entrySet()){
            array.add(new int[]{
                entry.getValue(),entry.getKey()
            });
        }
        array.sort((a,b)->b[0]-a[0]);

        //Step03: first k elements 
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=array.get(i)[1];
        }
        return ans;
    }
}
