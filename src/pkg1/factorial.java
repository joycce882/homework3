package pkg1;

import java.util.Scanner;

// 阶乘
public class factorial {
    public static void main(String[] args)
    {
        int sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数，我会告诉你阶乘的结果：");
        int n = sc.nextInt();
        if (n <= 0)
            System.out.println("Invalid input");
        else
            for (int i = 1; i <= n; i++)
            {
                sum *= i;
            }
        System.out.println("阶乘的结果为："+sum);
    }



}
