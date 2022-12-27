public class Api implements Runnable {
    private final static long REQUEST_TIME_MSEC = 5000;
    private String query;
    private State state;
    public Api(String query, State state) {
        this.query = query;
        this.state = state;
    }

    public void run() {
        state.setOn();
        App app = new App(query);
        try {
            Thread.sleep(REQUEST_TIME_MSEC);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        boolean isExist = app.isExist();
        state.setOff();
        System.out.println();
        if (isExist) {
            System.out.println("Result : " + query + " is exist!");
        } else {
            System.out.println("Result : " + query + " is not exist!");
        }
    }
}
