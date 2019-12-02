package 乌龟;

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
        //设置窗体
        Frame w = new Frame() ;
        w.setSize(1366, 768) ;
        w.setBackground(Color.LIGHT_GRAY);
        //添加画布
        MyWuGuiPa mp = new MyWuGuiPa();
        w.add(mp);
        //注册键盘事件
        w.addKeyListener(mp) ;
        mp.addKeyListener(mp) ;
        //注册鼠标事件
        w.addMouseListener(mp) ;
        mp.addMouseListener(mp) ;
        //显示
        w.show() ;
         
    }
 
}
class MyWuGuiPa extends Panel implements KeyListener,MouseListener
{
            //定义乌龟起始位置
            int x = 100, y = 400 ,x1 = 400 ,x2 = 700, x3 = 1000;
            //定义乌龟四只脚的变量 j是脚的y轴变量用来控制上下移动 k是脚的x轴的变量用来控制左右移动
            int j1 = 400 , k1 = 100 ;
            int j2 = 400 , k2 = 100 ;
            int j3 = 400 , k3 = 100 ;
            int j4 = 400 , k4 = 100 ;
             
            //定义乌龟行动规则 
            int f = 0 ;
    public void paint(Graphics g)
    {
        //乌龟的头
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(x, y, 70, 100);
        g.setColor(Color.BLACK);
        g.fillOval(x+10, y+30, 10, 10);
        g.fillOval(x+50, y+30, 10, 10);
        //龟尾巴
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(x, y+290, 60, 80);
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(x+20, y+300, 60, 80);
        //乌龟左上腿
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(k1-85, j1+70, 70, 70);
        //乌龟右上腿       100       
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(k2+85, j2+70, 70, 70);
        //乌龟左下腿      100    
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(k3-80, j3+235, 70, 70);
        //乌龟右下腿           
        g.setColor(Color.getHSBColor(169, 40, 3));
        g.fillOval(k4+80, j4+235, 70, 70);
        //龟盖
        g.setColor(Color.GREEN);
        g.fillOval(x-66, y+69, 200, 230);
        g.setColor(Color.black);
        g.drawOval(x-65, y+70, 200, 230);
        g.setColor(Color.black);//龟盖
        //龟纹
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
            //定义乌龟向上移动 f==0时候 左上脚和右下脚向前东
            // f==1时  右上脚和左下脚向前动
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
            //定义乌龟向下移动 移动规则与向上移动一样
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
            //定义乌龟 向左移动 f==0时候 左上和左下脚向左移动
            //f==1时候 右上和右下向左移动
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
            //定义乌龟向右移动 移动规则和向左一样
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
        //定义鼠标点到哪里 乌龟就出现在哪里
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
