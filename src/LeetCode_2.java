public class LeetCode_2 {
    public static void main(String[] args){
        int[] nums={0,1,2,0,5,6,0,8};
        int fast=0,slow=0;
        for( fast=0;fast<nums.length;fast++){
            int temp;
            if(nums[fast]!=0){
                temp=nums[fast];
                nums[fast]=nums[slow];
                nums[slow]=temp;
                slow++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
