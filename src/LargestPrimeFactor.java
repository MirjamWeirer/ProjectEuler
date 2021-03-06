public class LargestPrimeFactor {
    public static void main(String[] args) {
    calcPrim(13195);
    calcPrim(55);
    //calcPrim((long)600851475143);

    }

    public static void calcPrim (long number){
        //long number2 = 600851475143;
        while(number % 2 == 0) {
            number /= 2;
        }
        for (long prim = 3; prim < number; prim += 2){
            while (number % prim == 0 && prim < number) {
                number /= prim;
            }
        }
        System.out.println("The answer is: "+ number);
        //System.out.println("The answer is: "+ number2);
    }
}
