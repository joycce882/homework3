package pkg1;

public class TestBit {
        public static void main(String[] args) {

            int a=36;

            int b=2;

            byte b1=0x2f;

            byte b2=-0x1f;

            int i1=~b1;

            int i2=b1&b2;

            int i3=b1|b2;

            int i4=b1^b2;

            int i5=0B1110_0101&0B1010_0100|0B1110_1101;

            int r1,r2,r3,r4;

            r1=a>>b;

            r2=a<<b;

            r3=b>>a;

            r4=-7>>>5;

            System.out.printf("%d,%d,%d,%d,%d,%d,%d",b1,b2,i1,i2,i3,i4,i5);

            System.out.println();

            System.out.printf("%d,%d,%d,%d",r1,r2,r3,r4);

            System.out.println();

            System.out.println(Integer.toBinaryString(i5));//将整数转换为二进制序列

        }


}
