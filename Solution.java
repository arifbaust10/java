import java.util.Scanner;
public class Solution {
    public static void main(String[] arg){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if(n%2!=0)
            System.out.println("Weird");
        else if(n%2==0 & (n>=2 && n<=5))
            System.out.println("Not Weird");
        else if(n%2==0 & (n>=6 && n<=20))
            System.out.println("Weird");
        else if(n%2==0 && n>20)
            System.out.println("Not Weird");
        else
            System.out.println("Weird");
    }
}