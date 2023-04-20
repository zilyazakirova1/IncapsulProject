package ru.netology;

public class Radio {
    private int currentChannelNumber;
    private int volume;

    public void setCurrentChannelNumber(int newChannelNumber) {
        if (newChannelNumber < 0) {
            return;
        }
        if (newChannelNumber > 9) {
            return;
        }
        currentChannelNumber = newChannelNumber;
    }

    public int getCurrentChannelNumber() {
        return currentChannelNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            volume = 0;
            return;
        }
        if (newVolume > 100) {
            volume = 100;
            return;
        }
        volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        if (currentChannelNumber == 9) {
            currentChannelNumber = 0;
        } else {
            currentChannelNumber = currentChannelNumber + 1;
        }
    }

    public void prev() {
        if (currentChannelNumber == 0) {
            currentChannelNumber = 9;
        } else {
            currentChannelNumber = currentChannelNumber - 1;
        }
    }


    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}

