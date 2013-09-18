package server;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class CManager implements Runnable{

	private Socket client;
	private String name;
	private static client.ClientWindow clientWindow;



	public CManager(Socket cl, String name){
		this.client = cl;
		this.name = name;
	}

	@Override
	public void run() {
		DataInputStream in = null;
		try {
			in = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			return;
		}
		String msg;
		while (true) {
			try {
				msg = in.readUTF();

				switch (msg){
				case "/knock":
					new Thread(new Runnable() {
						public void run() {
							try {
								Clip clip = AudioSystem.getClip();
								AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("Knock.wav"));
								clip.open(inputStream);
								clip.start(); 
							} catch (Exception e) {
								System.err.println(e.getMessage());
							}
						}
					}).start();
					break;

				case "/knock2":
					new Thread(new Runnable() {
						public void run() {
							try {
								Clip clip = AudioSystem.getClip();
								AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("Knock.wav"));
								clip.open(inputStream);
								clip.start(); 
							} catch (Exception e) {
								System.err.println(e.getMessage());
							}
						}
					}).start();
					JOptionPane.showMessageDialog(clientWindow.getFrame(), "Knock knock....");
					break;

				case "/servon":
					clientWindow.getFrame().setVisible(true);
					break;

				case "/servoff":
					clientWindow.getFrame().setVisible(false);
					break;

				default:
					if ( msg.matches("^/.*")){
						break;
					}
						
					SocketList.sendMsg( name + " > " + msg );
					clientWindow.getTxtChatList().append( name + " > " + msg + "\n");
					break;
				}

			} catch (IOException e) {
				SocketList.removeSocket(client);

				msg = name + " disconnected.";
				System.out.println(msg);
				clientWindow.getTxtChatList().append(msg + "\n");
				try {
					SocketList.sendMsg(msg);
				} catch (IOException e1) {
					clientWindow.getTxtChatList().append("Error sending disconnect message to clients\n");
					e1.printStackTrace();
				}

				return;
			}
		}

	}

	public static void setClientWindow(client.ClientWindow clientWindow) {
		CManager.clientWindow = clientWindow;
	}

}
