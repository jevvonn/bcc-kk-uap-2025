public class Main {
    public static void main(String[] args) {

        int result = sumTwoNumber(3, 5);
        System.out.println("Sum of 3 and 5 is: " + result);

        Main mainObj = new Main();
        mainObj.greet();
        String greetMessage = mainObj.greetReturn();
        System.out.println(greetMessage);
        mainObj.printTriangle(5);
    }

    public static int sumTwoNumber(int a, int b) {
        return a + b;
    }

    public void greet() {
        System.out.println("Hello, World!");
    }

    public String greetReturn() {
        return "Hello, World!";
    }

    public void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
