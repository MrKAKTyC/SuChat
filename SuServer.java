package SuPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SuServer {

	public static void main(String[] args) throws IOException {
		ServerSocket servSocket = new ServerSocket(Const.PORT);
		while(true){
			Socket clnt = servSocket.accept();
			System.out.println("Clint "+ clnt.toString() +" connected");
		}
		
	}

}
