public class LaptopPrices {
    public static void main(String[] args) {


        double LaptopOne = 6000;
        double LaptopTwo = 5000;
        double LaptopThree = 7800;

        if (LaptopOne < LaptopTwo && LaptopOne < LaptopThree){
            System.out.println("Laptop numer 1 jest najtańszy");
        } else if (LaptopTwo < LaptopOne && LaptopTwo <LaptopThree){
            System.out.println("Laptop numer 2 jest najtańszy");
        } else if (LaptopThree < LaptopOne && LaptopThree < LaptopTwo){
            System.out.println("Laptop numer 3 jest najtanszy");
        }
    }
}
