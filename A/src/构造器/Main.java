package ¹¹ÔìÆ÷;
	import java.awt.Dimension;
	import java.awt.Toolkit;


	public class Main
	{
	public static void main(String[] args)
	{
	MainFrame mf = new MainFrame();

	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

	mf.setSize(dim.width, dim.height);
	mf.setVisible(true);
	}
	}

