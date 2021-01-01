package com.javalec.Admin;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class inputQuiz extends JDialog {
	private JButton btnInput;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_1_1;
	private JLabel label_1_1_1;
	private JLabel label_1_1_1_1;
	private JLabel label_1_1_1_1_1;
	private JLabel lblNewLabel;
	private JLabel label_2;
	private JTextArea taQuiz;
	private JTextField tfQuestion1;
	private JTextField tfQuestion2;
	private JTextField tfQuestion3;
	private JTextField tfQuestion4;
	private JTextField tfAnswer;
	private JTextArea taContents;
	private JComboBox cbChapter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inputQuiz dialog = new inputQuiz();
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
	public inputQuiz() {
		setBounds(100, 100, 597, 596);
		getContentPane().setLayout(null);
		getContentPane().add(getBtnInput());
		getContentPane().add(getLabel());
		getContentPane().add(getLabel_1());
		getContentPane().add(getLabel_1_1());
		getContentPane().add(getLabel_1_1_1());
		getContentPane().add(getLabel_1_1_1_1());
		getContentPane().add(getLabel_1_1_1_1_1());
		getContentPane().add(getLblNewLabel());
		getContentPane().add(getLabel_2());
		getContentPane().add(getTaQuiz());
		getContentPane().add(getTfQuestion1());
		getContentPane().add(getTfQuestion2());
		getContentPane().add(getTfQuestion3());
		getContentPane().add(getTfQuestion4());
		getContentPane().add(getTfAnswer());
		getContentPane().add(getTaContents());
		getContentPane().add(getCbChapter());

	}

	private JButton getBtnInput() {
		if (btnInput == null) {
			btnInput = new JButton("입력");
			btnInput.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					inputQuizAction inputQuizAction = new inputQuizAction();
					boolean rs = inputQuizAction.inputContents(taQuiz.getText(), tfQuestion1.getText(), tfQuestion2.getText(), tfQuestion3.getText(), tfQuestion4.getText(), tfAnswer.getText() , taContents.getText(), cbChapter.getSelectedItem().toString());
					if(rs == true){
				          JOptionPane.showMessageDialog(null, "문제 입력 완료");                    
					}else{
				          JOptionPane.showMessageDialog(null, "DB에 자료 입력중 에러가 발생했습니다! \n 시스템관리자에 문의하세요!");                    
					}
//					taQuiz.setText("");
//					taContents.setText("");
//					tfAnswer.setText("");
//					tfChapter.setText("");
//					tfQuestion1.setText("");
//					tfQuestion2.setText("");
//					tfQuestion3.setText("");
//					tfQuestion4.setText("");
				}
			});
			btnInput.setBounds(474, 540, 117, 29);
		}
		return btnInput;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("문제 :");
			label.setBounds(6, 6, 61, 16);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("문항 1 : ");
			label_1.setBounds(6, 186, 61, 16);
		}
		return label_1;
	}
	private JLabel getLabel_1_1() {
		if (label_1_1 == null) {
			label_1_1 = new JLabel("문항 2 : ");
			label_1_1.setBounds(6, 219, 61, 16);
		}
		return label_1_1;
	}
	private JLabel getLabel_1_1_1() {
		if (label_1_1_1 == null) {
			label_1_1_1 = new JLabel("문항 3 : ");
			label_1_1_1.setBounds(6, 252, 61, 16);
		}
		return label_1_1_1;
	}
	private JLabel getLabel_1_1_1_1() {
		if (label_1_1_1_1 == null) {
			label_1_1_1_1 = new JLabel("문항 4 : ");
			label_1_1_1_1.setBounds(6, 285, 61, 16);
		}
		return label_1_1_1_1;
	}
	private JLabel getLabel_1_1_1_1_1() {
		if (label_1_1_1_1_1 == null) {
			label_1_1_1_1_1 = new JLabel("정답 : ");
			label_1_1_1_1_1.setBounds(6, 323, 61, 16);
		}
		return label_1_1_1_1_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("해설 : ");
			lblNewLabel.setBounds(6, 351, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("쳅터 : ");
			label_2.setBounds(6, 545, 61, 16);
		}
		return label_2;
	}
	private JTextArea getTaQuiz() {
		if (taQuiz == null) {
			taQuiz = new JTextArea();
			taQuiz.setBounds(41, 6, 550, 163);
		}
		return taQuiz;
	}
	private JTextField getTfQuestion1() {
		if (tfQuestion1 == null) {
			tfQuestion1 = new JTextField();
			tfQuestion1.setBounds(51, 181, 540, 26);
			tfQuestion1.setColumns(10);
		}
		return tfQuestion1;
	}
	private JTextField getTfQuestion2() {
		if (tfQuestion2 == null) {
			tfQuestion2 = new JTextField();
			tfQuestion2.setColumns(10);
			tfQuestion2.setBounds(51, 214, 540, 26);
		}
		return tfQuestion2;
	}
	private JTextField getTfQuestion3() {
		if (tfQuestion3 == null) {
			tfQuestion3 = new JTextField();
			tfQuestion3.setColumns(10);
			tfQuestion3.setBounds(51, 247, 540, 26);
		}
		return tfQuestion3;
	}
	private JTextField getTfQuestion4() {
		if (tfQuestion4 == null) {
			tfQuestion4 = new JTextField();
			tfQuestion4.setColumns(10);
			tfQuestion4.setBounds(51, 280, 540, 26);
		}
		return tfQuestion4;
	}
	private JTextField getTfAnswer() {
		if (tfAnswer == null) {
			tfAnswer = new JTextField();
			tfAnswer.setColumns(10);
			tfAnswer.setBounds(51, 318, 540, 26);
		}
		return tfAnswer;
	}
	private JTextArea getTaContents() {
		if (taContents == null) {
			taContents = new JTextArea();
			taContents.setBounds(41, 351, 550, 174);
		}
		return taContents;
	}
	private JComboBox getCbChapter() {
		if (cbChapter == null) {
			cbChapter = new JComboBox();
			cbChapter.setModel(new DefaultComboBoxModel(new String[] {"데이터 모델링", "sql 기본", "sql 활용"}));
			cbChapter.setBounds(41, 541, 166, 27);
		}
		return cbChapter;
	}
}
