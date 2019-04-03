package Network;

import java.io.*;
import java.net.Socket;

/**
 * Created by len on 01/04/2019.
 */
public class NetworkConnection {
    private static Socket sServer;
    private static DataOutputStream dos;
    private static DataInputStream dis;

    private static ObjectOutputStream oos;
    private static ObjectInputStream ois;
    private static final String IP = "localhost";
    private static final int PORT = 55555;
    private int opcio;

    public NetworkConnection(){
        sServer=null;
        dos = null;
        dis = null;
        ois = null;
        oos = null;

    }
    public void connect() {
        try {
            sServer = new Socket(IP, PORT);
            dos = new DataOutputStream(sServer.getOutputStream());
            dis = new DataInputStream(sServer.getInputStream());
            oos = new ObjectOutputStream(sServer.getOutputStream());
            ois = new ObjectInputStream(sServer.getInputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Conexion con el servidor lista");
    }

    public void disconnect() {
        try {

            dos.close();
        }catch (IOException e){

        }
        try{
            dis.close();
        }catch(IOException e){

        }

        try{
            sServer.close();

        }catch (IOException e){

        }
    }
    public void sendboolean() throws IOException {
        opcio = 1;
        dos.writeInt(opcio);
    }
}
