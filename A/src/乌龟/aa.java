package �ڹ�;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class aa {
	public static void main(String[] args)
    {
        //���ô���
        Frame w = new Frame() ;
        w.setSize(1366, 768) ;
        w.setBackground(Color.LIGHT_GRAY);
        //��ӻ���
        MyWuGuiPa mp = new MyWuGuiPa();
        w.add(mp);
        //ע������¼�
        w.addKeyListener(mp) ;
        mp.addKeyListener(mp) ;
        //ע������¼�
        w.addMouseListener(mp) ;
        mp.addMouseListener(mp) ;
        //��ʾ
        w.show() ;
         
    }
 
}
class MyWuGuiPa extends Panel implements KeyListener,MouseListener
{
            //�����ڹ���ʼλ��
            int x = 100, y = 400 ,x1 = 400 ,x2 = 700, x3 = 1000;
            //�����ڹ���ֻ�ŵı��� j�ǽŵ�y������������������ƶ� k�ǽŵ�x��ı����������������ƶ�
            int j1 = 400 , k1 = 100 ;
            int j2 = 400 , k2 = 100 ;
            int j3 = 400 , k3 = 100 ;
            int j4 = 400 , k4 = 100 ;
             
            //�����ڹ��ж����� 
            int f = 0 ;
    public void paint(Graphics g)
    {
        //�ڹ��ͷ
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(x, y, 70, 100);
        g.setColor(Color.BLACK);
        g.fillOval(x+10, y+30, 10, 10);
        g.fillOval(x+50, y+30, 10, 10);
        //��β��
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(x, y+290, 60, 80);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(x+20, y+300, 60, 80);
        //�ڹ�������
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(k1-85, j1+70, 70, 70);
        //�ڹ�������       100       
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(k2+85, j2+70, 70, 70);
        //�ڹ�������      100    
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(k3-80, j3+235, 70, 70);
        //�ڹ�������           
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(k4+80, j4+235, 70, 70);
        //���
        g.setColor(Color.GREEN);
        g.fillOval(x-66, y+69, 200, 230);
        g.setColor(Color.black);
        g.drawOval(x-65, y+70, 200, 230);
        g.setColor(Color.black);//���
        //����
        g.drawLine(x+5, y+130, x+75, y+130);
        g.drawLine(x-10, y+82, x+5, y+130);
        g.drawLine(x+75, y+130, x+100, y+95);
        g.drawLine(x-67,y+200,x+135,y+200);
        g.drawLine(x+5,y+250,x+75,y+250);
        g.drawLine(x+5,y+250,x-20,y+278);
        g.drawLine(x+100,y+275,x+75,y+250);
        g.drawLine(x+40, y+70, x+40, y+300);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
        if(e.getKeyCode() == KeyEvent.VK_UP&&j1>0)
        {
            //�����ڹ������ƶ� f==0ʱ�� ���Ͻź����½���ǰ��
            // f==1ʱ  ���Ͻź����½���ǰ��
            y = y - 10 ;
            if(f == 0)
            {
                j1 = j1 - 20 ;
                j4 = j4 - 20 ;
            }
            if(f == 1)
            {
                j2 = j2 -20 ;
                j3 = j3 -20 ;
            }
            if(j1 >= j2)
            {
                f = 0 ;
            }
            if(j1 < j2)
            {
                f = 1 ;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN&&j4<400)
        {
            //�����ڹ������ƶ� �ƶ������������ƶ�һ��
            y = y + 10 ;
            if(f == 0)
            {
                j1 = j1 + 20 ;
                j4 = j4 + 20 ;
            }
            if(f == 1)
            {
                j2 = j2 + 20 ;
                j3 = j3 + 20 ;
            }
            if(j1 <= j2)
            {
                f = 0 ;
            }
            if(j1 > j2)
            {
                f = 1 ;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT&&k1>80)
        {
            //�����ڹ� �����ƶ� f==0ʱ�� ���Ϻ����½������ƶ�
            //f==1ʱ�� ���Ϻ����������ƶ�
            x = x - 10 ;
            if(f == 0)
            {
                k1 = k1 - 20 ;
                k3 = k3 - 20 ;
            }
            if(f == 1)
            {
                k2 = k2 - 20 ;
                k4 = k4 - 20 ;
            }
            if(k1 >= k2)
            {
                f = 0 ;
            }
            if(k1 < k2)
            {
                f = 1 ;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT&&k2<1200)
        {
            //�����ڹ������ƶ� �ƶ����������һ��
            x = x + 10 ;
            if(f == 0)
            {
                k2 = k2 + 20 ;
                k4 = k4 + 20 ;
            }
            if(f == 1)
            {
                k1 = k1 + 20 ;
                k3 = k3 + 20 ;
            }
            if(k2 <= k1)
            {
                f = 0 ;
            }
            if(k2 > k1)
            {
                f = 1 ;
            }
        }
        repaint() ;
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mousePressed(MouseEvent e) 
    {
        //�������㵽���� �ڹ�ͳ���������
        x = e.getX() ;
        y = e.getY() ;
        j1 = e.getY() ;
        j2 = e.getY() ;
        j3 = e.getY() ;
        j4 = e.getY() ;
        k1 = e.getX() ;
        k2 = e.getX() ;
        k3 = e.getX() ;
        k4 = e.getX() ;
        repaint() ;
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }
}
