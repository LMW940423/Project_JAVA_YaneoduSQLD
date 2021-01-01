//package com.javalec.Selectfunction;
//
//import java.awt.EventQueue;
//
//import javax.swing.JDialog;
//import javax.swing.JLabel;
//
//import com.javalec.Login.login;
//
//import java.awt.Font;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//public class DeleteConfirm extends JDialog {
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DeleteConfirm dialog = new DeleteConfirm();
//					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//					dialog.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the dialog.
//	 */
//	public DeleteConfirm() {
//		setBounds(100, 100, 400, 200);
//		getContentPane().setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("탈퇴하시겠습니까?");
//		lblNewLabel.setFont(new Font("궁서체", Font.BOLD, 18));
//		lblNewLabel.setBounds(107, 42, 167, 18);
//		getContentPane().add(lblNewLabel);
//		
//		JButton btnNewButton = new JButton("네");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				Update ud = new Update();
//				ud.saveData();
//				ud.deleteLevelAction();
//				ud.deleteUserAction();
//				dispose();
//				login login = new login();
//				login.setLocationRelativeTo(null);
//				login.setVisible(true);
//				ud.setVisible(false);
//			}
//		});
//		btnNewButton.setBounds(79, 86, 105, 27);
//		getContentPane().add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("아니오");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//		});
//		btnNewButton_1.setBounds(198, 86, 105, 27);
//		getContentPane().add(btnNewButton_1);
//		
//
//	}
//
//}
