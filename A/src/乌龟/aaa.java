package �ڹ�;

import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
  
public class aaa extends JFrame{  
  
    MyPanel mp=null;  
    public static void main(String[] args) {  
        aaa pb=new aaa();  
    }  
    public aaa()  
    {  
        mp=new MyPanel();  
        this.add(mp);  
          
        //�¼�����  
        this.addKeyListener(mp);  
          
        this.setSize(400,300);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setVisible(true);  
    }  
  
}  
  
//�����Լ������  
class MyPanel extends JPanel implements KeyListener  
{  
    int x=10;  
    int y=10;  
    public void paint(Graphics g)  
    {  
        super.paint(g);  
        g.fillOval(x, y, 10, 10);  
    }  
  
    @Override//��������  
    public void keyPressed(KeyEvent e) {  
        //System.out.println("������"+(char)e.getKeyCode());  
        switch(e.getKeyCode())  
        {  
            case KeyEvent.VK_UP:  
                y-=2;  
                //����repaint()���������»���С��λ��  
                this.repaint();  
                break;  
            case KeyEvent.VK_DOWN:  
                y+=2;  
                //����repaint()���������»���С��λ��  
                this.repaint();  
                break;  
            case KeyEvent.VK_LEFT:  
                x-=2;  
                //����repaint()���������»���С��λ��  
                this.repaint();  
                break;  
            case KeyEvent.VK_RIGHT:  
                x+=2;  
                //����repaint()���������»���С��λ��  
                this.repaint();  
                break;  
        }  
          
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