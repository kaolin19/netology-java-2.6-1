package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldSetCurrentStation() {
        int station = 0;
        radio.setCurrentStation(station);
        assertEquals(0, radio.getCurrentStation());

        station = 9;
        radio.setCurrentStation(station);
        assertEquals(9, radio.getCurrentStation());

        station = -1;
        radio.setCurrentStation(station);
        assertEquals(9, radio.getCurrentStation());

        station = 1;
        radio.setCurrentStation(station);
        assertEquals(1, radio.getCurrentStation());

        station = 10;
        radio.setCurrentStation(station);
        assertEquals(1, radio.getCurrentStation());

        station = 8;
        radio.setCurrentStation(station);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentVolume() {
        int volume = 0;
        radio.setCurrentVolume(volume);
        assertEquals(0, radio.getCurrentVolume());

        volume = -1;
        radio.setCurrentVolume(volume);
        assertEquals(0, radio.getCurrentVolume());


        volume = 1;
        radio.setCurrentVolume(volume);
        assertEquals(1, radio.getCurrentVolume());

        volume = 11;
        radio.setCurrentVolume(volume);
        assertEquals(1, radio.getCurrentVolume());

        volume = 10;
        radio.setCurrentVolume(volume);
        assertEquals(10, radio.getCurrentVolume());

        volume = 9;
        radio.setCurrentVolume(volume);
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void shouldSetPrevStation() {
        int station = 1;
        radio.setCurrentStation(station);
        radio.prevStation();
        assertEquals(0,radio.getCurrentStation());

        station = 0;
        radio.setCurrentStation(station);
        radio.prevStation();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStation() {
        int station = 8;
        radio.setCurrentStation(station);
        radio.nextStation();
        assertEquals(9,radio.getCurrentStation());

        station = 9;
        radio.setCurrentStation(station);
        radio.nextStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void shouldSetMinusVolume() {
        int volume = 1;
        radio.setCurrentVolume(volume);
        radio.minusVolume();
        assertEquals(0,radio.getCurrentVolume());

        volume = 0;
        radio.setCurrentVolume(volume);
        radio.minusVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void shouldSetPlusVolume() {
        int volume = 9;
        radio.setCurrentVolume(volume);
        radio.plusVolume();
        assertEquals(10,radio.getCurrentVolume());

        volume = 10;
        radio.setCurrentVolume(volume);
        radio.plusVolume();
        assertEquals(10,radio.getCurrentVolume());
    }
}