package ru.netology;

public class Radio {

    private int minVolume=0;
    private int maxVolume=100;
    private int currentVolume=minVolume;
    private int channelCount= 10;
    private int maxChannel= 9;
    private int minChannel=0;
    private int currentChannelNumber=minChannel;

    public Radio(int channelCount, int maxChannel, int minChannel, int currentChannelNumber, int minVolume,int maxVolume,int currentVolume) {
        this.channelCount = channelCount;
        this.maxChannel = maxChannel;
        this.minChannel = minChannel;
        this.currentChannelNumber = currentChannelNumber;
        this.minVolume = minVolume;
        this.maxVolume=maxVolume;
        this.currentVolume=currentVolume;

    }

    public Radio() {
        //    maxChannel=10;
    }

    public void setCurrentChannelNumber(int newChannelNumber) {
        if (newChannelNumber < minChannel) {
            return ;
        }
        if (newChannelNumber > maxChannel) {
            return;
        }
        currentChannelNumber = newChannelNumber;
    }

   public int getCurrentChannelNumber(){return currentChannelNumber;}

    public void setVolume(int newVolume) {
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

    public int getVolume() {
        return currentVolume;
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
        } else currentVolume=100;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume=0;
    }
}

/**/