import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    void setUp(){
        gallery = new Gallery("The Louvre");
    }

    @Test
    void canGetName(){
        String result = gallery.getName();
        String expected = "The Louvre";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetName(){
            gallery.setName("my house");
            String result = gallery.getName();
            String expected = "my house";
            assertThat(result).isEqualTo(expected);
        }

    @Test
    void canGetTill(){
            int result = gallery.getTill();
            int expected = 0;
            assertThat(result).isEqualTo(expected);
        }

    @Test
    void canSetTill(){
            gallery.setTill(500);
            int result = gallery.getTill();
            int expected = 500;
            assertThat(result).isEqualTo(expected);
        }

    @Test
    void canGetSizeOfStock(){
            ArtWork newArtWork = new ArtWork("Mona Lisa", 200, "Da Vinci");
            gallery.addArtWork(newArtWork);
            int result = gallery.getSizeOfStock();
            int expected = 1;
            assertThat(result).isEqualTo(expected);
        }

    @Test
    void canRemoveStock(){
        ArtWork newArtWork = new ArtWork("Mona Lisa", 200, "Da Vinci");
        gallery.addArtWork(newArtWork);
        gallery.removeArtWork(newArtWork);
        int result = gallery.getSizeOfStock();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canAddToTill(){
        gallery.addToTill(100);
        int result = gallery.getTill();
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

//     make test for setStock()

}
