package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldChangeChannelToNext() {
        Radio rad = new Radio(10, 9, 0, 7, 0, 100, 50);
        rad.next();
        Assertions.assertEquals(8, rad.getCurrentChannelNumber());
    }

    @Test
    public void shouldChangeChannelToNextIf9() {
        Radio rad = new Radio(10, 9, 0, 9, 0, 100, 50);
        rad.next();
        Assertions.assertEquals(0, rad.getCurrentChannelNumber());
    }

    @Test
    public void shouldChangeChannelToNextIfMinus() {
        Radio rad = new Radio(10, 9, 0, -12, 0, 100, 50);
        rad.setCurrentChannelNumber(-12);
        Assertions.assertEquals(0, rad.getCurrentChannelNumber());
    }

    @Test
    public void shouldChangeChannelToNextIfPlus() {
        Radio rad = new Radio(10, 9, 0, 65, 0, 100, 50);
        rad.setCurrentChannelNumber(65);
        Assertions.assertEquals(0, rad.getCurrentChannelNumber());
    }

    @Test
    public void shouldChangeChannelToPrevIf0() {
        Radio rad = new Radio(10, 9, 0, 0, 0, 100, 50);
        rad.prev();
        Assertions.assertEquals(9, rad.getCurrentChannelNumber());
    }

    @Test
    public void shouldChangeChannelToPrev() {
        Radio rad = new Radio(10, 9, 0, 2, 0, 100, 50);
        rad.prev();
        Assertions.assertEquals(1, rad.getCurrentChannelNumber());
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio(10, 9, 0, 2, 0, 100, 50);
        rad.increaseVolume();
        Assertions.assertEquals(51, rad.getCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolumeIf100() {
        Radio rad = new Radio(10, 9, 0, 2, 0, 100, 100);
        rad.increaseVolume();
        Assertions.assertEquals(100, rad.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio(10, 9, 0, 2, 0, 100, 30);
        rad.decreaseVolume();
        Assertions.assertEquals(29, rad.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolumeIf0() {
        Radio rad = new Radio(10, 9, 0, 2, 0, 100, 0);
        rad.decreaseVolume();
        Assertions.assertEquals(0, rad.getCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolumeToMax() {
        Radio rad = new Radio(10, 9, 0, 2, 0, 100, 257);
        rad.setCurrentVolume(257);
        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeToMinus() {
        Radio rad = new Radio(10, 9, 0, 2, 0, 100, -7);
        rad.setCurrentVolume(-7);
        Assertions.assertEquals(0, rad.getCurrentVolume());
    }


}

