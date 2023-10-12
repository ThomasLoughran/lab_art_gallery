import java.util.ArrayList;

public class Gallery {

    private String name;
    private int till;
    private ArrayList<ArtWork> stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return this.till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public int getSizeOfStock() {
        return this.stock.size();
    }

    public void setStock(ArrayList<ArtWork> stock) {
        this.stock = stock;
    }
    
    
    public void addArtWork(ArtWork artWork){
        this.stock.add(artWork);
    }
    
    public void removeArtWork(ArtWork artWork){
            this.stock.remove(artWork);
        }
        
    public void addToTill(int amount){
        this.till += amount;
    }
}
