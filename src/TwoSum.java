import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] nums={1,2,3,4,5};
        int target=9;
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.print(i+" "+j);
                    return ;
                }
            }
        }
        System.out.print("没找到");
    }

}
