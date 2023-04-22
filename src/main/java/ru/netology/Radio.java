package ru.netology;

public class Radio {

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int channelCount = 10;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentChannelNumber = minChannel;

    public Radio(int channelCount) {
        this.channelCount = channelCount;
        this.maxChannel = channelCount - 1;
    }


    public Radio() {
        this.channelCount = 10;
        this.maxChannel = channelCount - 1;
    }

    public int getCurrentChannelNumber() {
        return currentChannelNumber;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public int getChannelCount() {
        return channelCount;
    }

    public void setCurrentChannelNumber(int newChannelNumber) {
        if (newChannelNumber < minChannel) {
            currentChannelNumber = 9;
            return;
        }
        if (newChannelNumber > maxChannel) {
            currentChannelNumber = 0;
            return;
        }
        currentChannelNumber = newChannelNumber;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (newVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newVolume;
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
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 100;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume = 0;
    }
}

