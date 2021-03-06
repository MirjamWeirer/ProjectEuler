public class SumSquareDifference {
    public static void main(String[] args) {
        int resultSquaes = 0;
        int resultSum = 0;
        int counter1 = 1;
        int counter2 = 1;
        while (counter1 <= 100){
            resultSquaes = counter1 * counter1 + resultSquaes;
            counter1++;
        }
        while (counter2 <= 100){
            resultSum = resultSum + counter2;
            if (counter2 == 100){
                resultSum = resultSum * resultSum;
            }
            counter2++;
        }
        System.out.println(resultSum + " - " + resultSquaes + " = " + (resultSum-resultSquaes));
    }
}
