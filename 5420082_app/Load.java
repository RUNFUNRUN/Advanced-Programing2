public class Load implements Runnable {
    private final static long SEARCH_TIME_MSEC = 1000;
    private State state;
    public Load(State state) {
        this.state = state;
    }

    public void run() {
        if (state.isOn()) {
            System.out.print("Loading");
            waitLoading();
            while (state.isOn()) {
                System.out.print(".");
                waitLoading();
            }
        }
    }

    private void waitLoading() {
        try {
            Thread.sleep(SEARCH_TIME_MSEC);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
