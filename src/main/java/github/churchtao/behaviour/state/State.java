package github.churchtao.behaviour.state;

public abstract class State {

    private AudioPlayer audioPlayer;

    public State(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public abstract void clickLock();

    public abstract void clickPlay();

    public abstract void clickNext();

    public abstract void clickPrevious();
}

