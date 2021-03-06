public class MultipliesOf3And5 {
    public static void main(String[] args) {
        //Alle Multiplikatoren von 3 und 5 unter 1000 Ausgeben
        int counter = 1;
        int sum = 0;
        while (counter <= 1000) {
            if (counter % 3 == 0 || counter % 5 == 0){
                sum = sum + counter;
            }
            counter ++;
        }
        System.out.println("Die Summe der Multiplikatioren von 5 und 3 unter 1000 = " + sum);
    }
}
