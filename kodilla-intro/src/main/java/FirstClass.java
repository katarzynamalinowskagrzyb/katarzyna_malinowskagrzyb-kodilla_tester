public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println(notebook.weight  + " " +  notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2021);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2018);
        System.out.println(oldNotebook.weight  + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        Notebook newNotebook = new Notebook(1800, 1800, 2022);
        System.out.println(newNotebook.weight  + " " + newNotebook.price + " " + newNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
    }
    }






    /*
Możemy wykorzystać instrukcję if/else w naszym przykładzie z laptopem, chociażby po to,
żeby wyświetlić inny komunikat w zależności od ceny urządzenia. Obecnie w kodzie mamy trzy obiekty,
utworzone na podstawie konstruktora Notebook. Sprawdźmy cenę dla jednego z nich. Zmodyfikuj instrukcję warunkową podaną powyżej w następujący sposób:

Warunek if powinien sprawdzać, czy cena obiektu notebook jest niższa niż 900.
Czy pamiętasz, jak dotrzeć do właściwości price tego obiektu? Tak, tak – potrzebna będzie Ci kropka!
Jeżeli cena jest niższa niż 900, powinien pojawiać się komunikat "This notebook is cheap".
W przeciwnym wypadku powinien pojawiać się komunikat "This notebook is quite expensive".
Gotowe? Naciśnij "Run" i sprawdź, czy warunek działa poprawnie.
 */