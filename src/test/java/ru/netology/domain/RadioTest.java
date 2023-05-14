package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();

        Assertions.assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void volumeUp2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeDown2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(48);
        radio.reduceVolume();
        Assertions.assertEquals(47, radio.getCurrentVolume());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    public void nextStation1() {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.nextStation();
        Assertions.assertEquals(9, radio.getStation());
    }

    @Test
    public void previousStation() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.previousStation();
        Assertions.assertEquals(9, radio.getStation());
    }

    @Test
    public void previousStation1() {
        Radio radio = new Radio();
        radio.setStation(7);
        radio.previousStation();
        Assertions.assertEquals(6, radio.getStation());
    }

    @Test
    public void setStationPositive() {
        Radio radio = new Radio();
        radio.setStation(6);
        Assertions.assertEquals(6, radio.getStation());
    }

    @Test
    public void testSetStationOutOfRange() {
        Radio radio = new Radio(5);
        radio.setStation(15);
        Assertions.assertEquals(0, radio.getStation());
    }


    @Test
    public void testSetStationNegative() {
        Radio radio = new Radio(7);
        radio.setStation(-15);
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    public void testSetVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(120);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testSetVolumeNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-16);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

}