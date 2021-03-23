package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void shouldSetCurrentStationWithinRange() {
        int station = 8;
        radio.setCurrentStation(station);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationOutOfRange() {
        int station = 10;
        radio.setCurrentStation(station);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentVolumeWithinRange() {
        int volume = 9;
        radio.setCurrentVolume(volume);
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentVolumeOutOfRange() {
        int volume = 11;
        radio.setCurrentVolume(volume);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    void shouldSetPrevStationWithinRange() {
        int station = 1;
        radio.setCurrentStation(station);
        radio.prevStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStationOutOfRange() {
        int station = 0;
        radio.setCurrentStation(station);
        radio.prevStation();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationWithinRange() {
        int station = 8;
        radio.setCurrentStation(station);
        radio.nextStation();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationOutOfRange() {
        int station = 9;
        radio.setCurrentStation(station);
        radio.nextStation();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void shouldSetMinusVolumeWithinRange() {
        int volume = 1;
        radio.setCurrentVolume(volume);
        radio.minusVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void shouldSetMinusVolumeOutOfRange() {
        int volume = 0;
        radio.setCurrentVolume(volume);
        radio.minusVolume();
        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void shouldSetPlusVolumeWithinRange() {
        int volume = 9;
        radio.setCurrentVolume(volume);
        radio.plusVolume();
        assertEquals(10,radio.getCurrentVolume());
    }

    @Test
    void shouldSetPlusVolumeOutOfRange() {
        int volume = 10;
        radio.setCurrentVolume(volume);
        radio.plusVolume();
        assertEquals(10,radio.getCurrentVolume());
    }
}