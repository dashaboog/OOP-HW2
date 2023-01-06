import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(7);
        rad.prevStation();

        int expected = 6;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevBoarderStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.nextStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextBoarderStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multipleNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(4);
        rad.nextStation();
        rad.nextStation();
        rad.nextStation();

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multiplePrevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.prevStation();
        rad.prevStation();
        rad.prevStation();
        rad.prevStation();

        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(20);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UnderStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(-10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(8);

        int expected = 8;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnUnderVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-10);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnOverVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(12);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);
        rad.lowerVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerBoarderStation() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.lowerVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void higherVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(3);
        rad.higherVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void higherBoarderVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.higherVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multipleHigherVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(6);
        rad.higherVolume();
        rad.higherVolume();
        rad.higherVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void multipleLowerVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(7);
        rad.lowerVolume();
        rad.lowerVolume();
        rad.lowerVolume();
        rad.lowerVolume();

        int expected = 3;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}

