import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner num= new Scanner(System.in);
        int a=num.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=a-1-i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.print("\n");
        }
    }
}