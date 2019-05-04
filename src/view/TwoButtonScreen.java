package view;

import javax.swing.*;
import java.awt.*;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtonScreen extends JPanel
{
	private JButton next;
	private JButton back;
	private SpringLayout appLayout;
	
	public TwoButtonScreen()
	{
		super();
		
		appLayout = new SpringLayout();
		next = new JButton("Next");
		appLayout.putConstraint(SpringLayout.NORTH, next, -130, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, next, -160, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, next, -70, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, next, -60, SpringLayout.EAST, this);
		
		back = new JButton("Back");
		appLayout.putConstraint(SpringLayout.NORTH, back, 0, SpringLayout.NORTH, next);
		appLayout.putConstraint(SpringLayout.WEST, back, 60, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, back, 0, SpringLayout.SOUTH, next);
		appLayout.putConstraint(SpringLayout.EAST, back, -480, SpringLayout.WEST, next);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(next);
		this.add(back);
		this.setPreferredSize(new Dimension(800, 800));
	}
	
	private void setupLayout()
	{

	}
	
	private void setupListeners()
	{
		
	}
}
