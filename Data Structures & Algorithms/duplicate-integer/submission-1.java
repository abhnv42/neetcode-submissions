class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();
        for(int i = 0; i < nums.length; i++) {
            if(hashTable.containsKey(nums[i]) == false) {
                hashTable.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}