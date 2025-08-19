public class Main {
    public static void main(String[] args) {

        int num, num1, num2;
        num1 = 10;
        num2 = 20;

        num = num1 + num2;
        num--;
        ++num;
        num1 += 100000;


        int x = 2;

        x = x >>= 3;
        x = x <<= 3; // bitwise shift operators

        System.out.println(num + 100 - 100 * num + 10000 / 2 % 2 + x);
        System.out.println(x < 10);
        System.out.println(x > 10);
        System.out.println(x <= 10);
        System.out.println(x >= 10);
        System.out.println(x == 10);
        System.out.println(x != 10); // it outputs true or false its comparison operator.

        int y = 1;
        int z = 2;

        System.out.println(y < 2 && z > 1);
        System.out.println(y <= 1 || z > 3);
        System.out.println(y != 1 && z > 1);
        System.out.println(y == 1 || z < 3); // Logical operators
    }
}
