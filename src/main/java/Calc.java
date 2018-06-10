public class Calc {
    int a;
    int b;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int sum() {
        return a + b;
    }

    public int rem() {
        return a - b;
    }
    public static void main(String args[]) {
        Calc calc = new Calc(5, 8);

        System.out.println("Sumy: " + (calc.a + calc.b));
    }
}
