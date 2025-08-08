package org.oop;

public class TvMain {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        tv.checkTVStatus();


    }
}

class TV {
    String color;
    boolean power = false;
    int channel = 10;
    final int MIN_CHANNEL = 0;
    final int MAX_CHANNEL = 90;

    void togglePower() {
        this.power = !this.power;
    }

    void channelUp() {
        if (!this.power || this.channel < MAX_CHANNEL) {
            this.channel++;
        }
    }

    void channelDown() {
        if (!this.power || this.channel > MIN_CHANNEL) {
            this.channel--;
        }
    }

    boolean isChannelInRange(int channel) {
        return channel >= MIN_CHANNEL && channel <= MAX_CHANNEL;
    }

    void checkTVStatus() {
        System.out.println("Checking TV status");
        System.out.println("Channel: " + this.channel);
        System.out.println("Power: " + this.power);
    }


}
