package cell_java_doan;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class aaa extends JFrame {
	
	private JPanel contentPane1;
	private JPanel CellsByPríoner;
	private JPanel IsolationCellsByPrisoner;
	private JTextField txtCellId;
	private JLabel Cell_Id;
	private JTextField txtSize;
	private JLabel Status;
	private JComboBox CbbStatus;
	private JLabel Size;
	private JTextField txtCellLocation;
	private JLabel CellLocation;
	private JTextField txtareaId;
	private JLabel AreaId;
	private JLabel lblPrisonerId;
	private JTextField textField;
	private JLabel AreaId_1;
	private JLabel Cell_Iso_id;
	private JTextField CellIsoId;
	private JLabel lblIs;
	private JLabel lblDepcription;
	private JTextField txtIsOccup;
	private JTextField PríonerId;
	private JTextField textField_1;
	private JButton btnAdd;
	private JButton btnAdd1;

	private JPanel contentPane;

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CellsByPrisoner frame = new CellsByPrisoner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public aaa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 462);
		contentPane1 = new JPanel();
		contentPane1.setBackground(new Color(192, 192, 192));
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane1);
		
		CellsByPríoner = new JPanel();
		CellsByPríoner.setBackground(new Color(192, 192, 192));
		CellsByPríoner.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "CellsByPrisoner", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		IsolationCellsByPrisoner = new JPanel();
		IsolationCellsByPrisoner.setBackground(new Color(192, 192, 192));
		IsolationCellsByPrisoner.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "IsolationCellsByPrisoner", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout gl_contentPane = new GroupLayout(contentPane1);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(CellsByPríoner, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(IsolationCellsByPrisoner, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
					.addGap(8))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(CellsByPríoner, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(IsolationCellsByPrisoner, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
					.addGap(2))
		);
		
		lblPrisonerId = new JLabel("Prisoner Id");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		AreaId_1 = new JLabel("Area Id");
		
		Cell_Iso_id = new JLabel("Cell Iso Id");
		
		CellIsoId = new JTextField();
		CellIsoId.setColumns(10);
		
		lblIs = new JLabel("Is Occupied");
		
		lblDepcription = new JLabel("Description");
		
		txtIsOccup = new JTextField();
		txtIsOccup.setColumns(10);
		
		PríonerId = new JTextField();
		PríonerId.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		btnAdd1 = new JButton("ADD");
		btnAdd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAdd1ActionPerformed(e);
			}
		});
		GroupLayout gl_IsolationCellsByPrisoner = new GroupLayout(IsolationCellsByPrisoner);
		gl_IsolationCellsByPrisoner.setHorizontalGroup(
			gl_IsolationCellsByPrisoner.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_IsolationCellsByPrisoner.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_IsolationCellsByPrisoner.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_IsolationCellsByPrisoner.createSequentialGroup()
							.addGroup(gl_IsolationCellsByPrisoner.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblDepcription, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
								.addComponent(lblPrisonerId, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
								.addComponent(lblIs)
								.addComponent(AreaId_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(Cell_Iso_id))
							.addGap(18)
							.addGroup(gl_IsolationCellsByPrisoner.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
								.addComponent(CellIsoId, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
								.addComponent(txtIsOccup, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
								.addComponent(PríonerId, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
						.addGroup(gl_IsolationCellsByPrisoner.createSequentialGroup()
							.addComponent(btnAdd1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
							.addGap(18)))
					.addGap(15))
		);
		gl_IsolationCellsByPrisoner.setVerticalGroup(
			gl_IsolationCellsByPrisoner.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_IsolationCellsByPrisoner.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_IsolationCellsByPrisoner.createParallelGroup(Alignment.LEADING)
						.addComponent(CellIsoId, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(Cell_Iso_id, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_IsolationCellsByPrisoner.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDepcription, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_IsolationCellsByPrisoner.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIs, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtIsOccup, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(19)
					.addGroup(gl_IsolationCellsByPrisoner.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrisonerId, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(PríonerId, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_IsolationCellsByPrisoner.createParallelGroup(Alignment.BASELINE)
						.addComponent(AreaId_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(btnAdd1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		IsolationCellsByPrisoner.setLayout(gl_IsolationCellsByPrisoner);
		
		txtCellId = new JTextField();
		txtCellId.setColumns(10);
		
		Cell_Id = new JLabel("Cell_Id");
		
		txtSize = new JTextField();
		txtSize.setColumns(10);
		
		Status = new JLabel("Status");
		
		CbbStatus = new JComboBox();
		
		Size = new JLabel("Size");
		
		txtCellLocation = new JTextField();
		txtCellLocation.setColumns(10);
		
		CellLocation = new JLabel("Cell Location");
		
		txtareaId = new JTextField();
		txtareaId.setColumns(10);
		
		AreaId = new JLabel("Area Id");
		
		btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddActionPerformed(e);
			}
		});
		GroupLayout gl_CellsByPríoner = new GroupLayout(CellsByPríoner);
		gl_CellsByPríoner.setHorizontalGroup(
			gl_CellsByPríoner.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CellsByPríoner.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_CellsByPríoner.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_CellsByPríoner.createParallelGroup(Alignment.TRAILING)
							.addComponent(Size, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_CellsByPríoner.createParallelGroup(Alignment.LEADING)
								.addComponent(Cell_Id, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addComponent(Status)))
						.addGroup(gl_CellsByPríoner.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(CellLocation))
						.addGroup(gl_CellsByPríoner.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(AreaId, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_CellsByPríoner.createParallelGroup(Alignment.LEADING)
						.addComponent(txtareaId, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
						.addComponent(txtCellLocation, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
						.addComponent(txtSize, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
						.addComponent(CbbStatus, 0, 197, Short.MAX_VALUE)
						.addComponent(txtCellId, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
					.addGap(10))
				.addGroup(Alignment.TRAILING, gl_CellsByPríoner.createSequentialGroup()
					.addContainerGap(167, Short.MAX_VALUE)
					.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
		);
		gl_CellsByPríoner.setVerticalGroup(
			gl_CellsByPríoner.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CellsByPríoner.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_CellsByPríoner.createParallelGroup(Alignment.BASELINE)
						.addComponent(Cell_Id, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCellId, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_CellsByPríoner.createParallelGroup(Alignment.BASELINE)
						.addComponent(Status, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(CbbStatus, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_CellsByPríoner.createParallelGroup(Alignment.BASELINE)
						.addComponent(Size, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSize, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_CellsByPríoner.createParallelGroup(Alignment.BASELINE)
						.addComponent(CellLocation, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCellLocation, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_CellsByPríoner.createParallelGroup(Alignment.LEADING)
						.addComponent(AreaId, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtareaId, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(39))
		);
		CellsByPríoner.setLayout(gl_CellsByPríoner);
		contentPane1.setLayout(gl_contentPane);
	}
	protected void btnAdd1ActionPerformed(ActionEvent e) {
	}
	protected void btnAddActionPerformed(ActionEvent e) {
	}


}
