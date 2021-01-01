import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Form extends javax.swing.JFrame
{
    Entity entity;
    Service service;
    public JTabbedPane jTabbedPane;
    public JPanel jPanel1,jPanel2,jPanel3;
    public JTextField codetxt,nametxt,gendertxt,colortxt,pricetxt,removetxt,codeedit,nameedit,genderedit,coloredit,priceedit;
    public JButton jButton1,jButton2,jButton3;

    public Form()
    {
      CreateView();
    }

    public void CreateView()
    {
        jTabbedPane = new javax.swing.JTabbedPane();

        jPanel1 = new javax.swing.JPanel();
        codetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        gendertxt = new javax.swing.JTextField();
        colortxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel2 = new javax.swing.JPanel();
        removetxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jPanel3 = new javax.swing.JPanel();
        codeedit = new javax.swing.JTextField();
        nameedit = new javax.swing.JTextField();
        genderedit = new javax.swing.JTextField();
        coloredit = new javax.swing.JTextField();
        priceedit = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        codetxt.setText("ENTER CODE");
        nametxt.setText("ENTER NAME");
        gendertxt.setText("ENTER GENDER");
        colortxt.setText("ENTER COLOR");
        pricetxt.setText("ENTER PRICE");
        jButton1.setText("ثبت");
        
        jButton1.addActionListener(new  java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt)
            {
                entity =new Entity();
                service =new Service();

                entity.setCode(Integer.parseInt(codetxt.getText()));
                entity.setName(nametxt.getText());
                entity.setGender(gendertxt.getText());
                entity.setColor(colortxt.getText());
                entity.setPrice(Long.parseLong(pricetxt.getText()));

                try { service.save(entity); }
                catch (Exception ex) { Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex); }
            }
        }
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(codetxt)
                        .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(gendertxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(colortxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(pricetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(253, Short.MAX_VALUE))
        );


        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(colortxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pricetxt,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1)
                                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("افزودن", jPanel1);
        jTabbedPane.addTab("ویرایش",jPanel2);
        jTabbedPane.addTab("حذف",jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 630, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE)))
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 453, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE)))
        );

        pack();
    }
}
