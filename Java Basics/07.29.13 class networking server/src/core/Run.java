package core;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import client.ClientWindow;

import server.CManager;
import server.SocketList;

public class Run {

	public static void main(String... args) {
		try (ServerSocket soc = new ServerSocket(5554)){
			Socket client;
			Thread t;
			String name;
			String msg;

			ClientWindow clientWindow = new ClientWindow();
			try {
				if ( args[0] == "true"){
					clientWindow.getFrame().setVisible(true);
				}
			} catch ( ArrayIndexOutOfBoundsException e) {}
			CManager.setClientWindow(clientWindow);

			while (true){
				client = soc.accept();
				name = (new DataInputStream( client.getInputStream() ).readUTF());
				msg = name + " connected.";
				
				System.out.println(msg);
				clientWindow.getTxtChatList().append(msg + "\n");
				SocketList.sendMsg(msg);
				
				SocketList.addSocket(client);
				
				t = new Thread(new CManager(client,  name) );
				t.setDaemon(true);
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
