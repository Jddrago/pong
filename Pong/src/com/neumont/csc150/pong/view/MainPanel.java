package com.neumont.csc150.pong.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.neumont.csc150.pong.model.Ball;
import com.neumont.csc150.pong.model.Collision;
import com.neumont.csc150.pong.model.Paddle;

public class MainPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = -8031519751848054731L;
	
	public Ball b;
	public Paddle paddle1;
	public Paddle paddle2;
	public Collision c;
	
	private int scoreP1;
	private int scoreP2;
	private int width = 1205;
	private int height = 600;
	

	public MainPanel() {
		setBackground(Color.BLACK);
		
		Timer timer = new Timer(1000/60, this);
        timer.start();
        
        b = new Ball();
        c = new Collision();
        paddle1 = new Paddle(79, 345);
        paddle2 = new Paddle(1258, 323);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.black);
		g.setColor(Color.WHITE);
		drawField(g);
		drawPaddle1(g);
		drawPaddle2(g);
		drawBall(g);
		
	
	}
	
	private void drawField(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRect(70, 80, width, height);
		g.drawLine(width + 100, height/2, width/2, height);
		g.drawString("Player 1: " + scoreP1, 15, height/2 - 15);
		g.drawString("Player 2: " + scoreP2, 15, height/2 + 15);
	}
	
	private void drawPaddle1(Graphics g) {
		g.fillRect(paddle1.getX(), paddle1.getY(), paddle1.getWidth(), paddle1.getHeight());
	}
	
	private void drawPaddle2(Graphics g) {
		g.fillRect(paddle2.getX(), paddle2.getY(), paddle2.getWidth(), paddle2.getHeight());
	}
	
	private void drawBall(Graphics g) {
        g.fillOval(b.getX(), b.getY(), b.getWidth(), b.getHeight());
	}
	
	private void updateScoreP1() {
		scoreP1++;
	}
	
	private void updateScoreP2() {
		scoreP2++;
	}
	
	private void updatePaddle1() {
		
	}
	
	private void updatePaddle2() {
		
	}
	
	public Paddle getPaddle1() {
		return paddle1;
		 
	}
	
	public Paddle getPaddle2() {
		return paddle2;
		
	}
	
	private void updateBall() {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(b.getX() + b.getWidth() >= this.getWidth() ||
				b.getX() <= 0) {
				b.setDeltaX(b.getDeltaX() *= -1);
			}
			if(b.getY() + b.getHeight() >= this.getHeight() || b.getY() <= 0) {
				b.setDeltaY(b.getDeltaY()*= -1); 
			}
			b.getX() += b.getDeltax;
			b.setY(b.getY() += b.getDeltay);
			repaint();
	}
	
	


}
//So Much
