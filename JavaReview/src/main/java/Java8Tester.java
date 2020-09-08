/**
 * Created by CHULEI on 2019/9/5.
 */

class Java8Tester {

    final static String salutation = "Hello";

    public static void main(String[] args) {
        Java8Tester java8Tester = new Java8Tester();

        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + java8Tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + java8Tester.operate(10, 5, subtraction));
        System.out.println("10 * 5 = " + java8Tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + java8Tester.operate(10, 5, division));

        GreetingService greetingService = message -> System.out.println(salutation + message);
        GreetingService greetingService1 = (message) -> System.out.println("Hello" + message);

        greetingService.sayMessage("Google");
        greetingService1.sayMessage("Android");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}


