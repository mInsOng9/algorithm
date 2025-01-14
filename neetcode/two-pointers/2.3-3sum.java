class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){

            int left=i+1,right=nums.length-1;
            while(left<right){
                int num=nums[i]+nums[left]+nums[right];
                if(num==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if(num>0)
                    right--;
                else if(num<0)
                    left++;
            }

        }
        ans=ans.stream().distinct().collect(Collectors.toList());
        return ans;
    }
}
