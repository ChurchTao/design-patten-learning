package github.churchtao.structor.bridge;

import github.churchtao.structor.bridge.device.Device;
import github.churchtao.structor.bridge.device.concrete.Radio;
import github.churchtao.structor.bridge.device.concrete.TV;
import github.churchtao.structor.bridge.remote.Remote;
import github.churchtao.structor.bridge.remote.concrete.FreeRemote;
import github.churchtao.structor.bridge.remote.concrete.MiRemote;

public class BridgeMain {


    public static void main(String[] args) {
        Device device1 = new Radio();
        Device device2 = new TV();

        Remote remote = new FreeRemote(device1);

        Remote remote1 = new FreeRemote(device2);

        remote.power();
        remote1.power();
    }
}
