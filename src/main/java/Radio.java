public class Radio {
    private int currentVolume; //  текущая громкость
    private int currentStation; // теккущая радио станция

    public int getCurrentVolume() { // получение данных "теккущая радио станция"
        return currentVolume;
    }

    public int getCurrentStation() { // получение данных "текущая громкость"
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) { // менять данные "теккущая радио станция"

        if (newCurrentVolume < 0 || newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }

        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        int plusVolume = currentVolume + 1;
        setCurrentVolume(plusVolume);
    }

    public void decreaseVolume() {
        int minusVolume = currentVolume - 1;
        setCurrentVolume(minusVolume);
    }

    public void buttonNext() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void buttonPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }
}