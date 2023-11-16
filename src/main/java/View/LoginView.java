package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Valid.Check;
import database.DML;
import entity.Wardens;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Point;

import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.SwingConstants;

public class LoginView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblUserName;
	private JTextField txtUser;
	private JLabel lblPassWord;
	private JButton btnLogin;
	private JPasswordField txtPass;
	private Point mouseDownPont = null;
	private JLabel lblNewLabel_1;

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
					LoginView frame = new LoginView();
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
	public LoginView() {
		setBackground(new Color(64, 128, 128));
		setTitle("Login");
		setResizable(false);
		setUndecorated(true);
		
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 40, 40));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		separator = new JSeparator();
		
		lblUserName = new JLabel("UserName");
		lblUserName.setForeground(new Color(255, 255, 255));
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtUser = new JTextField();
		txtUser.setColumns(10);
		
		lblPassWord = new JLabel("PassWord");
		lblPassWord.setForeground(new Color(255, 255, 255));
		lblPassWord.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 0, 0));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btnLoginActionPerformed(e);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setFont(new Font("SansSerif", Font.PLAIN, 15));
		
		txtPass = new JPasswordField();
		
		lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_1MouseClicked(e);
			}
		});
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel_1.setBackground(Color.RED);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(164)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
					.addGap(150)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(65)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblPassWord, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtPass, 189, 189, 189)))
					.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(179, Short.MAX_VALUE)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(156))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addGap(28))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(9)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(1)
							.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPassWord, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtPass, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(64)
							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	protected void btnLoginActionPerformed(ActionEvent e) throws SQLException {
		String username=txtUser.getText();
		String password=new String(txtPass.getPassword());
		if(Check.checkNull(username)==false) {
			if(Check.checkNull(password)==false) {
				if(Check.checkLogin(username, password)==0) {
					this.setVisible(false);
					Addmin_view admin=new Addmin_view();
					admin.setVisible(true);
				}else if(Check.checkExistUser(username)==1 && Check.checkExistPass(password)==1) {
					DML.selectTableAccount().forEach(acc->{
						if(acc.getUsername().equals(username)) {
							if(acc.getActive()==1) {
								this.setVisible(false);
								Wardens.wardenId = acc.getWarden_id();
								User_view qlsv=new User_view();
								qlsv.setVisible(true);
								return;
							}else {JOptionPane.showMessageDialog(this,"Tai khoan bi vo hieu hoa","Thông báo",JOptionPane.ERROR_MESSAGE);}
						}
					});	
				}else {JOptionPane.showMessageDialog(this,"Sai tài khoản hoặc mật khẩu","Thông báo",JOptionPane.ERROR_MESSAGE);}
			}else{JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu");}
		}else{JOptionPane.showMessageDialog(this, "Vui lòng nhập tài khoản");}
			
	}
	
	protected void thisMousePressed(MouseEvent e) {
		mouseDownPont = e.getPoint();
	}
	protected void thisMouseDragged(MouseEvent e) {
		Point cur = e.getLocationOnScreen();
		this.setLocation(cur.x - mouseDownPont.x , cur.y - mouseDownPont.y);
		
	}
	protected void lblNewLabel_1MouseClicked(MouseEvent e) {
		this.dispose();
	}
}
