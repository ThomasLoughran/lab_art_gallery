import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    void setup(){
       customer = new Customer("Mike", 500);
    }

    @Test
    public void canGetCustomerName(){

        String result = customer.getName();
        String expected = "Mike";
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void canSetName(){
        Artist artist = new Artist("John");
        artist.setName("Mike");
        String result = artist.getName();
        String expected = "Mike";
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void canGetWallet(){

        int result = customer.getWallet();
        int expected = 500;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void canSetWallet(){
        customer.setWallet(700);
        int result = customer.getWallet();
        int expected = 700;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void canDecreaseWallet(){
        customer.decreaseWallet(100);
        int result = customer.getWallet();
        int expected = 400;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void canBuyArtWork(){
        Gallery gallery = new Gallery("The Louvre");
        ArtWork newArtWork = new ArtWork("Mona Lisa", 200, "Da Vinci");
        gallery.addArtWork(newArtWork);
        customer.buyArtWork(gallery, newArtWork);
        int result1 = customer.getWallet();
        int expected1 = 300;
        int result2 = gallery.getTill();
        int expected2 = 200;
        int result3 = gallery.getSizeOfStock();
        int expected3 = 0;
        assertThat(result1).isEqualTo(expected1);
        assertThat(result2).isEqualTo(expected2);
        assertThat(result3).isEqualTo(expected3);
    }




















}
