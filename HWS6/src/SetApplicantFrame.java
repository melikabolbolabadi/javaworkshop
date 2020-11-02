import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetApplicantFrame extends JPanel implements ActionListener
{
    JFrame aFrame=new JFrame("services");
    public   JButton jButton1,jButton2,jButton3,jButton4;
    public SetApplicantFrame()
    {
        aFrame.setSize(500,300);
        aFrame.setLayout(null);
        aFrame.setVisible(true);

        jButton1=new JButton("eftetah hesab");
        jButton2=new JButton("vam");
        jButton3=new JButton("sodur card");
        jButton4=new JButton("sodur check");

        jButton1.setBounds(50,50,200,30);
        jButton2.setBounds(50,100,200,30);
        jButton3.setBounds(50,150,200,30);
        jButton4.setBounds(50,200,200,30);

        aFrame.add(jButton1);
        aFrame.add(jButton2);
        aFrame.add(jButton3);
        aFrame.add(jButton4);

        jButton1.addActionListener((ActionListener) this);
        jButton2.addActionListener((ActionListener) this);
        jButton3.addActionListener((ActionListener) this);
        jButton4.addActionListener((ActionListener) this);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                SetEftetahFrame sef=new SetEftetahFrame();
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                SetVamFrame svf=new SetVamFrame();
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                SetSodurCard ssc=new SetSodurCard();
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
