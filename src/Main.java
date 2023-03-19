public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int temp = b;
        b = a;
        a = temp;
        System.out.printf("%d - %d", a, b);
    }
}