package github.churchtao.structor.bridge.device.concrete;

import github.churchtao.structor.bridge.device.Device;

public class TV extends Device {
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
        return 0;
    }

    @Override
    public void setVolume(int presentVol) {

    }

    @Override
    public String getChannel() {
        return null;
    }

    @Override
    public void setChannel(String channel) {

    }
}
