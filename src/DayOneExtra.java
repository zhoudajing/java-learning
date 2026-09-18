import java.util.Scanner;
public class DayOneExtra {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        a=input.nextInt();
        if (a%2==0){
            System.out.print("偶数");
        }else{
            System.out.print("奇数");
        }
    }
}
