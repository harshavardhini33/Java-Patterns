import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner num= new Scanner(System.in);
        int a=num.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}