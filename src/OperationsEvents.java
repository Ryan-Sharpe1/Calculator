import java.awt.*;
import java.awt.event.*;

public class OperationsEvents implements ActionListener {
	TextField Screen; 
	int First; 
	String Sign;
	public OperationsEvents (TextField T) {
	Screen=T;
	}
	
int Result;

public void actionPerformed(ActionEvent AE) {
	Button Btn=(Button)AE.getSource();
	String What=Btn.getLabel();
	if (What.equals("C")) {
		Screen.setText("");
	}		
	else if(What.equals("=")) {
			if(Sign.equals("+")) {
				Result=First+Integer.parseInt(Screen.getText());
			}
			else if(Sign.equals("-")) {
				Result=First-Integer.parseInt(Screen.getText());
			}
			else if(Sign.equals("*")) {
				Result=First*Integer.parseInt(Screen.getText());
			}
			else if(Sign.equals("/")) {
				Result=First/Integer.parseInt(Screen.getText());
			}
		Screen.setText(Integer.toString(Result));
		
	}
	else{
		First=Integer.parseInt(Screen.getText());
		Sign=Btn.getLabel();
		Screen.setText("");
		
	}
}
}

