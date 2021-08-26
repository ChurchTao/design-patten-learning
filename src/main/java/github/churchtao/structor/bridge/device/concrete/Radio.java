package github.churchtao.structor.bridge.device.concrete;

import github.churchtao.structor.bridge.device.Device;

public class Radio extends Device {

    private int volume = 0;

    private String channel = "";

    @Override
    public boolean isPowerOn() {
        return this.power==1;
    }

    @Override
    public boolean on() {
        System.out.println("开机");
        this.power = 1;
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("关机");
        this.power = 0;
        return true;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int presentVol) {
        this.volume = presentVol;
    }

    @Override
    public String getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(String channel) {

    }
}
