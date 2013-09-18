package server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketList {

	private static List<Socket> sockets;
	private static SocketList instance = new SocketList();
	
	private SocketList(){
		sockets = new ArrayList<Socket>();
	}
	
	public static void addSocket(Socket s){
		sockets.add(s);
	}
	
	public static synchronized void sendMsg(String msg) throws IOException{
		DataOutputStream out;
		for (Socket s : sockets) {
			out = new DataOutputStream(s.getOutputStream());
			out.writeUTF(msg);
		}
	}
	
	public static synchronized void removeSocket(Socket s){
		sockets.remove(s);
	}
}
