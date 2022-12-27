public class State {
    private static State state = new State();
    private boolean isOn;

    private State() {
        isOn = false;
    }

    public static State getState() {
        return state;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        isOn = true;
    }

    public void setOff() {
        isOn = false;
    }
}
