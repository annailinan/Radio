package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentRadioStationBackToZero() {
        Radio radio = new Radio();
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        Radio radio = new Radio();
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnPreviousRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeOnNextRadioStationIfStationIsMax() {
        Radio radio = new Radio();
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnNextRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = 1;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnPreviousRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio();
        int currentRadioStation = 8;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeOnNextRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio();
        int volume = 101;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio();
        int volume = -1;
        radio.setVolume(volume);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio();
        int volume = 100;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getVolume());

    }


    @Test
    void volumeUpForOne() {
        Radio radio = new Radio();
        int volume = 80;
        radio.setVolume(volume);
        radio.volumeUpForOne();
        int expected = 81;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio();
        int volume = 70;
        radio.setVolume(volume);
        radio.volumeDownForOne();
        int expected = 69;
        assertEquals(expected, radio.getVolume());

    }

}