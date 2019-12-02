package ÐÇÐÇ;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JFrame;

public class Test3 {
	Test3(){
		JFrame a=new JFrame();
		Mypane2 b=new Mypane2();
		Thread x=new Thread(b);
		x.start();
		a.add(b);
		a.getContentPane().setBackground(Color.black);
		a.show();
		a.setSize(1369, 768);
		
	}
class Mypane2 extends Panel implements Runnable{
	int[] x=new int[300];
	int[] y=new int[300];
	Mypane2(){
		for(int i=0;i<300;i++){
			x[i]=(int)(Math.random()*1369);
			y[i]=(int)(Math.random()*1369);
		}
	}
	
	public void paint(Graphics g){
		g.setColor(Color.white);
		for(int i=0;i<300;i++){
		g.drawString("*",x[i] , y[i]);
		}
	}

	@Override
	public void run() {
		while(true){
			try{for(int i=0 ; i<y.length ; i++){
				y[i] ++;
				if(y[i]>760){
					y[i]=0;
				}
			}		
				Thread.sleep(30);
			}catch(Exception e){}
			repaint();
		}
		
	}
	
}
	
	public static void main(String[] args) {
		Test3 a=new Test3();
	}
}
