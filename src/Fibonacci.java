public class Fibonacci {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int counter = 1;
        int sum = 0;
        while(counter <= 20){
            System.out.println(sum);
            sum = sum + number1;
            number1 = number2;
            number2 = sum;
            counter ++;
        }
    }
}
