import java.awt.*;
import java.awt.event.*;
public class CalculatorMainframe {
	public static void main(String xyz[]) {
		Frame F=new Frame("Calculator");
		Panel 
		P1=new Panel();
		Panel P2=new Panel();
		GridLayout GL=new GridLayout(4,4);
		P2.setLayout(GL);
		
		TextField Screen;
		Button B0,B1, B2, B3, B4, B5, B6, B7, B8, B9;
		Button Add, Sub, Mult, Div, Clear, Equals;
		
		Screen=new TextField(20);
		B0=new Button("0");
		B1=new Button("1");
		B2=new Button("2");
		B3=new Button("3");
		B4=new Button("4");
		B5=new Button("5");
		B6=new Button("6");
		B7=new Button("7");
		B8=new Button("8");
		B9=new Button("9");
		Add=new Button("+");
		Sub=new Button("-");
		Div=new Button("/");
		Mult=new Button("*");
		Equals=new Button("=");
		Clear=new Button("C");
		
		DigitEvents DE=new DigitEvents(Screen);
		
		B0.addActionListener(DE);
		B1.addActionListener(DE);
		B2.addActionListener(DE);
		B3.addActionListener(DE);
		B4.addActionListener(DE);
		B5.addActionListener(DE);
		B6.addActionListener(DE);
		B7.addActionListener(DE);
		B8.addActionListener(DE);
		B9.addActionListener(DE);
		
		OperationsEvents OE=new OperationsEvents(Screen);
		
		Add.addActionListener(OE);
		Sub.addActionListener(OE);
		Div.addActionListener(OE);
		Mult.addActionListener(OE);
		Clear.addActionListener(OE);
		Equals.addActionListener(OE);
		
		P1.add(Screen);
		P2.add(B0);
		P2.add(B1);
		P2.add(B2);
		P2.add(Add);
		P2.add(B3);
		P2.add(B4);
		P2.add(B5);
		P2.add(Sub);
		P2.add(B6);
		P2.add(B7);
		P2.add(B8);
		P2.add(Mult);
		P2.add(B9);
		P2.add(Clear);
		P2.add(Equals);
		P2.add(Div);
		
		F.add(P1,BorderLayout.NORTH);
		F.add(P2,BorderLayout.CENTER);
		F.setSize(400,400);
		F.setVisible(true);
		
		B0.setBackground(Color.CYAN);
		B1.setBackground(Color.CYAN);
		B2.setBackground(Color.CYAN);
		B3.setBackground(Color.CYAN);
		B4.setBackground(Color.CYAN);
		B5.setBackground(Color.CYAN);
		B6.setBackground(Color.CYAN);
		B7.setBackground(Color.CYAN);
		B8.setBackground(Color.CYAN);
		B9.setBackground(Color.CYAN);
		Add.setBackground(Color.CYAN);
		Sub.setBackground(Color.CYAN);
		Div.setBackground(Color.CYAN);
		Mult.setBackground(Color.CYAN);
		Clear.setBackground(Color.CYAN);
		Equals.setBackground(Color.CYAN);
		Screen.setBackground(Color.LIGHT_GRAY);
	}
}
