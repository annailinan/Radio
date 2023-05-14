package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int station;
    private int stationNumber = 10;

    public Radio() {

    }

    public Radio(int stationNumber) {
        this.stationNumber = stationNumber;

    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getStation() {
        return station;
    }


    public void setStation(int newStation) {
        if (newStation > stationNumber - 1) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        station = newStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);

        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void nextStation() {
        if (station == stationNumber - 1) {
            setStation(0);
        } else {
            station++;
        }

    }

    public void previousStation() {
        if (station == 0) {
            setStation(stationNumber - 1);
        } else {
            station--;
        }
    }
}