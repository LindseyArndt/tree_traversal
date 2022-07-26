import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Scrollbar;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.ScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class GUI extends JDialog implements ActionListener{
	

	
	//variables
	JTextField txtEnterHere = new JTextField();;
	JComboBox comboBox = new JComboBox();
	JTextArea txtVideos = new JTextArea();
	JButton btnSearch = new JButton("Search");
	JButton btnExit = new JButton("EXIT");
	JButton btnSortTitle = new JButton("Sort by Title ");
	JButton btnSortVid = new JButton("Sort by Video");
	JButton btnSortCompany = new JButton("Sort by Company");
	RM create = new RM();
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 * @throws FileNotFoundException 
	 */
	public GUI() throws FileNotFoundException {
		setBounds(100, 100, 446, 376);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{502, 0};
		gridBagLayout.rowHeights = new int[]{251, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel headerLabel = new JLabel("Videos in stock");
		headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headerLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(headerLabel, BorderLayout.NORTH);
		
		btnSortTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnSortTitle, BorderLayout.WEST);
		
		
		btnSortVid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnSortVid, BorderLayout.CENTER);
		
		
		btnSortCompany.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(btnSortCompany, BorderLayout.EAST);
		
		Panel panel_1 = new Panel();
		panel.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		
		txtVideos.setFont(new Font("Monospaced", Font.PLAIN, 16));
		create.getFile();
		txtVideos.setText(create.printVideo());
		panel_1.add(txtVideos, BorderLayout.WEST);
		
		Panel panel_2 = new Panel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		
		
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Title", "Video", "Company", "Actor", "Actor Sorted by Year"}));
		panel_2.add(comboBox);
		//comboBox.addActionListener(this);
		
		
		txtEnterHere.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEnterHere.setText("Search Name Here");
		panel_2.add(txtEnterHere);
		txtEnterHere.setColumns(10);
		
		
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel_2.add(btnSearch);
		
		
	
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setForeground(Color.RED);
		GridBagConstraints gbc_btnExit = new GridBagConstraints();
		gbc_btnExit.gridx = 0;
		gbc_btnExit.gridy = 1;
		getContentPane().add(btnExit, gbc_btnExit);
		
		//action listener components
		btnSearch.addActionListener(this);
		btnSortTitle.addActionListener(this);
		btnSortVid.addActionListener(this);
		btnSortCompany.addActionListener(this);
		btnExit.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		Listener listen = new Listener();
		if(e.getSource() == btnSearch) {
			txtVideos.setText(listen.searchClicked(comboBox.getSelectedIndex(), txtEnterHere.getText(), create));
		}
		else if(e.getSource() == btnSortTitle) {
			try {
				txtVideos.setText(listen.sTitle(create));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == btnSortVid) {
			txtVideos.setText(listen.sVid(create));
		}
		else if(e.getSource() == btnSortCompany) {
			txtVideos.setText(listen.sComp(create));
		}
		else if(e.getSource() == btnExit) {
			System.exit(0);
		}
		
	}

}
