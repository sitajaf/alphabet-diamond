import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class DiamondBuilderTest {

    @Mock
    ReaderWriter mockReaderWriter;

    DiamondBuilder builder;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
         builder = new DiamondBuilder(mockReaderWriter);
    }

    @Test
    public void shouldBuildABDiamond() throws Exception {
        builder.draw("B");

        verify(mockReaderWriter, times(3)).print(" ");
        verify(mockReaderWriter, times(2)).print("A");
        verify(mockReaderWriter, times(2)).print("B");

    }

    @Test
    public void shouldbuildABCDDiamondGiveSmallCase() throws Exception {
        builder.draw("d");

        verify(mockReaderWriter, times(21)).print(" ");
        verify(mockReaderWriter, times(2)).print("A");
        verify(mockReaderWriter, times(4)).print("B");
        verify(mockReaderWriter, times(4)).print("C");
        verify(mockReaderWriter, times(2)).print("D");


    }
}
