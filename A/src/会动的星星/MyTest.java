package 会动的星星;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyTest  {
	MyTest(){
		JFrame b=new JFrame();
		b.getContentPane().setBackground(Color.black);				//设置背景颜色
		Myhuaban a=new Myhuaban();											//创建了一个画布对象
		
		Thread t = new Thread(a);                                                     //建立线程很重要
		t.start();																					//启动线程
		b.add(a);
		b.setSize(1366,768);																//设置面板大小
		b.show();//显示面板
	}
	public static void main(String[] args) {
		MyTest a=new MyTest();
	}

		}
	class  Myhuaban extends Panel implements Runnable {
		int  x[] = new int[300];
		int  y[] = new int[300];
		
		public Myhuaban(){
			for(int i=0 ;  i<300 ;  i++){
				x[i]=(int)(Math.random()*1300);
				y[i]=(int)(Math.random()*768);
				}
		}
		public void  paint (Graphics g){
			g.setColor(Color.white);
			for(int i =1;i<=300;i++){
			g.drawString("*" ,x[i] , y[i] );
			}
		}
		public void run()  {
			while(true){
				try{for(int i=0 ; i<y.length ; i++){
					y[i] ++;
					if(y[i]>760){
						y[i]=0;
					}
				}		
					Thread.sleep(30);
				}catch(Exception e){}
				repaint(0, 0, 1366, 769);
			}
		}
}
