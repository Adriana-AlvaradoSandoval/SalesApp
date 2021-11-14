package Sales;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalesMain {

	private JFrame frame;
	private JTextField itemTextField;
	private JTextField costTextField;
	private JTextField qtyTextField;
	private JFormattedTextField totalTextField;
	private JButton btnNewButton;
	private JTextPane textPane;
	private SalesSlip slip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesMain window = new SalesMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
	
		});
	}

	/**
	 * Create the application.
	 */
	public SalesMain() {
		slip = new SalesSlip();
		initialize();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				String i = itemTextField.getText();
				Double c = Double.parseDouble(costTextField.getText());
				int q = Integer.parseInt(qtyTextField.getText()); 
				
				 
				SalesItem item = new SalesItem(i, c, q);
				slip.addItem(item);
				
				textPane.setText(slip.listToString());
				totalTextField.setText(slip.totalSales());
			}
		});
			
				
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel itemLBL = new JLabel("Item: ");
		itemLBL.setBounds(27, 63, 42, 16);
		frame.getContentPane().add(itemLBL);
		
		itemTextField = new JTextField();
		itemTextField.setBounds(100, 58, 255, 26);
		frame.getContentPane().add(itemTextField);
		itemTextField.setColumns(10);
		
		JLabel costLBL = new JLabel("Cost: $");
		costLBL.setBounds(27, 103, 61, 16);
		frame.getContentPane().add(costLBL);
		
		costTextField = new JTextField();
		costTextField.setBounds(100, 96, 130, 26);
		frame.getContentPane().add(costTextField);
		costTextField.setColumns(10);
		
		JLabel qtyLabel = new JLabel("Quantity:");
		qtyLabel.setBounds(27, 140, 61, 16);
		frame.getContentPane().add(qtyLabel);
		
		qtyTextField = new JTextField();
		qtyTextField.setBounds(102, 135, 130, 26);
		frame.getContentPane().add(qtyTextField);
		qtyTextField.setColumns(10);
		
		btnNewButton = new JButton("Add Item to the Sales List");
		btnNewButton.setBounds(100, 173, 210, 29);
		frame.getContentPane().add(btnNewButton);
		
		textPane = new JTextPane();
		textPane.setBounds(90, 214, 255, 169);
		frame.getContentPane().add(textPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(330, 214, 15, 173);
		frame.getContentPane().add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("Total: ");
		lblNewLabel.setBounds(27, 404, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		totalTextField = new JFormattedTextField();
		totalTextField.setBounds(90, 399, 140, 26);
		frame.getContentPane().add(totalTextField);
		
		JLabel lblNewLabel_1 = new JLabel("Sales List");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(166, 6, 116, 29);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
