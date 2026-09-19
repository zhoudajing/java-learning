import java.util.HashMap;
public class leetcode_TwoSum_hashmap {
    public static void main(String[] args){
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int target=18;
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if(map.containsKey(need)){
                System.out.print(map.get(need)+" "+i);
            }
            map.put(nums[i],i);
        }
    }
}
