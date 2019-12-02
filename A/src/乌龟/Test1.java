package 乌龟;

import java.awt.*;  
import javax.swing.*;


import java.awt.event.*;  
  
public class Test1 extends JFrame{  
	MyPanel qq=null;
    public static void main(String[] args) {  
    	Test1 pb=new Test1(); 
    }  
    public Test1()  
    {  
    	qq=new MyPanel();
		this.add(qq);
		
		 this.addKeyListener(qq);  			//事件监听 
		
		this.getContentPane().setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		 this.setVisible(true);  
		this.setSize(1366,768);
    }  
  
}  
  
//定义自己的面板  
class MyPanel extends JPanel implements KeyListener  
{  int[]c={360,50,360,350,270,130,450,130,270,275,450,275,310,110,300,100};
int x = 360, y = 50 ,x1 = 300 ,y2 = 100, x3 = 1000, x4 =400;
int f=0;
    public void paint(Graphics g)  
    { 
		super.paint(g); 																									//刷新之前的乌龟
		
		g.setColor(new Color(56, 128, 80));
		g.fillOval(x, y, 75, 100);																				
		g.fillOval(x,y+300, 75, 100);
		g.fillOval(c[4], c[5], 75, 100);																				//左上
		g.fillOval(c[6], c[7], 75, 100);																				//右上
		g.fillOval(c[8], c[9], 75, 100);																				//左下
		g.fillOval(c[10], c[11], 75, 100);																			//右下
		g.setColor(new Color(31, 73, 45));
		g.fillOval(x1, y2, 200, 300);																			//棕色边
		g.setColor(new Color(158, 129, 76));																	
		g.fillOval(x1+10, y2+10, 180, 280);																			//棕色的中间
	
    }  
  
    @Override//键被按下  
    public void keyPressed(KeyEvent e) {  
    	  if(e.getKeyCode() == KeyEvent.VK_UP)
          {
              //定义乌龟向上移动 f==0时候 左上脚和右下脚向前东
              // f==1时  右上脚和左下脚向前动
              y -= 10 ;
              y2 -=10;
              if(f == 0)
              {
                 c[5] -= 20 ;
                 c[11]-= 20 ;
              }
              if(f == 1)
              {
                  c[7]-=20 ;
                  c[9] -=20 ;
              }
              if(c[5] >= c[7])
              {
                  f = 0 ;
              }
              if(c[5] < c[7])
              {
                  f = 1 ;
              }
          }
          if(e.getKeyCode() == KeyEvent.VK_DOWN)
          {
              //定义乌龟向下移动 移动规则与向上移动一样
              y += 10 ; 
              y2 +=10;
              if(f == 0)
              {
            	  c[5]+= 20 ;
            	  c[11]+= 20 ;
              }
              if(f == 1)
              {
            	  c[7]+=20 ;
                  c[9] +=20 ;
              }
               if(c[5] <= c[7])																	//判断左脚是不是比右脚的高度小，小的话将f转换。让右脚也迈出一步
              {
                  f = 0 ;
              }
              if(c[5] >c[7])
              {
                  f = 1 ;
              }
          }
          if(e.getKeyCode() == KeyEvent.VK_LEFT)
          {
              //定义乌龟 向左移动 f==0时候 左上和左下脚向左移动
              //f==1时候 右上和右下向左移动
              x = x - 10 ;
              x1 -=10;
              if(f == 0)
              {
                  c[4] -= 20 ;
                  c[8] -= 20 ;
              }
              if(f == 1)
              {
                 c[6]  -= 20 ;
                  c[10]  -= 20 ;
              }
              if((c[4]+190) >= c[6])																//加上原本横的长度在判断左脚是否迈出第一步
              {
                  f = 0 ;
              }
              if((c[4] +190)< c[6])
              {
                  f = 1 ;
              }
          }
          if(e.getKeyCode() == KeyEvent.VK_RIGHT)
          {
              //定义乌龟向右移动 移动规则和向左一样
              x = x + 10 ;
              x1 +=10;
              if(f == 0)
              {
            	  c[6]  += 20 ;
                  c[10]  += 20 ;
              }
              if(f == 1)
              {
            	  c[4] += 20 ;
                  c[8] += 20 ;
              }
              if(c[6] <=( c[4]+190))
              {
                  f = 0 ;
              }
              if(c[6] > (c[4]+190))
              {
                  f = 1 ;
              }
          }
          repaint() ;
      }
          
    
  
    @Override//表示具体一个值被输出，例如：F1  
    public void keyTyped(KeyEvent e) {  
        // TODO Auto-generated method stub  
    	
          
    }  
    @Override//键被释放  
    public void keyReleased(KeyEvent e) {  
        // TODO Auto-generated method stub  
          
    }  
}