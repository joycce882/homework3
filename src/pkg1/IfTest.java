package pkg1;
import java.util.Scanner;
public class IfTest {
    public static void main(String[] args) {

        int r;

        double perimeter,area;

        System.out.println("请输入半径值: ");

        Scanner sc = new Scanner(System.in);

        r=sc.nextInt();

        if (r>0)
        {
            perimeter=2*Math.PI*r;
            area=Math.PI*r*r;
            System.out.println("周长为："+perimeter);
            System.out.println("面积为："+area);
        }
        else
            System.out.println("半径值不合法！");
    }
}
