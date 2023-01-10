import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int maxVolume = 10;
    private final int minVolume = 0;

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

