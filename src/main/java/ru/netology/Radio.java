package ru.netology;

public class Radio {
    public int currentChannelNumber;
    public int volume;

    public int getCurrentChannelNumber() {
        return currentChannelNumber;
    }

    public void setCurrentChannelNumber(int newChannelNumber) {
        if (newChannelNumber < 0 ) {
            return;
        }
            if (newChannelNumber > 9){
                return;
            }
            currentChannelNumber = newChannelNumber;
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

