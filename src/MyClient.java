import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("199.99.99.4", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("El Magyo estubo aqui");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
