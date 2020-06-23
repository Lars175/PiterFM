package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(10, 0, 100, 0);

    @Test
    void nextCurrentStation() {

        radio.setCurrentNumberStation(10);
        radio.nextStation();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void prevCurrentStation() {

        radio.setCurrentNumberStation(0);
        radio.prevStation();
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void moreSound() {

        radio.setCurrentVolume(0);
        radio.getCurrentVolume();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void lessSound() {

        radio.setCurrentVolume(100);
        radio.getCurrentVolume();
        assertEquals(100, radio.getMaxVolume());
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

        radio.setCurrentVolume(101);

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void nextCurrentVolume() {

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

        radio.setCurrentVolume(1);
        radio.lessSound();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void IncreaseCurrentVolume() {

        radio.setCurrentVolume(101);
        radio.moreSound();
        assertEquals(100, radio.getMaxVolume());
    }
}