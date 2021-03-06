package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import Model.SaveFiles;
import Model.Woerter;

public class ZeichenPanel extends JPanel {
	Font font = new Font(Font.MONOSPACED, Font.BOLD, 30);
	JTextPane text;

	public void zeichneStartBild() {

		this.add(text = new JTextPane());

		Font startFont = new Font(Font.MONOSPACED, Font.BOLD, 15);

		text.setFont(startFont);

		text.setText(String.format(SaveFiles.ladeStartBildschirm()));
		text.setLocation(this.getWidth() / 2, this.getHeight() / 2);
		text.setOpaque(false);
		repaint();
	}

	// view der gezeigt wird wenn gewonnen wurde
	public void zeichneGewonnenBild(Woerter fehlversuche) {
//		this.setLayout(new BorderLayout());
		this.setBackground(Color.GREEN);

		text.setFont(font);

		text.setText(String.format("Du hast das Spiel gewonnen!!!\nFehlversuche: " + fehlversuche.getFehlversuche()));

		text.setLocation(this.getWidth() / 2, this.getHeight() / 2);

		text.setOpaque(false);


	}

	

	// view der gezeigt wird wenn gewonnen wurde
	public void zeichneVerlorenBild(Woerter fehlversuche) {
		this.setBackground(Color.RED);

		text.setFont(font);

		text.setText(String.format("Du hast das Spiel verloren!!!\nFehlversuche: " + fehlversuche.getFehlversuche()));
		text.setLocation(this.getWidth() / 2, this.getHeight() / 2);
		text.setOpaque(false);
		repaint();
	}
	
}
