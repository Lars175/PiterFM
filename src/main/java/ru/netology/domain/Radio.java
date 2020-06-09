package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setCurrentNumberStation(int currentStation) {
//               если текущая выше макс
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }

//        если текущая ниже мин
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


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getMinVolume() {
        return minVolume;
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
//        если текущ = макс увеличить на 1
        if (currentVolume == maxVolume)
            return;
        currentVolume++;
    }

    public void lessSound() {
//        если текущ = мин уменьшить на 1
        if (currentVolume <= minVolume)
            return;
        currentVolume--;
    }


}






