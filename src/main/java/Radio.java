
public class Radio {

    private int maxStation;
    private int currentStation;
    private int lowestStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int numberOfStations) {
        maxStation = numberOfStations - 1;
    }

    public Radio() {
        maxStation = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < lowestStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = lowestStation;
        }
    }

    public void prevStation() {
        if (currentStation > lowestStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void higherVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void lowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}

