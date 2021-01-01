package com.javalec.Admin;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminMain extends JDialog {
	private JButton btnInput;
	private JButton btnUpdate;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMain dialog = new AdminMain();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public AdminMain() {
		setTitle("관리창");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnInput());
		getContentPane().add(getBtnUpdate());
		getContentPane().add(getButton());

	}
	private JButton getBtnInput() {
		if (btnInput == null) {
			btnInput = new JButton("문제 입력");
			btnInput.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputQuiz inputQuiz = new inputQuiz();
					inputQuiz.setLocationRelativeTo(null);
					inputQuiz.setVisible(true);
					dispose();
				}
			});
			btnInput.setBounds(151, 47, 117, 29);
		}
		return btnInput;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("문제 수정");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UpdateQuiz updateQuiz = new UpdateQuiz();
					updateQuiz.setLocationRelativeTo(null);
					updateQuiz.setVisible(true);
					dispose();
				}
			});
			btnUpdate.setBounds(151, 123, 117, 29);
		}
		return btnUpdate;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("공지사항 관리");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					NoticeM boardM = new NoticeM();
					boardM.setVisible(true);
					boardM.setLocationRelativeTo(null);
					dispose();
				}
			});
			button.setBounds(151, 199, 117, 29);
		}
		return button;
	}
}
