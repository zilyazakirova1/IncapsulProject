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
//    @Test
//    public void shouldChangeChannelToNextIfMinus() {
//        Radio rad = new Radio();
//        rad.setCurrentChannelNumber(-12);
//        int expected = 0;
//        rad.next();
//        int actual = rad.getCurrentChannelNumber();
//        Assertions.assertEquals(expected, actual);
//    }
    @Test
    public void shouldIncreaseVolume(){
        Radio rad=new Radio();
        rad.volume=82;
        int expected=83;
        rad.increaseVolume();
        int actual= rad.volume;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldIncreaseVolumeIf100(){
        Radio rad=new Radio();
        rad.volume=100;
        int expected=100;
        rad.increaseVolume();
        int actual= rad.volume;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldDecreaseVolume(){
        Radio rad=new Radio();
        rad.volume=30;
        int expected=29;
        rad.decreaseVolume();
        int actual= rad.volume;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldDecreaseVolumeIf0(){
        Radio rad=new Radio();
        rad.volume=0;
        int expected=0;
        rad.decreaseVolume();
        int actual= rad.volume;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void shouldChangeChannelToPrev() {
        Radio rad = new Radio();
        rad.setCurrentChannelNumber(7);
        int expected = 6;
        rad.prev();
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
}
