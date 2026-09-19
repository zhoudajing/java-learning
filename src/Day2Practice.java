import java.util.*;
import java.util.Random;
public class Day2Practice {
    public static void main(String[] args){

        //printMultiplicationTable();
        gussNumberGame();
    }
    public static void printMultiplicationTable(){
        for(int i=1;i<=9;i++){
            for(int j=i;j<=9;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
    public static void gussNumberGame(){
        Random rand = new Random();
        int target=rand.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("猜谜游戏开始，请输入数字");
        while(true){
            System.out.print("请输入你猜的数字");
            int guss=sc.nextInt();
            count++;
            if(guss>target){
                System.out.println("大了");

            }else if(guss<target){
                System.out.print("小了");

            }else{
                System.out.print("恭喜找到，一共花了"+count+"找到");
                break;
            }
        }

    }

}
