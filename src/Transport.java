public class Transport {
    public static void main(String[] args) {

        double Distance = 10001;

        if (Distance <= 300){
            System.out.println("Powinieneeś pójść pieszo.");
        } else if (Distance <= 2700){
            System.out.println("Powinienieś wwybrać rower.");
        } else if (Distance <= 10000){
            System.out.println("Powinieneś wybrać samochód");
        } else if (Distance >10000){
            System.out.println("Powinienieś wybrać samolot");
        }






    }
}
