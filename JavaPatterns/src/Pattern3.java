import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner num= new Scanner(System.in);
        int a=num.nextInt();
        for(int i=0;i<=a-1;i++)
        {
            for(int j=0;j<=i;j++) {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
        for(int i=a-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }
}