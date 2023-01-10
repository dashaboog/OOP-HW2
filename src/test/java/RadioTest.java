import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void higherNumberOfStation() {
        Radio rad = new Radio(22);

        rad.setCurrentStation(24);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void lowerNumberOfStation() {
        Radio rad = new Radio(15);

        rad.setCurrentStation(-3);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void HigherNextStation() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(28);
        rad.nextStation();
        rad.nextStation();
        rad.nextStation();
        rad.nextStation();
        rad.nextStation();

        Assertions.assertEquals(3, rad.getCurrentStation());
    }

    @Test
    public void PrevBoarderStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(2);
        rad.prevStation();
        rad.prevStation();
        rad.prevStation();

        Assertions.assertEquals(9, rad.getCurrentStation());
    }


    @Test
    public void nextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.nextStation();

        Assertions.assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void prevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.prevStation();

        Assertions.assertEquals(7, rad.getCurrentStation());
    }

    @Test
    public void nextBoarderStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.nextStation();

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void multipleNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(4);
        rad.nextStation();
        rad.nextStation();
        rad.nextStation();

        Assertions.assertEquals(7, rad.getCurrentStation());
    }

    @Test
    public void multiplePrevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.prevStation();
        rad.prevStation();
        rad.prevStation();
        rad.prevStation();

        Assertions.assertEquals(4, rad.getCurrentStation());
    }

    @Test
    public void OverStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(20);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void UnderStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(-10);

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(80);

        Assertions.assertEquals(80, rad.getCurrentVolume());
    }

    @Test
    public void returnUnderVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-10);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void returnOverVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(110);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void lowerVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(45);
        rad.lowerVolume();

        Assertions.assertEquals(44, rad.getCurrentVolume());
    }

    @Test
    public void lowerBoarderVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.lowerVolume();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void lowerLimitVolume() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);
        rad.lowerVolume();
        rad.lowerVolume();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void higherVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(33);
        rad.higherVolume();

        Assertions.assertEquals(34, rad.getCurrentVolume());
    }

    @Test
    public void higherBoarderVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.higherVolume();

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void multipleHigherVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(69);
        rad.higherVolume();
        rad.higherVolume();
        rad.higherVolume();
        rad.higherVolume();
        rad.higherVolume();
        rad.higherVolume();

        Assertions.assertEquals(75, rad.getCurrentVolume());
    }

    @Test
    public void multipleLowerVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(7);
        rad.lowerVolume();
        rad.lowerVolume();
        rad.lowerVolume();
        rad.lowerVolume();

        Assertions.assertEquals(3, rad.getCurrentVolume());
    }

}



