import java.awt.*;
import java.awt.event.*;
class gui extends Frame implements ActionListener
	{
		Button b1;
		Label l1;
		TextField t1;
		gui()
			{
				setVisible(true);
				setSize(500,500);
				setTitle("GUI");
				setLayout(null);
				setBackground(Color.pink);

				l1=new Label("First GUI");
				l1.setBounds(150,50,200,40);
				l1.setFont(new Font("",Font.BOLD,40));
				l1.setForeground(Color.green);
				add(l1);

				t1=new TextField();
				t1.setBounds(110,150,250,20);
				t1.setForeground(Color.red);
				add(t1);

				b1=new Button("Enter");
				b1.setBounds(190,200,80,20);
				add(b1);

				b1.addActionListener(this);
			}
		public void actionPerformed(ActionEvent e)
			{
				t1.setText("GUI Program was Executed");
			}
	}
class firstgui
	{
		public static void main(String a[])
			{
				gui obj=new gui();
			}
	}