import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtWorkTest {

    ArtWork artWork;


    @BeforeEach
    void setUp(){
        artWork = new ArtWork(
                "Mona Lisa",
                100,
                "Vincent Van Gogh");
    }


    @Test
    public void canGetTitle(){
        String result = artWork.getTitle();
        String expected = "Mona Lisa";
        assertThat(result).isEqualTo(expected);
    }


    @Test
    public void canSetTitle(){
       artWork.setTitle("sunflower");
       String result = artWork.getTitle();
       String expected = "sunflower";
       assertThat(result).isEqualTo(expected);
    }


    @Test
   public void canGetPrice() {
        int result = artWork.getPrice();
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetPrice(){
        artWork.setPrice(200);
        int result = artWork.getPrice();
        int expected = 200;
        assertThat(result).isEqualTo(expected);
    }


}
