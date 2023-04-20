package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldChangeChannelToNext() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(7);
        int expected = 8;
        rad.next();
        int actual = rad.getCurrentChannelNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChannelToNextIf9() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(9);
        int expected = 0;
        rad.next();
        int actual = rad.getCurrentChannelNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChannelToNextIfMinus() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(-12);
        int expected = 0;
        int actual = rad.getCurrentChannelNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChannelToNextIfPlus() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(65);
        int expected = 0;
        int actual = rad.getCurrentChannelNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChannelToPrevIf0() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(0);
        int expected = 9;
        rad.prev();
        int actual = rad.getCurrentChannelNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChannelToPrev() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(2);
        int expected = 1;
        rad.prev();
        int actual = rad.getCurrentChannelNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setVolume(50);
        int expected = 51;
        rad.increaseVolume();
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeIf100() {
        Radio rad = new Radio();
        rad.setVolume(100);
        int expected = 100;
        rad.increaseVolume();
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setVolume(30);
        int expected = 29;
        rad.decreaseVolume();
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeIf0() {
        Radio rad = new Radio();
        rad.setVolume(0);
        int expected = 0;
        rad.decreaseVolume();
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeToMax() {
        Radio rad = new Radio();
        rad.setVolume(257);
        int expected = 100;
        //  rad.increaseVolume();
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeToMinus() {
        Radio rad = new Radio();
        rad.setVolume(-7);
        int expected = 0;
        int actual = rad.getVolume();
        Assertions.assertEquals(expected, actual);
    }


}

