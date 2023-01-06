public class Radio {
    public int currentStation;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation += 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation -= 1;
        } else {
            currentStation = 9;
        }
    }

    public int currentVolume;
    public int maxVolume = 10;
    public int minVolume = 0;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void higherVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void lowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        } else {
            currentVolume = minVolume;
        }
    }
}
