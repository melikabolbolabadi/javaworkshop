import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetFrame extends JPanel implements ActionListener
{
    public JLabel jLabel=new JLabel(new ImageIcon("...."));
  public   JFrame jFrame=new JFrame("Bank account");
    public JButton button1,button2,button3;
    public   JButton jButton1,jButton2,jButton3,jButton4;

    public SetFrame()
    {
        jFrame.setSize(500,300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jLabel.setBounds(100,50,100,30);

        button1=new JButton("Applicant 1");
        button2=new JButton("Applicant 2");
        button3=new JButton("Applicant 3");

        button1.setBounds(70,100,100,50);
        button2.setBounds(170,100,100,50);
        button3.setBounds(270,100,100,50);

        jFrame.add(button1);
        jFrame.add(button2);
        jFrame.add(button3);

        button1.addActionListener((ActionListener) this);
        button2.addActionListener((ActionListener) this);
        button3.addActionListener((ActionListener) this);

button1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e)
    {
SetApplicantFrame saf=new SetApplicantFrame();
    }
});
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                SetApplicantFrame saf=new SetApplicantFrame();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                SetApplicantFrame saf=new SetApplicantFrame();
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
