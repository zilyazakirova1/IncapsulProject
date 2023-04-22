package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldCheckoutChannelCount() {
        Radio rad = new Radio();
        Assertions.assertEquals(0, rad.getCurrentChannelNumber());
        Assertions.assertEquals(9, rad.getMaxChannel());
        Assertions.assertEquals(0, rad.getMinChannel());
    }


    @Test
    public void shouldChangeChannelToNext() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(7);
        rad.next();
        Assertions.assertEquals(8, rad.getCurrentChannelNumber());
    }

    @Test
    public void shouldChangeChannelToNextIf9() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(9);
        rad.next();
        Assertions.assertEquals(0, rad.getCurrentChannelNumber());
    }

    @Test
    public void shouldChangeChannelToNextIfMinus() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(-12);
        Assertions.assertEquals(9, rad.getCurrentChannelNumber());
    }

    @Test
    public void shouldChangeChannelToNextIfPlus() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(65);
        Assertions.assertEquals(0, rad.getCurrentChannelNumber());
    }

    @Test
    public void shouldChangeChannelToPrevIf0() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(0);
        rad.prev();
        Assertions.assertEquals(9, rad.getCurrentChannelNumber());
    }

    @Test
    public void shouldChangeChannelToPrev() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(2);
        rad.prev();
        Assertions.assertEquals(1, rad.getCurrentChannelNumber());
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);
        rad.increaseVolume();
        Assertions.assertEquals(51, rad.getCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolumeIf100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        Assertions.assertEquals(100, rad.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(30);
        rad.decreaseVolume();
        Assertions.assertEquals(29, rad.getCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolumeIf0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        Assertions.assertEquals(0, rad.getCurrentVolume());

    }


    @Test
    public void shouldIncreaseVolumeToMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(257);
        rad.increaseVolume();
        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeToMinus() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-7);
        rad.decreaseVolume();
        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void shouldTakeChannelCount() {
        Radio rad = new Radio(8);
        Assertions.assertEquals(8, rad.getChannelCount());

    }

}

