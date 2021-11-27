import java.util.Scanner;
public class Lv3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数字： ");
            double x1 = scanner.nextDouble();
            System.out.println("请输入运算符： ");
            String operator = scanner.next();
            System.out.println("请再输入一个数字： ");
            double x2 = scanner.nextDouble();
            double y = com1(x1, operator, x2);
            System.out.println("结果为：" + y);
        }catch (Exception e) {
            System.out.println("表达式不符合规范。" + e);
        }
    }

    public static double com1(double x1, String operator, double x2) {
        double sum=0;
        try {

            switch (operator) {
                case "-":
                    sum = x1 - x2;
                    break;
                case "+":
                    sum = x1 + x2;
                    break;
                case "*":
                    sum = x1 * x2;
                    break;
                case "/":
                    sum = x1 / x2;
                    break;
            }
        } catch (Exception e) {
            System.out.println("表达式不符合规范。" + e);
        }return sum;
    }
}
