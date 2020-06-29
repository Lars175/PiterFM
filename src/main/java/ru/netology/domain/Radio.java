package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;


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






