package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void nextCurrentStation() {
        Radio radio = new Radio(0, 100, 0);
        radio.setCurrentNumberStation(10);
        radio.nextStation();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void prevCurrentStation() {
        Radio radio = new Radio(0, 100, 0);
        radio.setCurrentNumberStation(0);
        radio.prevStation();
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void moreSound() {

        radio.setCurrentVolume(2);

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void lessSound() {

        radio.setCurrentVolume(100);

        assertEquals(0, radio.getMaxVolume());
    }


    @Test
    void setCurrentStationMoreMaxStation() {

        radio.setCurrentNumberStation(11);

        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentStationEqualsMaxStation() {

        radio.setCurrentNumberStation(10);

        assertEquals(radio.getMaxStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentAboveMaxStation() {

        radio.setCurrentNumberStation(11);

        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void setCurrentLessMinStation() {

        radio.setCurrentNumberStation(-1);

        assertEquals(radio.getMinStation(), radio.getCurrentStation());
    }

    @Test
    void setCurrentLessMinSound() {

        radio.setCurrentNumberStation(-1);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void setCurrentEqualsMinVolume() {

        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void setCurrentAboveMaxVolume() {
        Radio radio = new Radio( 0, 100, 0);
        radio.setCurrentVolume(101);

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void nextCurrentVolume() {
        Radio radio = new Radio( 0, 100, 0);
        radio.setCurrentVolume(100);
        radio.moreSound();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void prevCurrentVolume() {

        radio.setCurrentVolume(0);
        radio.lessSound();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void decreaseCurrentVolume() {
        Radio radio = new Radio( 0, 100, 0);
        radio.setCurrentVolume(10);
        radio.lessSound();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void IncreaseCurrentVolume() {
        Radio radio = new Radio( 0, 100, 0);
        radio.setCurrentVolume(99);
        radio.moreSound();
        assertEquals(100, radio.getMaxVolume());
    }

}