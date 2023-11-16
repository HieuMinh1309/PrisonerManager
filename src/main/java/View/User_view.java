package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.DefaultRowSorter;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import Valid.Check;
import dao.AreasDAO;
import dao.PrisonersDao;
import dao.WardensDao;
import database.DML;
import entity.Wardens;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.management.StringValueExp;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.JTextArea;

public class User_view extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_North;
	private JLabel lblNewLabel;
	private JPanel panel_West;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JLabel lblManage;
	private JLabel lblReport;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel label;
	private JLabel lblNewLabel_4;
	private JPanel panel_Body;
	private JPanel panel_Warden;
	private JPanel panel_Manage;
	private static int x;
	private static int y;
	private Point mouseDownPont = null;
	private JLabel lblWarden;
	private JPanel panel_Report;
	private JPanel panel_ShowP;
	private JScrollPane scrollPane;
	private JPanel panel_2;
	private JLabel lblImage;
	private JLabel lblNewLabel_5;
	private JLabel lblShowPID;
	private JLabel lblLN;
	private JLabel lblShowLN;
	private JLabel lblFN;
	private JLabel lblShowFN;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel dsd;
	private JLabel lblShowA;
	private JLabel lblShowC;
	private JLabel lblShowF;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblNewLabel_9;
	private JTextField textSN;
	private JLabel lblNewLabel_10;
	private JTextField txtSS;
	private JButton btnShowP;
	private JTable table;
	private JPanel panel_5;
	private JLabel lblId;
	private JLabel lblFirstName1;
	private JLabel lblLastName1;
	private JLabel lblAddress;
	private JLabel lblEmail;
	private JLabel lblPhoneNumber;
	private JLabel lblGender;
	private JLabel lblIsWorking;
	private JLabel lblPosition;
	private JLabel lblDayOff;
	private JLabel lblDob;
	private JLabel lblStartDate;
	private JLabel lbArea;
	private JLabel lblSalary;
	private JLabel ShiftNumber;
	private JTextField txtWardId;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtAddress;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtDayoff;
	private JTextField txtSalary;
	private JTextField txtArea;
	private JTextField txtShift;
	private JTextField txtDob;
	private JTextField txtStartdate;
	private JTextField txtGender;
	private JTextField txtPosition;
	private JTextField txtStatus;
	private JPanel panel_6;
	private JButton btnEmployment;
	private JLabel lblEmployment;
	private JComboBox comboBoxEmployment;
	private JLabel lblPID;
	private JTextField txtPrisonerId;
	private JLabel label_1;
	private JPanel panel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblPicture;
	private JScrollPane scrollPane_1;
	private JButton btnPicture;
	private JTextField textname;
	private JTextField textEmail;
	
	
	private String filename= null;//lưu lại tên file
	private String driBefore= null;//Ddường dẫn trước đó
	private JTextArea textMes;
	private JButton btnSend;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_view frame = new User_view();
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
	public User_view() {
		setTitle("User View");
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setUndecorated(true);
		setBounds(100, 100, 1461, 803);
		contentPane = new JPanel();
		
		addMouseMotionListener((MouseMotionListener) new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				thisMouseDragged(e);
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				thisMousePressed(e);
			}
		});
		
		contentPane.setBackground(new Color(0, 40, 40));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel_North = new JPanel();
		panel_North.setBackground(new Color(0, 40, 40));
		contentPane.add(panel_North, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabelMouseClicked(e);
			}
		});
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel.setBackground(Color.RED);
		GroupLayout gl_panel_North = new GroupLayout(panel_North);
		gl_panel_North.setHorizontalGroup(
			gl_panel_North.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 1468, Short.MAX_VALUE)
				.addGroup(gl_panel_North.createSequentialGroup()
					.addContainerGap(1444, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_North.setVerticalGroup(
			gl_panel_North.createParallelGroup(Alignment.LEADING)
				.addGap(0, 22, Short.MAX_VALUE)
				.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
		);
		panel_North.setLayout(gl_panel_North);
		
		panel_West = new JPanel();
		panel_West.setBackground(new Color(0, 64, 64));
		contentPane.add(panel_West, BorderLayout.WEST);
		panel_West.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 40, 40));
		panel_West.add(panel, BorderLayout.NORTH);
		
		lblNewLabel_1 = new JLabel("Manages Prisons");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		lblNewLabel_1.setBackground(new Color(0, 40, 40));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 292, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 180, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(39)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 40, 40));
		panel_West.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblReport = new JLabel("REPORT");
		lblReport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblMouseClicked(e);
			}
		});
		
		lblWarden = new JLabel("WARDEN");
		lblWarden.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblWardenMouseClicked(e);
			}
		});
		lblWarden.setOpaque(true);
		lblWarden.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarden.setForeground(Color.WHITE);
		lblWarden.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblWarden.setBackground(new Color(0, 64, 64));
		panel_1.add(lblWarden);
		
		lblManage = new JLabel("MANAGE");
		lblManage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblInfoMouseClicked(e);
			}
		});
		lblManage.setOpaque(true);
		lblManage.setHorizontalAlignment(SwingConstants.CENTER);
		lblManage.setForeground(Color.WHITE);
		lblManage.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblManage.setBackground(new Color(0, 64, 64));
		panel_1.add(lblManage);
		lblReport.setOpaque(true);
		lblReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblReport.setForeground(Color.WHITE);
		lblReport.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblReport.setBackground(new Color(0, 64, 64));
		panel_1.add(lblReport);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(new Color(0, 40, 40));
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(0, 40, 40));
		panel_1.add(lblNewLabel_3);
		
		label = new JLabel("");
		label.setOpaque(true);
		label.setBackground(new Color(0, 40, 40));
		panel_1.add(label);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(0, 40, 40));
		panel_1.add(lblNewLabel_4);
		
		panel_Body = new JPanel();
		panel_Body.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_Body.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_Body, BorderLayout.CENTER);
		panel_Body.setLayout(new CardLayout(0, 0));
		
		panel_Warden = new JPanel();
		panel_Warden.setBackground(new Color(0, 40, 40));
		panel_Body.add(panel_Warden, "name_120526373177400");
		
		panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBackground(new Color(64, 128, 128));
		
		lblId = new JLabel("Warden Id");
		lblId.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(Color.WHITE);
		
		lblFirstName1 = new JLabel("First Name");
		lblFirstName1.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblFirstName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName1.setForeground(Color.WHITE);
		
		lblLastName1 = new JLabel("Last Name");
		lblLastName1.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblLastName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName1.setForeground(Color.WHITE);
		
		lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(Color.WHITE);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.WHITE);
		
		lblPhoneNumber = new JLabel("Phone");
		lblPhoneNumber.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNumber.setForeground(Color.WHITE);
		
		lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblGender.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGender.setForeground(Color.WHITE);
		
		lblIsWorking = new JLabel("Status");
		lblIsWorking.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblIsWorking.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIsWorking.setForeground(Color.WHITE);
		
		lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblPosition.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPosition.setForeground(Color.WHITE);
		
		lblDayOff = new JLabel("Day OFF");
		lblDayOff.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblDayOff.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDayOff.setForeground(Color.WHITE);
		
		lblDob = new JLabel("Birth Day");
		lblDob.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setForeground(Color.WHITE);
		
		lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblStartDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblStartDate.setForeground(Color.WHITE);
		
		lbArea = new JLabel("Area");
		lbArea.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lbArea.setHorizontalAlignment(SwingConstants.CENTER);
		lbArea.setForeground(Color.WHITE);
		
		lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("Calisto MT", Font.BOLD, 20));
		lblSalary.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalary.setForeground(Color.WHITE);
		
		ShiftNumber = new JLabel("Shift");
		ShiftNumber.setFont(new Font("Calisto MT", Font.BOLD, 20));
		ShiftNumber.setHorizontalAlignment(SwingConstants.CENTER);
		ShiftNumber.setForeground(Color.WHITE);
		
		txtWardId = new JTextField();
		txtWardId.setEditable(false);
		txtWardId.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setEditable(false);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setEditable(false);
		txtLastName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setEditable(false);
		txtAddress.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setEditable(false);
		txtPhone.setColumns(10);
		
		txtDayoff = new JTextField();
		txtDayoff.setEditable(false);
		txtDayoff.setColumns(10);
		
		txtSalary = new JTextField();
		txtSalary.setEditable(false);
		txtSalary.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setEditable(false);
		txtArea.setColumns(10);
		
		txtShift = new JTextField();
		txtShift.setEditable(false);
		txtShift.setColumns(10);
		
		txtDob = new JTextField();
		txtDob.setEditable(false);
		txtDob.setColumns(10);
		
		txtStartdate = new JTextField();
		txtStartdate.setEditable(false);
		txtStartdate.setColumns(10);
		
		txtGender = new JTextField();
		txtGender.setEditable(false);
		txtGender.setColumns(10);
		
		txtPosition = new JTextField();
		txtPosition.setEditable(false);
		txtPosition.setColumns(10);
		
		txtStatus = new JTextField();
		txtStatus.setEditable(false);
		txtStatus.setColumns(10);
		
		try {
			WardensDao.selectTableWardens().forEach(w->{
				if(Wardens.wardenId==w.getWardenId()) {
					txtWardId.setText(String.valueOf(w.getWardenId()));
					txtFirstName.setText(w.getFirstName());
					txtLastName.setText(w.getLastName());
					txtAddress.setText(w.getAddress());
					txtEmail.setText(w.getEmail());
					txtPhone.setText(w.getPhoneNumber());
					txtGender.setText(w.getIsMale());
					txtPosition.setText(w.getPosition());
					txtStatus.setText(String.valueOf(w.getIs_Working()));
					txtDayoff.setText(String.valueOf(w.getDay_off()));
					txtSalary.setText(String.valueOf(w.getSalary()));
					txtDob.setText(String.valueOf(w.getDateOfBirth()));
					txtStartdate.setText(String.valueOf(w.getStartDate()));
					txtArea.setText(w.getAreaName());
					txtShift.setText(String.valueOf(w.getShiftType()));
				}
			});
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addGap(13)
									.addComponent(lblLastName1))
								.addComponent(lblFirstName1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblId, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addGap(21)
									.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
										.addComponent(txtWardId, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_5.createSequentialGroup()
									.addGap(18)
									.addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPhoneNumber, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPosition, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtGender, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPosition, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblStartDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblDob, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblSalary, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
							.addGap(6)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addComponent(txtSalary, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDob, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtStartdate, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addComponent(txtAddress, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEmail, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
							.addGap(14)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblIsWorking)
								.addComponent(lblDayOff, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtStatus, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDayoff, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
							.addGap(4)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(lbArea, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
									.addGap(6)
									.addComponent(txtArea, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_5.createSequentialGroup()
									.addComponent(ShiftNumber, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
									.addGap(6)
									.addComponent(txtShift, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
							.addGap(26))))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtWardId, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSalary, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPhoneNumber, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSalary, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirstName1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDob, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtGender, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDob, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastName1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtStartdate, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPosition, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPosition, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStartDate, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtArea, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbArea, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtStatus, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIsWorking, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
						.addComponent(ShiftNumber, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtShift, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDayoff, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDayOff, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(74))
		);
		gl_panel_5.linkSize(SwingConstants.HORIZONTAL, new Component[] {txtPhone, txtDayoff, txtGender, txtPosition, txtStatus});
		gl_panel_5.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblPhoneNumber, lblGender, lblIsWorking, lblPosition, lblDayOff});
		panel_5.setLayout(gl_panel_5);
		GroupLayout gl_panel_Warden = new GroupLayout(panel_Warden);
		gl_panel_Warden.setHorizontalGroup(
			gl_panel_Warden.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_Warden.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 1127, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		gl_panel_Warden.setVerticalGroup(
			gl_panel_Warden.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Warden.createSequentialGroup()
					.addGap(135)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(217, Short.MAX_VALUE))
		);
		panel_Warden.setLayout(gl_panel_Warden);
		
		panel_Manage = new JPanel();
		panel_Manage.setBackground(new Color(0, 40, 40));
		panel_Body.add(panel_Manage, "name_120529549621900");
		
		panel_ShowP = new JPanel();
		panel_ShowP.setEnabled(false);
		panel_ShowP.setBorder(null);
		panel_ShowP.setBackground(new Color(0, 40, 40));
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		
		panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(null, "Prioner", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_2.setBackground(new Color(0, 40, 40));
		
		lblImage = new JLabel("");
		lblImage.setBackground(Color.BLACK);
		
		lblNewLabel_5 = new JLabel("Prisoner ID");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBackground(new Color(97, 158, 123));
		
		lblShowPID = new JLabel("");
		lblShowPID.setOpaque(true);
		lblShowPID.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPID.setForeground(Color.WHITE);
		lblShowPID.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowPID.setBackground(new Color(97, 158, 123));
		
		lblLN = new JLabel("Last Name");
		lblLN.setOpaque(true);
		lblLN.setHorizontalAlignment(SwingConstants.CENTER);
		lblLN.setForeground(Color.WHITE);
		lblLN.setBackground(new Color(97, 158, 123));
		
		lblShowLN = new JLabel("");
		lblShowLN.setOpaque(true);
		lblShowLN.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowLN.setForeground(Color.WHITE);
		lblShowLN.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowLN.setBackground(new Color(97, 158, 123));
		
		lblFN = new JLabel("First Name");
		lblFN.setOpaque(true);
		lblFN.setHorizontalAlignment(SwingConstants.CENTER);
		lblFN.setForeground(Color.WHITE);
		lblFN.setBackground(new Color(0, 128, 64));
		
		lblShowFN = new JLabel("");
		lblShowFN.setOpaque(true);
		lblShowFN.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowFN.setForeground(Color.WHITE);
		lblShowFN.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowFN.setBackground(new Color(0, 128, 64));
		
		lblNewLabel_6 = new JLabel("Area");
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBackground(new Color(97, 158, 123));
		
		lblNewLabel_7 = new JLabel("Cell");
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBackground(new Color(0, 128, 64));
		
		dsd = new JLabel("Floor");
		dsd.setOpaque(true);
		dsd.setHorizontalAlignment(SwingConstants.CENTER);
		dsd.setForeground(Color.WHITE);
		dsd.setBackground(new Color(97, 158, 123));
		
		lblShowA = new JLabel("");
		lblShowA.setOpaque(true);
		lblShowA.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowA.setForeground(Color.WHITE);
		lblShowA.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowA.setBackground(new Color(97, 158, 123));
		
		lblShowC = new JLabel("");
		lblShowC.setOpaque(true);
		lblShowC.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowC.setForeground(Color.WHITE);
		lblShowC.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowC.setBackground(new Color(0, 128, 64));
		
		lblShowF = new JLabel("");
		lblShowF.setOpaque(true);
		lblShowF.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowF.setForeground(Color.WHITE);
		lblShowF.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowF.setBackground(new Color(97, 158, 123));
		
		panel_3 = new JPanel();
		panel_3.setLayout(new CardLayout(0, 0));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowPID, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblLN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowLN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblFN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowFN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(dsd, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblShowA, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
						.addComponent(lblShowC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblShowF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel_2.createSequentialGroup()
											.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
												.addComponent(lblShowPID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblShowFN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblFN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_panel_2.createSequentialGroup()
											.addComponent(lblShowA, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblShowC, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblLN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblShowLN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(dsd, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblShowF, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "SEARCH", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_4.setBackground(new Color(0, 40, 40));
		
		lblNewLabel_9 = new JLabel("CELL NUMBER");
		lblNewLabel_9.setForeground(Color.WHITE);
		
		textSN = new JTextField();
		textSN.setColumns(10);
		
		lblNewLabel_10 = new JLabel("SEARCH");
		lblNewLabel_10.setForeground(Color.WHITE);
		
		txtSS = new JTextField();
		txtSS.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textSN, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSS, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(85, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(textSN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_10)
						.addComponent(txtSS, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		btnShowP = new JButton("Show");
		btnShowP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowPActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowP.setForeground(Color.WHITE);
		btnShowP.setBackground(Color.BLACK);
		
		panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Change Cell", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_6.setBackground(new Color(0, 40, 40));
		
		btnEmployment = new JButton("Applied");
		btnEmployment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEmploymentActionPerformed(e);
			}
		});
		btnEmployment.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnEmployment.setForeground(Color.WHITE);
		btnEmployment.setBackground(Color.RED);
		
		lblEmployment = new JLabel("Employment");
		lblEmployment.setOpaque(true);
		lblEmployment.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployment.setForeground(Color.WHITE);
		lblEmployment.setFont(new Font("Arial", Font.PLAIN, 15));
		lblEmployment.setBackground(new Color(0, 128, 64));
		
		comboBoxEmployment = new JComboBox();
		try {
			DML.selectTablePrionersEmployment().forEach(p->{
				if(Wardens.wardenId==p.getWardid()) {
					//comboBoxEmployment.addItem(p.getEmployment_name());
				}
			});
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		lblPID = new JLabel("Prioner ID");
		lblPID.setOpaque(true);
		lblPID.setHorizontalAlignment(SwingConstants.CENTER);
		lblPID.setForeground(Color.WHITE);
		lblPID.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPID.setBackground(new Color(0, 128, 64));
		
		txtPrisonerId = new JTextField();
		txtPrisonerId.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrisonerId.setForeground(Color.RED);
		txtPrisonerId.setEditable(false);
		txtPrisonerId.setColumns(10);
		
		label_1 = new JLabel("New label");
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addComponent(btnEmployment, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_6.createSequentialGroup()
									.addComponent(lblEmployment, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxEmployment, 0, 202, Short.MAX_VALUE))
								.addGroup(gl_panel_6.createSequentialGroup()
									.addComponent(lblPID, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtPrisonerId, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addGap(6))))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtPrisonerId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING, false)
						.addComponent(comboBoxEmployment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmployment, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnEmployment, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
					.addGap(3))
		);
		panel_6.setLayout(gl_panel_6);
		GroupLayout gl_panel_ShowP = new GroupLayout(panel_ShowP);
		gl_panel_ShowP.setHorizontalGroup(
			gl_panel_ShowP.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addGap(60)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addContainerGap(240, Short.MAX_VALUE)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnShowP, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGap(222))
				.addGroup(Alignment.LEADING, gl_panel_ShowP.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 1087, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_panel_ShowP.setVerticalGroup(
			gl_panel_ShowP.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addGap(19)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_ShowP.createSequentialGroup()
							.addGap(18)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_ShowP.createSequentialGroup()
							.addGap(28)
							.addComponent(btnShowP, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
					.addGap(65)
					.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_6, 0, 0, Short.MAX_VALUE))
					.addGap(82))
		);
		
		table = new JTable();
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(0, 64, 64));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					tableMouseClicked(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "First Name", "Last Name", "     Dob", "Nationality", "Gender", "dateOfEntry", "releaseDate", "Conviction", "Punishment", "  Religion"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(10);
		table.getColumnModel().getColumn(1).setPreferredWidth(40);
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(3).setPreferredWidth(40);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(20);
		table.getColumnModel().getColumn(6).setPreferredWidth(50);
		table.getColumnModel().getColumn(7).setPreferredWidth(50);
		table.getColumnModel().getColumn(8).setPreferredWidth(86);
		table.getColumnModel().getColumn(9).setPreferredWidth(86);
		table.getColumnModel().getColumn(10).setPreferredWidth(50);
		scrollPane.setViewportView(table);
		panel_ShowP.setLayout(gl_panel_ShowP);
		GroupLayout gl_panel_Manage = new GroupLayout(panel_Manage);
		gl_panel_Manage.setHorizontalGroup(
			gl_panel_Manage.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Manage.createSequentialGroup()
					.addGap(14)
					.addComponent(panel_ShowP, GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_Manage.setVerticalGroup(
			gl_panel_Manage.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Manage.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_ShowP, GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE))
		);
		panel_Manage.setLayout(gl_panel_Manage);
		
		panel_Report = new JPanel();
		panel_Report.setBackground(new Color(0, 40, 40));
		panel_Body.add(panel_Report, "name_25151380307500");
		
		panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(null, "Send Maill", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_7.setBackground(new Color(64, 128, 128));
		
		lblNewLabel_8 = new JLabel("User Name:");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Calisto MT", Font.BOLD, 13));
		
		lblNewLabel_11 = new JLabel("Email:");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Calisto MT", Font.BOLD, 13));
		
		lblNewLabel_12 = new JLabel("Image:");
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setFont(new Font("Calisto MT", Font.BOLD, 13));
		
		lblNewLabel_13 = new JLabel("Message:");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Calisto MT", Font.BOLD, 13));
		
		lblPicture = new JLabel("");
		lblPicture.setOpaque(true);
		lblPicture.setBackground(Color.WHITE);
		
		scrollPane_1 = new JScrollPane();
		
		btnPicture = new JButton("Choose Image");
		btnPicture.setBackground(new Color(0, 0, 0));
		btnPicture.setForeground(new Color(255, 255, 255));
		btnPicture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPictureActionPerformed(e);
			}
		});
		
		textname = new JTextField();
		textname.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		
		btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSendActionPerformed(e);
			}
		});
		btnSend.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnSend.setForeground(Color.WHITE);
		btnSend.setBackground(new Color(0, 0, 0));
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel_7.createSequentialGroup()
								.addGap(3)
								.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_12)
							.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
								.addGroup(gl_panel_7.createSequentialGroup()
									.addComponent(lblPicture, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
									.addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnPicture)))
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(textname, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
								.addComponent(textEmail, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))))
					.addGap(79))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(66)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(textname, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_12)
							.addComponent(lblPicture, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnSend, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnPicture, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
		);
		
		textMes = new JTextArea();
		scrollPane_1.setViewportView(textMes);
		panel_7.setLayout(gl_panel_7);
		GroupLayout gl_panel_Report = new GroupLayout(panel_Report);
		gl_panel_Report.setHorizontalGroup(
			gl_panel_Report.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_Report.createSequentialGroup()
					.addContainerGap(240, Short.MAX_VALUE)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(236))
		);
		gl_panel_Report.setVerticalGroup(
			gl_panel_Report.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Report.createSequentialGroup()
					.addGap(52)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(111, Short.MAX_VALUE))
		);
		panel_Report.setLayout(gl_panel_Report);
	}

	protected void thisMousePressed(MouseEvent e) {
		mouseDownPont = e.getPoint();
	}
	protected void thisMouseDragged(MouseEvent e) {
		Point cur = e.getLocationOnScreen();
		this.setLocation(cur.x - mouseDownPont.x , cur.y - mouseDownPont.y);
		
	}
	protected void lblNewLabelMouseClicked(MouseEvent e) {
		this.dispose();
	}
	protected void lblInfoMouseClicked(MouseEvent e) {
		lblManage.setBackground(new Color(64,128,128));
		lblWarden.setBackground(new Color(0,64,64));
		lblReport.setBackground(new Color(0,64,64));
		panel_Warden.show(false);
		panel_Report.show(false);
		panel_Manage.show(true);
	}
	protected void lblMouseClicked(MouseEvent e) {
		lblManage.setBackground(new Color(0,64,64));
		lblReport.setBackground(new Color(64,128,128));
		lblWarden.setBackground(new Color(0,64,64));
		panel_Manage.show(false);
		panel_Report.show(true);
		panel_Warden.show(false);
	}
	
	protected void lblWardenMouseClicked(MouseEvent e) {
		lblManage.setBackground(new Color(0,64,64));
		lblReport.setBackground(new Color(0,64,64));
		lblWarden.setBackground(new Color(64,128,128));
		panel_Manage.show(false);
		panel_Warden.show(true);
		panel_Report.show(false);
	}
	protected void btnShowPActionPerformed(ActionEvent e) throws SQLException {
		SetColumnWidths();
		ShowP();
	}
	
	public void ShowP() throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("First Name");
		model.addColumn("Last Name");
		model.addColumn("dateOfBirth");
		model.addColumn("nationality");
		model.addColumn("isMale");
		model.addColumn("dateOfEntry");
		model.addColumn("releaseDate");
		model.addColumn("conviction");
		model.addColumn("punishment");
		model.addColumn("religion");
		String b=textSN.getText();
		
		if(Check.checkNull(b)==true) {
			PrisonersDao.selectTablePrionersForUser().forEach(p->{
				if(Wardens.wardenId==p.getWardid()) {
					model.addRow(new Object[] {p.getId(), p.getFirstName(), p.getLastName(), p.getDateOfBirth(), p.getNationality(), p.getIsMale(), p.getDateOfEntry(), p.getReleaseDate(), p.getConviction(), p.getPunishment(), p.getReligion()});
				}
			});
			}else {
				PrisonersDao.selectTablePrionersForUser().forEach(p->{
					if(Wardens.wardenId==p.getWardid()) {
						if(p.getCellNumber()==Integer.parseInt(b)) {
							model.addRow(new Object[] {p.getId(),p.getFirstName(),p.getLastName(),p.getDateOfBirth(),p.getNationality(),p.getIsMale(),p.getDateOfEntry(),p.getReleaseDate(),p.getConviction(),p.getPunishment(),p.getReligion()});	
						}
					}
				});
			}
		
		
		table.setModel(model);
		String find=txtSS.getText();
		try {
			DefaultRowSorter<?,?> soter= (DefaultRowSorter<?, ?>) table.getRowSorter();
			soter.setRowFilter(RowFilter.regexFilter(find));
			soter.setSortKeys(null);
		} catch (Exception e) {
			
		}
	}
	
	private void SetColumnWidths() {
		table.getColumnModel().getColumn(0).setPreferredWidth(10);
		table.getColumnModel().getColumn(1).setPreferredWidth(40);
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(3).setPreferredWidth(40);
		table.getColumnModel().getColumn(4).setPreferredWidth(50);
		table.getColumnModel().getColumn(5).setPreferredWidth(20);
		table.getColumnModel().getColumn(6).setPreferredWidth(50);
		table.getColumnModel().getColumn(7).setPreferredWidth(50);
		table.getColumnModel().getColumn(8).setPreferredWidth(86);
		table.getColumnModel().getColumn(9).setPreferredWidth(86);
		table.getColumnModel().getColumn(10).setPreferredWidth(50);
	}
	
	protected void tableMouseClicked(MouseEvent e) throws SQLException {
		int a=table.getSelectedRow();
		int P=(int) table.getValueAt((int) a, 0);
	

		PrisonersDao.selectTablePrioners1().forEach(p->{
			if(P==p.getId()){
				txtPrisonerId.setText(String.valueOf(p.getId()));
				lblShowPID.setText(String.valueOf(p.getId()));			
				lblShowLN.setText(p.getLastName());
				lblShowFN.setText(p.getFirstName());
				lblShowF.setText(String.valueOf(p.getFloor_N()));
				lblShowC.setText(String.valueOf(p.getCellNumber()));
				lblShowA.setText(p.getAreaName().toString());
				
				
				lblImage.setIcon(
						new ImageIcon(
								new ImageIcon(
									p.getImage()
								)
								.getImage()
								.getScaledInstance(112, 138, Image.SCALE_SMOOTH)));
			}
		});
	}
	protected void btnEmploymentActionPerformed(ActionEvent e) {
		int Id= Integer.parseInt(txtPrisonerId.getText());
		String employment= (String)comboBoxEmployment.getSelectedItem();
		
		try {
			DML.UpdateEmployer(employment, Id);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	protected void btnPictureActionPerformed(ActionEvent e) {
		var chooser = new JFileChooser("D:\\ImgPrísoner");
		chooser.setDialogTitle("open image");
		chooser.setFileFilter(
				new FileNameExtensionFilter("image (jpg,png,gif,jpeg,tiff,psd,pdf,eps)","jpg","png","gif","jpeg","tiff","psd","pdf","eps")
				);
		chooser.setAcceptAllFileFilterUsed(false);
		var result = chooser.showOpenDialog(null);
		if(result == chooser.APPROVE_OPTION) {
			File f = chooser.getSelectedFile();
			filename = f.getName();
			driBefore = f.getAbsolutePath();
			
			lblPicture.setIcon(
					new ImageIcon(
						new ImageIcon(
								f.getAbsolutePath()
								
									)
						.getImage()
						.getScaledInstance(159, 89, Image.SCALE_SMOOTH)
							)
					);
		}
	}
	// Validate Email
	public static boolean ValidEmail(String email) {
	    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
	    return email.matches(regex);
	}
	
	protected void btnSendActionPerformed(ActionEvent e) {
		final String FromEmail = "nguyendotrong20003@gmail.com";
		final String password = "apes tjbw jukh pepk";
		
		var prop = new Properties();
		
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
		
		Session sess = Session.getInstance(prop, new javax.mail.Authenticator() {
		    protected PasswordAuthentication getPasswordAuthentication() {
		        return new PasswordAuthentication(FromEmail, password);
		    }
		});

		try {
		    var mess = new MimeMessage(sess);
		    mess.setFrom(new InternetAddress(FromEmail));
//		     Kiểm tra xem địa chỉ email có hợp lệ kh
		    if (ValidEmail(textEmail.getText())) {
		        mess.setRecipients(Message.RecipientType.TO, InternetAddress.parse(textEmail.getText()));
//		        bắt buột phải nhập tên
		        if (textname.getText() != null && !textname.getText().isEmpty()) {
		            mess.setSubject("Dear: " + textname.getText());
		
//		             Tạo MimeMultipart để chứa cả nội dung văn bản và imgae
		            MimeMultipart multipart = new MimeMultipart();
		
//		             thêm văn bản
		            MimeBodyPart message = new MimeBodyPart();
		            String messContent = textMes.getText();
		            message.setText(messContent);
		            multipart.addBodyPart(message);
		
//		             thêm picturre
		            if (driBefore != null && !driBefore.isEmpty()) {
		                MimeBodyPart image = new MimeBodyPart();
		                FileDataSource source = new FileDataSource(driBefore);
		                image.setDataHandler(new DataHandler(source));
		                image.setFileName(filename);
		                multipart.addBodyPart(image);
		            }
		
		            mess.setContent(multipart);
		
		            Transport.send(mess);
		            JOptionPane.showMessageDialog(null, "Send Success");
		        } else {
		            JOptionPane.showMessageDialog(null, "Name is required");
		        }
		    } else {
		        JOptionPane.showMessageDialog(null, "Invalid Email Address");
		    }
		} catch (Exception e2) {
		    JOptionPane.showMessageDialog(this, e2);
		}
	}
}


