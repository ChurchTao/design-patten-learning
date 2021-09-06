package github.churchtao.behaviour.state.concretestate;

import github.churchtao.behaviour.state.AudioPlayer;
import github.churchtao.behaviour.state.State;

public class LockedState extends State {

    public LockedState(AudioPlayer audioPlayer) {
        super(audioPlayer);
    }

    @Override
    public void clickLock() {

    }

    @Override
    public void clickPlay() {

    }

    @Override
    public void clickNext() {

    }

    @Override
    public void clickPrevious() {

    }
}
