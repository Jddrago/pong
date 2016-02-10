package com.neumont.csc150.pong.model;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.neumont.csc150.pong.view.MainPanel;

public class Pong extends JFrame implements KeyListener {
	private static final long serialVersionUID = 2428075151993380209L;
	
	
	private boolean RUNNING = false;
	public Paddle player;
	public MainPanel myPanel;
	private int up;
	private int down;
	private int left;
	private int right;
	private int vert; 
	private int horz;
	

	public static void main(String[] args) {
		new Pong();

	}
	
	public Pong() {
		JFrame frame = new JFrame("Pong");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setResizable(false);
		
		MainPanel mainPanel = new MainPanel();
		frame.add(mainPanel, BorderLayout.CENTER);
		
		frame.setSize(1600, 900);
		frame.setVisible(true);
		
		
		this.addKeyListener(this);
	}
	
	public void run() throws Exception {
		while(RUNNING) {
			
			myPanel.repaint();
		}
		Thread.sleep(3000);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		switch (e.getKeyCode()) {

		case 37:
			horz = left;
			player.setDeltaX(horz);
			break;
		case 38:
			 vert = up;
			 player.setDeltaY(vert);
			break;
		case 39:
			horz = right;
			player.setDeltaX(horz);
			break;
		case 40:
			 vert = down;
			 player.setDeltaY(vert);
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 37:
			horz = 0;
			player.setDeltaX(horz);
			break;
		case 38:
			vert = 0;
			 player.setDeltaY(vert);
			break;
		case 39:
			horz = 0;
			player.setDeltaX(horz);
			break;
		case 40:
			vert = 0;
			 player.setDeltaY(vert);
			break;
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
//Git
