import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {



    @Test
    public void canGetName(){
        Artist artist = new Artist("John");
        String result = artist.getName();
        String expected = "John";
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
}
