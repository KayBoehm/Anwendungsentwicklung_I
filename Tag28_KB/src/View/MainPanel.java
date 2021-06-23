package View;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private ZeichenPanel zeichenPanel = new ZeichenPanel();
	private RatePanel ratePanel = new RatePanel();
	private ButtonBox bbox = new ButtonBox();

	public MainPanel() {
		init();
	}

	private void init() {
		this.setLayout(new BorderLayout());
		this.add(ratePanel, BorderLayout.NORTH);
		this.add(zeichenPanel, BorderLayout.CENTER);
		this.add(bbox, BorderLayout.SOUTH);
	}

	@Override
	public String toString() {
		return "MainPanel [zeichenPanel=" + zeichenPanel + ", ratePanel=" + ratePanel + ", bbox=" + bbox + "]";
	}

	public ZeichenPanel getZeichenPanel() {
		return zeichenPanel;
	}

	public RatePanel getRatePanel() {
		return ratePanel;
	}


	public ButtonBox getBbox() {
		return bbox;
	}

}
