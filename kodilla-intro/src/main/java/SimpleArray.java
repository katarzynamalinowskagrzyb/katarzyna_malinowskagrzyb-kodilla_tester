public class SimpleArray {
    public static void main(String[] args) {
        String[] ourAnimals = new String[5];
        ourAnimals[0] = "Cat";
        ourAnimals[1] = "Dog";
        ourAnimals[2] = "Bird";
        ourAnimals[3] = "Flamingo";
        ourAnimals[4] = "Lion";
       // full commend: String[] ourAnimals = new ourAnimals[] {"Cat", "Dog", "Bird", "Flamingo", "Lion"};

        String Animal = ourAnimals[3];
        System.out.println( "Animal in the index of 3 is" + Animal);


        int numberOfElements = ourAnimals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " znaków" );
    }
}