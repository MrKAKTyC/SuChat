package SuPackage;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SuClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", Const.PORT);

	}

}
