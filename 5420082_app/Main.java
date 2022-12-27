import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        State state = State.getState();
        System.out.print("Enter query: ");
        String query = scanner.nextLine();
        scanner.close();
        System.out.println("Searching : " + query);
        Thread api = new Thread(new Api(query, state));
        Thread load = new Thread(new Load(state));
        api.start();
        load.start();
        try {
            api.join();
            load.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}
