import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        Assertions.assertEquals(10, rad.getCurrentStation());
    }
}
