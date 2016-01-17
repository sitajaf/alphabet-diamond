import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DiamondGeneratorTest {
    DiamondGenerator generator;

    @Before
    public void setUp() throws Exception {
        generator = new DiamondGenerator();
    }

    @Test
    public void shouldReturnABDiamondString() throws Exception {
        String diamond = generator.generate("B");

        assertThat(diamond, is(" A\nB B\n A\n"));
    }

    @Test
    public void shouldReturnABCDDiamondStringEvenWithSmallCaseInput() throws Exception {
        String diamond = generator.generate("d");

        assertThat(diamond, is("   A\n  B B\n C   C\nD     D\n C   C\n  B B\n   A\n"));
    }

    @Test
    public void shouldNotAllowInvalidInput() throws Exception {
        String diamond = generator.generate("23");
        assertThat(diamond, is("Invalid Input!"));
    }

    @Test
    public void shouldNotAllowOtherInvalidCharacters() throws Exception {
        assertThat(generator.generate("/"), is("Invalid Input!"));
        assertThat(generator.generate("3"), is("Invalid Input!"));
        assertThat(generator.generate("+"), is("Invalid Input!"));
        assertThat(generator.generate(","), is("Invalid Input!"));
        assertThat(generator.generate("JoJO"), is("Invalid Input!"));
    }

}
