package ÐÇÐÇ;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class Tsts1 {
	public static void main(String[] args) {
		Frame a=new Frame();
		MyTset x=new MyTset();
		a.add(x);
		a.setBackground(Color.BLACK);
		a.show();
		a.setSize(1366,768); 
	}
}
class MyTset extends Panel{
	public void paint(Graphics g){
		for(int i=1;i<=300;i++){
		g.setColor(Color.white);
		g.drawString("*", (int)(Math.random()*1366), (int)(Math.random()*768));
			}
		}
}