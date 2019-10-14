import java.awt.*;
import java.awt.event.*;
public class DigitEvents implements ActionListener {
	TextField T;
	public DigitEvents(TextField Screen) {
		T=Screen;
	}
	public void actionPerformed(ActionEvent AE) {
		Button Btn=(Button)AE.getSource();
		T.setText (T.getText()+Btn.getLabel());
	}

}
