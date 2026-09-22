class Solution {
    public int[] twoSum(int[] nums, int target) {

        int match = 0;
        int[] output = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<nums.length;i++){
            map.put(nums[i],i);

        }

        for(int i=0; i<nums.length; i++){

            match = target - nums[i];

            if(map.containsKey(match) && map.get(match)!= i){
                int[] result = {map.get(match),i};
                Arrays.sort(result);
                output = result;
            }


        }
    
        return output;
    }
}
