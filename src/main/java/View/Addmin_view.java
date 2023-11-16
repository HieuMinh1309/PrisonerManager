package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultRowSorter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.AncestorListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import Valid.Check;
import dao.AdminDao;
import dao.AreasDAO;
import dao.CellDao;
import dao.HealthDao;
import dao.PrisonersDao;
import dao.RelaveDao;
import dao.WardensDao;
import database.DML;
import entity.Account;
import entity.Admin;
import entity.All1;
import entity.Areas;
import entity.CellsByPrisoner;
import entity.HealthByPrisoner;
import entity.P_C_A;
import entity.Prisoners;
import entity.RelativesByPrisoner;
import entity.Wardens;
import entity.WorkShiftsByWarden;
import until.MaHoa;

import javax.swing.event.AncestorEvent;
import java.awt.CardLayout;
import javax.swing.border.TitledBorder;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.RowFilter;

import java.awt.GridLayout;
import javax.swing.border.MatteBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JScrollBar;

public class Addmin_view extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_Body;
	private JPanel panel_prisoners;
	private JPanel panel_areas;
	private JPanel panel_account;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel CreateAcc;
	private JLabel lblNewLabel;
	private JTextField txtUser;
	private JLabel lblPassword;
	private JTextField txtPass;
	private JLabel lblWad;
	private JTextField txtWardens;
	private JButton btnAddAccount;
	private JButton btnShowAccount;
	private JScrollPane scrollPane;
	private JButton btnShowmore;
	private JTextField textField_3;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane_1;
	private JButton btnAction;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JScrollPane scrollPane_2;
	private JPanel panel_showMoreLess;
	private JPanel panel_showWardenHight;
	private JPanel panel_showMore;
	private JPanel panel_showLess;
	private JTable table_showless;
	private JScrollPane scrollPane_3;
	private JButton ShowLess;
	private JTable table_showmore;
	private int count;
	private JTable table_showAccount;
	private JButton btnShowWardensHight;
	
	private Boolean check;
	private JTable table_showWardensHight;
	private JPanel panel_PNorth;
	private JPanel panel_PCenter;
	private JLabel lblShowP;
	private JLabel lblAddP;
	private JPanel panel_ShowP;
	private JPanel panel_Add;
	private JScrollPane scrollPane_4;
	private JButton btnShowP;
	private JPanel panel_3;
	private JLabel lblNewLabel_12;
	private JLabel lblShowLN;
	private JLabel lblShowPID;
	private JLabel lblLN;
	private JTable table_showP;
	private JPanel panel_4;
	private JLabel lblGender;
	private JLabel lblShowGender;
	private JLabel lblImage;
	private JLabel lblH;
	private JLabel lblR;
	private JPanel north;
	private JPanel center;
	private JLabel lblIn4;
	private JLabel lblHE;
	private JPanel panel_addP;
	private JPanel panel_addH;
	private JPanel panel_9;
	private JPanel panel_5;
	private JLabel lblPrisonerID;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel nationality;
	private JTextField txtPId;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtN;
	private JLabel lblCellId;
	private JLabel lblConviction_1;
	private JLabel lblPunishment_1;
	private JLabel lblReligion_1;
	private JTextField txtCell;
	private JTextField txtC;
	private JTextField txtP;
	private JTextField txtR;
	private JLabel lblPrisonerID_8;
	private JLabel lblPrisonerID_9;
	private JLabel lblPrisonerID_10;
	private JDateChooser dob;
	private JDateChooser doe;
	private JDateChooser rd;
	private JButton btnAddP;
	private JLabel lblGender1;
	private JRadioButton male;
	private JRadioButton Female;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnPrevious;
	private JTextField textField;
	private JButton btnNext;
	private JPanel panel_10;
	private JTextField textSN;
	private JLabel lblNewLabel_4;
	private JTextField txtSS;
	private JLabel lblNewLabel_7;
	private JTextField textField_5;
	private JLabel lblNewLabel_8;
	private JPanel panel;
	private JLabel lblFN;
	private JLabel lblShowFN;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel dsd;
	private JLabel lblNewLabel_13;
	private JLabel lblShowA;
	private JLabel lblShowC;
	private JLabel lblShowF;
	private JLabel lblShowPID_4;
	private JPanel panel_ShowH;
	private JPanel panel_ShowR;
	private JPanel panel_North;
	private JLabel lblNewLabel_20;
	private JPanel panel_West;
	private static int x;
	private static int y;
	private Point mouseDownPont = null;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_11;
	private JLabel lblNewLabel_1;
	private JPanel panel_13;
	private JLabel lblNewLabel_5;
	private JLabel label;
	private JLabel lblP;
	private JLabel lblW;
	private JLabel lblA;
	private JLabel lblN1;
	private JLabel lblNewLabel_16;
	private JLabel lblEmploy;
	private JLabel lblAc;
	private JButton btnDelete1;
	private JButton btnChange;
	private JPanel panel_12;
	private JComboBox comboBox;
	private JLabel label_1;
	private JLabel lblPID;
	private JLabel lblAreas;
	private JLabel lblCellNumber;
	private JTextField txtChangeID;
	private JComboBox comboBoxChange;
	private JTextField txtCellChange;
	private JButton btnChange_1;
	private JLabel lblCellId_1;
	private JComboBox comboBox_1;
	private JSeparator separator;
	private JPanel panel_14;
	private JLabel lblPrisonerID_1;
	private JTextField txtShowUpdateID;
	private JLabel lblFirstName_1;
	private JTextField txtShowUpdateFN;
	private JLabel lblLastName_1;
	private JTextField txtShowUpdateLN;
	private JLabel nationality_1;
	private JTextField txtShowUpdateN;
	private JLabel lblaaaa;
	private JTextField txtShowUpdateC;
	private JLabel lblPunishment;
	private JTextField txtShowUpdateP;
	private JLabel lblReligion;
	private JTextField txtShowUpdateR;
	private JLabel lblGender1_1;
	private JRadioButton male_1;
	private JRadioButton Female_1;
	private JLabel lblPrisonerID_2;
	private JDateChooser ShowUpdateRD;
	private JLabel lblPrisonerID_3;
	private JDateChooser ShowUpdateDOE;
	private JLabel lblPrisonerID_4;
	private JDateChooser ShowUpdateDOB;
	private JButton UpdateP;
	private JLabel lblImageUp;
	private JButton btnShow;
	int cellID=0;
	int arID=0;
	int cellIDChange;
	
	private int areaid=0;
	private int cell_idUpdate =0;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JButton btnCancel;
	private JPanel panel_6;
	private JPanel panel_15;
	private JLabel lblNewLabel_6;
	private JTextField AHID;
	private JLabel lblNewLabel_11;
	private JTextField AHMH;
	private JTextField AHCC;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JScrollPane scrollPane_5;
	private JTable table_showH;
	private JPanel panel_16;
	private JLabel lblNewLabel_21;
	private JTextField txtSearchHId;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel_22;
	private JTextField txtSearchHCell;
	private JButton btnShowH;
	private JPanel panel_18;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JButton btnUpdate_1;
	private JButton btnDelete_1;
	private JPanel panelPH;
	private JLabel lblNewLabel_26;
	private JTextField txtSearchH;
	private JLabel HI;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JLabel lblNewLabel_31;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_33;
	private JLabel lblNewLabel_34;
	private JLabel lblNewLabel_35;
	private JLabel HID;
	private JLabel HFN;
	private JLabel HLN;
	private JLabel HGENDER;
	private JLabel HA;
	private JLabel HC;
	private JLabel HF;
	private JPanel panel_17;
	private JPanel panel_20;
	private JScrollPane scrollPane_6;
	private JPanel panel_21;
	private JButton btnShowR;
	private JPanel panel_22;
	private JTable table_showR;
	private JLabel lblSR;
	private JLabel lblSRP;
	private JLabel lblNewLabel_36;
	private JLabel lblNewLabel_37;
	private JLabel lblNewLabel_39;
	private JLabel lblNewLabel_40;
	private JLabel lblNewLabel_41;
	private JLabel RID;
	private JLabel RLN;
	private JLabel RA;
	private JLabel RC;
	private JLabel RF;
	private JButton btnDeleteH;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_38;
	private JLabel lblNewLabel_43;
	private JTextField CellR;
	private JTextField IDR;
	private JTextField SearchR;
	private JLabel lblNewLabel_42;
	private JButton btnAddH;
	private JTextField AHA;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_44;
	private JLabel lblNewLabel_45;
	private JLabel lblNewLabel_46;
	private JTextField RPID;
	private JTextField RPN;
	private JTextField RPC;
	private JTextField RPR;
	private JTextField RPCCCD;
	private JButton btnAddH_1;
	private JPanel panel_19;
	private JTextField UHA;
	private JButton btnUpdate_2;
	private JLabel lblNewLabel_47;
	private JLabel lblNewLabel_48;
	private JLabel lblNewLabel_49;
	private JLabel lblNewLabel_50;
	private JTextField UHID;
	private JTextField UHMH;
	private JTextField UHCC;
	private JButton btnShowUH;
	private JButton btnCancelUH;
	private JPanel panel_23;
	private JPanel panel_24;
	private JPanel panel_25;
	private JLabel lblNewLabel_51;
	private JLabel lblNewLabel_52;
	private JLabel lblNewLabel_53;
	private JLabel lblNewLabel_54;
	private JLabel lblNewLabel_55;
	private JLabel lblNewLabel_56;
	private JLabel lblNewLabel_57;
	private JLabel lblNewLabel_58;
	private JLabel lblNewLabel_59;
	private JLabel lblNewLabel_60;
	private JLabel lblNewLabel_61;
	private JLabel lblNewLabel_62;
	private JLabel lblNewLabel_63;
	private JLabel lblNewLabel_64;
	private JPanel panel_26;
	private JLabel lblNewLabel_65;
	private JTextField URID;
	private JLabel lblNewLabel_66;
	private JTextField URN;
	private JLabel lblNewLabel_67;
	private JTextField URC;
	private JLabel lblNewLabel_68;
	private JTextField URR;
	private JLabel lblNewLabel_69;
	private JTextField URCC;
	private JButton btnAddH_4;
	private JButton btnAddH_5;
	private JButton btnAddH_6;
	private JPanel panel_27;
	private JScrollPane scrollPane_7;
	private JButton btnShowA;
	private JTable table_showA;
	private JPanel panel_28;
	private JScrollPane scrollPane_8;
	private JTable table_showC;
	private JButton btnShowC;
	private JComboBox comboBox_4;
	private JLabel lblNewLabel_70;
	private JLabel NOPIC;
	private int count1=0;
	private JSeparator separator_1;
	private JPanel panel_29;
	private JLabel lblNewLabel_71;
	private JLabel lblNewLabel_72;
	private JLabel lblNewLabel_73;
	private JTextField AADDAN;
	private JTextField AADDD;
	private JTextField AADDL;
	private JButton btnADDA;
	private JButton btnDeleteA;
	private JSeparator separator_2;
	private JLabel lblNewLabel_74;
	private JLabel lblNewLabel_75;
	private JLabel lblNewLabel_76;
	private JLabel lblNewLabel_77;
	private JTextField AUAID;
	private JTextField AUAN;
	private JTextField AUD;
	private JTextField AUL;
	private JButton btnShowAU;
	private JButton btnCencelA;
	private JButton btnUA;
	private JPanel panel_30;
	private JPanel panel_31;
	private JButton btnC;
	private JButton btnUA_2;
	private JPanel panel_UC;
	private JPanel panel_AC;
	private JPanel panel_USC;
	private JPanel panel_ASC;
	private JLabel lblNewLabel_78;
	private JLabel lblNewLabel_79;
	private JLabel lblNewLabel_80;
	private JLabel lblNewLabel_81;
	private JLabel lblNewLabel_82;
	private JTextField txtCellNBadd;
	private JTextField txtSizeadd;
	private JTextField txtFlooradd;
	private JButton btnADDC;
	private JButton btnUpdateCell;
	private JLabel lblNewLabel_83;
	private JLabel lblNewLabel_84;
	private JLabel lblNewLabel_85;
	private JLabel lblNewLabel_86;
	private JLabel lblNewLabel_87;
	private JLabel lblNewLabel_88;
	private JTextField txtCellId;
	private JTextField txtCellNumber;
	private JTextField txtSize;
	private JTextField txtFloor;
	private JButton btnADDA_1;
	private JButton btnUpdate_3;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JButton btnDeleteA_1;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private boolean is=false;
    private int checkCe=0;
    private JButton btnSUC;
    private JButton btnCencelA_1;
    private JPanel panel_wardens;
    private JPanel panel_32;
    private JPanel panel_bodyW;
    private JLabel lblWS;
    private JLabel lblWA;
    private JPanel panel_addW;
    private JPanel panel_showW;
    private JScrollPane scrollPane_9;
    private JPanel panel_34;
    private JComboBox comboBox_9;
    private JComboBox comboBoxDN;
    private JLabel lblNewLabel_91;
    private JTextField txtSearchW;
    private JPanel panel_35;
    private JLabel lblNewLabel_92;
    private JLabel lbshowWid;
    private JLabel lblFN_1;
    private JLabel lbShowWfn;
    private JLabel lblLN_1;
    private JLabel lbShowWln;
    private JLabel lblNewLabel_93;
    private JLabel lblNewLabel_94;
    private JLabel lblShowWarea;
    private JLabel lblShowWS;
    private JLabel lblNewLabel_95;
    private JLabel lblShowWP;
    private JPanel panel_36;
    private JButton btnShowW;
    private JButton btnDeleteW;
    private JPanel panel_38;
    private JButton btnChange_3;
    private JLabel lblCellNumber_1;
    private JComboBox comboBoxshift;
    private JLabel lblAreas_1;
    private JComboBox comboBox_10;
    private JLabel lblPID_1;
    private JTextField txtWardidupdateare;
    private JLabel label_2;
    private JTable table;
    private JPanel panel_33;
    private JButton btnChange_2;
    private JLabel lblPID_2;
    private JLabel lblAreas_2;
    private JTextField WIDCP;
    private JComboBox comboBoxP;
    private JLabel label_3;
    private int CheckAc=0;
    private JPanel panel_37;
    private JLabel lblId;
    private JTextField txtWardenId;
    private JLabel lblFirstName1;
    private JTextField txtFirstName;
    private JLabel lblLastName1;
    private JTextField txtLastname;
    private JLabel lblAddress;
    private JTextField txtAddress;
    private JLabel lblEmail;
    private JTextField txtEmail;
    private JLabel lblPhoneNumber;
    private JTextField txtPhone;
    private JLabel lblGender_1;
    private JRadioButton rdbtnMale;
    private JLabel lblIsWorking;
    private JRadioButton rdbtnHigh;
    private JRadioButton rdbtnFemale;
    private JRadioButton rdbtnResigned;
    private JLabel lblPosition;
    private JLabel lblDayOff;
    private JRadioButton rdbtnEmployed;
    private JTextField txtDayOff;
    private JRadioButton rdbtnLow;
    private JLabel lblDob;
    private JLabel lblStartDate;
    private JLabel lbArea;
    private JLabel lblSalary;
    private JLabel ShiftNumber;
    private JDateChooser StartDate;
    private JDateChooser dob1;
    private JTextField txtSalary;
    private JComboBox cbbArea1;
    private JComboBox CbbShift;
    private JPanel WDO;
    private JButton btnShowWU;
    private JLabel lblWardID;
    private JTextField WWID;
    private JButton btnCancel_1;
    private JLabel lblFirstName1_1;
    private JTextField WFN;
    private JLabel lblEmail_1;
    private JTextField WE;
    private JLabel lblLastName1_1;
    private JTextField WLN;
    private JLabel lblAddress_1;
    private JTextField WA;
    private JLabel lblPhoneNumber_1;
    private JTextField WP;
    private JLabel lblGender_2;
    private JRadioButton rdbtnMale_1;
    private JLabel lblDayOff_1;
    private JTextField WDOU;
    private JLabel lblIsWorking_1;
    private JRadioButton rdbtnEmployed_1;
    private JRadioButton rdbtnResigned_1;
    private JRadioButton rdbtnFemale_1;
    private JLabel lblSalary_1;
    private JTextField WS;
    private JLabel lblStartDate_1;
    private JLabel lblDob_1;
    private JDateChooser StartDate2;
    private JDateChooser dob2;
    private JButton btnAddP_1;
    private JButton UpdateP_1;
    private final ButtonGroup buttonGroup_2 = new ButtonGroup();
    private final ButtonGroup buttonGroup_3 = new ButtonGroup();
    private final ButtonGroup buttonGroup_4 = new ButtonGroup();
    private final ButtonGroup buttonGroup_5 = new ButtonGroup();
    private final ButtonGroup buttonGroup_6 = new ButtonGroup();
    private JPanel panel_39;
    private JLabel lblNewLabel_89;
    private JLabel showUser;
    private JLabel lblNewLabel_96;
    private JLabel showPass;
    private JLabel lblNewLabel_98;
    private JLabel showKey;
    private JButton btnChangePass;
    private JButton btnChangeKeypass;
    private JButton btnImage;
    private String fileName = null; //luu lai ten file
	private String fileBefore = null; //ten file truoc do
	private String driBefore = null; //duong dan truoc do
	private String driAfter = null; //duong dan hien tai
	private JLabel lblImageR;
	private JButton btnImageR;
	private String fileNamer = null; //luu lai ten file
	private String fileBeforer = null; //ten file truoc do
	private String driBeforer = null; //duong dan truoc do
	private String driAfterr = null; //duong dan hien tai
	private int CheckR=0;
	private JPanel panel_40;
	private JLabel lblNewLabel_3;
	private JLabel lbtotalArea;
	private JLabel lblNewLabel_17;
	private JLabel lbshowtotalPrisoner;

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
					Addmin_view frame = new Addmin_view();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Addmin_view() throws SQLException {
		setBackground(new Color(192, 192, 192));
		setTitle("Manages Prisons");
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1395, 750);
		
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
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 40, 40));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		
		panel_Body = new JPanel();
		panel_Body.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_Body.setBackground(new Color(192, 192, 192));
		panel_Body.setLayout(new CardLayout(0, 0));
		
		panel_prisoners = new JPanel();
		panel_prisoners.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_prisoners.setBackground(new Color(0, 40, 40));
		panel_Body.add(panel_prisoners, "name_1038379110987700");
		panel_prisoners.setLayout(new BorderLayout(0, 0));
		
		panel_PNorth = new JPanel();
		panel_PNorth.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		panel_PNorth.setBackground(new Color(0, 40, 40));
		panel_prisoners.add(panel_PNorth, BorderLayout.NORTH);
		panel_PNorth.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblShowP = new JLabel("PRISONERS");
		lblShowP.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowP.setToolTipText("");
		lblShowP.setForeground(new Color(255, 255, 255));
		lblShowP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblShowPMouseClicked(e);
			}
		});
		lblShowP.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblShowP.setLabelFor(this);
		lblShowP.setOpaque(true);
		lblShowP.setBackground(new Color(64, 128, 128));
		panel_PNorth.add(lblShowP);
		
		lblH = new JLabel("HEALTH");
		lblH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblHMouseClicked(e);
			}
		});
		lblH.setForeground(new Color(255, 255, 255));
		lblH.setOpaque(true);
		lblH.setBackground(new Color(0, 64, 64));
		lblH.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblH.setHorizontalAlignment(SwingConstants.CENTER);
		panel_PNorth.add(lblH);
		
		lblR = new JLabel("RELATIVES");
		lblR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblRMouseClicked(e);
			}
		});
		lblR.setForeground(new Color(255, 255, 255));
		lblR.setBackground(new Color(0, 64, 64));
		lblR.setOpaque(true);
		lblR.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		panel_PNorth.add(lblR);
		
		lblAddP = new JLabel("ADD");
		lblAddP.setForeground(new Color(255, 255, 255));
		lblAddP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblAddPMouseClicked(e);
			}
		});
		lblAddP.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblAddP.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddP.setBackground(new Color(0, 64, 64));
		lblAddP.setOpaque(true);
		panel_PNorth.add(lblAddP);
		
		panel_PCenter = new JPanel();
		panel_PCenter.setBorder(new MatteBorder(0, 1, 0, 0, (Color) new Color(0, 0, 0)));
		panel_prisoners.add(panel_PCenter, BorderLayout.CENTER);
		panel_PCenter.setLayout(new CardLayout(0, 0));
		
		panel_ShowP = new JPanel();
		panel_ShowP.setBorder(null);
		panel_ShowP.setEnabled(false);
		panel_ShowP.setBackground(new Color(0, 40, 40));
		panel_PCenter.add(panel_ShowP, "name_1109174382688600");
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBorder(null);
		scrollPane_4.getViewport().setBackground(new Color(0,40,40));
		
		panel_3 = new JPanel();
		panel_3.setForeground(new Color(255, 255, 255));
		panel_3.setBorder(new TitledBorder(null, "Prioner", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_3.setBackground(new Color(0, 40, 40));
		
		table_showP = new JTable();

		table_showP.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "First Name", "Last Name", "Birthday", "Nationality", "Gender", "Date of Entry", "Release Date", "Conviction", "Punishment", "Religion"
			}
		));
		table_showP.getColumnModel().getColumn(0).setPreferredWidth(30);
		table_showP.getColumnModel().getColumn(1).setPreferredWidth(53);
		table_showP.setAutoCreateRowSorter(true);
		table_showP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					table_showPMouseClicked(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		table_showP.setSelectionBackground(new Color(0, 128, 64));
		table_showP.setForeground(new Color(255, 255, 255));
		table_showP.setBackground(new Color(0, 64, 64));
		scrollPane_4.setViewportView(table_showP);
		
		lblNewLabel_12 = new JLabel("Prisoner ID");
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBackground(new Color(97, 158, 123));
		
		lblShowPID = new JLabel("");
		lblShowPID.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPID.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowPID.setForeground(new Color(255, 255, 255));
		lblShowPID.setBackground(new Color(97, 158, 123));
		lblShowPID.setOpaque(true);
		
		lblLN = new JLabel("Last Name");
		lblLN.setForeground(new Color(255, 255, 255));
		lblLN.setHorizontalAlignment(SwingConstants.CENTER);
		lblLN.setBackground(new Color(97, 158, 123));
		lblLN.setOpaque(true);
		
		lblShowLN = new JLabel("");
		lblShowLN.setForeground(new Color(255, 255, 255));
		lblShowLN.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowLN.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowLN.setBackground(new Color(97, 158, 123));
		lblShowLN.setOpaque(true);
		
		panel_4 = new JPanel();
		
		lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setOpaque(true);
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setBackground(new Color(0, 128, 64));
		
		lblShowGender = new JLabel("");
		lblShowGender.setOpaque(true);
		lblShowGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowGender.setForeground(new Color(255, 255, 255));
		lblShowGender.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowGender.setBackground(new Color(0, 128, 64));
		
		lblImage = new JLabel("");
		lblImage.setBackground(new Color(0, 0, 0));
		
		lblFN = new JLabel("First Name");
		lblFN.setOpaque(true);
		lblFN.setHorizontalAlignment(SwingConstants.CENTER);
		lblFN.setForeground(new Color(255, 255, 255));
		lblFN.setBackground(new Color(0, 128, 64));
		
		lblShowFN = new JLabel("");
		lblShowFN.setOpaque(true);
		lblShowFN.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowFN.setForeground(new Color(255, 255, 255));
		lblShowFN.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowFN.setBackground(new Color(0, 128, 64));
		
		lblNewLabel_9 = new JLabel("Area");
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBackground(new Color(97, 158, 123));
		
		lblNewLabel_10 = new JLabel("Cell");
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBackground(new Color(0, 128, 64));
		
		dsd = new JLabel("Floor");
		dsd.setOpaque(true);
		dsd.setHorizontalAlignment(SwingConstants.CENTER);
		dsd.setForeground(new Color(255, 255, 255));
		dsd.setBackground(new Color(97, 158, 123));
		
		lblNewLabel_13 = new JLabel("Prisoner ID");
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setForeground(new Color(255, 255, 255));
		lblNewLabel_13.setBackground(new Color(0, 128, 64));
		
		lblShowA = new JLabel("");
		lblShowA.setOpaque(true);
		lblShowA.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowA.setForeground(new Color(255, 255, 255));
		lblShowA.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowA.setBackground(new Color(97, 158, 123));
		
		lblShowC = new JLabel("");
		lblShowC.setOpaque(true);
		lblShowC.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowC.setForeground(new Color(255, 255, 255));
		lblShowC.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowC.setBackground(new Color(0, 128, 64));
		
		lblShowF = new JLabel("");
		lblShowF.setOpaque(true);
		lblShowF.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowF.setForeground(new Color(255, 255, 255));
		lblShowF.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowF.setBackground(new Color(97, 158, 123));
		
		lblShowPID_4 = new JLabel("");
		lblShowPID_4.setOpaque(true);
		lblShowPID_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowPID_4.setForeground(new Color(255, 255, 255));
		lblShowPID_4.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowPID_4.setBackground(new Color(0, 128, 64));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowGender, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowPID, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblLN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowLN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(lblFN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowFN, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(dsd, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblShowA, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
						.addComponent(lblShowC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblShowF, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblShowPID_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(8, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_panel_3.createSequentialGroup()
											.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
												.addComponent(lblShowPID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblShowFN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblFN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
										.addGroup(Alignment.LEADING, gl_panel_3.createSequentialGroup()
											.addComponent(lblShowA, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblShowC, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblLN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblShowLN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(dsd, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblShowF, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(lblShowPID_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblShowGender, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap())
		);
		panel_4.setLayout(new CardLayout(0, 0));
		panel_3.setLayout(gl_panel_3);
		
		panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "SEARCH", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_10.setBackground(new Color(0, 40, 40));
		
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
		
		textSN = new JTextField();
		textSN.setColumns(10);
		
		lblNewLabel_4 = new JLabel("CELL NUMBER");
		lblNewLabel_4.setForeground(Color.WHITE);
		
		txtSS = new JTextField();
		txtSS.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		txtSS.setColumns(10);
		
		lblNewLabel_7 = new JLabel("SEARCH");
		lblNewLabel_7.setForeground(Color.WHITE);
		
		comboBox = new JComboBox();
		comboBox.addItem("ALL");
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox.addItem(p.getAreaName());
		});
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(textSN, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSS, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
						.addComponent(textSN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtSS, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_10.setLayout(gl_panel_10);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "PAGE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBackground(new Color(0, 40, 40));
		
		btnDelete1 = new JButton("Delete");
		btnDelete1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnDelete1ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDelete1.setForeground(Color.WHITE);
		btnDelete1.setBackground(new Color(128, 0, 0));
		
		btnChange = new JButton("Change");
		btnChange.setForeground(Color.WHITE);
		btnChange.setBackground(Color.BLACK);
		
		panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 40, 40));
		panel_12.setBorder(new TitledBorder(null, "Change Cell", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		GroupLayout gl_panel_ShowP = new GroupLayout(panel_ShowP);
		gl_panel_ShowP.setHorizontalGroup(
			gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1028, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_ShowP.createSequentialGroup()
							.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
								.addGroup(gl_panel_ShowP.createSequentialGroup()
									.addGap(6)
									.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.LEADING)
										.addComponent(btnShowP, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnDelete1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnChange, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)))))
					.addGap(83))
		);
		gl_panel_ShowP.setVerticalGroup(
			gl_panel_ShowP.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_ShowP.createSequentialGroup()
					.addGap(26)
					.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_ShowP.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_ShowP.createSequentialGroup()
							.addGap(6)
							.addComponent(btnShowP, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDelete1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnChange, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 173, Short.MAX_VALUE)
						.addComponent(panel_12, 0, 0, Short.MAX_VALUE))
					.addGap(110))
		);
		
		label_1 = new JLabel("New label");
		
		lblPID = new JLabel("Prioner ID");
		lblPID.setOpaque(true);
		lblPID.setHorizontalAlignment(SwingConstants.CENTER);
		lblPID.setForeground(Color.WHITE);
		lblPID.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPID.setBackground(new Color(0, 128, 64));
		
		lblAreas = new JLabel("Areas");
		lblAreas.setOpaque(true);
		lblAreas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreas.setForeground(Color.WHITE);
		lblAreas.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAreas.setBackground(new Color(0, 128, 64));
		
		lblCellNumber = new JLabel("Cell Number");
		lblCellNumber.setOpaque(true);
		lblCellNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellNumber.setForeground(Color.WHITE);
		lblCellNumber.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCellNumber.setBackground(new Color(0, 128, 64));
		
		txtChangeID = new JTextField();
		txtChangeID.setEditable(false);
		txtChangeID.setForeground(new Color(255, 0, 0));
		txtChangeID.setColumns(10);
		
		comboBoxChange = new JComboBox();
		AreasDAO.selectTableAreas().forEach(p->{
			comboBoxChange.addItem(p.getAreaName());
		});
		
		txtCellChange = new JTextField();
		txtCellChange.setColumns(10);
		
		btnChange_1 = new JButton("Change");
		btnChange_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnChange_1ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnChange_1.setForeground(Color.WHITE);
		btnChange_1.setBackground(new Color(128, 0, 0));
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnChange_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel_12.createSequentialGroup()
							.addComponent(lblCellNumber, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCellChange, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel_12.createSequentialGroup()
							.addComponent(lblAreas, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBoxChange, 0, 177, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_panel_12.createSequentialGroup()
							.addComponent(lblPID, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtChangeID, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtChangeID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.LEADING, false)
						.addComponent(comboBoxChange)
						.addComponent(lblAreas, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_12.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCellNumber, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCellChange, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnChange_1, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
		);
		panel_12.setLayout(gl_panel_12);
		
		btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		
		lblNewLabel_8 = new JLabel("/");
		lblNewLabel_8.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(18)
					.addComponent(btnPrevious, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPrevious, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8)))
		);
		panel.setLayout(gl_panel);
		panel_ShowP.setLayout(gl_panel_ShowP);
		
		panel_Add = new JPanel();
		panel_Add.setBackground(new Color(0, 40, 40));
		panel_PCenter.add(panel_Add, "name_1109176343531900");
		panel_Add.setLayout(new BorderLayout(0, 0));
		
		north = new JPanel();
		panel_Add.add(north, BorderLayout.NORTH);
		
		lblIn4 = new JLabel("Iformation");
		lblIn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblIn4MouseClicked(e);
			}
		});
		north.setLayout(new GridLayout(0, 2, 0, 0));
		lblIn4.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblIn4.setHorizontalAlignment(SwingConstants.CENTER);
		north.add(lblIn4);
		
		lblHE = new JLabel("Health");
		lblHE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblHEMouseClicked(e);
			}
		});
		lblHE.setFont(new Font("SansSerif", Font.PLAIN, 18));
		lblHE.setHorizontalAlignment(SwingConstants.CENTER);
		north.add(lblHE);
		
		center = new JPanel();
		panel_Add.add(center, BorderLayout.CENTER);
		center.setLayout(new CardLayout(0, 0));
		
		panel_addP = new JPanel();
		panel_addP.setBackground(new Color(0, 40, 40));
		center.add(panel_addP, "name_1645143809796900");
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(64, 128, 128));
		panel_5.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		btnAddP = new JButton("ADD");
		btnAddP.setBackground(new Color(0, 0, 0));
		btnAddP.setForeground(new Color(255, 255, 255));
		btnAddP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnAddPActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		separator = new JSeparator();
		
		panel_14 = new JPanel();
		panel_14.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_14.setBackground(new Color(64, 128, 128));
		
		lblFirstName_1 = new JLabel("First Name");
		lblFirstName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName_1.setForeground(Color.WHITE);
		
		txtShowUpdateFN = new JTextField();
		txtShowUpdateFN.setEnabled(true);
		txtShowUpdateFN.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateFN.setColumns(10);
		
		lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName_1.setForeground(Color.WHITE);
		
		txtShowUpdateLN = new JTextField();
		txtShowUpdateLN.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateLN.setColumns(10);
		
		nationality_1 = new JLabel("Nationality");
		nationality_1.setHorizontalAlignment(SwingConstants.CENTER);
		nationality_1.setForeground(Color.WHITE);
		
		txtShowUpdateN = new JTextField();
		txtShowUpdateN.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateN.setColumns(10);
		
		lblaaaa = new JLabel("Conviction");
		lblaaaa.setHorizontalAlignment(SwingConstants.CENTER);
		lblaaaa.setForeground(Color.WHITE);
		
		txtShowUpdateC = new JTextField();
		txtShowUpdateC.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateC.setColumns(10);
		
		lblPunishment = new JLabel("Punishment");
		lblPunishment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunishment.setForeground(Color.WHITE);
		
		txtShowUpdateP = new JTextField();
		txtShowUpdateP.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateP.setColumns(10);
		
		lblReligion = new JLabel("Religion");
		lblReligion.setHorizontalAlignment(SwingConstants.CENTER);
		lblReligion.setForeground(Color.WHITE);
		
		txtShowUpdateR = new JTextField();
		txtShowUpdateR.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateR.setColumns(10);
		
		lblGender1_1 = new JLabel("Gender");
		lblGender1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender1_1.setForeground(Color.WHITE);
		
		male_1 = new JRadioButton("Male");
		buttonGroup_1.add(male_1);
		
		Female_1 = new JRadioButton("Female");
		buttonGroup_1.add(Female_1);
		Female_1.setSelected(true);
		
		lblPrisonerID_2 = new JLabel("release Date");
		lblPrisonerID_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_2.setForeground(Color.WHITE);
		
		ShowUpdateRD = new JDateChooser();
		ShowUpdateRD.setDateFormatString("dd-MM-yyyy");
		
		lblPrisonerID_3 = new JLabel("Date Of Entry");
		lblPrisonerID_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_3.setForeground(Color.WHITE);
		
		ShowUpdateDOE = new JDateChooser();
		ShowUpdateDOE.setDateFormatString("dd-MM-yyyy");
		
		lblPrisonerID_4 = new JLabel("Date Of Birth");
		lblPrisonerID_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_4.setForeground(Color.WHITE);
		
		ShowUpdateDOB = new JDateChooser();
		ShowUpdateDOB.setDateFormatString("dd-MM-yyyy");
		
		lblImageUp = new JLabel("");
		lblImageUp.setBackground(new Color(0, 40, 40));
		lblImageUp.setOpaque(true);
		
		lblPrisonerID_1 = new JLabel("Prisoner ID");
		lblPrisonerID_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_1.setForeground(Color.WHITE);
		
		txtShowUpdateID = new JTextField();
		txtShowUpdateID.setHorizontalAlignment(SwingConstants.LEFT);
		txtShowUpdateID.setColumns(10);
		
		btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShow.setForeground(Color.WHITE);
		btnShow.setBackground(Color.BLACK);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelActionPerformed(e);
			}
		});
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(new Color(128, 0, 0));
		
		btnImage = new JButton("image");
		btnImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnImageActionPerformed(e);
			}
		});
		btnImage.setForeground(Color.WHITE);
		btnImage.setBackground(Color.BLACK);
		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addComponent(btnShow, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_14.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblPrisonerID_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtShowUpdateID, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
						.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addGap(84)
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addComponent(btnImage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblImageUp, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_14.createSequentialGroup()
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createSequentialGroup()
									.addComponent(lblFirstName_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtShowUpdateFN, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_14.createSequentialGroup()
									.addComponent(lblLastName_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtShowUpdateLN, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_14.createSequentialGroup()
									.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_14.createSequentialGroup()
											.addGap(6)
											.addComponent(nationality_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblGender1_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_14.createSequentialGroup()
											.addComponent(male_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(Female_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
										.addComponent(txtShowUpdateN, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))))
							.addGap(24)
							.addGroup(gl_panel_14.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
									.addComponent(lblPrisonerID_4, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblPrisonerID_3, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblaaaa, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblPunishment, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_14.createSequentialGroup()
							.addComponent(lblReligion, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtShowUpdateR, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblPrisonerID_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addComponent(ShowUpdateDOB, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_14.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(ShowUpdateRD, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(ShowUpdateDOE, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
						.addComponent(txtShowUpdateC, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtShowUpdateP, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
					.addGap(65))
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_14.createSequentialGroup()
							.addGap(14)
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtShowUpdateFN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblFirstName_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblPrisonerID_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(ShowUpdateDOB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtShowUpdateLN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblLastName_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblPrisonerID_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addComponent(ShowUpdateDOE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createSequentialGroup()
									.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblReligion, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPrisonerID_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtShowUpdateR, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
										.addComponent(nationality_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblaaaa, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtShowUpdateC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtShowUpdateN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
								.addComponent(ShowUpdateRD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblPunishment, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtShowUpdateP, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_14.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblGender1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(male_1)
									.addComponent(Female_1))))
						.addGroup(gl_panel_14.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_14.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_14.createSequentialGroup()
									.addComponent(lblImageUp, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnImage))
								.addGroup(gl_panel_14.createSequentialGroup()
									.addComponent(lblPrisonerID_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtShowUpdateID, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnShow, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel_14.setLayout(gl_panel_14);
		
		UpdateP = new JButton("Update");
		UpdateP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UpdatePActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		UpdateP.setForeground(Color.WHITE);
		UpdateP.setBackground(Color.BLACK);
		GroupLayout gl_panel_addP = new GroupLayout(panel_addP);
		gl_panel_addP.setHorizontalGroup(
			gl_panel_addP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_addP.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panel_addP.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
						.addGroup(gl_panel_addP.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_addP.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_addP.createSequentialGroup()
									.addComponent(btnAddP, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(separator, GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(UpdateP, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addGap(11))
								.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 1026, GroupLayout.PREFERRED_SIZE))))
					.addGap(27))
		);
		gl_panel_addP.setVerticalGroup(
			gl_panel_addP.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_addP.createSequentialGroup()
					.addGap(32)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_addP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_addP.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAddP, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_addP.createSequentialGroup()
							.addGap(45)
							.addGroup(gl_panel_addP.createParallelGroup(Alignment.LEADING)
								.addComponent(UpdateP, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE))))
					.addGap(17)
					.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		
		lblPrisonerID = new JLabel("Prisoner ID");
		lblPrisonerID.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID.setForeground(new Color(255, 255, 255));
		
		lblFirstName = new JLabel("First Name");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setForeground(Color.WHITE);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setForeground(Color.WHITE);
		
		nationality = new JLabel("Nationality");
		nationality.setHorizontalAlignment(SwingConstants.CENTER);
		nationality.setForeground(Color.WHITE);
		
		txtPId = new JTextField();
		txtPId.setHorizontalAlignment(SwingConstants.LEFT);
		txtPId.setColumns(10);
		
		txtFName = new JTextField();
		txtFName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFName.setColumns(10);
		
		txtLName = new JTextField();
		txtLName.setHorizontalAlignment(SwingConstants.LEFT);
		txtLName.setColumns(10);
		
		txtN = new JTextField();
		txtN.setHorizontalAlignment(SwingConstants.LEFT);
		txtN.setColumns(10);
		
		lblCellId = new JLabel("Cell");
		lblCellId.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellId.setForeground(Color.WHITE);
		
		lblConviction_1 = new JLabel("Conviction");
		lblConviction_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblConviction_1.setForeground(Color.WHITE);
		
		lblPunishment_1 = new JLabel("Punishment");
		lblPunishment_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPunishment_1.setForeground(Color.WHITE);
		
		lblReligion_1 = new JLabel("Religion");
		lblReligion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReligion_1.setForeground(Color.WHITE);
		
		txtCell = new JTextField();
		txtCell.setHorizontalAlignment(SwingConstants.LEFT);
		txtCell.setColumns(10);
		
		txtC = new JTextField();
		txtC.setHorizontalAlignment(SwingConstants.LEFT);
		txtC.setColumns(10);
		
		txtP = new JTextField();
		txtP.setHorizontalAlignment(SwingConstants.LEFT);
		txtP.setColumns(10);
		
		txtR = new JTextField();
		txtR.setHorizontalAlignment(SwingConstants.LEFT);
		txtR.setColumns(10);
		
		lblPrisonerID_8 = new JLabel("Date Of Birth");
		lblPrisonerID_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_8.setForeground(Color.WHITE);
		
		lblPrisonerID_9 = new JLabel("Date Of Entry");
		lblPrisonerID_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_9.setForeground(Color.WHITE);
		
		lblPrisonerID_10 = new JLabel("release Date");
		lblPrisonerID_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrisonerID_10.setForeground(Color.WHITE);
		
		dob = new JDateChooser();
		dob.setBackground(new Color(64, 128, 128));
		
		doe = new JDateChooser();
		
		rd = new JDateChooser();
		
		lblGender1 = new JLabel("Gender");
		lblGender1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender1.setForeground(Color.WHITE);
		
		male = new JRadioButton("Male");
		buttonGroup.add(male);
		
		Female = new JRadioButton("Female");
		buttonGroup.add(Female);
		Female.setSelected(true);
		
		lblCellId_1 = new JLabel("Area");
		lblCellId_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellId_1.setForeground(Color.WHITE);
		
		comboBox_1 = new JComboBox();
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox_1.addItem(p.getAreaName());
		});
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPrisonerID, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtPId, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtFName, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtLName, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(nationality, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtN, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
					.addGap(41)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblConviction_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtC, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPunishment_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtP, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblReligion_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtR, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblGender1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(male, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Female, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
					.addGap(48)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPrisonerID_10, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPrisonerID_9, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(doe, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblPrisonerID_8, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(dob, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblCellId, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtCell, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCellId_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(21)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPrisonerID, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPId, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtFName, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtLName, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(nationality, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGender1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(male)
								.addComponent(Female))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblConviction_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPunishment_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtP, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblReligion_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtR, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_5.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPrisonerID_8, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(dob, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPrisonerID_9, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(doe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPrisonerID_10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(rd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblCellId, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtCell, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblCellId_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		panel_addP.setLayout(gl_panel_addP);
		
		panel_addH = new JPanel();
		panel_addH.setBackground(new Color(0, 40, 40));
		center.add(panel_addH, "name_1645145942555400");
		
		panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "ADD HEALTH", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_6.setBackground(new Color(64, 128, 128));
		
		panel_15 = new JPanel();
		panel_15.setBorder(new TitledBorder(null, "ADD RELATIVE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_15.setBackground(new Color(64, 128, 128));
		
		panel_19 = new JPanel();
		panel_19.setBorder(new TitledBorder(null, "UPDATE HEALTH", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_19.setBackground(new Color(64, 128, 128));
		
		UHA = new JTextField();
		UHA.setColumns(10);
		
		btnUpdate_2 = new JButton("Update");
		btnUpdate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnUpdate_2ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUpdate_2.setForeground(Color.WHITE);
		btnUpdate_2.setBackground(Color.BLACK);
		
		lblNewLabel_47 = new JLabel("Medical History");
		lblNewLabel_47.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_47.setForeground(Color.WHITE);
		
		lblNewLabel_48 = new JLabel("Allergies");
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_48.setForeground(Color.WHITE);
		
		lblNewLabel_49 = new JLabel("ID Health");
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_49.setForeground(Color.WHITE);
		
		lblNewLabel_50 = new JLabel("Current Conditions");
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_50.setForeground(Color.WHITE);
		
		UHID = new JTextField();
		UHID.setColumns(10);
		
		UHMH = new JTextField();
		UHMH.setColumns(10);
		
		UHCC = new JTextField();
		UHCC.setColumns(10);
		
		btnShowUH = new JButton("Show");
		btnShowUH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowUHActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowUH.setForeground(Color.WHITE);
		btnShowUH.setBackground(new Color(0, 0, 0));
		
		btnCancelUH = new JButton("Cancel");
		btnCancelUH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancelUHActionPerformed(e);
			}
		});
		btnCancelUH.setForeground(Color.WHITE);
		btnCancelUH.setBackground(new Color(128, 0, 0));
		GroupLayout gl_panel_19 = new GroupLayout(panel_19);
		gl_panel_19.setHorizontalGroup(
			gl_panel_19.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGroup(gl_panel_19.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_19.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_50)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(UHCC, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_19.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_47, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(UHMH, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_19.createSequentialGroup()
							.addGroup(gl_panel_19.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_panel_19.createSequentialGroup()
									.addContainerGap()
									.addComponent(btnShowUH, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCancelUH, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(Alignment.LEADING, gl_panel_19.createSequentialGroup()
									.addContainerGap()
									.addComponent(btnUpdate_2, GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
								.addGroup(Alignment.LEADING, gl_panel_19.createSequentialGroup()
									.addGroup(gl_panel_19.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_19.createSequentialGroup()
											.addGap(6)
											.addComponent(lblNewLabel_49, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblNewLabel_48, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_19.createParallelGroup(Alignment.LEADING)
										.addComponent(UHID, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
										.addComponent(UHA, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))))
							.addGap(71)))
					.addContainerGap())
		);
		gl_panel_19.setVerticalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel_19.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_49, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(UHID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_19.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnShowUH, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelUH, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addGroup(gl_panel_19.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_47, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(UHMH, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_19.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_50, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(UHCC, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_19.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_48)
						.addComponent(UHA, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUpdate_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_19.linkSize(SwingConstants.VERTICAL, new Component[] {lblNewLabel_47, lblNewLabel_48, lblNewLabel_49, lblNewLabel_50});
		gl_panel_19.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_47, lblNewLabel_49, lblNewLabel_50});
		gl_panel_19.linkSize(SwingConstants.HORIZONTAL, new Component[] {UHA, UHMH, UHCC});
		panel_19.setLayout(gl_panel_19);
		
		panel_23 = new JPanel();
		panel_23.setBorder(null);
		
		panel_26 = new JPanel();
		panel_26.setBorder(new TitledBorder(null, "UPDATE RELATIVE", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_26.setBackground(new Color(64, 128, 128));
		
		lblNewLabel_65 = new JLabel("Relative ID");
		lblNewLabel_65.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_65.setForeground(Color.WHITE);
		
		URID = new JTextField();
		URID.setColumns(10);
		
		lblNewLabel_66 = new JLabel("Name");
		lblNewLabel_66.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_66.setForeground(Color.WHITE);
		
		URN = new JTextField();
		URN.setColumns(10);
		
		lblNewLabel_67 = new JLabel("Contact");
		lblNewLabel_67.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_67.setForeground(Color.WHITE);
		
		URC = new JTextField();
		URC.setColumns(10);
		
		lblNewLabel_68 = new JLabel("Relationship");
		lblNewLabel_68.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_68.setForeground(Color.WHITE);
		
		URR = new JTextField();
		URR.setColumns(10);
		
		lblNewLabel_69 = new JLabel("CCCD");
		lblNewLabel_69.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_69.setForeground(Color.WHITE);
		
		URCC = new JTextField();
		URCC.setColumns(10);
		
		btnAddH_4 = new JButton("Update");
		btnAddH_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnAddH_4ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddH_4.setForeground(Color.WHITE);
		btnAddH_4.setBackground(Color.BLACK);
		
		btnAddH_5 = new JButton("Show");
		btnAddH_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnAddH_5ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddH_5.setForeground(Color.WHITE);
		btnAddH_5.setBackground(Color.BLACK);
		
		btnAddH_6 = new JButton("Cancel");
		btnAddH_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddH_6ActionPerformed(e);
			}
		});
		btnAddH_6.setForeground(Color.WHITE);
		btnAddH_6.setBackground(new Color(128, 0, 0));
		
		lblImageR = new JLabel("");
		
		btnImageR = new JButton("Image");
		btnImageR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnImageRActionPerformed(e);
			}
		});
		btnImageR.setForeground(Color.WHITE);
		btnImageR.setBackground(new Color(128, 0, 0));
		GroupLayout gl_panel_26 = new GroupLayout(panel_26);
		gl_panel_26.setHorizontalGroup(
			gl_panel_26.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_26.createSequentialGroup()
					.addGroup(gl_panel_26.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_26.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_65, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(URID, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_26.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_69, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(URCC, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_26.createSequentialGroup()
							.addComponent(lblNewLabel_68, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(URR, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_26.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_67, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(URC, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_26.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_66, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(URN, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_26.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAddH_5, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAddH_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(btnAddH_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
					.addGroup(gl_panel_26.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnImageR, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblImageR, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
					.addGap(59))
		);
		gl_panel_26.setVerticalGroup(
			gl_panel_26.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_26.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_26.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_26.createSequentialGroup()
							.addComponent(lblImageR, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnImageR, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_26.createSequentialGroup()
							.addGroup(gl_panel_26.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_65, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(URID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_26.createParallelGroup(Alignment.LEADING)
								.addComponent(btnAddH_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAddH_6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_panel_26.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_66, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(URN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_26.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_67, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(URC, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_26.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_68, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(URR, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_26.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_69, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(URCC, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnAddH_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel_26.setLayout(gl_panel_26);
		GroupLayout gl_panel_addH = new GroupLayout(panel_addH);
		gl_panel_addH.setHorizontalGroup(
			gl_panel_addH.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_addH.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_panel_addH.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE))
					.addGap(54)
					.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addGroup(gl_panel_addH.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 567, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 567, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_panel_addH.setVerticalGroup(
			gl_panel_addH.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_addH.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_panel_addH.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, gl_panel_addH.createSequentialGroup()
							.addGroup(gl_panel_addH.createParallelGroup(Alignment.BASELINE)
								.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_addH.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_addH.createSequentialGroup()
									.addGap(18)
									.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_addH.createSequentialGroup()
									.addGap(18)
									.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		panel_23.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_24 = new JPanel();
		panel_24.setBorder(new MatteBorder(1, 0, 0, 1, (Color) new Color(255, 255, 255)));
		panel_24.setBackground(new Color(0, 40, 40));
		panel_23.add(panel_24);
		panel_24.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblNewLabel_51 = new JLabel("H");
		lblNewLabel_51.setForeground(new Color(255, 255, 255));
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
		panel_24.add(lblNewLabel_51);
		
		lblNewLabel_52 = new JLabel("E");
		lblNewLabel_52.setForeground(new Color(255, 255, 255));
		lblNewLabel_52.setHorizontalAlignment(SwingConstants.CENTER);
		panel_24.add(lblNewLabel_52);
		
		lblNewLabel_53 = new JLabel("A");
		lblNewLabel_53.setForeground(new Color(255, 255, 255));
		lblNewLabel_53.setHorizontalAlignment(SwingConstants.CENTER);
		panel_24.add(lblNewLabel_53);
		
		lblNewLabel_54 = new JLabel("L");
		lblNewLabel_54.setForeground(new Color(255, 255, 255));
		lblNewLabel_54.setHorizontalAlignment(SwingConstants.CENTER);
		panel_24.add(lblNewLabel_54);
		
		lblNewLabel_55 = new JLabel("T");
		lblNewLabel_55.setForeground(new Color(255, 255, 255));
		lblNewLabel_55.setHorizontalAlignment(SwingConstants.CENTER);
		panel_24.add(lblNewLabel_55);
		
		lblNewLabel_56 = new JLabel("H");
		lblNewLabel_56.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_56.setForeground(new Color(255, 255, 255));
		panel_24.add(lblNewLabel_56);
		
		panel_25 = new JPanel();
		panel_25.setBorder(new MatteBorder(1, 1, 0, 0, (Color) new Color(255, 255, 255)));
		panel_25.setBackground(new Color(0, 40, 40));
		panel_23.add(panel_25);
		panel_25.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblNewLabel_59 = new JLabel("R");
		lblNewLabel_59.setForeground(new Color(255, 255, 255));
		lblNewLabel_59.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_59);
		
		lblNewLabel_61 = new JLabel("E");
		lblNewLabel_61.setForeground(new Color(255, 255, 255));
		lblNewLabel_61.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_61);
		
		lblNewLabel_63 = new JLabel("L");
		lblNewLabel_63.setForeground(new Color(255, 255, 255));
		lblNewLabel_63.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_63);
		
		lblNewLabel_64 = new JLabel("A");
		lblNewLabel_64.setForeground(new Color(255, 255, 255));
		lblNewLabel_64.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_64);
		
		lblNewLabel_62 = new JLabel("T");
		lblNewLabel_62.setForeground(new Color(255, 255, 255));
		lblNewLabel_62.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_62);
		
		lblNewLabel_58 = new JLabel("I");
		lblNewLabel_58.setForeground(new Color(255, 255, 255));
		lblNewLabel_58.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_58);
		
		lblNewLabel_60 = new JLabel("V");
		lblNewLabel_60.setForeground(new Color(255, 255, 255));
		lblNewLabel_60.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_60);
		
		lblNewLabel_57 = new JLabel("E");
		lblNewLabel_57.setForeground(new Color(255, 255, 255));
		lblNewLabel_57.setHorizontalAlignment(SwingConstants.CENTER);
		panel_25.add(lblNewLabel_57);
		
		lblNewLabel_18 = new JLabel("Prisoner ID");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setForeground(Color.WHITE);
		
		lblNewLabel_19 = new JLabel("Name");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setForeground(Color.WHITE);
		
		lblNewLabel_44 = new JLabel("Contact");
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_44.setForeground(Color.WHITE);
		
		lblNewLabel_45 = new JLabel("Relationship");
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_45.setForeground(Color.WHITE);
		
		lblNewLabel_46 = new JLabel("CCCD");
		lblNewLabel_46.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_46.setForeground(Color.WHITE);
		
		RPID = new JTextField();
		RPID.setColumns(10);
		
		RPN = new JTextField();
		RPN.setColumns(10);
		
		RPC = new JTextField();
		RPC.setColumns(10);
		
		RPR = new JTextField();
		RPR.setColumns(10);
		
		RPCCCD = new JTextField();
		RPCCCD.setColumns(10);
		
		btnAddH_1 = new JButton("ADD");
		btnAddH_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnAddH_1ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddH_1.setForeground(Color.WHITE);
		btnAddH_1.setBackground(Color.BLACK);
		GroupLayout gl_panel_15 = new GroupLayout(panel_15);
		gl_panel_15.setHorizontalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_15.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_15.createSequentialGroup()
								.addComponent(lblNewLabel_18, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(RPID, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_15.createSequentialGroup()
								.addComponent(lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(RPN, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_15.createSequentialGroup()
								.addComponent(lblNewLabel_44, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(RPC, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_15.createSequentialGroup()
								.addComponent(lblNewLabel_45, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(RPR, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_15.createSequentialGroup()
								.addComponent(lblNewLabel_46, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(RPCCCD, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnAddH_1, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(257, Short.MAX_VALUE))
		);
		gl_panel_15.setVerticalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_18, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(RPID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(RPN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_44, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(RPC, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_45, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(RPR, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_15.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_46, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(RPCCCD, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAddH_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_15.setLayout(gl_panel_15);
		
		lblNewLabel_6 = new JLabel("Prisoner ID");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		AHID = new JTextField();
		AHID.setColumns(10);
		
		lblNewLabel_11 = new JLabel("Medical History");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		
		AHMH = new JTextField();
		AHMH.setColumns(10);
		
		AHCC = new JTextField();
		AHCC.setColumns(10);
		
		lblNewLabel_14 = new JLabel("Current Conditions");
		lblNewLabel_14.setForeground(new Color(255, 255, 255));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_15 = new JLabel("Allergies");
		lblNewLabel_15.setForeground(new Color(255, 255, 255));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnAddH = new JButton("ADD");
		btnAddH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnAddHActionPerformed(e);
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddH.setForeground(Color.WHITE);
		btnAddH.setBackground(Color.BLACK);
		
		AHA = new JTextField();
		AHA.setColumns(10);
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAddH, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_6.createSequentialGroup()
									.addGap(6)
									.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_11, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
										.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
								.addGroup(gl_panel_6.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblNewLabel_14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_panel_6.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblNewLabel_15, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
									.addComponent(AHID, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
									.addComponent(AHMH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(AHCC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_6.createSequentialGroup()
									.addComponent(AHA, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addGap(203))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(AHID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_6.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_6.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_6.createSequentialGroup()
							.addGap(13)
							.addComponent(AHMH, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(AHCC, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_6.createParallelGroup(Alignment.BASELINE)
						.addComponent(AHA, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_15))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAddH, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_panel_6.linkSize(SwingConstants.VERTICAL, new Component[] {lblNewLabel_6, lblNewLabel_11, lblNewLabel_14, lblNewLabel_15});
		gl_panel_6.linkSize(SwingConstants.HORIZONTAL, new Component[] {AHID, AHMH, AHCC});
		panel_6.setLayout(gl_panel_6);
		panel_addH.setLayout(gl_panel_addH);
		
		panel_9 = new JPanel();
		center.add(panel_9, "name_1645148070302300");
		
		panel_ShowH = new JPanel();
		panel_ShowH.setForeground(new Color(255, 255, 255));
		panel_ShowH.setBackground(new Color(0, 40, 40));
		panel_PCenter.add(panel_ShowH, "name_263096476421599");
		
		scrollPane_5 = new JScrollPane();
		
		panel_16 = new JPanel();
		panel_16.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_16.setBackground(new Color(0, 40, 40));
		
		btnShowH = new JButton("Show");
		btnShowH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowHActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowH.setForeground(Color.WHITE);
		btnShowH.setBackground(Color.BLACK);
		
		panel_18 = new JPanel();
		panel_18.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_18.setBackground(new Color(0,40,40));
		
		panelPH = new JPanel();
		panelPH.show(false);
		panelPH.setBorder(new TitledBorder(null, "Prisoner", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelPH.setBackground(new Color(0, 40, 40));
		
		btnDeleteH = new JButton("Delete");
		btnDeleteH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnDeleteHActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDeleteH.setForeground(Color.WHITE);
		btnDeleteH.setBackground(Color.BLACK);
		GroupLayout gl_panel_ShowH = new GroupLayout(panel_ShowH);
		gl_panel_ShowH.setHorizontalGroup(
			gl_panel_ShowH.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_ShowH.createSequentialGroup()
					.addContainerGap(792, Short.MAX_VALUE)
					.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addGap(296))
				.addGroup(gl_panel_ShowH.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panel_ShowH.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(scrollPane_5)
						.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 598, Short.MAX_VALUE))
					.addGap(10)
					.addGroup(gl_panel_ShowH.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnShowH, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDeleteH, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(panelPH, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		gl_panel_ShowH.setVerticalGroup(
			gl_panel_ShowH.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_ShowH.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel_ShowH.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(scrollPane_5, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelPH, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(82, Short.MAX_VALUE))
				.addGroup(gl_panel_ShowH.createSequentialGroup()
					.addGap(19)
					.addComponent(btnShowH, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDeleteH, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(562, Short.MAX_VALUE))
		);
		
		HI = new JLabel("");
		HI.setOpaque(true);
		
		lblNewLabel_28 = new JLabel("Prisoner ID");
		lblNewLabel_28.setBackground(new Color(0, 128, 64));
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_28.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_29 = new JLabel("First Name");
		lblNewLabel_29.setBackground(new Color(97, 158, 123));
		lblNewLabel_29.setOpaque(true);
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_29.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_31 = new JLabel("Last Name");
		lblNewLabel_31.setBackground(new Color(0, 128, 64));
		lblNewLabel_31.setOpaque(true);
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_32 = new JLabel("Area");
		lblNewLabel_32.setBackground(new Color(0, 128, 64));
		lblNewLabel_32.setOpaque(true);
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_33 = new JLabel("Gender");
		lblNewLabel_33.setBackground(new Color(97, 158, 123));
		lblNewLabel_33.setOpaque(true);
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_34 = new JLabel("Cell");
		lblNewLabel_34.setBackground(new Color(97, 158, 123));
		lblNewLabel_34.setOpaque(true);
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_34.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_35 = new JLabel("Floor");
		lblNewLabel_35.setBackground(new Color(0, 128, 64));
		lblNewLabel_35.setOpaque(true);
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_35.setForeground(new Color(255, 255, 255));
		
		HID = new JLabel("");
		HID.setHorizontalAlignment(SwingConstants.CENTER);
		HID.setBackground(new Color(0, 128, 64));
		HID.setOpaque(true);
		HID.setForeground(new Color(255, 255, 255));
		
		HFN = new JLabel("");
		HFN.setHorizontalAlignment(SwingConstants.CENTER);
		HFN.setBackground(new Color(97, 158, 123));
		HFN.setOpaque(true);
		HFN.setForeground(new Color(255, 255, 255));
		
		HLN = new JLabel("");
		HLN.setHorizontalAlignment(SwingConstants.CENTER);
		HLN.setBackground(new Color(0, 128, 64));
		HLN.setOpaque(true);
		HLN.setForeground(new Color(255, 255, 255));
		
		HGENDER = new JLabel("");
		HGENDER.setHorizontalAlignment(SwingConstants.CENTER);
		HGENDER.setBackground(new Color(97, 158, 123));
		HGENDER.setOpaque(true);
		HGENDER.setForeground(new Color(255, 255, 255));
		
		HA = new JLabel("");
		HA.setHorizontalAlignment(SwingConstants.CENTER);
		HA.setBackground(new Color(0, 128, 64));
		HA.setOpaque(true);
		HA.setForeground(new Color(255, 255, 255));
		
		HC = new JLabel("");
		HC.setHorizontalAlignment(SwingConstants.CENTER);
		HC.setBackground(new Color(97, 158, 123));
		HC.setOpaque(true);
		HC.setForeground(new Color(255, 255, 255));
		
		HF = new JLabel("");
		HF.setHorizontalAlignment(SwingConstants.CENTER);
		HF.setBackground(new Color(0, 128, 64));
		HF.setOpaque(true);
		HF.setForeground(new Color(255, 255, 255));
		GroupLayout gl_panelPH = new GroupLayout(panelPH);
		gl_panelPH.setHorizontalGroup(
			gl_panelPH.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPH.createSequentialGroup()
					.addContainerGap()
					.addComponent(HI, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelPH.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPH.createSequentialGroup()
							.addComponent(lblNewLabel_35, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(HF, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelPH.createSequentialGroup()
							.addComponent(lblNewLabel_34, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(HC, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelPH.createSequentialGroup()
							.addComponent(lblNewLabel_32, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(HA, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelPH.createSequentialGroup()
							.addComponent(lblNewLabel_28, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(HID, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelPH.createSequentialGroup()
							.addComponent(lblNewLabel_29, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(HFN, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelPH.createSequentialGroup()
							.addComponent(lblNewLabel_31, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(HLN, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelPH.createSequentialGroup()
							.addComponent(lblNewLabel_33, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(HGENDER, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		gl_panelPH.setVerticalGroup(
			gl_panelPH.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPH.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelPH.createParallelGroup(Alignment.BASELINE)
						.addComponent(HI, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelPH.createSequentialGroup()
							.addGroup(gl_panelPH.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_28, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(HID, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panelPH.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelPH.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_29))
								.addGroup(gl_panelPH.createSequentialGroup()
									.addGap(5)
									.addComponent(HFN, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
							.addGap(8)
							.addGroup(gl_panelPH.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelPH.createSequentialGroup()
									.addComponent(lblNewLabel_31)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_33))
								.addGroup(gl_panelPH.createSequentialGroup()
									.addComponent(HLN, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(HGENDER, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelPH.createParallelGroup(Alignment.BASELINE)
						.addComponent(HA, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_32))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelPH.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_34)
						.addComponent(HC, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelPH.createParallelGroup(Alignment.LEADING)
						.addComponent(HF, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_35))
					.addGap(38))
		);
		gl_panelPH.linkSize(SwingConstants.VERTICAL, new Component[] {lblNewLabel_28, lblNewLabel_29, lblNewLabel_31, lblNewLabel_32, lblNewLabel_33, lblNewLabel_34, lblNewLabel_35});
		gl_panelPH.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_28, lblNewLabel_29, lblNewLabel_31, lblNewLabel_32, lblNewLabel_33, lblNewLabel_34, lblNewLabel_35});
		panelPH.setLayout(gl_panelPH);
		
		lblNewLabel_23 = new JLabel("Medical History");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setForeground(new Color(255, 255, 255));
		lblNewLabel_23.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		lblNewLabel_24 = new JLabel("Current Conditions");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setForeground(new Color(255, 255, 255));
		lblNewLabel_24.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		lblNewLabel_25 = new JLabel("Allergies");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setForeground(new Color(255, 255, 255));
		lblNewLabel_25.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		btnUpdate_1 = new JButton("Update");
		btnUpdate_1.setForeground(Color.WHITE);
		btnUpdate_1.setBackground(Color.BLACK);
		
		btnDelete_1 = new JButton("Delete");
		btnDelete_1.setForeground(Color.WHITE);
		btnDelete_1.setBackground(new Color(255, 0, 0));
		GroupLayout gl_panel_18 = new GroupLayout(panel_18);
		gl_panel_18.setHorizontalGroup(
			gl_panel_18.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_18.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_18.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_23, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_24, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_25, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_18.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_18.createParallelGroup(Alignment.LEADING)
						.addComponent(btnUpdate_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDelete_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		gl_panel_18.setVerticalGroup(
			gl_panel_18.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_18.createSequentialGroup()
					.addGroup(gl_panel_18.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_18.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_18.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_23, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGap(15)
							.addGroup(gl_panel_18.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_24, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_18.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_25, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_18.createSequentialGroup()
							.addGap(25)
							.addComponent(btnUpdate_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDelete_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(7, Short.MAX_VALUE))
		);
		gl_panel_18.linkSize(SwingConstants.VERTICAL, new Component[] {textField_9, textField_10, textField_11});
		gl_panel_18.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_23, lblNewLabel_24, lblNewLabel_25});
		gl_panel_18.linkSize(SwingConstants.HORIZONTAL, new Component[] {textField_9, textField_10, textField_11});
		panel_18.setLayout(gl_panel_18);
		
		lblNewLabel_21 = new JLabel("ID");
		lblNewLabel_21.setForeground(new Color(255, 255, 255));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.RIGHT);
		
		comboBox_2 = new JComboBox();
		comboBox_2.addItem("ALL");
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox_2.addItem(p.getAreaName());
		});
		
		lblNewLabel_22 = new JLabel("CELL");
		lblNewLabel_22.setForeground(new Color(255, 255, 255));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtSearchHCell = new JTextField();
		txtSearchHCell.setColumns(10);
		
		txtSearchHId = new JTextField();
		txtSearchHId.setColumns(10);
		
		lblNewLabel_26 = new JLabel("Search");
		lblNewLabel_26.setForeground(new Color(255, 255, 255));
		lblNewLabel_26.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtSearchH = new JTextField();
		txtSearchH.setColumns(10);
		GroupLayout gl_panel_16 = new GroupLayout(panel_16);
		gl_panel_16.setHorizontalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_16.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_22, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSearchHCell, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_21, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSearchHId, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_26, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSearchH, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_16.setVerticalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_16.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_16.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_22, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSearchHCell, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_21, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSearchHId, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_26)
						.addComponent(txtSearchH, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(9, Short.MAX_VALUE))
		);
		gl_panel_16.linkSize(SwingConstants.VERTICAL, new Component[] {txtSearchHId, txtSearchH});
		gl_panel_16.linkSize(SwingConstants.VERTICAL, new Component[] {lblNewLabel_21, comboBox_2, lblNewLabel_22, lblNewLabel_26});
		panel_16.setLayout(gl_panel_16);
		
		table_showH = new JTable();
		table_showH.setForeground(new Color(255, 255, 255));
		table_showH.setBackground(new Color(0, 64, 64));
		table_showH.setSelectionBackground(new Color(0, 128, 64));
		table_showH.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					table_showHMouseClicked(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		table_showH.setAutoCreateRowSorter(true);
		scrollPane_5.setViewportView(table_showH);
		panel_ShowH.setLayout(gl_panel_ShowH);
		
		panel_ShowR = new JPanel();
		panel_ShowR.setBackground(new Color(0, 40, 40));
		panel_PCenter.add(panel_ShowR, "name_263100679818000");
		panel_ShowR.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_17 = new JPanel();
		panel_17.setBackground(new Color(0, 40, 40));
		panel_ShowR.add(panel_17);
		
		scrollPane_6 = new JScrollPane();
		
		panel_21 = new JPanel();
		panel_21.setBackground(new Color(0, 40, 40));
		panel_21.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		
		btnShowR = new JButton("Show");
		btnShowR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowRActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowR.setForeground(Color.WHITE);
		btnShowR.setBackground(Color.BLACK);
		
		panel_22 = new JPanel();
		panel_22.setBorder(new TitledBorder(null, "Prisoner", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_22.setBackground(new Color(0, 40, 40));
		
		lblSR = new JLabel("");
		GroupLayout gl_panel_17 = new GroupLayout(panel_17);
		gl_panel_17.setHorizontalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_17.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_17.createSequentialGroup()
							.addComponent(btnShowR, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 628, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addComponent(lblSR, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_6, GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_17.setVerticalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel_17.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_17.createSequentialGroup()
							.addGroup(gl_panel_17.createParallelGroup(Alignment.BASELINE)
								.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane_6, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_17.createSequentialGroup()
							.addComponent(lblSR, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnShowR, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
					.addGap(50))
		);
		
		comboBox_3 = new JComboBox();
		comboBox_3.addItem("ALL");
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox_3.addItem(p.getAreaName());
		});
		
		lblNewLabel_38 = new JLabel("Cell");
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_38.setForeground(new Color(255, 255, 255));
		lblNewLabel_38.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		lblNewLabel_43 = new JLabel("ID");
		lblNewLabel_43.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_43.setForeground(new Color(255, 255, 255));
		lblNewLabel_43.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		CellR = new JTextField();
		CellR.setColumns(10);
		
		IDR = new JTextField();
		IDR.setColumns(10);
		
		SearchR = new JTextField();
		SearchR.setColumns(10);
		
		lblNewLabel_42 = new JLabel("Search");
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_42.setForeground(Color.WHITE);
		lblNewLabel_42.setFont(new Font("SansSerif", Font.PLAIN, 12));
		GroupLayout gl_panel_21 = new GroupLayout(panel_21);
		gl_panel_21.setHorizontalGroup(
			gl_panel_21.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_21.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_38, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(CellR, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_43, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(IDR, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_42, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SearchR, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE))
		);
		gl_panel_21.setVerticalGroup(
			gl_panel_21.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_21.createSequentialGroup()
					.addGroup(gl_panel_21.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_43, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
						.addGroup(gl_panel_21.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNewLabel_38, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
					.addGap(56))
				.addGroup(gl_panel_21.createSequentialGroup()
					.addComponent(CellR, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel_21.createSequentialGroup()
					.addComponent(IDR, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel_21.createSequentialGroup()
					.addGroup(gl_panel_21.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel_42, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(SearchR, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_21.setLayout(gl_panel_21);
		
		lblSRP = new JLabel("");
		
		lblNewLabel_36 = new JLabel("Prisoner ID");
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_36.setOpaque(true);
		lblNewLabel_36.setBackground(new Color(0, 128, 64));
		lblNewLabel_36.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_37 = new JLabel("Last Name");
		lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_37.setForeground(new Color(255, 255, 255));
		lblNewLabel_37.setBackground(new Color(97, 158, 123));
		lblNewLabel_37.setOpaque(true);
		
		lblNewLabel_39 = new JLabel("Area");
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_39.setForeground(new Color(255, 255, 255));
		lblNewLabel_39.setBackground(new Color(97, 158, 123));
		lblNewLabel_39.setOpaque(true);
		
		lblNewLabel_40 = new JLabel("Cell");
		lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_40.setOpaque(true);
		lblNewLabel_40.setBackground(new Color(0, 128, 64));
		lblNewLabel_40.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_41 = new JLabel("Floor");
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_41.setForeground(new Color(255, 255, 255));
		lblNewLabel_41.setBackground(new Color(97, 158, 123));
		lblNewLabel_41.setOpaque(true);
		
		RID = new JLabel("");
		RID.setHorizontalAlignment(SwingConstants.CENTER);
		RID.setForeground(new Color(255, 255, 255));
		RID.setBackground(new Color(0, 128, 64));
		RID.setOpaque(true);
		
		RLN = new JLabel("");
		RLN.setHorizontalAlignment(SwingConstants.CENTER);
		RLN.setOpaque(true);
		RLN.setBackground(new Color(97, 158, 123));
		RLN.setForeground(new Color(255, 255, 255));
		
		RA = new JLabel("");
		RA.setHorizontalAlignment(SwingConstants.CENTER);
		RA.setOpaque(true);
		RA.setBackground(new Color(97, 158, 123));
		RA.setForeground(new Color(255, 255, 255));
		
		RC = new JLabel("");
		RC.setHorizontalAlignment(SwingConstants.CENTER);
		RC.setForeground(new Color(255, 255, 255));
		RC.setBackground(new Color(0, 128, 64));
		RC.setOpaque(true);
		
		RF = new JLabel("");
		RF.setHorizontalAlignment(SwingConstants.CENTER);
		RF.setOpaque(true);
		RF.setBackground(new Color(97, 158, 123));
		RF.setForeground(new Color(255, 255, 255));
		GroupLayout gl_panel_22 = new GroupLayout(panel_22);
		gl_panel_22.setHorizontalGroup(
			gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_22.createSequentialGroup()
					.addComponent(lblSRP, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_36, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_37, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_39, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_40, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_41, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
						.addComponent(RID, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(RLN, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(RA, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(RC, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
						.addComponent(RF, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_22.setVerticalGroup(
			gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_22.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_22.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblSRP, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_panel_22.createSequentialGroup()
							.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
								.addComponent(RID, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_36, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_37, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(RLN, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_39, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(RA, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_40, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(RC, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_22.createParallelGroup(Alignment.LEADING)
								.addComponent(RF, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_41, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))))
					.addGap(34))
		);
		gl_panel_22.linkSize(SwingConstants.VERTICAL, new Component[] {lblNewLabel_40, lblNewLabel_41, RF});
		gl_panel_22.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_36, lblNewLabel_37, lblNewLabel_39, lblNewLabel_40, lblNewLabel_41});
		panel_22.setLayout(gl_panel_22);
		
		table_showR = new JTable();
		table_showR.setAutoCreateRowSorter(true);
		table_showR.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					table_showRMouseClicked(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		scrollPane_6.setViewportView(table_showR);
		panel_17.setLayout(gl_panel_17);
		
		panel_20 = new JPanel();
		panel_20.setBackground(new Color(0, 40, 40));
		panel_ShowR.add(panel_20);
		GroupLayout gl_panel_20 = new GroupLayout(panel_20);
		gl_panel_20.setHorizontalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1088, Short.MAX_VALUE)
		);
		gl_panel_20.setVerticalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGap(0, 338, Short.MAX_VALUE)
		);
		panel_20.setLayout(gl_panel_20);
		
		panel_areas = new JPanel();
		panel_areas.setBackground(new Color(0, 40, 40));
		panel_Body.add(panel_areas, "name_1038385072255100");
		
		panel_27 = new JPanel();
		panel_27.setBackground(new Color(0, 40, 40));
		
		panel_28 = new JPanel();
		panel_28.setBackground(new Color(0, 40, 40));
		
		separator_1 = new JSeparator();
		
		panel_29 = new JPanel();
		panel_29.setBorder(new TitledBorder(null, "AREAS", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_29.setBackground(new Color(64, 128, 128));
		
		panel_30 = new JPanel();
		panel_30.setBorder(new TitledBorder(null, "CELL", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_30.setBackground(new Color(64, 128, 128));
		
		lblNewLabel_71 = new JLabel("Area Name");
		
		lblNewLabel_72 = new JLabel("Description");
		
		lblNewLabel_73 = new JLabel("Location");
		
		AADDAN = new JTextField();
		AADDAN.setColumns(10);
		
		AADDD = new JTextField();
		AADDD.setColumns(10);
		
		AADDL = new JTextField();
		AADDL.setColumns(10);
		
		btnADDA = new JButton("ADD");
		btnADDA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnADDAActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnADDA.setForeground(Color.WHITE);
		btnADDA.setBackground(Color.BLACK);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBackground(new Color(0, 0, 0));
		
		lblNewLabel_74 = new JLabel("Area ID");
		
		lblNewLabel_75 = new JLabel("Area Name");
		
		lblNewLabel_76 = new JLabel("Description");
		
		lblNewLabel_77 = new JLabel("Location");
		
		AUAID = new JTextField();
		AUAID.setColumns(10);
		
		AUAN = new JTextField();
		AUAN.setColumns(10);
		
		AUD = new JTextField();
		AUD.setColumns(10);
		
		AUL = new JTextField();
		AUL.setColumns(10);
		
		btnShowAU = new JButton("Show");
		btnShowAU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowAUActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnShowAU.setForeground(Color.WHITE);
		btnShowAU.setBackground(Color.BLACK);
		
		btnCencelA = new JButton("Cancel");
		btnCencelA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCencelAActionPerformed(e);
			}
		});
		
		btnCencelA.setForeground(Color.WHITE);
		btnCencelA.setBackground(new Color(128, 0, 0));
		
		btnUA = new JButton("Update");
		btnUA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnUAActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUA.setForeground(Color.WHITE);
		btnUA.setBackground(new Color(0, 0, 0));
		GroupLayout gl_panel_29 = new GroupLayout(panel_29);
		gl_panel_29.setHorizontalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_71, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_74, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_75, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_76, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_77, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_29.createSequentialGroup()
							.addComponent(AADDAN, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(btnADDA, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_29.createSequentialGroup()
							.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
								.addComponent(AUAID, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(AUAN, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(AUD, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(AUL, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
							.addGap(37)
							.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCencelA, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnShowAU, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnUA, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
							.addGap(4))))
				.addGroup(gl_panel_29.createSequentialGroup()
					.addGap(6)
					.addComponent(lblNewLabel_72, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(AADDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_29.createSequentialGroup()
					.addGap(6)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_29.createSequentialGroup()
					.addGap(6)
					.addComponent(lblNewLabel_73, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(AADDL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_29.setVerticalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_29.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_29.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_71, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(AADDAN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(gl_panel_29.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_72, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(AADDD, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_29.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_73, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(AADDL, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_29.createSequentialGroup()
							.addGap(18)
							.addComponent(btnADDA, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_29.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_29.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_29.createSequentialGroup()
									.addComponent(lblNewLabel_74, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_29.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_75, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(AUAN, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_29.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_76, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(AUD, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
								.addComponent(AUAID, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_29.createParallelGroup(Alignment.BASELINE)
								.addComponent(AUL, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_77, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_29.createSequentialGroup()
							.addGap(18)
							.addComponent(btnShowAU, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCencelA, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnUA, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addGap(48))
		);
		gl_panel_29.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_71, lblNewLabel_74, lblNewLabel_75, lblNewLabel_76, lblNewLabel_77});
		gl_panel_29.linkSize(SwingConstants.HORIZONTAL, new Component[] {AADDAN, AADDD, AADDL});
		panel_29.setLayout(gl_panel_29);
		
		scrollPane_8 = new JScrollPane();
		
		btnShowC = new JButton("Show");
		btnShowC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowCActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowC.setForeground(Color.WHITE);
		btnShowC.setBackground(Color.BLACK);
		
		comboBox_4 = new JComboBox();
		comboBox_4.addItem("ALL");
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox_4.addItem(p.getAreaName());
		});
		
		lblNewLabel_70 = new JLabel(" Prisoner:");
		lblNewLabel_70.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_70.setOpaque(true);
		lblNewLabel_70.setBackground(new Color(0, 40, 40));
		lblNewLabel_70.setForeground(new Color(255, 255, 255));
		
		NOPIC = new JLabel("");
		NOPIC.setVerticalAlignment(SwingConstants.TOP);
		NOPIC.setFont(new Font("SansSerif", Font.PLAIN, 12));
		NOPIC.setForeground(new Color(255, 255, 255));
		NOPIC.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnDeleteA_1 = new JButton("Delete");
		btnDeleteA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnDeleteA_1ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDeleteA_1.setForeground(Color.WHITE);
		btnDeleteA_1.setBackground(new Color(128, 0, 0));
		
		
		GroupLayout gl_panel_28 = new GroupLayout(panel_28);
		gl_panel_28.setHorizontalGroup(
			gl_panel_28.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_28.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_28.createParallelGroup(Alignment.LEADING, false)
						.addComponent(scrollPane_8, GroupLayout.PREFERRED_SIZE, 472, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_28.createSequentialGroup()
							.addComponent(btnShowC, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDeleteA_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(48)
							.addComponent(lblNewLabel_70, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(NOPIC, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(1)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_28.setVerticalGroup(
			gl_panel_28.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_28.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_8, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_28.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_28.createSequentialGroup()
							.addGroup(gl_panel_28.createParallelGroup(Alignment.TRAILING)
								.addComponent(NOPIC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_panel_28.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnShowC, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
									.addComponent(comboBox_4, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
									.addComponent(btnDeleteA_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
							.addGap(18))
						.addGroup(gl_panel_28.createSequentialGroup()
							.addComponent(lblNewLabel_70, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addContainerGap())))
		);
		
		table_showC = new JTable();
		table_showC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					table_showCMouseClicked(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
			
		scrollPane_8.setViewportView(table_showC);
		panel_28.setLayout(gl_panel_28);
		
		scrollPane_7 = new JScrollPane();
		
		btnShowA = new JButton("Show");
		btnShowA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowAActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowA.setForeground(Color.WHITE);
		btnShowA.setBackground(Color.BLACK);
		
		btnDeleteA = new JButton("Delete");
		btnDeleteA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnDeleteAActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDeleteA.setForeground(Color.WHITE);
		btnDeleteA.setBackground(new Color(128, 0, 0));
		GroupLayout gl_panel_27 = new GroupLayout(panel_27);
		gl_panel_27.setHorizontalGroup(
			gl_panel_27.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_27.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_27.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_27.createSequentialGroup()
							.addComponent(scrollPane_7, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(8, Short.MAX_VALUE))
						.addGroup(gl_panel_27.createSequentialGroup()
							.addComponent(btnShowA, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnDeleteA, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))))
		);
		gl_panel_27.setVerticalGroup(
			gl_panel_27.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_27.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_7, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_27.createParallelGroup(Alignment.LEADING)
						.addComponent(btnShowA, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDeleteA, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		
		table_showA = new JTable();
		scrollPane_7.setViewportView(table_showA);
		panel_27.setLayout(gl_panel_27);
		GroupLayout gl_panel_areas = new GroupLayout(panel_areas);
		gl_panel_areas.setHorizontalGroup(
			gl_panel_areas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_areas.createSequentialGroup()
					.addGap(21)
					.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 478, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_areas.createSequentialGroup()
					.addGap(27)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 1009, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_areas.createSequentialGroup()
					.addGap(27)
					.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(63)
					.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_areas.setVerticalGroup(
			gl_panel_areas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_areas.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel_areas.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_panel_areas.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))
		);
		
		panel_31 = new JPanel();
		
		btnC = new JButton("CELL");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCActionPerformed(e);
			}
		});
		btnC.setForeground(new Color(255, 255, 255));
		btnC.setBackground(new Color(0, 43, 0));
		
		btnUA_2 = new JButton("IsoLation Cell");
		btnUA_2.setForeground(new Color(255, 255, 255));
		btnUA_2.setBackground(new Color(0, 43, 0));
		GroupLayout gl_panel_30 = new GroupLayout(panel_30);
		gl_panel_30.setHorizontalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_30.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_30.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_30.createSequentialGroup()
							.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnUA_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_30.setVerticalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_30.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addGroup(gl_panel_30.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnUA_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel_30.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnC, btnUA_2});
		panel_31.setLayout(new CardLayout(0, 0));
		
		panel_UC = new JPanel();
		panel_UC.setBackground(new Color(64, 128, 128));
		panel_31.add(panel_UC, "name_1661360761665800");
		
		lblNewLabel_83 = new JLabel("Cell ID");
		
		lblNewLabel_84 = new JLabel("Cell Number");
		
		lblNewLabel_85 = new JLabel("Status");
		
		lblNewLabel_86 = new JLabel("Area name");
		
		lblNewLabel_87 = new JLabel("Size");
		
		lblNewLabel_88 = new JLabel("Floor");
		
		txtCellId = new JTextField();
		txtCellId.setColumns(10);
		
		txtCellNumber = new JTextField();
		txtCellNumber.setColumns(10);
		
		txtSize = new JTextField();
		txtSize.setColumns(10);
		
		txtFloor = new JTextField();
		txtFloor.setColumns(10);
		
		btnADDA_1 = new JButton("ADD");
		btnADDA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnADDA_1ActionPerformed(e);
			}
		});
		btnADDA_1.setForeground(Color.WHITE);
		btnADDA_1.setBackground(Color.BLACK);
		
		btnUpdate_3 = new JButton("Update");
		btnUpdate_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnUpdate_3ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUpdate_3.setForeground(Color.WHITE);
		btnUpdate_3.setBackground(Color.BLACK);
		
		comboBox_5 = new JComboBox();
		comboBox_5.addItem("Active");
		comboBox_5.addItem("Inactive");
		
		comboBox_6 = new JComboBox();
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox_6.addItem(p.getAreaName());
		});
		
		btnSUC = new JButton("Show");
		btnSUC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSUCActionPerformed(e);
			}
		});
		btnSUC.setForeground(Color.WHITE);
		btnSUC.setBackground(Color.BLACK);
		
		btnCencelA_1 = new JButton("Cancel");
		btnCencelA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCencelA_1ActionPerformed(e);
			}
		});
		btnCencelA_1.setForeground(Color.WHITE);
		btnCencelA_1.setBackground(new Color(128, 0, 0));
		GroupLayout gl_panel_UC = new GroupLayout(panel_UC);
		gl_panel_UC.setHorizontalGroup(
			gl_panel_UC.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_UC.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_panel_UC.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_UC.createSequentialGroup()
							.addGroup(gl_panel_UC.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_UC.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_87, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_88, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_84, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_85, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_86, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_UC.createParallelGroup(Alignment.LEADING)
								.addComponent(txtFloor, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_UC.createSequentialGroup()
									.addComponent(txtSize, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(txtCellNumber, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_UC.createSequentialGroup()
							.addComponent(lblNewLabel_83, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCellId, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
					.addGap(12)
					.addGroup(gl_panel_UC.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCencelA_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSUC, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnADDA_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdate_3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addGap(41))
		);
		gl_panel_UC.setVerticalGroup(
			gl_panel_UC.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_UC.createSequentialGroup()
					.addGroup(gl_panel_UC.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_UC.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panel_UC.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_83, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCellId, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_UC.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_84, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCellNumber, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_UC.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_85, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_UC.createSequentialGroup()
							.addGap(26)
							.addComponent(btnSUC, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCencelA_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_UC.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_UC.createSequentialGroup()
							.addComponent(btnADDA_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnUpdate_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_UC.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_panel_UC.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_87, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtSize, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_UC.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_88, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtFloor, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
					.addGap(11))
				.addGroup(gl_panel_UC.createSequentialGroup()
					.addGap(127)
					.addGroup(gl_panel_UC.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_86, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(100, Short.MAX_VALUE))
		);
		panel_UC.setLayout(gl_panel_UC);
		
		panel_AC = new JPanel();
		panel_AC.setBackground(new Color(64, 128, 128));
		panel_31.add(panel_AC, "name_1661363470174300");
		
		lblNewLabel_78 = new JLabel("Cell Number");
		
		lblNewLabel_79 = new JLabel("Status");
		
		lblNewLabel_80 = new JLabel("Size");
		
		lblNewLabel_81 = new JLabel("Area Name");
		
		lblNewLabel_82 = new JLabel("Floor_N");
		
		txtCellNBadd = new JTextField();
		txtCellNBadd.setColumns(10);
		
		txtSizeadd = new JTextField();
		txtSizeadd.setColumns(10);
		
		txtFlooradd = new JTextField();
		txtFlooradd.setColumns(10);
		
		btnADDC = new JButton("ADD");
		btnADDC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnADDCActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnADDC.setForeground(Color.WHITE);
		btnADDC.setBackground(Color.BLACK);
		
		btnUpdateCell = new JButton("Update");
		btnUpdateCell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUpdateCellActionPerformed(e);
			}
		});
		btnUpdateCell.setForeground(Color.WHITE);
		btnUpdateCell.setBackground(Color.BLACK);
		
		comboBox_7 = new JComboBox();
		comboBox_7.addItem("Active");
		comboBox.addItem("Inactive");
		
		comboBox_8 = new JComboBox();
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox_8.addItem(p.getAreaName());
		});
		
		GroupLayout gl_panel_AC = new GroupLayout(panel_AC);
		gl_panel_AC.setHorizontalGroup(
			gl_panel_AC.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_AC.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel_AC.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_AC.createSequentialGroup()
							.addComponent(lblNewLabel_79, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_AC.createSequentialGroup()
							.addComponent(lblNewLabel_78, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCellNBadd, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_AC.createSequentialGroup()
							.addComponent(lblNewLabel_82, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtFlooradd, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_AC.createSequentialGroup()
							.addComponent(lblNewLabel_81, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_AC.createSequentialGroup()
							.addComponent(lblNewLabel_80, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtSizeadd, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addGroup(gl_panel_AC.createParallelGroup(Alignment.LEADING)
						.addComponent(btnADDC, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdateCell, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		gl_panel_AC.setVerticalGroup(
			gl_panel_AC.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_AC.createSequentialGroup()
					.addContainerGap(31, Short.MAX_VALUE)
					.addGroup(gl_panel_AC.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_78, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCellNBadd, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_AC.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_79, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_AC.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_80, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSizeadd, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_AC.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_81, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_AC.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_82, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFlooradd, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(29))
				.addGroup(gl_panel_AC.createSequentialGroup()
					.addGap(79)
					.addComponent(btnADDC, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnUpdateCell, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		panel_AC.setLayout(gl_panel_AC);
		
		panel_USC = new JPanel();
		panel_31.add(panel_USC, "name_1661365701037000");
		
		panel_ASC = new JPanel();
		panel_31.add(panel_ASC, "name_1661367952531400");
		panel_30.setLayout(gl_panel_30);
		panel_areas.setLayout(gl_panel_areas);
		
		panel_account = new JPanel();
		panel_account.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		panel_account.setBackground(new Color(0, 40, 40));
		panel_Body.add(panel_account, "name_1038386697681100");
		
		CreateAcc = new JPanel();
		CreateAcc.setBorder(new TitledBorder(null, "Create Account", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		CreateAcc.setBackground(new Color(0, 40, 40));
		GridBagLayout gbl_CreateAcc = new GridBagLayout();
		gbl_CreateAcc.columnWidths = new int[]{78, 38, 102, 64, 20, 20, 20, 0, 0, 0};
		gbl_CreateAcc.rowHeights = new int[]{20, 40, 40, 40, 0, 0};
		gbl_CreateAcc.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_CreateAcc.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		CreateAcc.setLayout(gbl_CreateAcc);
		
		lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		CreateAcc.add(lblNewLabel, gbc_lblNewLabel);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUser.setColumns(10);
		GridBagConstraints gbc_txtUser = new GridBagConstraints();
		gbc_txtUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUser.gridwidth = 5;
		gbc_txtUser.insets = new Insets(0, 0, 5, 5);
		gbc_txtUser.gridx = 1;
		gbc_txtUser.gridy = 1;
		CreateAcc.add(txtUser, gbc_txtUser);
		
		btnAddAccount = new JButton("ADD");
		btnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnAddAccountActionPerformed(e);
				} catch (HeadlessException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddAccount.setForeground(new Color(255, 255, 255));
		btnAddAccount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddAccount.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnAddAccount = new GridBagConstraints();
		gbc_btnAddAccount.fill = GridBagConstraints.BOTH;
		gbc_btnAddAccount.gridwidth = 3;
		gbc_btnAddAccount.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddAccount.gridx = 6;
		gbc_btnAddAccount.gridy = 1;
		CreateAcc.add(btnAddAccount, gbc_btnAddAccount);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassword.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 2;
		CreateAcc.add(lblPassword, gbc_lblPassword);
		
		txtPass = new JTextField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPass.setColumns(10);
		GridBagConstraints gbc_txtPass = new GridBagConstraints();
		gbc_txtPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPass.gridwidth = 5;
		gbc_txtPass.insets = new Insets(0, 0, 5, 5);
		gbc_txtPass.gridx = 1;
		gbc_txtPass.gridy = 2;
		CreateAcc.add(txtPass, gbc_txtPass);
		
		btnShowAccount = new JButton("SHOW");
		btnShowAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowAccountActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowAccount.setForeground(new Color(255, 255, 255));
		
		btnShowAccount.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnShowAccount.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnShowAccount = new GridBagConstraints();
		gbc_btnShowAccount.gridwidth = 3;
		gbc_btnShowAccount.fill = GridBagConstraints.BOTH;
		gbc_btnShowAccount.insets = new Insets(0, 0, 5, 0);
		gbc_btnShowAccount.gridx = 6;
		gbc_btnShowAccount.gridy = 2;
		CreateAcc.add(btnShowAccount, gbc_btnShowAccount);
		
		lblWad = new JLabel("Wardens ID");
		lblWad.setForeground(Color.WHITE);
		lblWad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblWad.setBackground(Color.BLACK);
		GridBagConstraints gbc_lblWad = new GridBagConstraints();
		gbc_lblWad.insets = new Insets(0, 0, 5, 5);
		gbc_lblWad.gridx = 0;
		gbc_lblWad.gridy = 3;
		CreateAcc.add(lblWad, gbc_lblWad);
		
		txtWardens = new JTextField();
		txtWardens.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtWardens.setColumns(10);
		GridBagConstraints gbc_txtWardens = new GridBagConstraints();
		gbc_txtWardens.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtWardens.gridwidth = 5;
		gbc_txtWardens.insets = new Insets(0, 0, 5, 5);
		gbc_txtWardens.gridx = 1;
		gbc_txtWardens.gridy = 3;
		CreateAcc.add(txtWardens, gbc_txtWardens);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Search");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBackground(Color.BLACK);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(10, 6));
		scrollPane_1.setBorder(null);
		scrollPane_1.setForeground(new Color(255, 255, 255));
		scrollPane_1.getViewport().setBackground(new Color(0,40,40));
		
		btnAction = new JButton("Action");
		btnAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnActionActionPerformed(e);
			}
		});
		btnAction.setForeground(new Color(255, 255, 255));
		btnAction.setBackground(new Color(0, 0, 0));
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeleteActionPerformed(e);
			}
		});
		btnDelete.setForeground(new Color(255, 255, 255));
		btnDelete.setBackground(new Color(128, 0, 0));
		
		btnUpdate = new JButton("Update");
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setBackground(new Color(0, 0, 0));
		
		panel_showMoreLess = new JPanel();
		panel_showMoreLess.setOpaque(false);
		panel_showMoreLess.setBackground(new Color(0, 40, 40));
		
		panel_showWardenHight = new JPanel();
		
		panel_showWardenHight.setBorder(new TitledBorder(null, "Show Wardens High", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_showWardenHight.setForeground(new Color(0, 40, 40));
		panel_showWardenHight.setBackground(new Color(0, 40, 40));
		GroupLayout gl_panel_account = new GroupLayout(panel_account);
		gl_panel_account.setHorizontalGroup(
			gl_panel_account.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_account.createSequentialGroup()
					.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_account.createSequentialGroup()
							.addGap(44)
							.addComponent(CreateAcc, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_account.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_panel_account.createSequentialGroup()
								.addGap(47)
								.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_account.createSequentialGroup()
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
									.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
									.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnAction, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_showWardenHight, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
							.addGroup(Alignment.LEADING, gl_panel_account.createSequentialGroup()
								.addContainerGap()
								.addComponent(panel_showMoreLess, GroupLayout.PREFERRED_SIZE, 1105, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panel_account.setVerticalGroup(
			gl_panel_account.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_account.createSequentialGroup()
					.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_account.createSequentialGroup()
							.addGap(13)
							.addGroup(gl_panel_account.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_account.createSequentialGroup()
									.addGroup(gl_panel_account.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_panel_account.createSequentialGroup()
									.addGap(92)
									.addComponent(btnAction, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_account.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_showWardenHight, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_showMoreLess, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(CreateAcc, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addGap(108))
		);
		
		btnShowWardensHight = new JButton("SHOW");
		btnShowWardensHight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowWardensHightActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowWardensHight.setForeground(Color.WHITE);
		btnShowWardensHight.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnShowWardensHight.setBackground(Color.BLACK);
		GridBagConstraints gbc_btnShowWardensHight = new GridBagConstraints();
		gbc_btnShowWardensHight.fill = GridBagConstraints.BOTH;
		gbc_btnShowWardensHight.gridwidth = 3;
		gbc_btnShowWardensHight.insets = new Insets(0, 0, 5, 5);
		gbc_btnShowWardensHight.gridx = 6;
		gbc_btnShowWardensHight.gridy = 3;
		CreateAcc.add(btnShowWardensHight, gbc_btnShowWardensHight);
		
		table_showAccount = new JTable() {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
	            Component comp = super.prepareRenderer(renderer, row, column);
	            Color alternateColor = new Color(200, 201, 210);
	            Color whiteColor = Color.WHITE;
	            Color bg = comp.getBackground();
	            if(!comp.getBackground().equals(getSelectionBackground())) {
	               Color c = (row % 2 == 0 ? alternateColor : whiteColor);
	               comp.setBackground(bg);
	               c = null;
	            }
	            return comp;
	         }
		};
		table_showAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					table_showAccountMouseClicked(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		table_showAccount.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table_showAccount.setGridColor(new Color(128, 128, 64));
		table_showAccount.setForeground(new Color(255, 255, 255));
		table_showAccount.setSelectionForeground(new Color(255, 255, 255));
		table_showAccount.setSelectionBackground(new Color(0, 128, 64));
		table_showAccount.setBackground(new Color(0, 64, 64));
		scrollPane_1.setViewportView(table_showAccount);
		panel_showMoreLess.setLayout(new CardLayout(0, 0));
		
		panel_showMore = new JPanel();
		panel_showMore.setBackground(new Color(0, 40, 40));
		panel_showMoreLess.add(panel_showMore, "name_1043142193808600");
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setEnabled(false);
		scrollPane.setBackground(new Color(64, 128, 128));
		
		btnShowmore = new JButton("Show More");
		btnShowmore.setForeground(new Color(255, 255, 255));
		btnShowmore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnShowmoreActionPerformed(e);
			}
		});
		btnShowmore.setBackground(new Color(0, 0, 0));
		GroupLayout gl_panel_showMore = new GroupLayout(panel_showMore);
		gl_panel_showMore.setHorizontalGroup(
			gl_panel_showMore.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showMore.createSequentialGroup()
					.addGap(39)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnShowmore, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
					.addGap(505))
		);
		gl_panel_showMore.setVerticalGroup(
			gl_panel_showMore.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_showMore.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_showMore.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
						.addComponent(btnShowmore, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
					.addGap(12))
		);
		
		table_showless = new JTable();
		table_showless.setBorder(null);
		table_showless.setEnabled(false);
		table_showless.setRowSelectionAllowed(false);
		table_showless.setBackground(new Color(0, 64, 64));
		table_showless.setForeground(new Color(255, 255, 255));
		scrollPane.setViewportView(table_showless);
		panel_showMore.setLayout(gl_panel_showMore);
		
		panel_showLess = new JPanel();
		panel_showLess.setBackground(new Color(0, 40, 40));
		panel_showMoreLess.add(panel_showLess, "name_1043145970182400");
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBorder(null);
		
		ShowLess = new JButton("Show Less");
		ShowLess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowLessActionPerformed(e);
			}
		});
		ShowLess.setForeground(Color.WHITE);
		ShowLess.setBackground(Color.BLACK);
		GroupLayout gl_panel_showLess = new GroupLayout(panel_showLess);
		gl_panel_showLess.setHorizontalGroup(
			gl_panel_showLess.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_showLess.createSequentialGroup()
					.addContainerGap(39, Short.MAX_VALUE)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 952, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ShowLess, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
		);
		gl_panel_showLess.setVerticalGroup(
			gl_panel_showLess.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showLess.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_showLess.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addComponent(ShowLess, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
					.addGap(12))
		);
		
		table_showmore = new JTable();
		table_showmore.setBorder(null);
		table_showmore.setEnabled(false);
		table_showmore.setRowSelectionAllowed(false);
		table_showmore.setForeground(new Color(255, 255, 255));
		table_showmore.setBackground(new Color(0, 64, 64));
		scrollPane_3.setViewportView(table_showmore);
		panel_showLess.setLayout(gl_panel_showLess);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(null);
		scrollPane_2.getViewport().setBackground(new Color(0,40,40));
		contentPane.setLayout(new BorderLayout(0, 0));
		GroupLayout gl_panel_showWardenHight = new GroupLayout(panel_showWardenHight);
		gl_panel_showWardenHight.setHorizontalGroup(
			gl_panel_showWardenHight.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_showWardenHight.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_showWardenHight.setVerticalGroup(
			gl_panel_showWardenHight.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showWardenHight.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table_showWardensHight = new JTable();
		table_showWardensHight.setForeground(new Color(255, 255, 255));
		table_showWardensHight.setBackground(new Color(0, 64, 64));
		table_showWardensHight.setEnabled(false);
		scrollPane_2.setViewportView(table_showWardensHight	);
		panel_showWardenHight.setLayout(gl_panel_showWardenHight);
		panel_account.setLayout(gl_panel_account);
		
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 40, 40));
		panel_Body.add(panel_7, "name_1038388635795000");
		
		panel_39 = new JPanel();
		panel_39.setBorder(new TitledBorder(null, "ADMIN", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_39.setBackground(new Color(64, 128, 128));
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(302)
					.addComponent(panel_39, GroupLayout.PREFERRED_SIZE, 480, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(307, Short.MAX_VALUE))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(163)
					.addComponent(panel_39, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(250, Short.MAX_VALUE))
		);
		
		lblNewLabel_89 = new JLabel("Username");
		lblNewLabel_89.setOpaque(true);
		lblNewLabel_89.setBackground(new Color(0, 128, 64));
		lblNewLabel_89.setForeground(new Color(255, 255, 255));
		lblNewLabel_89.setHorizontalAlignment(SwingConstants.CENTER);
		
		showUser = new JLabel("");
		showUser.setOpaque(true);
		showUser.setBackground(new Color(0, 128, 64));
		showUser.setForeground(new Color(255, 255, 255));
		showUser.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_96 = new JLabel("Password");
		lblNewLabel_96.setBackground(new Color(255, 255, 255));
		lblNewLabel_96.setOpaque(true);
		lblNewLabel_96.setForeground(new Color(0, 0, 0));
		lblNewLabel_96.setHorizontalAlignment(SwingConstants.CENTER);
		
		showPass = new JLabel("");
		showPass.setBackground(new Color(255, 255, 255));
		showPass.setOpaque(true);
		showPass.setForeground(new Color(0, 0, 0));
		showPass.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_98 = new JLabel("keyPass");
		lblNewLabel_98.setOpaque(true);
		lblNewLabel_98.setBackground(new Color(0, 128, 64));
		lblNewLabel_98.setForeground(new Color(255, 255, 255));
		lblNewLabel_98.setHorizontalAlignment(SwingConstants.CENTER);
		
		showKey = new JLabel("");
		showKey.setOpaque(true);
		showKey.setBackground(new Color(0, 128, 64));
		showKey.setForeground(new Color(255, 255, 255));
		showKey.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnChangePass = new JButton("Change Pass");
		btnChangePass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnChangePassActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnChangePass.setForeground(Color.WHITE);
		btnChangePass.setBackground(Color.BLACK);
		
		btnChangeKeypass = new JButton("Change keyPass");
		btnChangeKeypass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnChangeKeypassActionPerformed(e);
			}
		});
		btnChangeKeypass.setForeground(Color.WHITE);
		btnChangeKeypass.setBackground(Color.BLACK);
		GroupLayout gl_panel_39 = new GroupLayout(panel_39);
		gl_panel_39.setHorizontalGroup(
			gl_panel_39.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_39.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_39.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnChangePass, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(lblNewLabel_98, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(lblNewLabel_96, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(lblNewLabel_89, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_39.createParallelGroup(Alignment.LEADING, false)
						.addComponent(showPass, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
						.addComponent(showKey, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
						.addComponent(btnChangeKeypass, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(showUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(74))
		);
		gl_panel_39.setVerticalGroup(
			gl_panel_39.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_39.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panel_39.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_89, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(showUser, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_39.createParallelGroup(Alignment.LEADING)
						.addComponent(showPass, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_96, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_39.createParallelGroup(Alignment.LEADING)
						.addComponent(showKey, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_98, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_39.createParallelGroup(Alignment.LEADING)
						.addComponent(btnChangeKeypass, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnChangePass, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		gl_panel_39.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblNewLabel_89, showUser, showPass, showKey});
		panel_39.setLayout(gl_panel_39);
		panel_7.setLayout(gl_panel_7);
		
		panel_8 = new JPanel();
		panel_Body.add(panel_8, "name_1038390434654900");
		contentPane.add(panel_Body);
		
		panel_wardens = new JPanel();
		panel_wardens.setBackground(new Color(0, 40, 40));
		panel_Body.add(panel_wardens, "name_1705322537492000");
		panel_wardens.setLayout(new BorderLayout(0, 0));
		
		panel_32 = new JPanel();
		panel_wardens.add(panel_32, BorderLayout.NORTH);
		panel_32.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblWS = new JLabel("Wardens");
		lblWS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblWSMouseClicked(e);
			}
		});
		lblWS.setForeground(new Color(255, 255, 255));
		lblWS.setOpaque(true);
		lblWS.setBackground(new Color(0, 64, 64));
		lblWS.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblWS.setHorizontalAlignment(SwingConstants.CENTER);
		panel_32.add(lblWS);
		
		lblWA = new JLabel("ADD");
		lblWA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_90MouseClicked(e);
			}
		});
		lblWA.setForeground(new Color(255, 255, 255));
		lblWA.setBackground(new Color(0, 64, 64));
		lblWA.setOpaque(true);
		lblWA.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblWA.setHorizontalAlignment(SwingConstants.CENTER);
		panel_32.add(lblWA);
		
		panel_bodyW = new JPanel();
		panel_wardens.add(panel_bodyW, BorderLayout.CENTER);
		panel_bodyW.setLayout(new CardLayout(0, 0));
		
		panel_addW = new JPanel();
		panel_addW.setBackground(new Color(0, 40, 40));
		panel_bodyW.add(panel_addW, "name_1705819110125400");
		
		panel_37 = new JPanel();
		panel_37.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_37.setBackground(new Color(64, 128, 128));
		
		lblId = new JLabel("Warden Id");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setForeground(Color.WHITE);
		
		txtWardenId = new JTextField();
		txtWardenId.setHorizontalAlignment(SwingConstants.LEFT);
		txtWardenId.setColumns(10);
		
		lblFirstName1 = new JLabel("First Name");
		lblFirstName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName1.setForeground(Color.WHITE);
		
		txtFirstName = new JTextField();
		txtFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstName.setColumns(10);
		
		lblLastName1 = new JLabel("Last Name");
		lblLastName1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName1.setForeground(Color.WHITE);
		
		txtLastname = new JTextField();
		txtLastname.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastname.setColumns(10);
		
		lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(Color.WHITE);
		
		txtAddress = new JTextField();
		txtAddress.setHorizontalAlignment(SwingConstants.LEFT);
		txtAddress.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.WHITE);
		
		txtEmail = new JTextField();
		txtEmail.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmail.setColumns(10);
		
		lblPhoneNumber = new JLabel("Phone");
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNumber.setForeground(Color.WHITE);
		
		txtPhone = new JTextField();
		txtPhone.setHorizontalAlignment(SwingConstants.LEFT);
		txtPhone.setColumns(10);
		
		lblGender_1 = new JLabel("Gender");
		lblGender_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender_1.setForeground(Color.WHITE);
		
		rdbtnMale = new JRadioButton("Male");
		buttonGroup_2.add(rdbtnMale);
		rdbtnMale.setSelected(true);
		rdbtnMale.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lblIsWorking = new JLabel("Work Status");
		lblIsWorking.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsWorking.setForeground(Color.WHITE);
		
		rdbtnHigh = new JRadioButton("Hight");
		buttonGroup_3.add(rdbtnHigh);
		rdbtnHigh.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		rdbtnFemale = new JRadioButton("Female");
		buttonGroup_2.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		rdbtnResigned = new JRadioButton("Resigned");
		buttonGroup_4.add(rdbtnResigned);
		rdbtnResigned.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		lblPosition = new JLabel("Position");
		lblPosition.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosition.setForeground(Color.WHITE);
		
		lblDayOff = new JLabel("Day OFF");
		lblDayOff.setHorizontalAlignment(SwingConstants.CENTER);
		lblDayOff.setForeground(Color.WHITE);
		
		rdbtnEmployed = new JRadioButton("Employed");
		buttonGroup_4.add(rdbtnEmployed);
		rdbtnEmployed.setSelected(true);
		rdbtnEmployed.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		txtDayOff = new JTextField();
		txtDayOff.setHorizontalAlignment(SwingConstants.LEFT);
		txtDayOff.setColumns(10);
		
		rdbtnLow = new JRadioButton("Low");
		buttonGroup_3.add(rdbtnLow);
		rdbtnLow.setSelected(true);
		rdbtnLow.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lblDob = new JLabel("Birth Day");
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setForeground(Color.WHITE);
		
		lblStartDate = new JLabel("Start Date");
		lblStartDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblStartDate.setForeground(Color.WHITE);
		
		lbArea = new JLabel("Area");
		lbArea.setHorizontalAlignment(SwingConstants.CENTER);
		lbArea.setForeground(Color.WHITE);
		
		lblSalary = new JLabel("Salary");
		lblSalary.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalary.setForeground(Color.WHITE);
		
		ShiftNumber = new JLabel("Shift");
		ShiftNumber.setHorizontalAlignment(SwingConstants.CENTER);
		ShiftNumber.setForeground(Color.WHITE);
		
		StartDate = new JDateChooser();
		StartDate.setDateFormatString("YYYY-MM-dd");
		
		dob1 = new JDateChooser();
		dob1.setDateFormatString("YYYY-MM-dd");
		
		txtSalary = new JTextField();
		txtSalary.setHorizontalAlignment(SwingConstants.LEFT);
		txtSalary.setColumns(10);
		
		cbbArea1 = new JComboBox();
		AreasDAO.selectTableAreas().forEach(a->{
			cbbArea1.addItem(a.getAreaName());
		});
		
		CbbShift = new JComboBox();
		CbbShift.setModel(new DefaultComboBoxModel(new String[] {"D", "N"}));
		GroupLayout gl_panel_37 = new GroupLayout(panel_37);
		gl_panel_37.setHorizontalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_37.createSequentialGroup()
							.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtWardenId, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_37.createSequentialGroup()
							.addComponent(lblFirstName1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_37.createSequentialGroup()
							.addComponent(lblLastName1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtLastname, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_37.createSequentialGroup()
							.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_37.createSequentialGroup()
							.addGap(6)
							.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
					.addGap(41)
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel_37.createSequentialGroup()
								.addComponent(lblPhoneNumber, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_37.createSequentialGroup()
								.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_37.createSequentialGroup()
										.addComponent(lblGender_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(rdbtnMale, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_panel_37.createSequentialGroup()
										.addGap(14)
										.addComponent(lblIsWorking, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
								.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
									.addComponent(rdbtnFemale, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addComponent(rdbtnResigned, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addComponent(rdbtnHigh, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_37.createSequentialGroup()
							.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPosition, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_37.createSequentialGroup()
									.addGap(6)
									.addComponent(lblDayOff, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnEmployed, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDayOff, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnLow, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_37.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
							.addGroup(gl_panel_37.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panel_37.createSequentialGroup()
									.addGroup(gl_panel_37.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblDob, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblStartDate, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
									.addGap(18))
								.addGroup(gl_panel_37.createSequentialGroup()
									.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
										.addComponent(lbArea, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSalary, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
										.addComponent(ShiftNumber, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
									.addGap(28)))
							.addGroup(gl_panel_37.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING, false)
									.addComponent(StartDate, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
									.addComponent(dob1, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
									.addComponent(txtSalary, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
								.addComponent(cbbArea1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_37.createSequentialGroup()
							.addGap(140)
							.addComponent(CbbShift, 0, 194, Short.MAX_VALUE)))
					.addContainerGap(100, Short.MAX_VALUE))
		);
		gl_panel_37.setVerticalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtWardenId, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPhoneNumber, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSalary, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSalary, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
						.addComponent(dob1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_37.createSequentialGroup()
							.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGender_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnFemale)
								.addComponent(rdbtnMale)
								.addComponent(lblDob, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_37.createSequentialGroup()
									.addGap(11)
									.addComponent(StartDate, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_37.createSequentialGroup()
									.addGroup(gl_panel_37.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_37.createSequentialGroup()
											.addGap(13)
											.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblPosition, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
												.addComponent(rdbtnLow)
												.addComponent(rdbtnHigh))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
												.addComponent(rdbtnEmployed)
												.addComponent(rdbtnResigned)
												.addComponent(lblIsWorking, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_panel_37.createSequentialGroup()
											.addGap(11)
											.addComponent(lblStartDate, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
												.addComponent(cbbArea1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
												.addComponent(lbArea, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDayOff, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtDayOff, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
										.addComponent(CbbShift, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
										.addComponent(ShiftNumber, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_37.createSequentialGroup()
							.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFirstName1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLastName1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtLastname, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAddress, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_37.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
					.addGap(9))
		);
		gl_panel_37.linkSize(SwingConstants.VERTICAL, new Component[] {StartDate, CbbShift});
		gl_panel_37.linkSize(SwingConstants.VERTICAL, new Component[] {dob1, txtSalary});
		gl_panel_37.linkSize(SwingConstants.HORIZONTAL, new Component[] {StartDate, CbbShift});
		gl_panel_37.linkSize(SwingConstants.HORIZONTAL, new Component[] {dob1, txtSalary});
		panel_37.setLayout(gl_panel_37);
		
		WDO = new JPanel();
		WDO.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		WDO.setBackground(new Color(64, 128, 128));
		
		btnShowWU = new JButton("Show");
		btnShowWU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowWUActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnShowWU.setForeground(Color.WHITE);
		btnShowWU.setBackground(Color.BLACK);
		
		lblWardID = new JLabel("Warden ID");
		lblWardID.setHorizontalAlignment(SwingConstants.CENTER);
		lblWardID.setForeground(Color.WHITE);
		
		WWID = new JTextField();
		WWID.setHorizontalAlignment(SwingConstants.LEFT);
		WWID.setColumns(10);
		
		btnCancel_1 = new JButton("Cancel");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCancel_1ActionPerformed(e);
			}
		});
		btnCancel_1.setForeground(Color.WHITE);
		btnCancel_1.setBackground(new Color(128, 0, 0));
		
		lblFirstName1_1 = new JLabel("First Name");
		lblFirstName1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName1_1.setForeground(Color.WHITE);
		
		WFN = new JTextField();
		WFN.setHorizontalAlignment(SwingConstants.LEFT);
		WFN.setColumns(10);
		
		lblEmail_1 = new JLabel("Email");
		lblEmail_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail_1.setForeground(Color.WHITE);
		
		WE = new JTextField();
		WE.setHorizontalAlignment(SwingConstants.LEFT);
		WE.setColumns(10);
		
		lblLastName1_1 = new JLabel("Last Name");
		lblLastName1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName1_1.setForeground(Color.WHITE);
		
		WLN = new JTextField();
		WLN.setHorizontalAlignment(SwingConstants.LEFT);
		WLN.setColumns(10);
		
		lblAddress_1 = new JLabel("Address");
		lblAddress_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_1.setForeground(Color.WHITE);
		
		WA = new JTextField();
		WA.setHorizontalAlignment(SwingConstants.LEFT);
		WA.setColumns(10);
		
		lblPhoneNumber_1 = new JLabel("Phone");
		lblPhoneNumber_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNumber_1.setForeground(Color.WHITE);
		
		WP = new JTextField();
		WP.setHorizontalAlignment(SwingConstants.LEFT);
		WP.setColumns(10);
		
		lblGender_2 = new JLabel("Gender");
		lblGender_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender_2.setForeground(Color.WHITE);
		
		rdbtnMale_1 = new JRadioButton("Male");
		buttonGroup_5.add(rdbtnMale_1);
		rdbtnMale_1.setSelected(true);
		rdbtnMale_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lblDayOff_1 = new JLabel("Day OFF");
		lblDayOff_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDayOff_1.setForeground(Color.WHITE);
		
		WDOU = new JTextField();
		WDOU.setHorizontalAlignment(SwingConstants.LEFT);
		WDOU.setColumns(10);
		
		lblIsWorking_1 = new JLabel("Work Status");
		lblIsWorking_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsWorking_1.setForeground(Color.WHITE);
		
		rdbtnEmployed_1 = new JRadioButton("Employed");
		buttonGroup_6.add(rdbtnEmployed_1);
		rdbtnEmployed_1.setSelected(true);
		rdbtnEmployed_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		rdbtnResigned_1 = new JRadioButton("Resigned");
		buttonGroup_6.add(rdbtnResigned_1);
		rdbtnResigned_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		rdbtnFemale_1 = new JRadioButton("Female");
		buttonGroup_5.add(rdbtnFemale_1);
		rdbtnFemale_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		lblSalary_1 = new JLabel("Salary");
		lblSalary_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalary_1.setForeground(Color.WHITE);
		
		WS = new JTextField();
		WS.setHorizontalAlignment(SwingConstants.LEFT);
		WS.setColumns(10);
		
		lblStartDate_1 = new JLabel("Start Date");
		lblStartDate_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblStartDate_1.setForeground(Color.WHITE);
		
		lblDob_1 = new JLabel("Birth Day");
		lblDob_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob_1.setForeground(Color.WHITE);
		
		StartDate2 = new JDateChooser();
		StartDate2.setDateFormatString("YYYY-MM-dd");
		
		dob2 = new JDateChooser();
		dob2.setDateFormatString("YYYY-MM-dd");
		GroupLayout gl_WDO = new GroupLayout(WDO);
		gl_WDO.setHorizontalGroup(
			gl_WDO.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_WDO.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_WDO.createParallelGroup(Alignment.LEADING)
						.addComponent(btnShowWU, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_WDO.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblWardID, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(WWID, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
						.addComponent(btnCancel_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_WDO.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_WDO.createSequentialGroup()
							.addGroup(gl_WDO.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_WDO.createSequentialGroup()
									.addComponent(lblFirstName1_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(WFN, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_WDO.createSequentialGroup()
									.addComponent(lblLastName1_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(WLN, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_WDO.createSequentialGroup()
									.addComponent(lblAddress_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(WA, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_WDO.createSequentialGroup()
									.addGap(6)
									.addComponent(lblEmail_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(WE, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_WDO.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPhoneNumber_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGender_2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblStartDate_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_WDO.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblSalary_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblIsWorking_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_WDO.createSequentialGroup()
							.addComponent(lblDayOff_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(WDOU, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_WDO.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_WDO.createSequentialGroup()
							.addComponent(rdbtnMale_1, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnFemale_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_WDO.createSequentialGroup()
							.addComponent(rdbtnEmployed_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnResigned_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_WDO.createSequentialGroup()
							.addComponent(WP, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDob_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dob2, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_WDO.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(WS, Alignment.LEADING)
							.addComponent(StartDate2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
					.addGap(118))
		);
		gl_WDO.setVerticalGroup(
			gl_WDO.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_WDO.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_WDO.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_WDO.createSequentialGroup()
							.addGroup(gl_WDO.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_WDO.createSequentialGroup()
									.addGroup(gl_WDO.createParallelGroup(Alignment.BASELINE)
										.addComponent(WFN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFirstName1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
									.addGap(12)
									.addGroup(gl_WDO.createParallelGroup(Alignment.LEADING)
										.addComponent(lblLastName1_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(WLN, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
									.addGap(12)
									.addGroup(gl_WDO.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAddress_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(WA, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
									.addGap(12)
									.addGroup(gl_WDO.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEmail_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
										.addComponent(WE, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_WDO.createSequentialGroup()
									.addComponent(lblWardID, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(WWID, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnShowWU, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCancel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_WDO.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDayOff_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(WDOU, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSalary_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(WS, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_WDO.createSequentialGroup()
							.addGroup(gl_WDO.createParallelGroup(Alignment.TRAILING)
								.addComponent(dob2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_WDO.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblPhoneNumber_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addComponent(WP, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblDob_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
							.addGap(13)
							.addGroup(gl_WDO.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblGender_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnMale_1)
								.addComponent(rdbtnFemale_1))
							.addGap(12)
							.addGroup(gl_WDO.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblStartDate_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(StartDate2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addGroup(gl_WDO.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIsWorking_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnEmployed_1)
								.addComponent(rdbtnResigned_1))))
					.addGap(29))
		);
		gl_WDO.linkSize(SwingConstants.VERTICAL, new Component[] {WP, WDOU});
		gl_WDO.linkSize(SwingConstants.HORIZONTAL, new Component[] {WP, WDOU});
		WDO.setLayout(gl_WDO);
		
		btnAddP_1 = new JButton("ADD");
		btnAddP_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnAddP_1ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddP_1.setForeground(Color.WHITE);
		btnAddP_1.setBackground(Color.BLACK);
		
		UpdateP_1 = new JButton("Update");
		UpdateP_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateP_1ActionPerformed(e);
			}
		});
		UpdateP_1.setForeground(Color.WHITE);
		UpdateP_1.setBackground(Color.BLACK);
		GroupLayout gl_panel_addW = new GroupLayout(panel_addW);
		gl_panel_addW.setHorizontalGroup(
			gl_panel_addW.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_addW.createSequentialGroup()
					.addGroup(gl_panel_addW.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_addW.createSequentialGroup()
							.addContainerGap()
							.addComponent(WDO, GroupLayout.PREFERRED_SIZE, 1038, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_panel_addW.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_panel_addW.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_addW.createSequentialGroup()
									.addComponent(btnAddP_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 846, Short.MAX_VALUE)
									.addComponent(UpdateP_1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel_37, 0, 0, Short.MAX_VALUE))))
					.addGap(28))
		);
		gl_panel_addW.setVerticalGroup(
			gl_panel_addW.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_addW.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_addW.createParallelGroup(Alignment.BASELINE)
						.addComponent(UpdateP_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAddP_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(WDO, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
					.addGap(43))
		);
		panel_addW.setLayout(gl_panel_addW);
		
		panel_showW = new JPanel();
		panel_showW.setBackground(new Color(0, 40, 40));
		panel_bodyW.add(panel_showW, "name_1705821581769500");
		
		scrollPane_9 = new JScrollPane();
		scrollPane_9.setBorder(null);
		
		panel_34 = new JPanel();
		panel_34.setBorder(new TitledBorder(null, "SEARCH", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_34.setBackground(new Color(0, 40, 40));
		
		comboBox_9 = new JComboBox();
		comboBox_9.addItem("ALL");
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox_9.addItem(p.getAreaName());
		});
		
		comboBoxDN = new JComboBox();
		comboBoxDN.addItem("D-N");
		comboBoxDN.addItem("D");
		comboBoxDN.addItem("N");
		
		lblNewLabel_91 = new JLabel("SEARCH");
		lblNewLabel_91.setForeground(Color.WHITE);
		
		txtSearchW = new JTextField();
		txtSearchW.setColumns(10);
		GroupLayout gl_panel_34 = new GroupLayout(panel_34);
		gl_panel_34.setHorizontalGroup(
			gl_panel_34.createParallelGroup(Alignment.LEADING)
				.addGap(0, 588, Short.MAX_VALUE)
				.addGroup(gl_panel_34.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(comboBoxDN, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addComponent(lblNewLabel_91, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtSearchW, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_34.setVerticalGroup(
			gl_panel_34.createParallelGroup(Alignment.LEADING)
				.addGap(0, 70, Short.MAX_VALUE)
				.addGroup(gl_panel_34.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_34.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSearchW, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_91)
						.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxDN, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_34.setLayout(gl_panel_34);
		
		panel_35 = new JPanel();
		panel_35.setForeground(Color.WHITE);
		panel_35.setBorder(new TitledBorder(null, "Prioner", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_35.setBackground(new Color(0, 40, 40));
		
		lblNewLabel_92 = new JLabel("Warden ID");
		lblNewLabel_92.setOpaque(true);
		lblNewLabel_92.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_92.setForeground(Color.WHITE);
		lblNewLabel_92.setBackground(new Color(97, 158, 123));
		
		lbshowWid = new JLabel("");
		lbshowWid.setOpaque(true);
		lbshowWid.setHorizontalAlignment(SwingConstants.CENTER);
		lbshowWid.setForeground(Color.WHITE);
		lbshowWid.setFont(new Font("Arial", Font.PLAIN, 15));
		lbshowWid.setBackground(new Color(97, 158, 123));
		
		lblFN_1 = new JLabel("First Name");
		lblFN_1.setOpaque(true);
		lblFN_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFN_1.setForeground(Color.WHITE);
		lblFN_1.setBackground(new Color(0, 128, 64));
		
		lbShowWfn = new JLabel("");
		lbShowWfn.setOpaque(true);
		lbShowWfn.setHorizontalAlignment(SwingConstants.CENTER);
		lbShowWfn.setForeground(Color.WHITE);
		lbShowWfn.setFont(new Font("Arial", Font.PLAIN, 15));
		lbShowWfn.setBackground(new Color(0, 128, 64));
		
		lblLN_1 = new JLabel("Last Name");
		lblLN_1.setOpaque(true);
		lblLN_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLN_1.setForeground(Color.WHITE);
		lblLN_1.setBackground(new Color(97, 158, 123));
		
		lbShowWln = new JLabel("");
		lbShowWln.setOpaque(true);
		lbShowWln.setHorizontalAlignment(SwingConstants.CENTER);
		lbShowWln.setForeground(Color.WHITE);
		lbShowWln.setFont(new Font("Arial", Font.PLAIN, 15));
		lbShowWln.setBackground(new Color(97, 158, 123));
		
		lblNewLabel_93 = new JLabel("Area");
		lblNewLabel_93.setOpaque(true);
		lblNewLabel_93.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_93.setForeground(Color.WHITE);
		lblNewLabel_93.setBackground(new Color(97, 158, 123));
		
		lblNewLabel_94 = new JLabel("Shift Type");
		lblNewLabel_94.setOpaque(true);
		lblNewLabel_94.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_94.setForeground(Color.WHITE);
		lblNewLabel_94.setBackground(new Color(0, 128, 64));
		
		lblShowWarea = new JLabel("");
		lblShowWarea.setOpaque(true);
		lblShowWarea.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowWarea.setForeground(Color.WHITE);
		lblShowWarea.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowWarea.setBackground(new Color(97, 158, 123));
		
		lblShowWS = new JLabel("");
		lblShowWS.setOpaque(true);
		lblShowWS.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowWS.setForeground(Color.WHITE);
		lblShowWS.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowWS.setBackground(new Color(0, 128, 64));
		
		lblNewLabel_95 = new JLabel("Position");
		lblNewLabel_95.setOpaque(true);
		lblNewLabel_95.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_95.setForeground(Color.WHITE);
		lblNewLabel_95.setBackground(new Color(97, 158, 123));
		
		lblShowWP = new JLabel("");
		lblShowWP.setOpaque(true);
		lblShowWP.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowWP.setForeground(Color.WHITE);
		lblShowWP.setFont(new Font("Arial", Font.PLAIN, 15));
		lblShowWP.setBackground(new Color(97, 158, 123));
		
		panel_36 = new JPanel();
		panel_36.setLayout(new CardLayout(0, 0));
		GroupLayout gl_panel_35 = new GroupLayout(panel_35);
		gl_panel_35.setHorizontalGroup(
			gl_panel_35.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_92, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFN_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLN_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
						.addComponent(lbshowWid, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_35.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lbShowWfn, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_35.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lbShowWln, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_35.createSequentialGroup()
							.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_93, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_94, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblShowWarea, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
								.addComponent(lblShowWS, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_panel_35.createSequentialGroup()
							.addComponent(lblNewLabel_95, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblShowWP, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_35.setVerticalGroup(
			gl_panel_35.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_35.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_35.createSequentialGroup()
									.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
										.addComponent(lbshowWid, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_93, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_92, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING)
										.addComponent(lbShowWfn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_94, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFN_1)))
								.addGroup(gl_panel_35.createSequentialGroup()
									.addComponent(lblShowWarea, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblShowWS, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_35.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_35.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblShowWP, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_95, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblLN_1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
								.addComponent(lbShowWln, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_panel_35.linkSize(SwingConstants.VERTICAL, new Component[] {lblNewLabel_92, lbshowWid, lblFN_1, lbShowWfn, lblLN_1, lbShowWln, lblNewLabel_93, lblNewLabel_94, lblShowWarea, lblShowWS, lblNewLabel_95, lblShowWP});
		panel_35.setLayout(gl_panel_35);
		
		btnShowW = new JButton("SHOW");
		btnShowW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnShowWActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnShowW.setEnabled(true);
		btnShowW.setForeground(Color.WHITE);
		btnShowW.setBackground(Color.BLACK);
		
		btnDeleteW = new JButton("DELETE");
		btnDeleteW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeleteWActionPerformed(e);
			}
		});
		btnDeleteW.setForeground(Color.WHITE);
		btnDeleteW.setBackground(new Color(128, 0, 0));
		
		panel_38 = new JPanel();
		panel_38.setBorder(new TitledBorder(null, "Change Shift", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_38.setBackground(new Color(0, 40, 40));
		
		btnChange_3 = new JButton("Change");
		btnChange_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnChange_3ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnChange_3.setForeground(Color.WHITE);
		btnChange_3.setBackground(new Color(0, 0, 0));
		
		lblCellNumber_1 = new JLabel("Shift Type");
		lblCellNumber_1.setOpaque(true);
		lblCellNumber_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellNumber_1.setForeground(Color.WHITE);
		lblCellNumber_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblCellNumber_1.setBackground(new Color(0, 128, 64));
		
		comboBoxshift = new JComboBox();
		comboBoxshift.addItem("D");
		comboBoxshift.addItem("N");
		
		lblAreas_1 = new JLabel("Areas");
		lblAreas_1.setOpaque(true);
		lblAreas_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreas_1.setForeground(Color.WHITE);
		lblAreas_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAreas_1.setBackground(new Color(0, 128, 64));
		
		comboBox_10 = new JComboBox();
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox_10.addItem(p.getAreaName());
		});
		
		lblPID_1 = new JLabel("Warden ID");
		lblPID_1.setOpaque(true);
		lblPID_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPID_1.setForeground(Color.WHITE);
		lblPID_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPID_1.setBackground(new Color(0, 128, 64));
		
		txtWardidupdateare = new JTextField();
		txtWardidupdateare.setForeground(Color.RED);
		txtWardidupdateare.setEditable(false);
		txtWardidupdateare.setColumns(10);
		
		label_2 = new JLabel("New label");
		GroupLayout gl_panel_38 = new GroupLayout(panel_38);
		gl_panel_38.setHorizontalGroup(
			gl_panel_38.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_38.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_38.createSequentialGroup()
							.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAreas_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCellNumber_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPID_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING)
								.addComponent(txtWardidupdateare, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxshift, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))
							.addGap(98)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_38.createSequentialGroup()
							.addComponent(btnChange_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(100))))
		);
		gl_panel_38.setVerticalGroup(
			gl_panel_38.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_38.createSequentialGroup()
					.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING, false)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_38.createSequentialGroup()
							.addGap(17)
							.addGroup(gl_panel_38.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_38.createSequentialGroup()
									.addGroup(gl_panel_38.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtWardidupdateare, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPID_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(8)
									.addGroup(gl_panel_38.createParallelGroup(Alignment.BASELINE)
										.addComponent(comboBoxshift, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCellNumber_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_38.createSequentialGroup()
									.addGap(36)
									.addComponent(lblAreas_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnChange_3, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(9))
		);
		gl_panel_38.linkSize(SwingConstants.VERTICAL, new Component[] {comboBoxshift, comboBox_10, txtWardidupdateare});
		gl_panel_38.linkSize(SwingConstants.HORIZONTAL, new Component[] {comboBoxshift, comboBox_10, txtWardidupdateare});
		panel_38.setLayout(gl_panel_38);
		
		panel_33 = new JPanel();
		panel_33.setBorder(new TitledBorder(null, "Change Position", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_33.setBackground(new Color(0, 40, 40));
		
		btnChange_2 = new JButton("Change");
		btnChange_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnChange_2ActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnChange_2.setForeground(Color.WHITE);
		btnChange_2.setBackground(Color.BLACK);
		
		lblPID_2 = new JLabel("Warden ID");
		lblPID_2.setOpaque(true);
		lblPID_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPID_2.setForeground(Color.WHITE);
		lblPID_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPID_2.setBackground(new Color(0, 128, 64));
		
		lblAreas_2 = new JLabel("Position");
		lblAreas_2.setOpaque(true);
		lblAreas_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreas_2.setForeground(Color.WHITE);
		lblAreas_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblAreas_2.setBackground(new Color(0, 128, 64));
		
		WIDCP = new JTextField();
		WIDCP.setEnabled(false);
		WIDCP.setForeground(Color.RED);
		WIDCP.setEditable(false);
		WIDCP.setColumns(10);
		
		comboBoxP = new JComboBox();
		comboBoxP.addItem("Low");
		comboBoxP.addItem("Hight");
		
		label_3 = new JLabel("New label");
		GroupLayout gl_panel_33 = new GroupLayout(panel_33);
		gl_panel_33.setHorizontalGroup(
			gl_panel_33.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 297, Short.MAX_VALUE)
				.addGroup(gl_panel_33.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_33.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_33.createSequentialGroup()
							.addGroup(gl_panel_33.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAreas_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPID_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_33.createParallelGroup(Alignment.LEADING)
								.addComponent(WIDCP, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxP, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
							.addGap(98)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel_33.createSequentialGroup()
							.addComponent(btnChange_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(100))))
		);
		gl_panel_33.setVerticalGroup(
			gl_panel_33.createParallelGroup(Alignment.LEADING)
				.addGap(0, 201, Short.MAX_VALUE)
				.addGroup(gl_panel_33.createSequentialGroup()
					.addGroup(gl_panel_33.createParallelGroup(Alignment.LEADING, false)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_33.createSequentialGroup()
							.addGap(17)
							.addGroup(gl_panel_33.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_33.createSequentialGroup()
									.addGroup(gl_panel_33.createParallelGroup(Alignment.BASELINE)
										.addComponent(WIDCP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblPID_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBoxP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_33.createSequentialGroup()
									.addGap(36)
									.addComponent(lblAreas_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))))
					.addGap(40)
					.addComponent(btnChange_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(9))
		);
		gl_panel_33.linkSize(SwingConstants.VERTICAL, new Component[] {WIDCP, comboBoxP});
		gl_panel_33.linkSize(SwingConstants.HORIZONTAL, new Component[] {WIDCP, comboBoxP});
		panel_33.setLayout(gl_panel_33);
		
		panel_40 = new JPanel();
		panel_40.setBorder(new TitledBorder(null, "GENERAL INFORMATION", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_40.setBackground(new Color(0, 40, 40));
		GroupLayout gl_panel_showW = new GroupLayout(panel_showW);
		gl_panel_showW.setHorizontalGroup(
			gl_panel_showW.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showW.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel_showW.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_9, GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
						.addGroup(gl_panel_showW.createSequentialGroup()
							.addGroup(gl_panel_showW.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_showW.createSequentialGroup()
									.addGap(100)
									.addComponent(btnShowW, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnDeleteW, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
							.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel_showW.createSequentialGroup()
							.addComponent(panel_34, GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(panel_40, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_showW.setVerticalGroup(
			gl_panel_showW.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_showW.createSequentialGroup()
					.addGap(21)
					.addComponent(scrollPane_9, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_showW.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_40, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_showW.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_showW.createSequentialGroup()
							.addGroup(gl_panel_showW.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnDeleteW, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnShowW, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_showW.createParallelGroup(Alignment.BASELINE)
							.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel_38, 0, 0, Short.MAX_VALUE)))
					.addContainerGap(85, Short.MAX_VALUE))
		);
		
		lblNewLabel_3 = new JLabel("Total Area");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBackground(new Color(0, 128, 64));
		
		lbtotalArea = new JLabel("");
		lbtotalArea.setOpaque(true);
		lbtotalArea.setHorizontalAlignment(SwingConstants.CENTER);
		lbtotalArea.setForeground(Color.WHITE);
		lbtotalArea.setFont(new Font("Arial", Font.PLAIN, 15));
		lbtotalArea.setBackground(new Color(0, 128, 64));
		
		lblNewLabel_17 = new JLabel("Total Prisoners");
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setForeground(Color.WHITE);
		lblNewLabel_17.setBackground(new Color(97, 158, 123));
		
		lbshowtotalPrisoner = new JLabel("");
		lbshowtotalPrisoner.setOpaque(true);
		lbshowtotalPrisoner.setHorizontalAlignment(SwingConstants.CENTER);
		lbshowtotalPrisoner.setForeground(Color.WHITE);
		lbshowtotalPrisoner.setFont(new Font("Arial", Font.PLAIN, 15));
		lbshowtotalPrisoner.setBackground(new Color(97, 158, 123));
		GroupLayout gl_panel_40 = new GroupLayout(panel_40);
		gl_panel_40.setHorizontalGroup(
			gl_panel_40.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_40.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lbtotalArea, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_17, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbshowtotalPrisoner, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		gl_panel_40.setVerticalGroup(
			gl_panel_40.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_40.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_40.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbtotalArea, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_17, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbshowtotalPrisoner, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
		);
		panel_40.setLayout(gl_panel_40);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "FirstName", "LastName", "DateOfBirth", "Gender", "Phone", "Email", "Address", "Position", "Start Date", "Day Off", "Status", "Salary"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(31);
		table.setAutoCreateRowSorter(true);
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
		scrollPane_9.setViewportView(table);
		panel_showW.setLayout(gl_panel_showW);
		
		panel_North = new JPanel();
		panel_North.setBackground(new Color(0, 40, 40));
		contentPane.add(panel_North, BorderLayout.NORTH);
		
		lblNewLabel_20 = new JLabel("X");
		lblNewLabel_20.setForeground(new Color(255, 255, 255));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_20MouseClicked(e);
			}
		});
		lblNewLabel_20.setOpaque(true);
		lblNewLabel_20.setBackground(new Color(255, 0, 0));
		GroupLayout gl_panel_North = new GroupLayout(panel_North);
		gl_panel_North.setHorizontalGroup(
			gl_panel_North.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_North.createSequentialGroup()
					.addContainerGap(1361, Short.MAX_VALUE)
					.addComponent(lblNewLabel_20, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_North.setVerticalGroup(
			gl_panel_North.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_20, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
		);
		panel_North.setLayout(gl_panel_North);
		
		panel_West = new JPanel();
		panel_West.setBackground(new Color(0, 64, 64));
		contentPane.add(panel_West, BorderLayout.WEST);
		panel_West.setLayout(new BorderLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 40, 40));
		panel_West.add(panel_2, BorderLayout.NORTH);
		
		lblNewLabel_1 = new JLabel("Manages Prisons");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		lblNewLabel_1.setBackground(new Color(0, 40, 40));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(39)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 40, 40));
		panel_West.add(panel_11, BorderLayout.SOUTH);
		
		panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 40, 40));
		panel_West.add(panel_13, BorderLayout.CENTER);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblP = new JLabel("Prioners");
		//lblP.setIcon(new ImageIcon("C:\\Users\\Quoc Ky\\eclipse-workspace\\TuNhan\\images\\prionericon.png").getIconHeight());
		lblP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblPMouseClicked(e);
			}
		});
		lblP.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		lblP.setForeground(new Color(255, 255, 255));
		lblP.setBackground(new Color(64, 128, 128));
		lblP.setOpaque(true);
		panel_13.add(lblP);
		
		lblW = new JLabel("Wardens");
		lblW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblWMouseClicked(e);
			}
		});
		lblW.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblW.setHorizontalAlignment(SwingConstants.CENTER);
		lblW.setForeground(new Color(255, 255, 255));
		lblW.setBackground(new Color(0, 64, 64));
		lblW.setOpaque(true);
		panel_13.add(lblW);
		
		lblA = new JLabel("Areas && Cell");
		lblA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblAMouseClicked(e);
			}
		});
		lblA.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setForeground(new Color(255, 255, 255));
		lblA.setBackground(new Color(0, 64, 64));
		lblA.setOpaque(true);
		panel_13.add(lblA);
		
		lblAc = new JLabel("Account");
		lblAc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					lblAcMouseClicked(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblAc.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblAc.setHorizontalAlignment(SwingConstants.CENTER);
		lblAc.setForeground(new Color(255, 255, 255));
		lblAc.setBackground(new Color(0, 64, 64));
		lblAc.setOpaque(true);
		panel_13.add(lblAc);
		
		lblN1 = new JLabel("Admin");
		lblN1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					lblN1MouseClicked(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblN1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblN1.setHorizontalAlignment(SwingConstants.CENTER);
		lblN1.setForeground(new Color(255, 255, 255));
		lblN1.setBackground(new Color(0, 64, 64));
		lblN1.setOpaque(true);
		panel_13.add(lblN1);
		
		lblEmploy = new JLabel("");
		lblEmploy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblEmployMouseClicked(e);
			}
		});
		lblEmploy.setForeground(new Color(255, 255, 255));
		lblEmploy.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmploy.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblEmploy.setBackground(new Color(0, 40, 40));
		lblEmploy.setOpaque(true);
		panel_13.add(lblEmploy);
		
		lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setBackground(new Color(0, 40, 40));
		lblNewLabel_16.setOpaque(true);
		panel_13.add(lblNewLabel_16);
		
		label = new JLabel("");
		label.setBackground(new Color(0, 40, 40));
		label.setOpaque(true);
		panel_13.add(label);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBackground(new Color(0, 40, 40));
		lblNewLabel_5.setOpaque(true);
		panel_13.add(lblNewLabel_5);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 40, 40));
		contentPane.add(panel_1, BorderLayout.SOUTH);
	}
	protected void btnShowmoreActionPerformed(ActionEvent e) {

		panel_showLess.show(true);
		panel_showMore.show(false);
	}
	protected void ShowLessActionPerformed(ActionEvent e) {
		panel_showLess.show(false);
		panel_showMore.show(true);
		
	}
	protected void btnShowWardensHightActionPerformed(ActionEvent e) throws SQLException {
		panel_showWardenHight.setVisible(true);
		showDataWardensHight();
		
	}
	protected void btnAddAccountActionPerformed(ActionEvent e) throws HeadlessException, SQLException {
		String user=txtUser.getText();
		String pass=txtPass.getText();
		String wardensId=txtWardens.getText();
			Account ac=new Account();
			if(Check.checkNull(user)== false && Check.checkNull(pass)==false) {
				if(Check.checkNumber1(wardensId)==true) {
					ac.setWarden_id(Integer.parseInt(wardensId));
					if(Check.checkExistUser(user)==0) {
						if(Check.checkExistPass(pass)==0) {
							if(Check.checkExistWardenIdAccount(ac.getWarden_id())==0) {
								Wardens wd=new Wardens();
								count=0;
								WardensDao.selectTableWardens().forEach(wr->{
									count=(wr.getWardenId());
								});
								WardensDao.selectTableWardens().forEach(wr->{
									if(wr.getWardenId()==ac.getWarden_id()) {
										if(ac.getWarden_id()<=count ) {
											if(wr.getPosition().equals("Hight")) {
												ac.setUsername(user);
												ac.setPassword(pass);
												try {
													DML.insertAccount(ac);
												} catch (SQLException e1) {
													JOptionPane.showMessageDialog(this, "Warden not exits","ERROR",JOptionPane.ERROR_MESSAGE);txtWardens.setText(null);
												}
												JOptionPane.showMessageDialog(this, "Success","Thong Bao",JOptionPane.INFORMATION_MESSAGE);
												txtUser.setText(null);
												txtPass.setText(null);
												txtWardens.setText(null);
											}else {JOptionPane.showMessageDialog(this, "low","ERROR",JOptionPane.ERROR_MESSAGE);txtWardens.setText(null);}
										}else {JOptionPane.showMessageDialog(this, "Warden not exits","ERROR",JOptionPane.ERROR_MESSAGE);txtWardens.setText(null);}
									}
								});	
							}else {JOptionPane.showMessageDialog(this, "Warden ID is exists","ERROR",JOptionPane.ERROR_MESSAGE);txtWardens.setText(null);}
						}else {JOptionPane.showMessageDialog(this, "Password is exists","ERROR",JOptionPane.ERROR_MESSAGE);txtPass.setText(null);}
					}else {JOptionPane.showMessageDialog(this, "Username is exists","ERROR",JOptionPane.ERROR_MESSAGE);txtUser.setText(null);}
				}else {JOptionPane.showMessageDialog(this, "Warden ID is not numberic and >0","ERROR",JOptionPane.ERROR_MESSAGE);txtWardens.setText(null);}
			}else {JOptionPane.showMessageDialog(this, "Please do not leave it blank");}
		
	}
	protected void btnShowAccountActionPerformed(ActionEvent e) throws SQLException {
		showDataAccount();
	}
	public void showDataAccount() throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Accound Id");
		model.addColumn("Warden Id");
		model.addColumn("UserName");
		model.addColumn("Password");
		model.addColumn("Active");
		
		DML.selectTableAccount().forEach(ac->{
			model.addRow(new Object[] {ac.getAccount_id(),ac.getWarden_id(),ac.getUsername(),ac.getPassword(),ac.getActive()});
		});
		table_showAccount.setModel(model);
	}
	protected void table_showAccountMouseClicked(MouseEvent e) throws SQLException {
		int a=table_showAccount.getSelectedRow();
		int warden=(int) table_showAccount.getValueAt((int) a, 1);
		
		showDataWardensLess(warden);
		showDataWardensMore(warden);
	}
	public void showDataWardensLess(int warden) throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Warden Id");
		model.addColumn("Name");
		model.addColumn("Gender");
		model.addColumn("Position");
		
		WardensDao.selectTableWardens().forEach(wd->{
			if(wd.getWardenId()==warden) {
				model.addRow(new Object[] {wd.getWardenId(),wd.getLastName(),wd.getIsMale(),wd.getPosition()});}
		});
		table_showless.setModel(model);
	}
	public void showDataWardensMore(int a) throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("First Name");
		model.addColumn("Last Name");
		model.addColumn("Gender");
		model.addColumn("Phone");
		model.addColumn("Email");
		model.addColumn("Address");
		model.addColumn("Start Day");
		model.addColumn("Be Working");
		model.addColumn("Area");
		model.addColumn("Shift");

		
		WardensDao.selectTableWardens().forEach(wd->{
			if(wd.getWardenId()==a) {
				model.addRow(new Object[] {wd.getWardenId(),wd.getFirstName(),wd.getLastName(),wd.getIsMale(),wd.getPhoneNumber(),wd.getEmail(),wd.getAddress(),wd.getStartDate(),wd.getIs_Working(),wd.getAreaName(),wd.getShiftType()});
			}
			
		});
		table_showmore.setModel(model);
		
		table_showmore.getColumnModel().getColumn(0).setMinWidth(40);
		table_showmore.getColumnModel().getColumn(0).setPreferredWidth(40);
		table_showmore.getColumnModel().getColumn(0).setMaxWidth(100);
	}
	
	public void showDataWardensHight() throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Gender");
		model.addColumn("Phone");
		model.addColumn("Position");
		model.addColumn("Area");
		model.addColumn("Shift");
		
		WardensDao.selectTableWardens().forEach(l1->{
			if(( l1.getPosition().equals("Hight"))) {
				model.addRow(new Object[] {l1.getWardenId(),l1.getLastName(),l1.getIsMale(),l1.getPhoneNumber(),l1.getPosition(),l1.getAreaName(),l1.getShiftType()});
			}	
		});
		table_showWardensHight.setModel(model);
		table_showWardensHight.getColumnModel().getColumn(0).setMinWidth(40);
		table_showWardensHight.getColumnModel().getColumn(0).setPreferredWidth(40);
		table_showWardensHight.getColumnModel().getColumn(0).setMaxWidth(100);
		
		table_showWardensHight.getColumnModel().getColumn(4).setMinWidth(70);
		table_showWardensHight.getColumnModel().getColumn(4).setPreferredWidth(70);
		table_showWardensHight.getColumnModel().getColumn(4).setMaxWidth(70);
		
		table_showWardensHight.getColumnModel().getColumn(2).setMinWidth(50);
		table_showWardensHight.getColumnModel().getColumn(2).setPreferredWidth(50);
		table_showWardensHight.getColumnModel().getColumn(2).setMaxWidth(50);
		
		table_showWardensHight.getColumnModel().getColumn(3).setMinWidth(100);
		table_showWardensHight.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_showWardensHight.getColumnModel().getColumn(3).setMaxWidth(100);
		
		table_showWardensHight.getColumnModel().getColumn(5).setMinWidth(60);
		table_showWardensHight.getColumnModel().getColumn(5).setPreferredWidth(60);
		table_showWardensHight.getColumnModel().getColumn(5).setMaxWidth(60);
		
		table_showWardensHight.getColumnModel().getColumn(1).setMinWidth(70);
		table_showWardensHight.getColumnModel().getColumn(1).setPreferredWidth(70);
		table_showWardensHight.getColumnModel().getColumn(1).setMaxWidth(100);
	}
	
	protected void btnActionActionPerformed(ActionEvent e) 
	{
		try {
			String key="a";
			String Pass=null;
			Account ac=new Account();
			int column=table_showAccount.getSelectedRow();
			int idAccount=(int) table_showAccount.getValueAt((int) column, 0);
			ac.setAccount_id(idAccount);
			String input= JOptionPane.showInputDialog(Pass);
			if(input.equals(key)) {
				DML.selectTableAccount().forEach(acc->{
					if(acc.getAccount_id()==idAccount) {
						if(acc.getActive()==0) {
							ac.setActive(1);
							JOptionPane.showMessageDialog(this, "Turn on Active");
						}else {ac.setActive(0);JOptionPane.showMessageDialog(this, "Turn of Active");}
					}
				});
				DML.alterActive(ac);;
			}else {JOptionPane.showMessageDialog(this, "Pass is not true","ERROR",JOptionPane.ERROR_MESSAGE);}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}
	
	protected void btnDeleteActionPerformed(ActionEvent e) {
		try {
			int a=table_showAccount.getSelectedRow();
			int id= (int) table_showAccount.getValueAt( a, 0);
			DML.deleteByID(id, "Account", "account_id");
			showDataAccount();
		} catch (Exception e2) {
			
		}
	}
	protected void btnShowPActionPerformed(ActionEvent e) throws SQLException {
		ShowP();
	}
	public void ShowP() throws SQLException {
		DefaultTableModel model=new DefaultTableModel() {
//			public boolean isCellEditTable(int row,int col) {
//				switch(col) {
//				case 0:return true;
//				default:return false;
//				}
//			}
		};
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
		String selectedValue = (String) comboBox.getSelectedItem();
				
		if(Check.checkNull(b)==true) {
			if(selectedValue.equals("ALL")) {
				PrisonersDao.selectTablePrioners1().forEach(p->{
					model.addRow(new Object[] {p.getId(),p.getFirstName(),p.getLastName(),p.getDateOfBirth(),p.getNationality(),p.getIsMale(),p.getDateOfEntry(),p.getReleaseDate(),p.getConviction(),p.getPunishment(),p.getReligion()});
				});
			} else {
				PrisonersDao.selectTablePrioners1().forEach(p->{
					if(p.getAreaName().equals(selectedValue)) {
						model.addRow(new Object[] {p.getId(),p.getFirstName(),p.getLastName(),p.getDateOfBirth(),p.getNationality(),p.getIsMale(),p.getDateOfEntry(),p.getReleaseDate(),p.getConviction(),p.getPunishment(),p.getReligion()});
					}
				});
			}
		}else {
			if(selectedValue.equals("ALL")) {
				PrisonersDao.selectTablePrioners1().forEach(p->{
					if(p.getCellNumber()==Integer.parseInt(b)) {
						model.addRow(new Object[] {p.getId(),p.getFirstName(),p.getLastName(),p.getDateOfBirth(),p.getNationality(),p.getIsMale(),p.getDateOfEntry(),p.getReleaseDate(),p.getConviction(),p.getPunishment(),p.getReligion()});	
					}
				});
			} else {
				PrisonersDao.selectTablePrioners1().forEach(p->{
					if(p.getAreaName().equals(selectedValue)&& p.getCellNumber()==Integer.parseInt(b)) {
						model.addRow(new Object[] {p.getId(),p.getFirstName(),p.getLastName(),p.getDateOfBirth(),p.getNationality(),p.getIsMale(),p.getDateOfEntry(),p.getReleaseDate(),p.getConviction(),p.getPunishment(),p.getReligion()});
					}
				});
			}
		}
		
		table_showP.setModel(model);
		String find=txtSS.getText();
		DefaultRowSorter<?,?> soter= (DefaultRowSorter<?, ?>) table_showP.getRowSorter();
		soter.setRowFilter(RowFilter.regexFilter(find));
		soter.setSortKeys(null);
		table_showP.getColumn("ID").setMinWidth(10);
		table_showP.getColumn("ID").setWidth(20);
		table_showP.getColumn("ID").setMaxWidth(100);
		
		
	}
	
	protected void table_showPMouseClicked(MouseEvent e) throws SQLException {
		int a=table_showP.getSelectedRow();
		int P=(int) table_showP.getValueAt((int) a, 0);
	

		PrisonersDao.selectTablePrioners1().forEach(p->{
			if(P==p.getId()){
				lblShowPID.setText(String.valueOf(p.getId()));			
				lblShowLN.setText(p.getLastName());
				lblShowFN.setText(p.getFirstName());
				lblShowF.setText(String.valueOf(p.getFloor_N()));
				lblShowC.setText(String.valueOf(p.getCellNumber()));
				lblShowA.setText(p.getAreaName().toString());
				lblShowGender.setText(p.getIsMale().toString());
				txtChangeID.setText(String.valueOf(p.getId()));
				txtChangeID.setEditable(false);
				
				
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
	protected void btnSearchActionPerformed(ActionEvent e) throws SQLException {
		
	}
	protected void lblShowPMouseClicked(MouseEvent e) {
		lblShowP.setBackground(new Color(64, 128, 128));
		lblAddP.setBackground(new Color(0, 64, 64));
		lblR.setBackground(new Color(0, 64, 64));
		lblH.setBackground(new Color(0, 64, 64));
		panel_ShowP.show(true);
		panel_Add.show(false);
		panel_ShowH.show(false);
		panel_ShowR.show(false);
		
	}
	protected void lblAddPMouseClicked(MouseEvent e) {
		lblR.setBackground(new Color(0, 64, 64));
		lblAddP.setBackground(new Color(64, 128, 128));
		lblShowP.setBackground(new Color(0, 64, 64));
		lblH.setBackground(new Color(0, 64, 64));		
		panel_ShowP.show(false);
		panel_Add.show(true);
		panel_ShowH.show(false);
		panel_ShowR.show(false);
		panel_addH.show(false);
		panel_addP.show(true);
		
	}
	protected void lblHMouseClicked(MouseEvent e) {
		lblR.setBackground(new Color(0, 64, 64));
		lblAddP.setBackground(new Color(0, 64, 64));
		lblShowP.setBackground(new Color(0, 64, 64));
		lblH.setBackground(new Color(64, 128, 128));
		panel_ShowH.show(true);
		panel_ShowR.show(false);
		panel_ShowP.show(false);
		panel_Add.show(false);
		panelPH.show(false);
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Prisoner ID");
		model.addColumn("Health ID");
		model.addColumn("Medical History");
		model.addColumn("Current Conditions");
		model.addColumn("Allergies");	
		table_showH.setModel(model);								
		
	}
	protected void lblRMouseClicked(MouseEvent e) {
		lblR.setBackground(new Color(64, 128, 128));
		lblAddP.setBackground(new Color(0, 64, 64));
		lblShowP.setBackground(new Color(0, 64, 64));
		lblH.setBackground(new Color(0, 64, 64));
		panel_ShowH.show(false);
		panel_ShowR.show(true);
		panel_ShowP.show(false);
		panel_Add.show(false);
	}
	protected void btnAddPActionPerformed(ActionEvent e) throws SQLException {
		String id=txtPId.getText();
		String firstName=txtFName.getText();
		String lastName= txtLName.getText();
		String gender;
		String nationality= txtN.getText();
		String cell=txtCell.getText();
		String conviction=txtC.getText();
		String punishment= txtP.getText();
		String religion= txtR.getText();
		String image=null;//txtI.getText();
		String area=(String) comboBox_1.getSelectedItem();	
		Date datedob=dob.getDate();
		Date datedoe=doe.getDate();
		Date daterd=rd.getDate();
		

		if(Check.checkNull(id)==false &&
			Check.checkNull(firstName)==false &&
			Check.checkNull(lastName)==false &&
			Check.checkNull(nationality)==false &&
			Check.checkNull(cell)==false &&
			Check.checkNull(conviction)==false &&
			Check.checkNull(punishment)==false &&
			Check.checkNull(religion)==false) {		
				if(Check.checkNumber1(id)==true && Check.checkNumber1(cell)==true) {
					if(Check.checkString(firstName)==true &&
						Check.checkString(lastName)==true &&
						Check.checkString(nationality)==true &&
						Check.checkString(conviction)==true &&
						Check.checkString(punishment)==true &&
						Check.checkString(religion)==true  ) {
						 if(Check.checkExistP(Integer.parseInt(id))==false) {
							 Prisoners pr=new Prisoners();
								AreasDAO.selectTableAreas().forEach(p->{
									if(area.equals(p.getAreaName())) {
										areaid=p.getAreaId();
									}
								});
								CellDao.selectTableCell().forEach(p->{
									if(areaid==p.getAreaId()&& Integer.parseInt(cell)==p.getCellNumber()) {
										pr.setCellId(p.getCellId());
									}
								});
								pr.setDateOfBirth(LocalDate.ofInstant(datedob.toInstant(), ZoneId.systemDefault()));
								pr.setDateOfEntry(LocalDate.ofInstant(datedoe.toInstant(), ZoneId.systemDefault()));
								pr.setReleaseDate(LocalDate.ofInstant(daterd.toInstant(), ZoneId.systemDefault()));
								if(male.isSelected()) {
									 pr.setIsMale("nam");
								}else {pr.setIsMale("nu");}
								pr.setId(Integer.parseInt(id));
								pr.setFirstName(firstName);
								pr.setLastName(lastName);
								pr.setNationality(nationality);
								pr.setConviction(conviction);
								pr.setPunishment(punishment);
								pr.setReligion(religion);
								pr.setImage(image);
								PrisonersDao.insertPrisoner(pr);
								JOptionPane.showMessageDialog(this, "Success","Alert",JOptionPane.INFORMATION_MESSAGE);
						 }else {
							 JOptionPane.showMessageDialog(this, "Prisoner ID is exists","ERROR",JOptionPane.ERROR_MESSAGE);
						 }
						
					}else {JOptionPane.showMessageDialog(this, "Except for prisoner id and cell id everything does not contain numbers","ERROR",JOptionPane.ERROR_MESSAGE);}
				} else {JOptionPane.showMessageDialog(this, "Prisoner ID and cell ID must be numeric","ERROR",JOptionPane.ERROR_MESSAGE);}
		} else {JOptionPane.showMessageDialog(this, "Please do not leave information blank","ERROR",JOptionPane.ERROR_MESSAGE);}
			
		
	}
	
	public void ShowArea() throws SQLException {
		DefaultTableModel model=new DefaultTableModel() {
			public boolean isCellEditTable(int row,int col) {
				switch(col) {
				case 0:return false;
				default:return true;
				}
			}
		};
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Description");
		model.addColumn("Location description");
		AreasDAO.selectTableAreas().forEach(p->{
			model.addRow(new Object[] {p.getAreaId(),p.getAreaName(),p.getDescription(),p.getAreasLocationDescription()});
		});
		table_showA.setModel(model);
		
	}
	protected void lblNewLabel_20MouseClicked(MouseEvent e) {
		this.dispose();
	}
	protected void thisMousePressed(MouseEvent e) {
		mouseDownPont = e.getPoint();
	}
	protected void thisMouseDragged(MouseEvent e) {
		Point cur = e.getLocationOnScreen();
		this.setLocation(cur.x - mouseDownPont.x , cur.y - mouseDownPont.y);
		
	}
	protected void lblPMouseClicked(MouseEvent e) {
		lblP.setBackground(new Color(64,128,128));
		lblW.setBackground(new Color(0,64,64));
		lblA.setBackground(new Color(0,64,64));
		lblAc.setBackground(new Color(0,64,64));
		lblN1.setBackground(new Color(0,64,64));
		lblEmploy.setBackground(new Color(0,40,40));
		panel_wardens.show(false);
		panel_prisoners.show(true);
		panel_account.show(false);
		panel_areas.show(false);
		panel_7.show(false);
		panel_8.show(false);
		lblShowP.setBackground(new Color(64,128,128));
		lblR.setBackground(new Color(0, 64, 64));
		lblAddP.setBackground(new Color(0, 64, 64));
		lblH.setBackground(new Color(0, 64, 64));

		panel_ShowP.show(true);
		panel_Add.show(false);
		panel_ShowH.show(false);
		panel_ShowR.show(false);
		
	}
	protected void lblWMouseClicked(MouseEvent e) {
		lblP.setBackground(new Color(0,64,64));
		lblW.setBackground(new Color(64,128,128));
		lblA.setBackground(new Color(0,64,64));
		lblAc.setBackground(new Color(0,64,64));
		lblN1.setBackground(new Color(0,64,64));
		lblWS.setBackground(new Color(64,128,128));
		panel_prisoners.show(false);
		panel_wardens.show(true);
		panel_account.show(false);
		panel_areas.show(false);
		panel_7.show(false);
		panel_8.show(false);
		panel_showW.show(true);
		panel_addW.show(false);
		lblEmploy.setBackground(new Color(0,40,40));
	}
	protected void lblAMouseClicked(MouseEvent e) {
		lblP.setBackground(new Color(0,64,64));
		lblW.setBackground(new Color(0,64,64));
		lblA.setBackground(new Color(64,128,128));
		lblAc.setBackground(new Color(0,64,64));
		lblN1.setBackground(new Color(0,64,64));
		lblEmploy.setBackground(new Color(0,40,40));
		panel_wardens.show(false);
		panel_prisoners.show(false);
		panel_account.show(false);
		panel_areas.show(true);
		panel_7.show(false);
		panel_8.show(false);
//		DefaultTableModel model=new DefaultTableModel();
//		model.addColumn("Cell Id");
//		model.addColumn("Cell Number");
//		model.addColumn("Status");
//		model.addColumn("Size");
//		model.addColumn("Area ID");
//		model.addColumn("Floor");
//		table_showC.setModel(model);
//		
//		DefaultTableModel a=new DefaultTableModel();
//		model.addColumn("ID");
//		model.addColumn("Name");
//		model.addColumn("Description");
//		model.addColumn("Location description");
//		table_showA.setModel(a);
	}
	protected void lblAcMouseClicked(MouseEvent e) throws SQLException {
		lblP.setBackground(new Color(0,64,64));
		lblW.setBackground(new Color(0,64,64));
		lblA.setBackground(new Color(0,64,64));
		lblAc.setBackground(new Color(64,128,128));
		lblN1.setBackground(new Color(0,64,64));
		lblEmploy.setBackground(new Color(0,40,40));
		panel_prisoners.show(false);
		panel_account.show(true);
		panel_areas.show(false);
		panel_wardens.show(false);
		panel_7.show(false);
		panel_8.show(false);
		
	}
	protected void lblN1MouseClicked(MouseEvent e) throws SQLException {
		try {
			String a=JOptionPane.showInputDialog(this, "Enter keyPass", "ADMIN",JOptionPane.INFORMATION_MESSAGE);
			if(Check.checkNull(a)==false) {
				DML.selectTableAdmin().forEach(p->{
					if(a.equals(p.getEmail())) {
						lblP.setBackground(new Color(0,64,64));
						lblW.setBackground(new Color(0,64,64));
						lblA.setBackground(new Color(0,64,64));
						lblAc.setBackground(new Color(0,64,64));
						lblN1.setBackground(new Color(64,128,128));
						lblEmploy.setBackground(new Color(0,40,40));
						panel_prisoners.show(false);
						panel_account.show(false);
						panel_areas.show(false);
						panel_7.show(true);
						panel_8.show(false);
						showUser.setText(p.getUsername());
						showPass.setText(p.getPassword());
						showKey.setText(String.valueOf(p.getKey()));
					}
				});
			}else {
				JOptionPane.showMessageDialog(this, "Keypass is incorect");
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	protected void btnDelete1ActionPerformed(ActionEvent e) throws SQLException {
		int a=table_showP.getSelectedRow();
		int id=(int) table_showP.getValueAt(a, 0);
		DML.deleteByID(id, "Prisoners", "prisoner_id");
		ShowP();
	}
	protected void btnShowActionPerformed(ActionEvent e) throws SQLException {
		String a=txtShowUpdateID.getText();
		if(Check.checkNull(a)==false) {
			if(Check.checkNumber1(a)==true) {
				PrisonersDao.selectTablePrioners1().forEach(p->{
					if(p.getId()==Integer.parseInt(a)) {
						txtShowUpdateLN.setText(p.getLastName());
						txtShowUpdateFN.setText(p.getFirstName());
						txtShowUpdateR.setText(p.getReligion());
						txtShowUpdateP.setText(p.getPunishment());
						txtShowUpdateN.setText(p.getNationality());
						txtShowUpdateC.setText(p.getConviction());
						lblImageUp.setIcon(
								new ImageIcon(
										new ImageIcon(
											p.getImage()
										)
										.getImage()
										.getScaledInstance(150, 249, Image.SCALE_SMOOTH)));
						txtShowUpdateID.setEnabled(false);
						if(p.getIsMale().equals("Male")) {
							male_1.setSelected(rootPaneCheckingEnabled);
						} else {Female_1.setSelected(rootPaneCheckingEnabled);}
						SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					        try {
								Date dob = simpleDateFormat.parse(p.getDateOfBirth().toString());
								Date doe = simpleDateFormat.parse(p.getDateOfEntry().toString());
								Date rD = simpleDateFormat.parse(p.getReleaseDate().toString());
								ShowUpdateDOB.setDate(dob);
								ShowUpdateDOE.setDate(doe);
								ShowUpdateRD.setDate(rD);
							} catch (ParseException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
					}
				});
			}
		}
	}
	protected void UpdatePActionPerformed(ActionEvent e) throws SQLException {
		String ShowUpdateLN=txtShowUpdateLN.getText();
		String ShowUpdateFN=txtShowUpdateFN.getText();
		String ShowUpdateC=txtShowUpdateC.getText();
		String ShowUpdateP=txtShowUpdateP.getText();
		String ShowUpdateN=txtShowUpdateN.getText();
		String ShowUpdateR=txtShowUpdateR.getText();
		Date ShowUpdate1DOE=ShowUpdateDOE.getDate();
		Date ShowUpdate1DOB=ShowUpdateDOB.getDate();
		Date ShowUpdate1RD=ShowUpdateRD.getDate();
		String id=txtShowUpdateID.getText();
		cell_idUpdate=0;
		
		LocalDate.ofInstant(ShowUpdate1DOB.toInstant(), ZoneId.systemDefault());
		PrisonersDao.selectTablePrisoners().forEach(p->{
			if(p.getId()==Integer.parseInt(id)) {
				cell_idUpdate=p.getCellId();
			}
		});
		Prisoners pr=new Prisoners();
		pr.setId(Integer.parseInt(id));
		pr.setLastName(ShowUpdateLN);
		pr.setFirstName(ShowUpdateFN);
		pr.setConviction(ShowUpdateC);
		pr.setNationality(ShowUpdateN);
		pr.setReligion(ShowUpdateR);
		pr.setPunishment(ShowUpdateP);
		pr.setCellId(cell_idUpdate);
		pr.setIsMale(id);
		if(male_1.isSelected()) {
			pr.setIsMale("Male");
		}else {pr.setIsMale("Female");}
		pr.setDateOfBirth(LocalDate.ofInstant(ShowUpdate1DOB.toInstant(), ZoneId.systemDefault()));
		pr.setDateOfEntry(LocalDate.ofInstant(ShowUpdate1DOE.toInstant(), ZoneId.systemDefault()));
		pr.setReleaseDate(LocalDate.ofInstant(ShowUpdate1RD.toInstant(), ZoneId.systemDefault()));
		
		if(fileName!=null) {
			driAfter = System.getProperty("user.dir") + "\\images";
			var pathBefore = Paths.get(driBefore);
			var pathAfter = Paths.get(driAfter);
			try {
				Files.copy(pathBefore, pathAfter.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			pr.setImage("images/" + fileName);
		} else {
			pr.setImage("images/" + fileBefore);
		}
		PrisonersDao.updatePrioners(pr);
		JOptionPane.showMessageDialog(this, "Success");
		
	}

	protected void btnCancelActionPerformed(ActionEvent e) {
		txtShowUpdateID.setEnabled(true);
		txtShowUpdateID.setText("");
		txtShowUpdateLN.setText("");
		txtShowUpdateFN.setText("");
		txtShowUpdateR.setText("");
		txtShowUpdateP.setText("");
		txtShowUpdateN.setText("");
		txtShowUpdateC.setText("");
		lblImageUp.setIcon(null);
		ShowUpdateDOB.setDate(new Date());
		ShowUpdateDOE.setDate(new Date());
		ShowUpdateRD.setDate(new Date());
		Female_1.setSelected(rootPaneCheckingEnabled);
	}
	protected void btnChange_1ActionPerformed(ActionEvent e) throws SQLException {
		String idS=txtChangeID.getText();
		String ar=(String) comboBoxChange.getSelectedItem();
		String cell=txtCellChange.getText();
		
		
		try {
			if(Check.checkNull(cell)==false && Check.checkNull(idS)==false) {
				int id=Integer.parseInt(idS);
				int cellN=Integer.parseInt(txtCellChange.getText());
			
				PrisonersDao.selectTablePrioners1().forEach(p->{
					if(p.getId()==id) {
						cellID=p.getCellId();					}
				});
				AreasDAO.selectTableAreas().forEach(p->{
					if(p.getAreaName().equals(ar)) {
						arID=p.getAreaId();					}
				});
				CellDao.selectTableCell().forEach(p->{
						if(  cellN==p.getCellNumber() && arID==p.getAreaId() ) {
							cellIDChange=p.getCellId();
						}
				});
				if(cellID!=cellIDChange) {
					Prisoners pr=new Prisoners();
					pr.setId(id);
					pr.setCellId(cellIDChange);
					String a=JOptionPane.showInputDialog(this, "Enter KeyPass");
					if(Check.checkNull(a)==false) {
						if(Check.checkNumber1(a)==true) {
							AdminDao.selectTableAdmin().forEach(p->{
								if(Integer.parseInt(a)==p.getKey()) {
									try {
										PrisonersDao.changeCell(pr);
										txtChangeID.setText(null);
										txtCellChange.setText(null);
										JOptionPane.showMessageDialog(this, "succses","ERROR",JOptionPane.ERROR_MESSAGE);
									} catch (SQLException e1) {
										JOptionPane.showMessageDialog(this, "gfdg","ERROR",JOptionPane.ERROR_MESSAGE);
									}
								}else {JOptionPane.showMessageDialog(this, "Error","ERROR",JOptionPane.ERROR_MESSAGE);
}
							});
						}else {JOptionPane.showMessageDialog(this, "Error ","ERROR",JOptionPane.ERROR_MESSAGE);
}
					}else {JOptionPane.showMessageDialog(this, "Error","ERROR",JOptionPane.ERROR_MESSAGE);
}

				}else {JOptionPane.showMessageDialog(this, "KHong trung phong giam","ERROR",JOptionPane.ERROR_MESSAGE);};
			}
		} catch (Exception e2) {
		}
	}
	protected void btnShowHActionPerformed(ActionEvent e) throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Prisoner ID");
		model.addColumn("Health ID");
		model.addColumn("Medical History");
		model.addColumn("Current Conditions");
		model.addColumn("Allergies");
		
		String ar=(String) comboBox_2.getSelectedItem();
		String cell=txtSearchHCell.getText();
		String id=txtSearchHId.getText();
		String search=txtSearchH.getText();		
		
		if(Check.checkNull(id)==true) {
			if(ar.equals("ALL")) {
				if(Check.checkNull(cell)==true) {
					HealthDao.selectTablehHealth().forEach(p->{
							model.addRow(new Object[] {p.getId(),p.getHealthId(),p.getMedicalHistory(),p.getCurrentConditions(),p.getAllergies()});
					});
					table_showH.setModel(model);
				} else if(Check.checkNull(cell)==false) {
					if(Check.checkNumber1(cell)==true) {
						HealthDao.selectTablehHealth().forEach(p->{
							if(p.getCellNumber()==Integer.parseInt(cell)) {
								model.addRow(new Object[] {p.getId(),p.getHealthId(),p.getMedicalHistory(),p.getCurrentConditions(),p.getAllergies()});
							}
						});
					}
					table_showH.setModel(model);
				} 
			}else {
				if(Check.checkNull(cell)==true) {
					HealthDao.selectTablehHealth().forEach(p->{
						if(ar.equals(p.getAreaName())) {
							model.addRow(new Object[] {p.getId(),p.getHealthId(),p.getMedicalHistory(),p.getCurrentConditions(),p.getAllergies()});
						}
					});
					table_showH.setModel(model);
				} else if(Check.checkNull(cell)==false) {
					if(Check.checkNumber1(cell)==true) {
						HealthDao.selectTablehHealth().forEach(p->{
							if(ar.equals(p.getAreaName()) && p.getCellNumber()==Integer.parseInt(cell)) {
								model.addRow(new Object[] {p.getId(),p.getHealthId(),p.getMedicalHistory(),p.getCurrentConditions(),p.getAllergies()});
							}
						});
						table_showH.setModel(model);
					}
				}
			} 
		} else if(Check.checkNull(id)==false) {
			HealthDao.selectTablehHealth().forEach(f->{
				if(Check.checkNumber1(id)==true) {
					if(f.getId()==Integer.parseInt(id)) {
						model.addRow(new Object[] {f.getId(),f.getHealthId(),f.getMedicalHistory(),f.getCurrentConditions(),f.getAllergies()});
					}
				}
			});
			table_showH.setModel(model);
		} else {}
		
		DefaultRowSorter<?,?> soter= (DefaultRowSorter<?, ?>) table_showH.getRowSorter();
		soter.setRowFilter(RowFilter.regexFilter(search));
		soter.setSortKeys(null);
	}
	protected void table_showHMouseClicked(MouseEvent e) throws SQLException {
		int a=table_showH.getSelectedRow();
		int id=(int) table_showH.getValueAt((int) a, 0);
		
		PrisonersDao.selectTablePrioners1().forEach(p->{
			if(p.getId()==id) {
				HID.setText(String.valueOf(p.getId()));
				HFN.setText(p.getFirstName());
				HLN.setText(p.getLastName());
				HGENDER.setText(p.getIsMale());
				HA.setText(p.getAreaName());
				HC.setText(String.valueOf(p.getCellNumber()));
				HF.setText(String.valueOf(p.getFloor_N()));	
				if(p.getImage()==null) {
					HI.setBackground(new Color(0,63,63));
				} else {
					HI.setBackground(new Color(0,255,255));
				}
			}
		});
		panelPH.show(true);
	}
	protected void btnShowRActionPerformed(ActionEvent e) throws SQLException {
		String id=IDR.getText();
		String ar=(String) comboBox_3.getSelectedItem();
		String cell=CellR.getText();
		
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Relative Id");
		model.addColumn("Prisoner Id");
		model.addColumn("Name");
		model.addColumn("Contact Info");
		model.addColumn("Relationship");
		model.addColumn("CCCD");
		if(Check.checkNull(id)==true) {
			if(ar.equals("ALL")) {
				if(Check.checkNull(cell)==true) {
					RelaveDao.selectTableRela().forEach(p->{
						model.addRow(new Object[] {p.getRelativeId(),p.getId(),p.getRelativeName(),p.getContactInfo(),p.getRelationship(),p.getCCCD()});
					});
					table_showR.setModel(model);
				} else if(Check.checkNull(cell)==false) {
					if(Check.checkNumber1(cell)==true) {
						RelaveDao.selectTableRela1().forEach(p->{
							if(Integer.parseInt(cell)==p.getCellNumber()) {
								model.addRow(new Object[] {p.getRelativeId(),p.getId(),p.getRelativeName(),p.getContactInfo(),p.getRelationship(),p.getCCCD()});
							}
						});
						table_showR.setModel(model);
					}
					
				} 
			}else {
				if(Check.checkNull(cell)==true) {
					RelaveDao.selectTableRela1().forEach(p->{
						if(p.getAreaName().equals(ar)) {
							model.addRow(new Object[] {p.getRelativeId(),p.getId(),p.getRelativeName(),p.getContactInfo(),p.getRelationship(),p.getCCCD()});
						}
					});
					table_showR.setModel(model);
				} else if(Check.checkNull(cell)==false) {
					if(Check.checkNumber1(cell)==true) {
						RelaveDao.selectTableRela1().forEach(p->{
							if(p.getAreaName().equals(ar) && p.getCellNumber()==Integer.parseInt(cell)) {
								model.addRow(new Object[] {p.getRelativeId(),p.getId(),p.getRelativeName(),p.getContactInfo(),p.getRelationship(),p.getCCCD()});
							}
						});
						table_showR.setModel(model);
					}
				}
			} 
		} else if(Check.checkNull(id)==false) {
			RelaveDao.selectTableRela().forEach(f->{
				if(Check.checkNumber1(id)==true) {
					if(f.getId()==Integer.parseInt(id)) {
						model.addRow(new Object[] {f.getId(),f.getRelativeId(),f.getRelativeName(),f.getContactInfo(),f.getRelationship(),f.getCCCD()});
					}
				}
			});
			table_showR.setModel(model);
		} else {}
		String Search=SearchR.getText();
		DefaultRowSorter<?,?> soter= (DefaultRowSorter<?, ?>) table_showR.getRowSorter();
		soter.setRowFilter(RowFilter.regexFilter(Search));
		soter.setSortKeys(null);
	}
	protected void btnDeleteHActionPerformed(ActionEvent e) throws SQLException {
		try {
			int a=table_showH.getSelectedRow();
			int id=(int) table_showH.getValueAt(a, 1);
			String re=JOptionPane.showInputDialog(this, "input keypass");
			if(Check.checkNumber1(re)==true) {
				AdminDao.selectTableAdmin().forEach(p->{
					if(Integer.parseInt(re)==p.getKey()) {
						try {
							DML.deleteByID(id,"HealthByPrisoner", "health_id");
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						try {
							ShowH();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}else {
						JOptionPane.showMessageDialog(this, "key is false");
					}
				});
			}else {
				JOptionPane.showMessageDialog(this, "key is false");

			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}
	public void ShowH() throws SQLException {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Prisoner ID");
		model.addColumn("Health ID");
		model.addColumn("Medical History");
		model.addColumn("Current Conditions");
		model.addColumn("Allergies");
		
		String ar=(String) comboBox_2.getSelectedItem();
		String cell=txtSearchHCell.getText();
		String id=txtSearchHId.getText();
		String search=txtSearchH.getText();		
		
		if(Check.checkNull(id)==true) {
			if(ar.equals("ALL")) {
				if(Check.checkNull(cell)==true) {
					HealthDao.selectTablehHealth().forEach(p->{
							model.addRow(new Object[] {p.getId(),p.getHealthId(),p.getMedicalHistory(),p.getCurrentConditions(),p.getAllergies()});
					});
					table_showH.setModel(model);
				} else if(Check.checkNull(cell)==false) {
					if(Check.checkNumber1(cell)==true) {
						HealthDao.selectTablehHealth().forEach(p->{
							if(p.getCellNumber()==Integer.parseInt(cell)) {
								model.addRow(new Object[] {p.getId(),p.getHealthId(),p.getMedicalHistory(),p.getCurrentConditions(),p.getAllergies()});
							}
						});
					}
					table_showH.setModel(model);
				} 
			}else {
				if(Check.checkNull(cell)==true) {
					HealthDao.selectTablehHealth().forEach(p->{
						if(ar.equals(p.getAreaName())) {
							model.addRow(new Object[] {p.getId(),p.getHealthId(),p.getMedicalHistory(),p.getCurrentConditions(),p.getAllergies()});
						}
					});
					table_showH.setModel(model);
				} else if(Check.checkNull(cell)==false) {
					if(Check.checkNumber1(cell)==true) {
						HealthDao.selectTablehHealth().forEach(p->{
							if(ar.equals(p.getAreaName()) && p.getCellNumber()==Integer.parseInt(cell)) {
								model.addRow(new Object[] {p.getId(),p.getHealthId(),p.getMedicalHistory(),p.getCurrentConditions(),p.getAllergies()});
							}
						});
						table_showH.setModel(model);
					}
				}
			} 
		} else if(Check.checkNull(id)==false) {
			HealthDao.selectTablehHealth().forEach(f->{
				if(Check.checkNumber1(id)==true) {
					if(f.getId()==Integer.parseInt(id)) {
						model.addRow(new Object[] {f.getId(),f.getHealthId(),f.getMedicalHistory(),f.getCurrentConditions(),f.getAllergies()});
					}
				}
			});
			table_showH.setModel(model);
		} else {}
		
		DefaultRowSorter<?,?> soter= (DefaultRowSorter<?, ?>) table_showH.getRowSorter();
		soter.setRowFilter(RowFilter.regexFilter(search));
		soter.setSortKeys(null);
	}
	public void ShowR() throws SQLException {
		DefaultTableModel model= new DefaultTableModel();
		model.addColumn("Relative Id");
		model.addColumn("Prisoner Id");
		model.addColumn("Name");
		model.addColumn("Contact Info");
		model.addColumn("Relationship");
		model.addColumn("CCCD");
		RelaveDao.selectTableRela().forEach(p->{
			model.addRow(new Object[] {p.getRelativeId(),p.getId(),p.getRelativeName(),p.getContactInfo(),p.getRelationship(),p.getCCCD()});
		});
		table_showR.setModel(model);
	}
	protected void table_showRMouseClicked(MouseEvent e) throws SQLException {
		int a=table_showR.getSelectedRow();
		int id=(int) table_showR.getValueAt(a, 1);
		PrisonersDao.selectTablePrioners1().forEach(p->{
			if(p.getId()==id) {
				RID.setText(String.valueOf(p.getId()));
				RLN.setText(p.getLastName());
				RA.setText(String.valueOf(p.getAreaName()));
				RC.setText(String.valueOf(p.getCellNumber()));
				RF.setText(String.valueOf(p.getFloor_N()));
				lblSRP.setIcon(
						new ImageIcon(
								new ImageIcon(
									p.getImage()
								)
								.getImage()
								.getScaledInstance(112, 138, Image.SCALE_SMOOTH)));
			}
		});
		RelaveDao.selectTableRela().forEach(b->{
			if(b.getId()==id) {
				lblSR.setIcon(
						new ImageIcon(
								new ImageIcon(
									b.getImage()
								)
								.getImage()
								.getScaledInstance(112, 138, Image.SCALE_SMOOTH)));
			}
		});
	}
	protected void btnAddHActionPerformed(ActionEvent e) throws NumberFormatException, SQLException {
		String a=AHID.getText();
		String b=AHMH.getText();
		String c=AHCC.getText();
		String d=AHA.getText();
		if(Check.checkNull(a)==false && Check.checkNull(b)==false && Check.checkNull(c)==false && Check.checkNull(d)==false ) {
			if(Check.checkNumber1(a)==true) {
				if(Check.checkExistP(Integer.parseInt(a))==true) {
					HealthByPrisoner hp=new HealthByPrisoner();
					hp.setId(Integer.parseInt(a));
					hp.setMedicalHistory(b);
					hp.setCurrentConditions(c);
					hp.setAllergies(d);
					HealthDao.insertHealth(hp);
					JOptionPane.showMessageDialog(this, "Success");
				}else {
					JOptionPane.showMessageDialog(this, "Prisoner is not exist");
				}
			}else {
				JOptionPane.showMessageDialog(this, "ID is not Number");
			}
		}else {
			JOptionPane.showMessageDialog(this, "NUll");
		}
	}
	protected void lblIn4MouseClicked(MouseEvent e) {
		panel_addH.show(false);
		panel_addP.show(true);
	}
	protected void lblHEMouseClicked(MouseEvent e) {
		panel_addH.show(true);
		panel_addP.show(false);
	}
	protected void btnShowUHActionPerformed(ActionEvent e) throws SQLException {
		String id=UHID.getText();
		if(Check.checkNumber1(id)==true) {
			UHID.enable(false);
			HealthDao.selectTablehHealth().forEach(p->{
				if(p.getHealthId()==Integer.parseInt(id)) {
					UHA.setText(String.valueOf(p.getAllergies()));
					UHCC.setText(p.getCurrentConditions());
					UHMH.setText(p.getMedicalHistory());
				}
			});
		}
	}
	protected void btnCancelUHActionPerformed(ActionEvent e) {
		UHID.enable(true);
		UHA.setText(null);
		UHCC.setText(null);
		UHMH.setText(null);
		UHID.setText(null);
	}
	protected void btnUpdate_2ActionPerformed(ActionEvent e) throws SQLException {
		String id =UHID.getText();
		String a=UHA.getText();
		String cc=UHCC.getText();
		String mh=UHMH.getText();
		if(Check.checkNull(id)==false &&Check.checkNumber1(id)==true) {
			if(Check.checkNull(a)==false && Check.checkNull(cc)==false && Check.checkNull(mh)==false){
				HealthByPrisoner hp=new HealthByPrisoner();
				hp.setHealthId(Integer.parseInt(id));
				hp.setAllergies(a);
				hp.setCurrentConditions(cc);
				hp.setMedicalHistory(mh);
				HealthDao.updateHealth(hp);
				JOptionPane.showMessageDialog(this, "Success");

			}else {
				JOptionPane.showMessageDialog(this, "Trong");
			}
		}
	}
	protected void btnShowAActionPerformed(ActionEvent e) throws SQLException {
		ShowArea();
	}
	protected void btnShowCActionPerformed(ActionEvent e) throws SQLException {
		ShowC();
	}
	public void ShowC() throws SQLException {
		String ar=(String) comboBox_4.getSelectedItem();
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Cell Id");
		model.addColumn("Cell Number");
		model.addColumn("Status");
		model.addColumn("Size");
		model.addColumn("Area ID");
		model.addColumn("Floor");
		if(ar.equals("ALL")) {
			CellDao.selectTableCell().forEach(p->{
				model.addRow(new Object[] {p.getCellId(),p.getCellNumber(),p.getStatus(),p.getSize(),p.getAreaId(),p.getFloor_N()});
			});
			table_showC.setModel(model);
		}else {
			AreasDAO.selectTableAreas().forEach(a->{
				if(a.getAreaName().equals(ar)) {
					try {
						CellDao.selectTableCell().forEach(p->{
							if(p.getAreaId()==a.getAreaId()) {
								model.addRow(new Object[] {p.getCellId(),p.getCellNumber(),p.getStatus(),p.getSize(),p.getAreaId(),p.getFloor_N()});
							}
						});
						table_showC.setModel(model);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
		}
	}
	
	protected void table_showCMouseClicked(MouseEvent e) throws SQLException {
		
		int a=table_showC.getSelectedRow();
		int id=(int) table_showC.getValueAt(a, 0);
		NOPIC.setText(String.valueOf(countN(id)));
		
	}
	public int countN(int id) throws SQLException {
		count1=0;
		PrisonersDao.countPrisoner(id).forEach(p->{
			count1+=1;
		});
		return count1;
	}

	protected void btnADDAActionPerformed(ActionEvent e) throws SQLException {
		String aN=AADDAN.getText();
		String aD=AADDD.getText();
		String aL=AADDL.getText();
		if(Check.checkNull(aN)==false && Check.checkNull(aD)==false && Check.checkNull(aL)==false ) {
			Areas ar=new Areas();
			ar.setAreaName(aN);
			ar.setAreasLocationDescription(aL);
			ar.setDescription(aD);
			AreasDAO.insertAreas(ar);
			JOptionPane.showMessageDialog(this, "Success");
			AADDAN.setText(null);
			AADDD.setText(null);
			AADDL.setText(null);
			loadAComboBox();
		}else {
			JOptionPane.showMessageDialog(this, "Error");
		}
	}
	protected void btnShowAUActionPerformed(ActionEvent e) throws SQLException {
		String id=AUAID.getText();
		if(Check.checkNull(id)==false) {
			if(Check.checkNumber1(id)==true) {
				AreasDAO.selectTableAreas().forEach(p->{
					if(p.getAreaId()==Integer.parseInt(id)) {
						AUAID.enable(false);
						AUAN.setText(p.getAreaName());
						AUD.setText(p.getDescription());
						AUL.setText(p.getAreasLocationDescription());
					}
				});
			}
		}
	}
	
	protected void btnCencelAActionPerformed(ActionEvent e) {
		AUAID.enable(true);
		AUAID.setText(null);
		AUAN.setText(null);
		AUD.setText(null);
		AUL.setText(null);
	}
	protected void btnUAActionPerformed(ActionEvent e) throws SQLException {
		String id=AUAID.getText();
		String name=AUAN.getText();
		String ad=AUD.getText();
		String al=AUL.getText();
		if(Check.checkNull(id)==false && Check.checkNull(name)==false && Check.checkNull(ad)==false && Check.checkNull(al)==false ) {
			if(Check.checkNumber1(id)==true) {
				Areas ar=new Areas();
				ar.setAreaId(Integer.parseInt(id));
				ar.setAreaName(name);
				ar.setAreasLocationDescription(al);
				ar.setDescription(ad);
				AreasDAO.updateAreas(ar);
				JOptionPane.showMessageDialog(this, "Success");
				AUAID.setText(null);
				AUAN.setText(null);
				AUD.setText(null);
				AUL.setText(null);
				loadAComboBox();
			}
		}else {
			JOptionPane.showMessageDialog(this, "Trong");
		}
		
	}
	protected void btnDeleteAActionPerformed(ActionEvent e) throws SQLException {
		try {
			int a=table_showA.getSelectedRow();
			int id=(int) table_showA.getValueAt(a, 0);
			
			DML.deleteByID(id, "Areas", "area_id");
			ShowArea();
			loadAComboBox();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	protected void btnADDCActionPerformed(ActionEvent e) throws SQLException {
		var daoCells = new PrisonersDao();
	    var cells = new CellsByPrisoner();
	    String cellNumberText = txtCellNBadd.getText();
	    String status = (String) comboBox_7.getSelectedItem();
	    String areaIdText = (String) comboBox_8.getSelectedItem();
	    String size = txtSizeadd.getText();
	    String FloorText = txtFlooradd.getText();

	    if (cellNumberText.isEmpty() || status.isEmpty() || areaIdText.isEmpty() || size.isEmpty() || FloorText.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Please fill in all fields before adding data.");
	    } else {
	        try {
	            int cellNumber = Integer.parseInt(cellNumberText);
	            cells.setCellNumber(cellNumber);
	            int Floor_N = Integer.parseInt(FloorText);
	            cells.setFloor_N(Floor_N);
	            cells.setStatus(status);
	            AreasDAO.selectTableAreas().forEach(p->{
	            	if(p.getAreaName().equals(areaIdText)) {
	            		cells.setAreaId(p.getAreaId());
	            	}
	            });
	            cells.setSize(size);
	           if(Check.checkExistC(cells.getAreaId(), cellNumber)==false) {
	        	   CellDao.addCellsPri(cells);
	           }else {
	        	  JOptionPane.showMessageDialog(this, "Cell Number is exist in area", "Error", JOptionPane.ERROR_MESSAGE);
	           }
	            
	        } catch (NumberFormatException e2) {
	            JOptionPane.showMessageDialog(null, "Please enter a valid integer for 'Area ID' and 'cellNumber'.");
	        }
	    }
	}
	protected void btnCActionPerformed(ActionEvent e) {
		panel_AC.show(true);
		panel_ASC.show(false);
		panel_USC.show(false);
		panel_UC.show(false);
	}
	public void loadAComboBox() throws SQLException {
		
		int itemCount = comboBox.getItemCount();
		for(int i = 0; i < itemCount; i++){
			comboBox.removeItemAt(0);
		}
		int itemCount1 = comboBox_1.getItemCount();
		for(int i = 0; i < itemCount1; i++){
			comboBox_1.removeItemAt(0);
		}
		int itemCount2 = comboBox_2.getItemCount();
		for(int i = 0; i < itemCount2; i++){
			comboBox_2.removeItemAt(0);
		}
		int itemCount3 = comboBox_3.getItemCount();
		for(int i = 0; i < itemCount3; i++){
			comboBox_3.removeItemAt(0);
		}
		int itemCount4 = comboBox_4.getItemCount();
		for(int i = 0; i < itemCount4; i++){
			comboBox_4.removeItemAt(0);
		}
		int itemCount6 = comboBox_6.getItemCount();
		for(int i = 0; i < itemCount6; i++){
			comboBox_6.removeItemAt(0);
		}
		int itemCount8 = comboBox_8.getItemCount();
		for(int i = 0; i < itemCount8; i++){
			comboBox_8.removeItemAt(0);
		}
		int itemCount9 = comboBox_9.getItemCount();
		for(int i = 0; i < itemCount9; i++){
			comboBox_9.removeItemAt(0);
		}
		int itemCount10 = comboBox_10.getItemCount();
		for(int i = 0; i < itemCount10; i++){
			comboBox_10.removeItemAt(0);
		}
		
		comboBox.addItem("ALL");
		comboBox_1.addItem("ALL");
		comboBox_2.addItem("ALL");
		comboBox_3.addItem("ALL");
		comboBox_4.addItem("ALL");
		comboBox_9.addItem("ALL");
		AreasDAO.selectTableAreas().forEach(p->{
			comboBox.addItem(p.getAreaName());
			comboBox_1.addItem(p.getAreaName());
			comboBox_2.addItem(p.getAreaName());
			comboBox_3.addItem(p.getAreaName());
			comboBox_4.addItem(p.getAreaName());
			comboBox_6.addItem(p.getAreaName());
			comboBox_8.addItem(p.getAreaName());
			comboBox_9.addItem(p.getAreaName());
			comboBox_10.addItem(p.getAreaName());
		});
	}
	protected void btnUpdateCellActionPerformed(ActionEvent e) {
		panel_AC.show(false);
		panel_ASC.show(false);
		panel_USC.show(false);
		panel_UC.show(true);
	}
	protected void btnUpdate_3ActionPerformed(ActionEvent e) throws SQLException {
		String cellIdText = txtCellId.getText();
	    String cellNumberText = txtCellNumber.getText();
	    String status = (String) comboBox_5.getSelectedItem();
	    String areaNameText = (String) comboBox_6.getSelectedItem();
	    String size = txtSize.getText();
	    String FloorText = txtFloor.getText();
	    
	    if(Check.checkNull(cellIdText)==false && Check.checkNull(cellNumberText)==false && Check.checkNull(size)==false && Check.checkNull(FloorText)==false ) {
	    	var daoCells = new PrisonersDao();
		    var cells = new CellsByPrisoner();
	    	if(status.equals("Active")) {
	    		 cells.setStatus(status);
	    	}else {
	    		cells.setStatus(status);
	    	}
	    	int cellId = Integer.parseInt(cellIdText);
            cells.setCellId(cellId);
            int cellNumber = Integer.parseInt(cellNumberText);
            cells.setCellNumber(cellNumber);
            cells.setStatus(status);
            AreasDAO.selectTableAreas().forEach(p->{
            	if(p.getAreaName().equals(areaNameText)) {
            		cells.setAreaId(p.getAreaId());
            	}
            });
            cells.setSize(size);
            int Floor_N = Integer.parseInt(FloorText);
            cells.setFloor_N(Floor_N);
            
            
            CellDao.selectTableCell().forEach(p->{
            	if(p.getCellNumber()==cellNumber) {
            		checkCe=p.getCellId();
            	}
            });
            if(checkCe==cellId) {
            	CellDao.updateCellsPri(cells);
            }else {
            	if(Check.checkExistC(cells.getAreaId(), cellNumber)==false) {
            		CellDao.updateCellsPri(cells);
            	}else {
            		JOptionPane.showMessageDialog(this, "CellNumber is exist");
            	}
            }
	    }
	}
	protected void btnDeleteA_1ActionPerformed(ActionEvent e) throws SQLException {
		try {
			int a=table_showC.getSelectedRow();
			int id=(int) table_showC.getValueAt(a, 0);
			String key=JOptionPane.showInputDialog(this,"Enter keyPass");
			if(Check.checkNull(key)==false && Check.checkNumber1(key)==true){
				AdminDao.selectTableAdmin().forEach(p->{
					if(Integer.parseInt(key)==p.getKey()) {
						try {
							DML.deleteByID(id, "CellsByPrisoner", "cell_id");
							ShowC();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
			}	
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	protected void btnSUCActionPerformed(ActionEvent e) {
		try {
			String id=txtCellId.getText();
			txtCellId.enable(false);
			if(Check.checkNull(id)==false && Check.checkNumber1(id)==true) {
				CellDao.selectTableCell().forEach(p->{
					if(p.getCellId()==Integer.parseInt(id)) {
						txtCellNumber.setText(String.valueOf(p.getCellNumber()));
						comboBox_5.setSelectedItem(p.getStatus());
						try {
							AreasDAO.selectTableAreas().forEach(a->{
								if(a.getAreaId()==p.getAreaId()) {
									comboBox_6.setSelectedItem(a.getAreaName());
								}
							});
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						txtSize.setText(p.getSize());
						txtFloor.setText(String.valueOf(p.getFloor_N()));
					}
				});
			}
			
		    String cellNumberText = txtCellNumber.getText();
		    String status = (String) comboBox_5.getSelectedItem();
		    String areaNameText = (String) comboBox_6.getSelectedItem();
		    String size = txtSize.getText();
		    String FloorText = txtFloor.getText();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	protected void btnADDA_1ActionPerformed(ActionEvent e) {
		panel_AC.show(true);
		panel_ASC.show(false);
		panel_USC.show(false);
		panel_UC.show(false);
	}
	protected void btnCencelA_1ActionPerformed(ActionEvent e) {
		txtCellId.enable(true);
		txtCellId.setText(null);
		txtCellNumber.setText(null);
		txtSize.setText(null);
		txtFloor.setText(null);
		comboBox_5.getSelectedItem();
		comboBox_6.getSelectedItem();
	}
	protected void btnDeleteWActionPerformed(ActionEvent e) {
		try {
			int a=table.getSelectedRow();
			int id= (int) table.getValueAt( a, 0);
			String key=JOptionPane.showInputDialog(this,"Enter keyPass");
			if(Check.checkNull(key)==false && Check.checkNumber1(key)==true){
				try {
					AdminDao.selectTableAdmin().forEach(d->{
						if(Integer.parseInt(key)==d.getKey()) {
							try {
								DML.deleteByID(id, "Wardens", "warden_id");
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(this, "The warden has a account", "error", JOptionPane.ERROR_MESSAGE);

							}
							try {
								loadWard();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block

							}
						} else {
							JOptionPane.showMessageDialog(this, "keyPass is false", "error", JOptionPane.ERROR_MESSAGE);
						}
					});
				} catch (SQLException e1) {
					// TODO Auto-generated catch block

				}
			}
		} catch (Exception e2) {

		}
	}
	
	public void loadWard() throws SQLException {
		var model = new DefaultTableModel();
		model.addColumn("warden_id");
		model.addColumn("first_name");
		model.addColumn("last_name");
		model.addColumn("date_of_birth");
		model.addColumn("gender");
		model.addColumn("phone_number");
		model.addColumn("email");
		model.addColumn("address");
		model.addColumn("position");
		model.addColumn("start_date");
		model.addColumn("day_off");
		model.addColumn("is_Working");
		model.addColumn("salary");
		
		String ar=(String) comboBox_9.getSelectedItem();
		String dn=(String) comboBoxDN.getSelectedItem();
		
		List<P_C_A> areaList = DML.selectTotalA();
        List<P_C_A> prisonersList = DML.selectTotalP();
        
        lbtotalArea.setText(String.valueOf(areaList.get(0).getCount()));
        
        lbshowtotalPrisoner.setText(String.valueOf(prisonersList.get(0).getCount()));
        
		if(ar.equals("ALL")) {
			if(dn.equals("D-N")) {
				WardensDao.selectTableWardens().forEach(wd->{
					model.addRow(new Object[] {wd.getWardenId(),wd.getFirstName(),wd.getLastName(),wd.getDateOfBirth(),wd.getIsMale(),wd.getPhoneNumber(),wd.getEmail(),wd.getAddress(),wd.getPosition(),wd.getStartDate(),wd.getDay_off(),wd.getIs_Working(),wd.getSalary()});
				});
			}else if(dn.equals("D")) {
				WardensDao.selectTableWardens().forEach(wd->{
					if(wd.getShiftType().equals("D")) {
						model.addRow(new Object[] {wd.getWardenId(),wd.getFirstName(),wd.getLastName(),wd.getDateOfBirth(),wd.getIsMale(),wd.getPhoneNumber(),wd.getEmail(),wd.getAddress(),wd.getPosition(),wd.getStartDate(),wd.getDay_off(),wd.getIs_Working(),wd.getSalary()});
					}
				});
			}else {
				WardensDao.selectTableWardens().forEach(wd->{
					if(wd.getShiftType().equals("N")) {
						model.addRow(new Object[] {wd.getWardenId(),wd.getFirstName(),wd.getLastName(),wd.getDateOfBirth(),wd.getIsMale(),wd.getPhoneNumber(),wd.getEmail(),wd.getAddress(),wd.getPosition(),wd.getStartDate(),wd.getDay_off(),wd.getIs_Working(),wd.getSalary()});
					}
				});
			}
		}else {
			if(dn.equals("D-N")) {
				WardensDao.selectTableWardens().forEach(wd->{
					if(wd.getAreaName().equals(ar)) {
						model.addRow(new Object[] {wd.getWardenId(),wd.getFirstName(),wd.getLastName(),wd.getDateOfBirth(),wd.getIsMale(),wd.getPhoneNumber(),wd.getEmail(),wd.getAddress(),wd.getPosition(),wd.getStartDate(),wd.getDay_off(),wd.getIs_Working(),wd.getSalary()});
					}
				});
			}else if(dn.equals("D")) {
				WardensDao.selectTableWardens().forEach(wd->{
					if(wd.getShiftType().equals("D") && wd.getAreaName().equals(ar)) {
						model.addRow(new Object[] {wd.getWardenId(),wd.getFirstName(),wd.getLastName(),wd.getDateOfBirth(),wd.getIsMale(),wd.getPhoneNumber(),wd.getEmail(),wd.getAddress(),wd.getPosition(),wd.getStartDate(),wd.getDay_off(),wd.getIs_Working(),wd.getSalary()});
					}
				});
			}else {
				WardensDao.selectTableWardens().forEach(wd->{
					if(wd.getShiftType().equals("N") && wd.getAreaName().equals(ar)) {
						model.addRow(new Object[] {wd.getWardenId(),wd.getFirstName(),wd.getLastName(),wd.getDateOfBirth(),wd.getIsMale(),wd.getPhoneNumber(),wd.getEmail(),wd.getAddress(),wd.getPosition(),wd.getStartDate(),wd.getDay_off(),wd.getIs_Working(),wd.getSalary()});
					}
				});
			}
		}
	table.setModel(model);
	String find=txtSearchW.getText();
	DefaultRowSorter<?,?> soter= (DefaultRowSorter<?, ?>) table.getRowSorter();
	soter.setRowFilter(RowFilter.regexFilter(find));
	soter.setSortKeys(null);
	}
	protected void btnShowWActionPerformed(ActionEvent e) throws SQLException {
		loadWard();
	}
	protected void tableMouseClicked(MouseEvent e) throws SQLException {
		int rowindex = table.getSelectedRow();
		int wardid = (int)table.getValueAt(rowindex, 0);
		
		txtWardidupdateare.setText(table.getValueAt(rowindex, 0).toString());
		WardensDao.selectTableWardens().forEach(w->{
			if(wardid==w.getWardenId()) {
				WIDCP.setText(String.valueOf(w.getWardenId()));
				lbshowWid.setText(String.valueOf(w.getWardenId()));
				lbShowWfn.setText(w.getFirstName());
				lbShowWln.setText(w.getLastName());
				lblShowWarea.setText(w.getAreaName());
				lblShowWS.setText(w.getShiftType());
				lblShowWP.setText(w.getPosition());
			}
		});
	}
	protected void btnChange_3ActionPerformed(ActionEvent e) throws SQLException {
		String id=txtWardidupdateare.getText();
		String ar=(String) comboBox_10.getSelectedItem();
		String type=(String) comboBoxshift.getSelectedItem();
		All1 al=new All1();
		if(Check.checkNull(id)==false && Check.checkNumber1(id)==true) {
			WardensDao.selectTableWardens().forEach(p->{
				if(ar.equals(p.getAreaName())&& p.getShiftType().equals(type)) {
					al.setShift_number(p.getShift_number());
					al.setWardenId(Integer.parseInt(id));
				}
			});
			WardensDao.selectTableWardens().forEach(a->{
				if(a.getWardenId()==Integer.parseInt(id)) {
					if(a.getPosition().equals("Low")) {
						String key=JOptionPane.showInputDialog(this,"Enter keyPass");
						if(Check.checkNull(key)==false && Check.checkNumber1(key)==true){
							try {
								AdminDao.selectTableAdmin().forEach(d->{
									if(Integer.parseInt(key)==d.getKey()) {
										WardensDao.updateWardA(al);
										try {
											loadWard();
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									} else {
										JOptionPane.showMessageDialog(this, "keyPass is false", "error", JOptionPane.ERROR_MESSAGE);
									}
								});
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}else {
						JOptionPane.showMessageDialog(this, "The Position is high so cant change area", "error", JOptionPane.ERROR_MESSAGE);	
					}
				}
			});
		}else {
			JOptionPane.showMessageDialog(this, "Error", "error", JOptionPane.ERROR_MESSAGE);
		}
	}
	protected void btnChange_2ActionPerformed(ActionEvent e) throws SQLException {
		String id=WIDCP.getText();
		String p=(String) comboBoxP.getSelectedItem();
		var al=new All1();
		if(Check.checkNull(id)==false && Check.checkNumber1(id)==true) {
			if(p.equals("Low")) {
				al.setPosition("Low");
				al.setWardenId(Integer.parseInt(id));
				DML.selectTableAccount().forEach(a->{
					if(a.getWarden_id()==Integer.parseInt(id)) {
						CheckAc=1;
					}
				});
				if(CheckAc==0) {
					WardensDao.updateWardP(al);
					loadWard();
				}else {
					JOptionPane.showMessageDialog(this, "The warden has a account", "error", JOptionPane.ERROR_MESSAGE);
				}
				CheckAc=0;
				
			}else {
				al.setPosition("Hight");
				al.setWardenId(Integer.parseInt(id));
				
				WardensDao.selectTableWardens().forEach(b->{
					if(b.getWardenId()==Integer.parseInt(id)) {
						try {
							WardensDao.selectTableWardens().forEach(c->{
								if(b.getAreaName().equals(c.getAreaName())) {
									if(c.getPosition().equals("Hight")) {
										CheckAc=1;
									}
								}
							});
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				if(CheckAc==0) {
					WardensDao.updateWardP(al);
					loadWard();
				} else {
					JOptionPane.showMessageDialog(this, "The area has a warden hight", "error", JOptionPane.ERROR_MESSAGE);

				}
				CheckAc=0;
			}
		}
	}
	protected void btnAddP_1ActionPerformed(ActionEvent e) throws SQLException {
		String WardId= txtWardenId.getText();
		String firstname= txtFirstName.getText();
		String lastname = txtLastname.getText();
		Date datedob = dob1.getDate();
		String phone= txtPhone.getText();
		String email = txtEmail.getText();
		String address = txtAddress.getText();
		Date startdate= StartDate.getDate();
		String dayoff= txtDayOff.getText();
		String salary = txtSalary.getText();
		String area = (String)cbbArea1.getSelectedItem();
		String shifttype = (String)CbbShift.getSelectedItem();
		All1 ward = new All1();
		
		if(Check.checkNull(WardId)==false &&
		   Check.checkNull(firstname)==false &&
		   Check.checkNull(lastname)== false &&
		   Check.checkNull(phone)== false &&
		   Check.checkNull(email)== false &&
		   Check.checkNull(address)== false &&
		   Check.checkNull(dayoff)== false &&
		   Check.checkNull(salary)== false &&
		   Check.checkNull(area)== false &&
		   Check.checkNull(shifttype)== false
		){
			if(WardensDao.checkExistWardenId(Integer.parseInt(WardId))==false) {
				if(Check.checkNumber1(WardId)==true && 
				   Check.checkNumber1(phone)==true &&
				   Check.checkNumber1(dayoff)==true &&
				   Check.checkNumber1(salary)==true
				){
					if(Check.checkString(firstname)==true &&
						Check.checkString(lastname)==true
					){
						if(email.contains("@")) {
							WardensDao.selectTableWardens().forEach(w -> {
					            if (area.equals(w.getAreaName())) {
					                if (rdbtnHigh.isSelected()) {
					                    count1 += 1;
					                }else {
					                	count1 = 0;
					                }
					            }
					        });
							if(count1>0) {
								JOptionPane.showMessageDialog(this, "Hight is exits in area","Error",JOptionPane.ERROR_MESSAGE);
								count1=0;
								} else {
								if(rdbtnLow.isSelected()) {
									ward.setPosition("Low");
								}
									ward.setWardenId(Integer.parseInt(WardId));
									ward.setFirstName(firstname);
									ward.setLastName(lastname);
									ward.setDateOfBirth(LocalDate.ofInstant(datedob.toInstant(), ZoneId.systemDefault()));
									if(rdbtnMale.isSelected()) {
										ward.setIsMale("Male");
									}else {
										ward.setIsMale("female");
									}
									ward.setPhoneNumber(phone);
											
									ward.setEmail(email);
											
									ward.setAddress(address);
									
									ward.setStartDate(LocalDate.ofInstant(startdate.toInstant(), ZoneId.systemDefault()));
											
									ward.setDay_off(Integer.parseInt(dayoff));
											
									if(rdbtnEmployed.isSelected()) {
										ward.setIs_Working(true);
									}else {
										ward.setIs_Working(false);
									}
									ward.setSalary(Integer.parseInt(salary));
									WardensDao.selectTableWardens().forEach(w->{
										if(area.equals(w.getAreaName()) && shifttype.equals(w.getShiftType())) {
											ward.setShift_number(w.getShift_number());
										}
									});
									WardensDao.insertWard(ward);
									refresh();
							}
						}else {
							JOptionPane.showMessageDialog(this, "Please check again, The email must contain @", "error", JOptionPane.WARNING_MESSAGE);
						}	
					}else {
						JOptionPane.showMessageDialog(this, "Please check again, LastName and FirstName fields only accept strings!", "error", JOptionPane.WARNING_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(this, "Please check again, (wardId, Phone, Dayoff, Salary) fields only accept numbers!", "error", JOptionPane.WARNING_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(this, "Id already exists!", "error", JOptionPane.WARNING_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(this, "Please Input all the information!", "Error", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void refresh() {
		txtWardenId.setText("");
		txtFirstName.setText("");
		txtLastname.setText("");
		dob1.setDate(new Date());
		txtPhone.setText("");
		txtEmail.setText("");
		txtAddress.setText("");
		StartDate.setDate(new Date());
		txtDayOff.setText("");
		txtSalary.setText("");
		rdbtnMale_1.setSelected(false);
		rdbtnFemale_1.setSelected(false);
		rdbtnEmployed_1.setSelected(false);
		rdbtnResigned_1.setSelected(false);
		lbshowWid.setText("");
		lbShowWfn.setText("");
		lbShowWln.setText("");
		lblShowWarea.setText("");
		lblShowWP.setText("");
		lblShowWS.setText("");
		txtWardidupdateare.setText("");
	}
	protected void lblWSMouseClicked(MouseEvent e) {
		panel_showW.show(true);
		panel_addW.show(false);
		lblWA.setBackground(new Color(0,64,64));
		lblWS.setBackground(new Color(64,128,128));
	}
	protected void lblNewLabel_90MouseClicked(MouseEvent e) {
		panel_showW.show(false);
		panel_addW.show(true);
		lblWA.setBackground(new Color(64,128,128));
		lblWS.setBackground(new Color(0,64,64));
	}
	protected void btnShowWUActionPerformed(ActionEvent e) throws SQLException {
		String id=WWID.getText();	
		WWID.enable(false);
		if(Check.checkNull(id)==false && Check.checkNumber1(id)==true) {
			WardensDao.selectTableWardens().forEach(p->{
				if(p.getWardenId()==Integer.parseInt(id)) {
					WFN.setText(p.getFirstName());
					WLN.setText(p.getLastName());
					WA.setText(p.getAddress());
					WE.setText(p.getEmail());
					WP.setText(p.getPhoneNumber());
					WS.setText(String.valueOf(p.getSalary()));
					WDOU.setText(String.valueOf(p.getDay_off()));
					StartDate2.setDate(p.getStartTime());
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					Date dob = null;
					try {
						dob = simpleDateFormat.parse(p.getDateOfBirth().toString());
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					dob2.setDate(dob);
					if(p.getIsMale().equals("male")) {
						rdbtnMale_1.isSelected();
					}else {
						rdbtnFemale_1.isSelected();
					}
					if(p.getIs_Working()==true) {
						rdbtnEmployed.isSelected();
					}else {
						rdbtnResigned.isSelected();
					}
				}
			});	
		}else {
			JOptionPane.showMessageDialog(this, "Error");
		}
	}
	protected void btnCancel_1ActionPerformed(ActionEvent e) {
		WWID.enable(true);
		WWID.setText(null);
		WFN.setText(null);
		WLN.setText(null);
		WA.setText(null);
		WE.setText(null);
		WP.setText(null);
		WS.setText(null);
		WDOU.setText(null);
		StartDate2.setDate(new Date());
		dob2.setDate(new Date());
		rdbtnMale_1.isSelected();
		rdbtnEmployed.isSelected();
	}
	protected void UpdateP_1ActionPerformed(ActionEvent e) {
		String id=WWID.getText();
		String fn=WFN.getText();
		String ln=WLN.getText();
		String address=WA.getText();
		String email=WE.getText();
		String phone=WP.getText();
		String dayoff=WDOU.getText();
		String salary=WS.getText();
		Date start=StartDate2.getDate();
		Date dob=dob2.getDate();
		All1 w=new All1();
		if(Check.checkNull(id)==false &&
				Check.checkNull(fn)==false &&
				Check.checkNull(ln)==false &&
				Check.checkNull(address)==false &&
				Check.checkNull(email)==false &&
				Check.checkNull(phone)==false &&
				Check.checkNull(dayoff)==false &&
				Check.checkNull(salary)==false 
				) {
			if(Check.checkNumber1(id)==true && Check.checkNumber1(dayoff)==true && Check.checkNumber1(salary)==true) {
				if(rdbtnMale.isSelected()) {
					w.setIsMale("Male");
				}else {
					w.setIsMale("Female");
				}
				if(rdbtnEmployed.isSelected()) {
					w.setIs_Working(true);
				}else {
					w.setIs_Working(false);
				}
				w.setWardenId(Integer.parseInt(id));
				w.setFirstName(fn);
				w.setLastName(ln);
				w.setAddress(address);
				w.setDateOfBirth(LocalDate.ofInstant(dob.toInstant(), ZoneId.systemDefault()));
				w.setStartDate(LocalDate.ofInstant(start.toInstant(), ZoneId.systemDefault()));
				w.setDay_off(Integer.parseInt(dayoff));
				w.setPhoneNumber(phone);
				w.setEmail(email);
				w.setSalary(Integer.parseInt(salary));
				WardensDao.updateWard(w);
			}
		}
		
	}
	protected void btnChangePassActionPerformed(ActionEvent e) throws SQLException {
		try {
			String pass=JOptionPane.showInputDialog(this, "Enter new password");
			if(Check.checkNull(pass)==false) {
				Admin ad=new Admin();
				ad.setPassword(pass);
				AdminDao.updatePass(ad);
				JOptionPane.showMessageDialog(this, "S.uccess");
				AdminDao.selectTableAdmin().forEach(p->{
					showPass.setText(p.getPassword());
					});
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	protected void btnChangeKeypassActionPerformed(ActionEvent e) {
		try {
			String pass=JOptionPane.showInputDialog(this, "Enter new password");
			if(Check.checkNull(pass)==false && Check.checkNumber1(pass)==true) {
				Admin ad=new Admin();
				ad.setKey(Integer.parseInt(pass));;
				AdminDao.updateKey(ad);
				JOptionPane.showMessageDialog(this, "Success");
				AdminDao.selectTableAdmin().forEach(p->{
					showPass.setText(String.valueOf(p.getKey()));
					});
			}
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	protected void btnImageActionPerformed(ActionEvent e) {
		var chooser = new JFileChooser(System.getProperty("D:\\") + "\\ImgPrísoner");
		chooser.setDialogTitle("Open image");
		chooser.setFileFilter(new FileNameExtensionFilter("image (jpg, png)", "jpg", "png"));
		chooser.setAcceptAllFileFilterUsed(false);
		var result = chooser.showOpenDialog(null);
		if(result==JFileChooser.APPROVE_OPTION) {
			var f = chooser.getSelectedFile();
			fileName = f.getName();
			driBefore = f.getAbsolutePath();
			lblImageUp.setIcon(new ImageIcon(new ImageIcon(f.getAbsolutePath()).getImage()
				.getScaledInstance(150, 249, Image.SCALE_SMOOTH)));
		}
	}
	protected void btnImageRActionPerformed(ActionEvent e) {
		var chooser = new JFileChooser(System.getProperty("D:\\") + "\\ImgPrísoner");
		chooser.setDialogTitle("Open image");
		chooser.setFileFilter(new FileNameExtensionFilter("image (jpg, png)", "jpg", "png"));
		chooser.setAcceptAllFileFilterUsed(false);
		var result = chooser.showOpenDialog(null);
		if(result==JFileChooser.APPROVE_OPTION) {
			var f = chooser.getSelectedFile();
			fileNamer = f.getName();
			driBeforer = f.getAbsolutePath();
			lblImageR.setIcon(new ImageIcon(new ImageIcon(f.getAbsolutePath()).getImage()
				.getScaledInstance(150, 249, Image.SCALE_SMOOTH)));
		}
	}
	protected void btnAddH_4ActionPerformed(ActionEvent e) throws SQLException {
		String id=URID.getText();
		String name=URN.getText();
		String contact=URC.getText();
		String re=URR.getText();
		String cc=URCC.getText();
		RelativesByPrisoner r=new RelativesByPrisoner();
		if(Check.checkNull(id)==false && Check.checkNull(name)==false && Check.checkNull(contact)==false && Check.checkNull(re)==false && Check.checkNull(cc)==false ) {
			if(Check.checkNumber1(id)==true && Check.checkNumber1(cc)) {
				r.setCCCD(Integer.parseInt(cc));
				r.setContactInfo(contact);
				r.setId(Integer.parseInt(id));
				r.setRelationship(re);
				r.setRelativeName(name);
				r.setRelativeId(Integer.parseInt(id));
				if(fileNamer!=null) {
					driAfterr = System.getProperty("user.dir") + "\\imageR";
					var pathBefore = Paths.get(driBeforer);
					var pathAfter = Paths.get(driAfterr);
					try {
						Files.copy(pathBefore, pathAfter.resolve(fileNamer), StandardCopyOption.REPLACE_EXISTING);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					r.setImage("imageR/" + fileNamer);
				} else {
					r.setImage("imageR/" + fileBeforer);
				}
				RelaveDao.updateRela(r);
				JOptionPane.showMessageDialog(this, "Success");
			}
		}
	}
	protected void btnAddH_1ActionPerformed(ActionEvent e) throws SQLException {
		String id=RPID.getText();
		String  name=RPN.getText();
		String contact=RPC.getText();
		String rela=RPR.getText();
		String cccd=RPCCCD.getText();
		if(Check.checkNull(id)==false &&Check.checkNull(name)==false && Check.checkNull(contact)==false && Check.checkNull(rela)==false && Check.checkNull(cccd)==false) {
			if(Check.checkNumber1(id)==true && Check.checkNumber1(cccd)==true) {
				PrisonersDao.selectTablePrisoners().forEach(p->{
					if(p.getId()==Integer.parseInt(id)) {
						CheckR=1;
					}
				});
				if(CheckR==1) {
					RelativesByPrisoner r=new RelativesByPrisoner();
					r.setId(Integer.parseInt(id));
					r.setCCCD(Integer.parseInt(cccd));
					r.setContactInfo(contact);
					r.setImage(null);
					r.setRelationship(rela);
					r.setRelativeName(name);
					try {
						RelaveDao.inserRela(r);
						JOptionPane.showMessageDialog(this, "Success");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					CheckR=0;
				}else {
					JOptionPane.showMessageDialog(this, "Prisoner no exist");
				}
			}
		}else {
			JOptionPane.showMessageDialog(this, "Null");
		}
	}
	protected void btnAddH_5ActionPerformed(ActionEvent e) throws SQLException {
		String id=URID.getText();
		URID.enable(false);
		if(Check.checkNull(id)==false && Check.checkNumber1(id)==true) {
			RelaveDao.selectTableRela().forEach(p->{
				if(p.getRelativeId()==Integer.parseInt(id)) {
					
					URN.setText(p.getRelativeName());
					URC.setText(p.getContactInfo());
					URR.setText(p.getRelationship());
					URCC.setText(String.valueOf(p.getCCCD()));
					lblImageR.setIcon(
							new ImageIcon(
									new ImageIcon(
										p.getImage()
									)
									.getImage()
									.getScaledInstance(150, 249, Image.SCALE_SMOOTH)));
				}
			});
		}
	}
	protected void btnAddH_6ActionPerformed(ActionEvent e) {
		URID.enable(true);
		URID.setText(null);
		URN.setText(null);
		URC.setText(null);
		URR.setText(null);
		URCC.setText(null);
		lblImageR.setIcon(null);
	}
	protected void lblEmployMouseClicked(MouseEvent e) {
		lblP.setBackground(new Color(0,64,64));
		lblW.setBackground(new Color(0,64,64));
		lblA.setBackground(new Color(0,64,64));
		lblAc.setBackground(new Color(0,64,64));
		lblN1.setBackground(new Color(0,64,64));
		lblWS.setBackground(new Color(0,64,64));
		lblEmploy.setBackground(new Color(0,40,40));
		panel_prisoners.show(false);
		panel_wardens.show(false);
		panel_account.show(false);
		panel_areas.show(false);
		panel_7.show(false);
		panel_8.show(false);
		panel_showW.show(true);
		panel_addW.show(false);
	}
}


