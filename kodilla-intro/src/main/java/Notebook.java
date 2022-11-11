public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook (int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if(this.price < 600){
            System.out.println("This notebook is very cheap.");
        }else if(this.price >= 600 && this.price <= 1000){
            System.out.println("The price is good.");
        }
        else{
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if(this.price <=600){
            System.out.println("This notebook is light.");
        } else if(this.price >600 && this.price >= 1600){
            System.out.println("This notebook is a little bit heavy.");
        }else {
            System.out.println("This notebook is heavy.");
        }
    }
    public void checkYear() {
        if(this.year <= 2020 && this.price < 600){
            System.out.println("This is old notebook and cheap.");
        }else if(this.year <=2020 && this.price > 600){
            System.out.println("This notebook is old and too expensive.");
        }else if(this.year < 2022 && this.price < 1600){
            System.out.println("This notebook is quite new with good price.");
            } else {
            System.out.println("This is new laptop and very expensive.");
        }
    }


}


    /*jeśli cena jest niższa od 600, wyświetl "This notebook is very cheap.",
        jeśli cena jest z przedziału 600-1000, wyświetl "The price is good.",
        jeśli cena jest wyższa od 1000, wyświetl "This notebook is expensive.".

     */
