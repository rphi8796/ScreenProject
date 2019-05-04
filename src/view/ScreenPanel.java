package view;

import controller.ScreenController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.*;

public class ScreenPanel extends JPanel
{
	private ScreenController app;
	private SpringLayout appLayout;
	private JPanel basePanel;
	private TwoButtonScreen bluePanel;
	private TwoButtonScreen redPanel;
	private TwoButtonScreen greenPanel;
	
	private JButton blueRed;
	private JButton blueGreen;
	private JButton redGreen;
	private JButton redBlue;
	private JButton greenBlue;
	private JButton greenRed;
	

	final static String BLUEPANEL = "blue";
	final static String REDPANEL = "red";
	final static String GREENPANEL = "green";

	public ScreenPanel(ScreenController app)
	{
		super();
		this.app = app;

		basePanel = new JPanel(new CardLayout());
		
		appLayout = new SpringLayout();
		bluePanel = new TwoButtonScreen();
		redPanel = new TwoButtonScreen();
		greenPanel = new TwoButtonScreen();
		
		blueRed = (JButton) (bluePanel.getComponent(0));
		blueGreen = (JButton) (bluePanel.getComponent(1));
		redGreen = (JButton) (redPanel.getComponent(0));
		redBlue = (JButton) (redPanel.getComponent(1));
		greenBlue = (JButton) (greenPanel.getComponent(0));
		greenRed = (JButton) (greenPanel.getComponent(1));
		
		setupSubPanels();
		setupPanel();
		setupListeners();
	}

	private void setupSubPanels()
	{
		bluePanel.setBackground(Color.blue);
		redPanel.setBackground(Color.red);
		greenPanel.setBackground(Color.green);
		
		basePanel.add(bluePanel, BLUEPANEL);
		basePanel.add(redPanel, REDPANEL);
		basePanel.add(greenPanel, GREENPANEL);
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 800));
		this.add(basePanel);
	}

	private void setupListeners()
	{
        blueRed.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent mouseClick)
        	{
        		CardLayout cl = (CardLayout) (basePanel.getLayout());
        		cl.show(basePanel, REDPANEL);
        	}
        });
        
        blueGreen.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent mouseClick)
        	{
        		CardLayout cl = (CardLayout) (basePanel.getLayout());
        		cl.show(basePanel, GREENPANEL);
        	}
        });
        
        redGreen.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent mouseClick)
        	{
        		CardLayout cl = (CardLayout) (basePanel.getLayout());
        		cl.show(basePanel, GREENPANEL);
        	}
        });
        
        redBlue.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent mouseClick)
        	{
        		CardLayout cl = (CardLayout) (basePanel.getLayout());
        		cl.show(basePanel, BLUEPANEL);
        	}
        });
        
        greenBlue.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent mouseClick)
        	{
        		CardLayout cl = (CardLayout) (basePanel.getLayout());
        		cl.show(basePanel, BLUEPANEL);
        	}
        });
        
        greenRed.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent mouseClick)
        	{
        		CardLayout cl = (CardLayout) (basePanel.getLayout());
        		cl.show(basePanel, REDPANEL);
        	}
        });

	}

}
