package com.javalec.Admin;


import javax.swing.JDialog;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import com.javalec.share.ShareVar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class UpdateQuiz extends JDialog {
	private JComboBox cbSearch;
	private JTextField tfSearch;
	private JButton btnSearch;
	private JLabel lblNewLabel;
	private JTextArea taQuiz;
	private JLabel label;
	private JTextField tfQuestion1;
	private JLabel label_1;
	private JTextField tfQuestion2;
	private JLabel label_2;
	private JTextField tfQuestion3;
	private JLabel label_3;
	private JTextField tfQuestion4;
	private JLabel label_4;
	private JTextField tfAnswer;
	private JLabel lblNewLabel_1;
	private JTextArea taContents;
	private JLabel label_5;
	private JTextField tfChapter;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateQuiz dialog = new UpdateQuiz();
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
	public UpdateQuiz() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				taQuiz.setText(ShareVar.QcAdm);
				tfQuestion1.setText(ShareVar.Qt1Adm);
				tfQuestion2.setText(ShareVar.Qt2Adm);
				tfQuestion3.setText(ShareVar.Qt3Adm);
				tfQuestion4.setText(ShareVar.Qt4Adm);
				tfAnswer.setText(Integer.toString(ShareVar.answAdm));
				taContents.setText(ShareVar.ExplAdm);
				tfChapter.setText(ShareVar.chapAdm);
			}
		});
		setBounds(100, 100, 606, 604);
		getContentPane().setLayout(null);
		getContentPane().add(getCbSearch());
		getContentPane().add(getTfSearch());
		getContentPane().add(getBtnSearch());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getTaQuiz());
		getContentPane().add(getLabel());
		getContentPane().add(getTextField_1_1());
		getContentPane().add(getLabel_1());
		getContentPane().add(getTfQuestion2());
		getContentPane().add(getLabel_2());
		getContentPane().add(getTfQuestion3());
		getContentPane().add(getLabel_3());
		getContentPane().add(getTfQuestion4());
		getContentPane().add(getLabel_4());
		getContentPane().add(getTfAnswer());
		getContentPane().add(getLblNewLabel_1());
		getContentPane().add(getTaContents());
		getContentPane().add(getLabel_5());
		getContentPane().add(getTfChapter());
		getContentPane().add(getBtnNewButton());

	}
	private JComboBox getCbSearch() {
		if (cbSearch == null) {
			cbSearch = new JComboBox();
			cbSearch.setModel(new DefaultComboBoxModel(new String[] {"문제 번호", "문제 내용"}));
			cbSearch.setBounds(6, 6, 114, 27);
		}
		return cbSearch;
	}
	private JTextField getTfSearch() {
		if (tfSearch == null) {
			tfSearch = new JTextField();
			tfSearch.setBounds(132, 5, 339, 26);
			tfSearch.setColumns(10);
		}
		return tfSearch;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("검색");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SearchList searchList = new SearchList(cbSearch.getSelectedIndex(), tfSearch.getText());
					searchList.setLocationRelativeTo(null);
					searchList.setVisible(true);
					dispose();
				}
			});
			btnSearch.setBounds(483, 5, 117, 29);
		}
		return btnSearch;
	}
	
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("문제 :");
			lblNewLabel.setBounds(6, 45, 61, 16);
		}
		return lblNewLabel;
	}
	private JTextArea getTaQuiz() {
		if (taQuiz == null) {
			taQuiz = new JTextArea();
			taQuiz.setBounds(42, 45, 558, 152);
		}
		return taQuiz;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("문항 1 : ");
			label.setBounds(6, 214, 61, 16);
		}
		return label;
	}
	private JTextField getTextField_1_1() {
		if (tfQuestion1 == null) {
			tfQuestion1 = new JTextField();
			tfQuestion1.setBounds(52, 209, 548, 26);
			tfQuestion1.setColumns(10);
		}
		return tfQuestion1;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("문항 2 : ");
			label_1.setBounds(6, 247, 61, 16);
		}
		return label_1;
	}
	private JTextField getTfQuestion2() {
		if (tfQuestion2 == null) {
			tfQuestion2 = new JTextField();
			tfQuestion2.setColumns(10);
			tfQuestion2.setBounds(52, 242, 548, 26);
		}
		return tfQuestion2;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("문항 3 : ");
			label_2.setBounds(6, 280, 61, 16);
		}
		return label_2;
	}
	private JTextField getTfQuestion3() {
		if (tfQuestion3 == null) {
			tfQuestion3 = new JTextField();
			tfQuestion3.setColumns(10);
			tfQuestion3.setBounds(52, 275, 548, 26);
		}
		return tfQuestion3;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("문항 4 : ");
			label_3.setBounds(6, 313, 61, 16);
		}
		return label_3;
	}
	private JTextField getTfQuestion4() {
		if (tfQuestion4 == null) {
			tfQuestion4 = new JTextField();
			tfQuestion4.setColumns(10);
			tfQuestion4.setBounds(52, 308, 548, 26);
		}
		return tfQuestion4;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("정답 : ");
			label_4.setBounds(6, 346, 61, 16);
		}
		return label_4;
	}
	private JTextField getTfAnswer() {
		if (tfAnswer == null) {
			tfAnswer = new JTextField();
			tfAnswer.setColumns(10);
			tfAnswer.setBounds(52, 341, 548, 26);
		}
		return tfAnswer;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("해설 : ");
			lblNewLabel_1.setBounds(6, 374, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JTextArea getTaContents() {
		if (taContents == null) {
			taContents = new JTextArea();
			taContents.setBounds(42, 374, 558, 152);
		}
		return taContents;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("챕터 : ");
			label_5.setBounds(6, 538, 61, 16);
		}
		return label_5;
	}
	private JTextField getTfChapter() {
		if (tfChapter == null) {
			tfChapter = new JTextField();
			tfChapter.setBounds(52, 533, 307, 26);
			tfChapter.setColumns(10);
		}
		return tfChapter;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("수정");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					UpdateAction();
				}
			});
			btnNewButton.setBounds(483, 547, 117, 29);
		}
		return btnNewButton;
	}
	private void UpdateAction() {
		String wkQuiz = taQuiz.getText();
		String wkQuestion1 = tfQuestion1.getText();
		String wkQuestion2 = tfQuestion2.getText();
		String wkQuestion3 = tfQuestion3.getText();
		String wkQuestion4 = tfQuestion4.getText();
		int wkAnswer = Integer.parseInt(tfAnswer.getText());
		String wkExplanation = taContents.getText();
		String wkChpater = tfChapter.getText();
		UpdateQuizAction updateQuizAction = new UpdateQuizAction();
		boolean msg = updateQuizAction.UpdateAction(wkQuiz, wkQuestion1, wkQuestion2, wkQuestion3, wkQuestion4, wkAnswer, wkExplanation, wkChpater);
		
		if(msg = true) {
			JOptionPane.showMessageDialog(null, "수정완료");
		}else {
			JOptionPane.showMessageDialog(null, "수정실패");
		}
	}
	
}
