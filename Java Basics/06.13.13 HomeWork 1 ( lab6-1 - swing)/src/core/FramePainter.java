package core;

import javax.swing.JFrame;

public class FramePainter {
	private JFrame frame;
	private ColorMouseListener listen;
	private ColorMouseMotionListener listenMove;
	
	public FramePainter(){
		frame = new JFrame("Color test");
		listen = new ColorMouseListener(frame);
		listenMove = new ColorMouseMotionListener(frame);
		buildGui();
	}
	
	private void buildGui(){
		
		frame.setSize(400, 400);
		
		
		frame.addMouseMotionListener(listenMove);
		frame.addMouseListener(listen);
		
		frame.addWindowListener(new FramePainterWindowListener());
		frame.setVisible(true);
		
	}
}
