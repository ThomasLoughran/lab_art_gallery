public class Customer {


    private String name;

    private int wallet;


    public Customer(String name, int wallet){

        this.name = name;

        this. wallet= wallet;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }


//    public  void makePurchase(){
//    }
    
    
    public void decreaseWallet(int amountDecreased){
         this.wallet -= amountDecreased;
    }

    public void buyArtWork(Gallery gallery, ArtWork artWork){
        int price = artWork.getPrice();
        decreaseWallet(price);
        gallery.addToTill(price);
        gallery.removeArtWork(artWork);
        
    }

}
