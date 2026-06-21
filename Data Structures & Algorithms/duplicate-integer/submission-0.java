class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(hashSet.contains(Integer.valueOf(nums[i]))) return true;
            hashSet.add(Integer.valueOf(nums[i]));
        }
        return false;
    }
}