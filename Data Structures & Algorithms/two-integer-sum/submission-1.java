class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int correspondingNumber = target - nums[i];
            if(map.containsKey(correspondingNumber)) {
                return new int[] { map.get(correspondingNumber), i };
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}
