package com.javalec.Admin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.javalec.Selectfunction.Been;
import com.javalec.share.ShareVar;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;

public class NoticeReadUDM extends JDialog {
	ShareVar shareVar = new ShareVar();

	private final JPanel contentPanel = new JPanel();
	private JTextArea tfbContents;
	private JLabel tfTitle;
	private JTextField tfbTitle;
	private JLabel lblNewLabel_1;
	private JButton btnPrevious;

	private final String url_mysql = ShareVar.url_mysql;
	private final String id_mysql = ShareVar.id_mysql;
	private final String pw_mysql = ShareVar.pw_mysql;
	private JButton btnUpdate;
	private JButton btnDelete;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NoticeReadUDM dialog = new NoticeReadUDM();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NoticeReadUDM() {
		setTitle("공지사항 작성");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				listInfo1();
			}
		});
		setBounds(100, 100, 460, 504);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(51, 51, 51));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.add(getTfbContents());
		contentPanel.add(getTfTitle());
		contentPanel.add(getTfbTitle());
		contentPanel.add(getLblNewLabel_1());
		contentPanel.add(getBtnPrevious());
		contentPanel.add(getBtnUpdate());
		contentPanel.add(getBtnDelete());
	}
	private JTextArea getTfbContents() {
		if (tfbContents == null) {
			tfbContents = new JTextArea();
			tfbContents.setBounds(18, 84, 424, 350);
		}
		return tfbContents;
	}
	private JLabel getTfTitle() {
		if (tfTitle == null) {
			tfTitle = new JLabel("제목");
			tfTitle.setForeground(Color.WHITE);
			tfTitle.setBounds(18, 6, 61, 16);
		}
		return tfTitle;
	}
	private JTextField getTfbTitle() {
		if (tfbTitle == null) {
			tfbTitle = new JTextField();
			tfbTitle.setBounds(18, 26, 424, 26);
			tfbTitle.setColumns(10);
		}
		return tfbTitle;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("내용");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(18, 64, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnPrevious() {
		if (btnPrevious == null) {
			btnPrevious = new JButton("이전");
			btnPrevious.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
					NoticeM boardM = new NoticeM();
					boardM.setVisible(true);
					boardM.setLocationRelativeTo(null);
				}
			});
			btnPrevious.setBounds(325, 446, 117, 29);
		}
		return btnPrevious;
	}
	
	public void listInfo1() {
		Been seqno = new Been();
		
		String WhereDefault = "select board_title, board_contents from board "; 
        String WhereDefault2 = "where board_seqno =" + seqno.seqno;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            Statement stmt_mysql = conn_mysql.createStatement();

            ResultSet rs = stmt_mysql.executeQuery(WhereDefault + WhereDefault2);
           
            while(rs.next()){

            	tfbTitle.setText(rs.getString(1));
            	tfbContents.setText(rs.getString(2));
            	
            }
            conn_mysql.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
	}
	
	public JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("수정");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				boardUpdate();
				
				
				
				
				}
			});
			btnUpdate.setBounds(18, 446, 71, 29);
		}
		return btnUpdate;
	}
	public JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("삭제");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boardDelete();
 					NoticeM bd = new NoticeM();
 					bd.setLocationRelativeTo(null);
 					bd.setVisible(true);
 					dispose();
//				Been seqno = new Been();
//				BoardReadUDAction uda = new BoardReadUDAction();
//				uda.boardDelete();
				
				}
			});
			btnDelete.setBounds(92, 446, 71, 29);
		}
		return btnDelete;
	}
	

	public void boardUpdate() {
	
		if(weakTitle()==true && weakContents()==true) {
			
			
		String title = tfbTitle.getText();
		String contents = tfbContents.getText();
		NoticeReadUDActionM uda = new NoticeReadUDActionM(title,contents);
		boolean msg = uda.boardUpdate();
		
		if(msg == true) {
			JOptionPane.showMessageDialog(null, "수정완료");
		}else{
			JOptionPane.showMessageDialog(null, "수정실패");
			
		}
		
		}
	}
	public boolean boardDelete() {
        PreparedStatement ps = null;
        Been seqno = new Been();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn_mysql = DriverManager.getConnection(url_mysql,id_mysql,pw_mysql);
            @SuppressWarnings("unused")
			Statement stmt_mysql = conn_mysql.createStatement();

            String A = "delete from board where board_seqno = ? ";

            ps = conn_mysql.prepareStatement(A);
            
            ps.setInt(1, seqno.seqno);
            ps.executeUpdate();

            conn_mysql.close();
        } catch (Exception e){
           JOptionPane.showMessageDialog(null, "삭제실패");
        	e.printStackTrace();
            return false;
        }
        JOptionPane.showMessageDialog(null, "삭제완료"); 				
        return true;
	}
	
private boolean weakTitle() {
		
		String getTitle = tfbTitle.getText().toString();
		String trimTitle = tfbTitle.getText().trim().toString().replaceAll(" ", "");
		
		if(getTitle.length() - trimTitle.length() != 0 || getTitle.length() == 0){
			JOptionPane.showMessageDialog(null, "제목을 입력하세요.");
			
			return false;
		}else {
			
			return true;
		}
		
	}
	
	private boolean weakContents() {
		
		String getContents = tfbContents.getText().toString();
		String trimContents = tfbContents.getText().trim().toString().replaceAll(" ", "");
		
		if(getContents.length() - trimContents.length() != 0 || getContents.length() == 0){
			JOptionPane.showMessageDialog(null, "내용을 입력하세요.");
			
			return false;
		}else {
			
			return true;
		}
	}
//	public void boardDelete() {
//		
//		
//		BoardReadUDAction uda1 = new BoardReadUDAction(Been.seqno);
//		
//		boolean msg = uda1.boardDelete();
//		
//		if(msg == true) {
//			JOptionPane.showMessageDialog(null, "삭제완료");
//	
//	
//		}
//	}
}