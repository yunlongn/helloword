package �ڹ�;

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
		
		 this.addKeyListener(qq);  			//�¼����� 
		
		this.getContentPane().setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		 this.setVisible(true);  
		this.setSize(1366,768);
    }  
  
}  
  
//�����Լ������  
class MyPanel extends JPanel implements KeyListener  
{  int[]c={360,50,360,350,270,130,450,130,270,275,450,275,310,110,300,100};
int x = 360, y = 50 ,x1 = 300 ,y2 = 100, x3 = 1000, x4 =400;
int f=0;
    public void paint(Graphics g)  
    { 
		super.paint(g); 																									//ˢ��֮ǰ���ڹ�
		
		g.setColor(new Color(56, 128, 80));
		g.fillOval(x, y, 75, 100);																				
		g.fillOval(x,y+300, 75, 100);
		g.fillOval(c[4], c[5], 75, 100);																				//����
		g.fillOval(c[6], c[7], 75, 100);																				//����
		g.fillOval(c[8], c[9], 75, 100);																				//����
		g.fillOval(c[10], c[11], 75, 100);																			//����
		g.setColor(new Color(31, 73, 45));
		g.fillOval(x1, y2, 200, 300);																			//��ɫ��
		g.setColor(new Color(158, 129, 76));																	
		g.fillOval(x1+10, y2+10, 180, 280);																			//��ɫ���м�
	
    }  
  
    @Override//��������  
    public void keyPressed(KeyEvent e) {  
    	  if(e.getKeyCode() == KeyEvent.VK_UP)
          {
              //�����ڹ������ƶ� f==0ʱ�� ���Ͻź����½���ǰ��
              // f==1ʱ  ���Ͻź����½���ǰ��
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
              //�����ڹ������ƶ� �ƶ������������ƶ�һ��
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
               if(c[5] <= c[7])																	//�ж�����ǲ��Ǳ��ҽŵĸ߶�С��С�Ļ���fת�������ҽ�Ҳ����һ��
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
              //�����ڹ� �����ƶ� f==0ʱ�� ���Ϻ����½������ƶ�
              //f==1ʱ�� ���Ϻ����������ƶ�
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
              if((c[4]+190) >= c[6])																//����ԭ����ĳ������ж�����Ƿ�������һ��
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
              //�����ڹ������ƶ� �ƶ����������һ��
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
          
    
  
    @Override//��ʾ����һ��ֵ����������磺F1  
    public void keyTyped(KeyEvent e) {  
        // TODO Auto-generated method stub  
    	
          
    }  
    @Override//�����ͷ�  
    public void keyReleased(KeyEvent e) {  
        // TODO Auto-generated method stub  
          
    }  
}