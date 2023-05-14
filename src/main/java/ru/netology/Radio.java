package ru.netology;

public class  Radio {
    private int currentRadioStation;
    private int volume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void changeOnPreviousRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation--;
    }


    public void changeOnNextRadioStation() {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation++;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }

    public void volumeUpForOne() {

        if (volume == 100) {
            this.volume = volume;
        }
        if (volume < 100) {
            this.volume++;
        }
    }

    public void volumeDownForOne() {
        if (volume == 0) {
            this.volume = volume;
        }
        if (volume > 0) {
            this.volume--;
        }
    }

}