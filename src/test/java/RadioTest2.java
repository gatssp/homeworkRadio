import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest2 {
    @Test // включить радиостанцию (с конструктором)
    public void putOnRadioStationValid() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(49);

        int expected = 49;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // переключить радио станцию на следующую (с конструктором)
    public void putOnNextRadioStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(13);

        radio.buttonNext();

        int expected = 14;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // переключить радио станцию с 49й + 1 (с конструктором)
    public void putOnNextZeroRadioStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);

        radio.buttonNext();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // переключить радио станцию с 0й - 1 (с конструктором)
    public void putOnPrevZeroRadioStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);

        radio.buttonPrev();

        int expected = 49;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}