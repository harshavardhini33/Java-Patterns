# Java-Patterns
## 1.Print the following pattern
![image](https://user-images.githubusercontent.com/93427264/224882782-5f07fcec-86eb-4298-83d0-11a6c1c5ef6f.png)
## Code:
~~~
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
~~~
## Output:
![image](https://user-images.githubusercontent.com/93427264/224882941-861884a0-5f14-4efe-b240-502179f7df82.png)
## 2.PRINT THE FOLLWOING PATTERN
![image](https://user-images.githubusercontent.com/93427264/224883002-0d978e53-8e7d-453f-beaf-d0baa38d403f.png)
### CODE:
~~~
import java.util.Scanner;
public class Main {
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
~~~
### OUTPUT:
![image](https://user-images.githubusercontent.com/93427264/224883604-a202e451-2376-4bc2-952b-06733fbb6365.png)
## 3.PRINT THE FOLLOWING PATTERN
![image](https://user-images.githubusercontent.com/93427264/224883956-5729b447-2e1c-4e9d-bdb9-298650b21c60.png)
### CODE:
~~~
import java.util.Scanner;
public class Main {
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
~~~
### OUTPUT:
![image](https://user-images.githubusercontent.com/93427264/224884621-c397178c-9d85-47c0-b0d1-10cfdf52ef40.png)
