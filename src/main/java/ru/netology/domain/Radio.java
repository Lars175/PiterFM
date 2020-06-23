package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {
    private int currentStation;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxStation, int minStation, int maxVolume, int minVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }


    public void setCurrentNumberStation(int currentStation) {

        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }

        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }

        this.currentStation = currentStation;
    }

    public void nextStation() {

        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;

            return;
        }
        currentStation--;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void moreSound() {

        if (currentVolume == maxVolume)
            return;
        currentVolume++;
    }

    public void lessSound() {

        if (currentVolume <= minVolume)
            return;
        currentVolume--;
    }

}






