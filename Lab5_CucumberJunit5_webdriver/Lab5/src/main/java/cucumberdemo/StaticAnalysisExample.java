package cucumberdemo;
public class StaticAnalysisExample {
    private String unusedField; // Unused field

    public static void main(String[] args) {
        StaticAnalysisExample example = new StaticAnalysisExample();
        example.printMessage("Hello, world!");

        int result = example.add(5, 3);
        System.out.println("Result: " + result);
    }

    public void printMessage(String message) {
        if (message != null) {
            System.out.println(message);
        } else {
            System.out.println("Message is null");
        }
    }

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public void deadCode() {
        System.out.println("This is a dead code method and is never called.");
    }
}
