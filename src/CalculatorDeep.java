import java.util.Scanner;

public class CalculatorDeep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean chk = true;
        boolean opChk = true;
        String op = "";
        int result = 0;

        while (chk) {
            // 숫자와 연산자 입력받기
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = Integer.parseInt(sc.next());

            System.out.println("사칙 연산자를 입력하세요: ");
            op = sc.next();
            if (op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*")) {
                opChk = false;
            }
            while (opChk) { // 연산자의 입력이 잘못됐다면 다시 입력받는다.
                System.out.println("다시 입력하세요 : ");
                op = sc.next();
                if (op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*")) {
                    opChk = false;
                }
            }

            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = Integer.parseInt(sc.next());

            if (op.equals("+")) {
                result = num1 + num2;
            } else if (op.equals("-")) {
                result = num1 - num2;
            } else if (op.equals("/")) {
                result = num1 / num2;
            } else if (op.equals("*")) {
                result = num1 * num2;
            }
            System.out.println(num1 + op + num2 + "=" + result);
            System.out.print("계산기를 다시 실행하시겠습니까? (Y/N) : ");
            String restart = sc.next();
            if (restart.equals("N")) {
                System.out.println("GOOD BYE!");
                chk = false;
            }
        }
    }
}
