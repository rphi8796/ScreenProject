package view;

import controller.ScreenController;

import javax.swing.JFrame;

public class ScreenFrame extends JFrame
{
	ScreenController app;
	ScreenPanel appPanel;
	
	public ScreenFrame(ScreenController app)
	{
		super();
		this.app = app;
		this.appPanel = new ScreenPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800,800);
		this.setTitle("|~O~O~O~O~O~O~O~O~O~O~O~O~O~O~O~O~|");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
