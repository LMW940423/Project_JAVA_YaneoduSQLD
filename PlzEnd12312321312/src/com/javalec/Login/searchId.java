package com.javalec.Login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.share.ShareVar;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class searchId extends JDialog {
	ShareVar shareVar = new ShareVar();

	private final JPanel contentPanel = new JPanel();
	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	private JTextField tfEMAIL;
	private JTextField tfBDAY;
	String id = "!@#$%^11111";
	String email = "!@#$%^11111";
	String bday= "!@#$%^11111";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			searchId dialog = new searchId();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public searchId() {
		setBounds(100, 100, 450, 329);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMAIL");
		lblNewLabel.setBounds(77, 111, 61, 16);
		contentPanel.add(lblNewLabel);
		
		tfEMAIL = new JTextField();
		tfEMAIL.setBounds(127, 106, 130, 26);
		contentPanel.add(tfEMAIL);
		tfEMAIL.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("생년월일");
		lblNewLabel_1.setBounds(77, 144, 61, 16);
		contentPanel.add(lblNewLabel_1);
		
		tfBDAY = new JTextField();
		tfBDAY.setColumns(10);
		tfBDAY.setBounds(127, 139, 130, 26);
		contentPanel.add(tfBDAY);
		
		JButton btnNewButton = new JButton("ID 찾기");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchIDaction();
				idCheck();
	
			}
		});
		btnNewButton.setBounds(263, 106, 117, 59);
		contentPanel.add(btnNewButton);
		
		JButton btnPw = new JButton("PW 찾기");
		btnPw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchPw();
			}
		});
		btnPw.setBounds(263, 187, 117, 29);
		contentPanel.add(btnPw);
		
		JLabel label = new JLabel("패스워드가 기억나지 않는다면 ? ");
		label.setBounds(77, 190, 176, 16);
		contentPanel.add(label);
		
		JButton btnPw_1 = new JButton("회원가입");
		btnPw_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				joinUs();
			}
		});
		btnPw_1.setBounds(263, 221, 117, 29);
		contentPanel.add(btnPw_1);
		
		JLabel label_1 = new JLabel("회원가입을 진행하고 싶으시다면?");
		label_1.setBounds(77, 224, 176, 16);
		contentPanel.add(label_1);
		
		JLabel lblId = new JLabel("ID찾기");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("Hiragino Maru Gothic ProN", Font.PLAIN, 20));
		lblId.setBounds(153, 38, 130, 46);
		contentPanel.add(lblId);
		
		JLabel label_2 = new JLabel("회원가입 시 입력한 정보를 입력해주세요.");
		label_2.setBounds(116, 75, 215, 16);
		contentPanel.add(label_2);
	}
	//아이디 찾기 버튼 실행 메소드
	public void searchIDaction() {
			PreparedStatement ps=null;
			//이메일과 생년월일 
			String WhereDefault = "select userid, useremail, userbirth from yaneoduSQLD.user";
			String WhereDefault2 = " where useremail = '"+tfEMAIL.getText()+"' and userbirth = '"+tfBDAY.getText()+"'";
            try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
	            Statement stmt_mysql = conn_mysql.createStatement();
	            ResultSet rs = stmt_mysql.executeQuery(WhereDefault+WhereDefault2);
	            while(rs.next()){
	            	id = rs.getString(1);
	            	email = rs.getString(2);
	            	bday = rs.getString(3);
	            }
	            conn_mysql.close();
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
	}
	
	public void idCheck() {
    	if (email.equals(tfEMAIL.getText()) && bday.equals(tfBDAY.getText())) {
    		JOptionPane.showMessageDialog(null, "당신의 아이디는 " + id +" 입니다.");
    	}
    	else {
    		JOptionPane.showMessageDialog(null, "일치하는 정보가 없습니다.");
    	}
	}
	
	public void	joinUs(){
		
		joinUs us = new joinUs();
		us.setLocationRelativeTo(null);
		us.setVisible(true);
	}	
	public void	searchPw(){
		
		searchPw sPw = new searchPw();
		sPw.setLocationRelativeTo(null);
		sPw.setVisible(true);
	}
}
