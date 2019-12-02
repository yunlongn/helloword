package ÐÇÐÇ;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyTest extends JFrame {
	MyTest(){
		this.getContentPane().setBackground(Color.black);
		Myhuaban a=new Myhuaban();
		this.add(a);
		this.setSize(1366,768);
		this.show();
	}
	public static void main(String[] args) {
		MyTest a=new MyTest();
	}

		}
	class  Myhuaban extends Panel{
		public void  paint (Graphics g){
			for(int i =1;i<=300;i++){
			g.setColor(Color.white);
			g.drawString("*",(int)(Math.random()*1366),(int) (Math.random()*768));
			}
		}
}

