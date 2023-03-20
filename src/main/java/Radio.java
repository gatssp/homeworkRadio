public class Radio {
    private int maxStation = 10;
    private int currentVolume; //  текущая громкость
    private int currentStation; // теккущая радио станция

    public Radio(int quantityStaition) {
        maxStation = quantityStaition - 1;
    }

    public Radio() {

    }


    public int getCurrentVolume() { // получение данных "текущая громкость"
        return currentVolume;
    }

    public int getCurrentStation() { // получение данных "теккущая радио станция"
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) { // менять данные "теккущая радио станция"

        if (newCurrentVolume < 0 || newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
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
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void buttonPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }
}