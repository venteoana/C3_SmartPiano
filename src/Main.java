import Network.NetworkConnection;
import View.CloseSessionView;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        CloseSessionView closeview = new CloseSessionView();
        closeview.setVisible(true);
        /*NetworkConnection network = new NetworkConnection();
        network.connect();
        network.sendboolean();
        network.disconnect();
        */
    }
}
