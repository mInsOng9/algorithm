import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {

        //handle the case where the array is empty or contains only one element
        if(nums.length<2)
            return nums.length;

        int cnt=1;
        int streak=1;

        // remove duplicate numbers using a HashSet
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
            set.add(num);
        
        // convert the set to an array and sort the numbers in ascending order
        int[] arr=new int[set.size()];
        int index=0;
        for(int num:set)
            arr[index++]=num;
         
        Arrays.sort(arr);
        
        //find the longest consecutive sequence
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]-1)
                cnt++;
            else{
                streak=Math.max(streak,cnt);
                cnt=1;
            }
        } 

        //maximum streak  
        return Math.max(streak,cnt);
    }
}
