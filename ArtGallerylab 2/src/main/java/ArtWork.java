public class ArtWork {

    private String title;

    private int price;

    private Artist artist;


    public ArtWork(String title, int price, String artistName){

        this.title = title;

        this.price =price;

        this.artist = new Artist(artistName);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public void addArtWork(Artist artist){
//    }

//    public Artist getArtist() {
//        return artist;
//    }
//
//    public void setArtist() {
//        this.artist = ;
//    }

}
