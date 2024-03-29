package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class G08_Gugudan {

	/*
	 	# 실행하면 구구단이 출력되는 GUI 프로그램을 만들보세요
	 	
	 	(1) 프로그램을 처음 시작하면 구구단 2단이 출력된 상태로 시작
	 	
	 	(2) + 버튼을 누르면 단이 증가하며 구구단 내용이 바뀜 (최대 9단 까지)
	 	
	 	(3) - 버튼을 누르면 단이 감소하며 구구단 내용이 바뀜 (최소 2단 까지)
	*/
static int dan = 2;

public static void main(String[] args) {
	JFrame f = new JFrame("구구단 보기");
		
	f.setLayout(new BorderLayout(2, 1));
		
	JPanel topPanel = new JPanel(new GridLayout(9, 1));
		
	List<JLabel> gugudanLabels = new ArrayList<>();
		
	for (int i = 0; i < 9; ++i) {
		JLabel gugudanLabel = new JLabel(String.format("2 X %d = %d",
				(i + 1), (i + 1) * 2));
		gugudanLabel.setFont(new Font("Consolas", Font.PLAIN, 25));
		gugudanLabels.add(gugudanLabel);
		topPanel.add(gugudanLabel);
		}
		
		JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
		
		JButton nextBtn = new JButton(">>");
		JButton prevBtn = new JButton("<<");
		
		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				++dan;
				for (int i = 0; i < 9; ++i) {
					JLabel gugudanLabel = gugudanLabels.get(i);
					int gop = i + 1;
					gugudanLabel.setText(
							String.format("%d X %d = %d", dan, gop, dan * gop));
				}
				
				if (dan == 3) {
					prevBtn.setEnabled(true);
				} else if (dan == 9) {
					nextBtn.setEnabled(false);
				}
			}
		});
		
		prevBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				--dan;
				for (int i = 0; i < 9; ++i) {
					JLabel gugudanLabel = gugudanLabels.get(i);
					int gop = i + 1;
					gugudanLabel.setText(
							String.format("%d X %d = %d", dan, gop, dan * gop));
				}
				
				if (dan == 8) {
					nextBtn.setEnabled(true);
				} else if (dan == 2) {
					prevBtn.setEnabled(false);
				}
			}
		});
		
		prevBtn.setEnabled(false);
		
		bottomPanel.add(prevBtn);
		bottomPanel.add(nextBtn);
		
		f.add(topPanel, "Center");
		f.add(bottomPanel, "South");
		
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 300, 300);
		f.setVisible(true);
		}
	
}
