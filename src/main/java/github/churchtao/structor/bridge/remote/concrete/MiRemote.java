package github.churchtao.structor.bridge.remote.concrete;

import github.churchtao.structor.bridge.device.Device;
import github.churchtao.structor.bridge.remote.Remote;

public class MiRemote implements Remote {

    private Device device;

    public MiRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {

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
