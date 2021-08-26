package github.churchtao.structor.bridge.remote.concrete;

import github.churchtao.structor.bridge.device.Device;
import github.churchtao.structor.bridge.remote.Remote;

public class FreeRemote implements Remote {

    private Device device;

    public FreeRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.isPowerOn()){
            device.off();
        } else {
            device.on();
        }
    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void channelNext() {

    }

    @Override
    public void channelPrev() {

    }
}
