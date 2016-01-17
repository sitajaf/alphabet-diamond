import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.MockitoAnnotations.initMocks;

public class DiamondBuilderTest {
    DiamondBuilder builder;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        builder = new DiamondBuilder();
    }

    @Test
    public void shouldReturnABDiamondString() throws Exception {
        String diamond = builder.generate("B");

        assertThat(diamond, is(" A\nB B\n A\n"));
    }

    @Test
    public void shouldReturnABCDDiamondStringEvenWithSmallCaseInput() throws Exception {
        String diamond = builder.generate("d");

        assertThat(diamond, is("   A\n  B B\n C   C\nD     D\n C   C\n  B B\n   A\n"));
    }

    @Test
    public void shouldNotAllowInvalidInput() throws Exception {
        String diamond = builder.generate("23");
        assertThat(diamond, is("Invalid Input!"));
    }

    @Test
    public void shouldNotAllowOtherInvalidCharacters() throws Exception {
        assertThat(builder.generate("/"), is("Invalid Input!"));
        assertThat(builder.generate("3"), is("Invalid Input!"));
        assertThat(builder.generate("+"), is("Invalid Input!"));
        assertThat(builder.generate(","), is("Invalid Input!"));
        assertThat(builder.generate("JoJO"), is("Invalid Input!"));
    }

}
