import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetVamFrame extends JPanel implements ActionListener
{
    JFrame vFrame=new JFrame("loan page");
    JLabel label=new JLabel("Enter the requested amount: ");
    JTextField text=new JTextField(15);
    JButton vButton1,vbutton2;
    public SetVamFrame()
    {
        vFrame.setSize(500,300);
        vFrame.setLayout(null);
        vFrame.setVisible(true);
        vButton1=new JButton("ok!");
        vbutton2=new JButton("cancel!");
        label.setBounds(50,50,200,30);
        text.setBounds(250,50,200,30);
        vButton1.setBounds(150,150,100,30);
        vbutton2.setBounds(250,150,100,30);

        vFrame.add(label);
        vFrame.add(text);
        vFrame.add(vButton1);
        vFrame.add(vbutton2);
        vButton1.addActionListener(this);
        vbutton2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vButton1))
        {
            System.out.println(" your amount registered ! ");
        }
        else if (e.getSource().equals(vbutton2))
        {
            vFrame.setVisible(false);
            new SetVamFrame();
        }
    }
}
