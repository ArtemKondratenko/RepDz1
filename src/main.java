public class main {
    public static void main(String[] args) {
        int number = 123;
        int a = number % 10;
        int b = number / 100;
        int c = (number % 100) / 10;

        // вариант первый
        System.out.println(a+b+c);
        //вариант второй
        System.out.println((number % 10)+(number / 100)+((number % 100) / 10));
    }
}
