import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetEftetahFrame extends JPanel implements ActionListener
{
    JFrame eFrame=new JFrame("account inauguration");
    JLabel label1=new JLabel("name & familyname : ");
    JLabel label2=new JLabel("password : ");
    JTextField text1=new JTextField(15);
    JTextField text2=new JTextField(4);
    JButton eButton;
    public SetEftetahFrame()
    {
        eFrame.setSize(500,300);
        eFrame.setLayout(null);
        eFrame.setVisible(true);

        eButton=new JButton("registe!");

        label1.setBounds(50,50,200,30);
        label2.setBounds(50,100,200,30);
        text1.setBounds(250,50,200,30);
        text2.setBounds(250,100,200,30);
        eButton.setBounds(150,150,100,30);


        eFrame.add(label1);
        eFrame.add(label2);
        eFrame.add(text1);
        eFrame.add(text2);
        eFrame.add(eButton);
        eButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
if (e.getSource().equals(eButton))
    System.out.println("registered ! ");
    }
}
