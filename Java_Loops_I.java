import java.util.*;

public class Java_Loops_I {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;
        n=obj.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
}
