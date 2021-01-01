package com.javalec.Section;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowSection extends JDialog {
	private JButton btnExit;
	private JLabel lbl10;
	private JLabel lbl9;
	private JLabel lbl8;
	private JLabel lbl7;
	private JLabel lbl6;
	private JLabel lbl5;
	private JLabel lbl4;
	private JLabel lbl3;
	private JLabel lbl2;
	private JLabel lbl1;
	
	public ArrayList<String> arrayList = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowSection dialog = new ShowSection();
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
	public ShowSection() {
		setTitle("레벨별 인원");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				GetSectionCount();
			}
		});
		setBounds(100, 100, 270, 419);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnExit());
		getContentPane().add(getLbl10());
		getContentPane().add(getLbl9());
		getContentPane().add(getLbl8());
		getContentPane().add(getLbl7());
		getContentPane().add(getLbl6());
		getContentPane().add(getLbl5());
		getContentPane().add(getLbl4());
		getContentPane().add(getLbl3());
		getContentPane().add(getLbl2());
		getContentPane().add(getLbl1());

	}
	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("나가기");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ShowSection.this.dispose();
				}
			});
			btnExit.setBounds(79, 323, 117, 29);
		}
		return btnExit;
	}
	private JLabel getLbl10() {
		if (lbl10 == null) {
			lbl10 = new JLabel("LV.10 :");
			lbl10.setForeground(new Color(139, 0, 0));
			lbl10.setFont(new Font("Lucida Grande", Font.BOLD, 20));
			lbl10.setBounds(58, 38, 149, 29);
		}
		return lbl10;
	}
	private JLabel getLbl9() {
		if (lbl9 == null) {
			lbl9 = new JLabel("LV.9 :");
			lbl9.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lbl9.setBounds(90, 88, 131, 23);
		}
		return lbl9;
	}
	private JLabel getLbl8() {
		if (lbl8 == null) {
			lbl8 = new JLabel("LV.8 :");
			lbl8.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lbl8.setBounds(90, 111, 131, 23);
		}
		return lbl8;
	}
	private JLabel getLbl7() {
		if (lbl7 == null) {
			lbl7 = new JLabel("LV.7 :");
			lbl7.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lbl7.setBounds(90, 135, 131, 23);
		}
		return lbl7;
	}
	private JLabel getLbl6() {
		if (lbl6 == null) {
			lbl6 = new JLabel("LV.6 :");
			lbl6.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lbl6.setBounds(90, 159, 131, 23);
		}
		return lbl6;
	}
	private JLabel getLbl5() {
		if (lbl5 == null) {
			lbl5 = new JLabel("LV.5 :");
			lbl5.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lbl5.setBounds(90, 183, 131, 23);
		}
		return lbl5;
	}
	private JLabel getLbl4() {
		if (lbl4 == null) {
			lbl4 = new JLabel("LV.4 :");
			lbl4.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lbl4.setBounds(90, 207, 131, 23);
		}
		return lbl4;
	}
	private JLabel getLbl3() {
		if (lbl3 == null) {
			lbl3 = new JLabel("LV.3 :");
			lbl3.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lbl3.setBounds(90, 231, 131, 23);
		}
		return lbl3;
	}
	private JLabel getLbl2() {
		if (lbl2 == null) {
			lbl2 = new JLabel("LV.2 :");
			lbl2.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lbl2.setBounds(90, 255, 131, 23);
		}
		return lbl2;
	}
	private JLabel getLbl1() {
		if (lbl1 == null) {
			lbl1 = new JLabel("LV.1 :");
			lbl1.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			lbl1.setBounds(90, 279, 131, 23);
		}
		return lbl1;
	}
	public void GetSectionCount() {
		SectionAction action = new SectionAction();
		arrayList = action.rowCount();
		
		lbl1.setText("LV.1 => " + arrayList.get(0) + "명");
		lbl2.setText("LV.2 => " + arrayList.get(1) + "명");
		lbl3.setText("LV.3 => " + arrayList.get(2) + "명");
		lbl4.setText("LV.4 => " + arrayList.get(3) + "명");
		lbl5.setText("LV.5 => " + arrayList.get(4) + "명");
		lbl6.setText("LV.6 => " + arrayList.get(5) + "명");
		lbl7.setText("LV.7 => " + arrayList.get(6) + "명");
		lbl8.setText("LV.8 => " + arrayList.get(7) + "명");
		lbl9.setText("LV.9 => " + arrayList.get(8) + "명");
		lbl10.setText("LV.10 => " + arrayList.get(9) + "명");
		
	}
	
}
