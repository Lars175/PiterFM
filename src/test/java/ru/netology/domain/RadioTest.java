package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        radio.nextStation();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void prevCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.prevStation();
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void moreSound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.getCurrentVolume();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void lessSound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.getCurrentVolume();
        assertEquals(10, radio.getMaxVolume());
    }


    @Test
    void setCurrentStationMoreMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentStationEqualsMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentAboveMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(11);
        radio.getCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void setCurrentLessMinStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(-1);
        radio.getCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setCurrentLessMinSound() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(-1);
        radio.getCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setCurrentEqualsMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void setCurrentAboveMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    void nextCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.moreSound();
        assertEquals(10, radio.getMaxVolume());
    }

    @Test
    void prevCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.lessSound();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.lessSound();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void IncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.moreSound();
        assertEquals(10, radio.getMaxVolume());
    }
}