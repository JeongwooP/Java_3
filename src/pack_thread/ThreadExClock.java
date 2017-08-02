package pack_thread;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

public class ThreadExClock extends Frame implements ActionListener, Runnable{
	Label lbl;
	Boolean b = false;
	Thread thread;
	Button button;
	
	public ThreadExClock() {
		lbl = new Label("Display time", Label.CENTER);
		add("Center", lbl);

		//Button button = new Button("click");
		button = new Button("click");
		add("South", button);
		button.addActionListener(this);

		setTitle("Thread test");
		setBounds(200, 200, 300, 300);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				b = true;
				System.exit(0);
			}
		});
		thread = new Thread(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("클릭했군요");
		//calShow();
		if(thread.isAlive()) return;
		thread.start();
		button.setEnabled(false);
	}

	@Override
	public void run() {
		while(true){
			if(b == true) break;
			
			calShow();
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	private void calShow() {
		Calendar cal = Calendar.getInstance();
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		lbl.setText(y + "-" + m + "-" + d + " " + h + ":" + mi + ":" + s);
		lbl.setFont(new Font("굴림", Font.BOLD, 14));
	}

	public static void main(String[] args) {
		new ThreadExClock();

	}

}
