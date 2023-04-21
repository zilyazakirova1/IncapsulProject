package ru.netology;

public class Radio {

    private int volume;
    private int channelCount;// = 10;
    private int maxChannel;// = 9;
    private int minChannel;// = 0;
    private int currentChannelNumber=0;//minChannel;

    public Radio(int channelCount, int maxChannel, int minChannel, int currentChannelNumber, int volume) {
        this.channelCount = channelCount;
        this.maxChannel = maxChannel;
        this.minChannel = minChannel;
        this.currentChannelNumber = currentChannelNumber;
        this.volume = volume;
    }

    public Radio() {
        //    maxChannel=10;
    }

    public void setCurrentChannelNumber(int newChannelNumber) {
        if (newChannelNumber < minChannel) {
            return;
        }
        if (newChannelNumber > maxChannel) {
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
        if (currentChannelNumber == maxChannel) {
            currentChannelNumber = minChannel;
        } else {
            currentChannelNumber = currentChannelNumber + 1;
        }
    }

    public void prev() {
        if (currentChannelNumber == minChannel) {
            currentChannelNumber = maxChannel;
        } else {
            currentChannelNumber = currentChannelNumber - 1;
        }
    }


    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        } else
        volume=100;
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        } else volume=0;
    }
}

/**/