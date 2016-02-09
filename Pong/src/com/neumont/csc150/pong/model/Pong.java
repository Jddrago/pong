package com.neumont.csc150.pong.model;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.neumont.csc150.pong.view.MainPanel;

public class Pong extends JFrame {
	private static final long serialVersionUID = 2428075151993380209L;
	
	
	private boolean RUNNING = false;
	public Paddle player;
	public MainPanel myPanel;
	private int up, down;
	private int left, right;
	private int vert, horz;
	

	public static void main(String[] args) {
		JFrame frame = new JFrame("Pong");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setResizable(false);
		
		MainPanel mainPanel = new MainPanel();
		frame.add(mainPanel, BorderLayout.CENTER);
		
		frame.setSize(1600, 900);
		frame.setVisible(true);

	}
	
	public Pong() {
		
	}
	
	public void run() {
		do {
			
		}while(RUNNING);
		
	}

}
