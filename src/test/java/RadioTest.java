import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test // включить радиостанцию
    public void putOnRadioStationValid() {
        Radio radio = new Radio(); // подготовительная часть (создание объекта)

        radio.setCurrentStation(5); // поле

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // поставить максимальную радио станцию
    public void putOnRadioStationUpperLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // поставить минимальную радио станцию
    public void putOnRadioStationLowerLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // поставить радио станцию, которой не существует (больше 9)
    public void putOnRadioStationNoValidMore() {
        Radio radio = new Radio();

        radio.setCurrentStation(17);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // поставить радио станцию, которой не существует (меньше 0)
    public void putOnRadioStationNoValid() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // переключить радио станцию на следующую
    public void putOnNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.buttonNext();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // переключить вперед радио станцию граничные значения (8)
    public void putOnNextRadioStationLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.buttonNext();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // переключить радио станцию с 9й + 1
    public void putOnNextZeroRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.buttonNext();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // переключить радио станцию на предыдущую
    public void putOnPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.buttonPrev();

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // переключить радио станцию с 0й - 1
    public void putOnPrevZeroRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.buttonPrev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test // переключить назад радио станцию граничные значения (1)
    public void putOnPrevZeoRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.buttonPrev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test  // увеличить звук на 1 единицу (в пределах нормы)
    public void increaseVolumeValid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);


        radio.increaseVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test  // увеличить звук на 1 единицу (не в пределах нормы)
    public void increaseVolumeNoValid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test  // уменьшить звук на 1 единицу (в пределах нормы)
    public void decreaseVolumeValid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);


        radio.decreaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test  // уменьшить звук на 1 единицу (не в пределах нормы)
    public void decreaseVolumeNoValid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);


        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}