public class App {
    private final static long SEARCH_TIME_MSEC = 5000;
    private String query;
    public App(String query) {
        this.query = query;
    }

    public boolean isExist() {
        try {
            Thread.sleep(SEARCH_TIME_MSEC);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
