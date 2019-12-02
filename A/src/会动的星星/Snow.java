package �ᶯ������;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class Snow{
    public static void main(String[] args){
          Frame w = new Frame();//����һ�����
          w.setSize(800, 600);//��������С
          w.setBackground(Color.black);//���ñ�����ɫ
          MyJPanel p = new MyJPanel();//������һ����������
          w.add(p);
          Thread t = new Thread(p);//����һ���߳�
          t.start();//�����߳�
          w.setVisible(true);//��ʾ���

    }
}
class MyJPanel extends Panel implements Runnable{
    int[] x = new int[100];
    int[] y = new int[100];
    int[] y1 = new int[100];
    public MyJPanel(){
        for(int i=0;i<100;i++){
            x[i]=this.randomNum(800);
            y[i]=this.randomNum(600);
        }

}

    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(600, 70, 130, 130);
        g.setColor(Color.black);
        g.fillOval(550, 50, 130, 130);
        g.setColor(Color.white);
        for(int i =0;i<=100;i++){
            g.drawString("*", x[i], y[i]);
            for (int j = -1; j < y1[i]; j++) {
                g.drawString("*", x[i], 600-j*3);
            }
        }
    } 

    public void run(){
        while(true){
            for (int i = 0; i < y.length; i++) {
                if(y[i]<=600){
                    y[i]++;
                }else{
                    y1[i]++;
                    y[i] = 0;
                }
            }
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    //���������
    public int randomNum(int a){
        return (int)(Math.random()*a);
    }
}
