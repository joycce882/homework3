package pkg1;

import java.util.Scanner;

public class Function {
    public static void main(String[] args){
        System.out.println("请依次输入a,b,c的值：");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float a1 = b * b - 4 * a * c;
        float a2 = 4*a*c - b*b;
        if (a ==0 && b == 0)
            System.out.println("X1 = X2 = 无解");
        if(a ==0 && b != 0)
            System.out.println("方程的解为"+(-(c/b)));
        if(b*b == 4*a*c)
            System.out.println("方程有两个相等的实根，方程的解为"+(-(b/(2*a))));
        if( b*b > 4*a*c )
            System.out.println("方程有两个不等的实根，方程的解为：X1 ="+ (-b+Math.sqrt(a1))/2*a + "，X2 ="+(-b-Math.sqrt(a1))/2*a);
        if( b*b < 4*a*c )
            System.out.println("方程有两个共轭复根，方程的解为：X1 ="+ (-b/2*a)+Math.sqrt(a2)/2*a + "，X2 = "+((-b/2*a)+Math.sqrt(a2)/2*a));
    }
}
