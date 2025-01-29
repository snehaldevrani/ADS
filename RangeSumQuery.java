public class RangeSumQuery{
    public int[] prefixsum;

    public RangeSumQuery(int[] nums) {
        prefixsum = new int[nums.length];
        prefixsum[0] = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            prefixsum[i] = prefixsum[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
        {
            return prefixsum[right];
        }

        return prefixsum[right]-prefixsum[left-1];
    }
}