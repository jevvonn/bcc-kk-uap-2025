package Method;

public class ExamplesMethod {
    public static void main(String[] args) {
        System.out.println("Sum: " + add(5, 3));
        greet();

        ExamplesMethod ex = new ExamplesMethod();
        System.out.println(ex.personalGreet("Jevon"));
        System.out.println("Factorial of 5: " + ex.factorial(5));
        System.out.println("Reversed 'hello': " + ex.reverse("hello"));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void greet() {
        System.out.println("Hello from static greet()");
    }

    public String personalGreet(String name) {
        return "Hello, " + name;
    }

    public long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
