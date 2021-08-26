package github.churchtao.structor.bridge.device;

public abstract class Device {

    protected int power = 0;

    public abstract boolean isPowerOn();

    public abstract boolean on();

    public abstract boolean off();

    public abstract int getVolume();

    public abstract void setVolume(int presentVol);

    public abstract String getChannel();

    public abstract void setChannel(String channel);

}
