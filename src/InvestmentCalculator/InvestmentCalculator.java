/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InvestmentCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author SydnaAgnehs
 */
public class InvestmentCalculator implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    JTextField txt_1a, txt_2a, txt_3a, txt_4a, txt_5a, txt_6a, 
            txt_1b, txt_2b, txt_3b, txt_4b, txt_5b, txt_6b,
            txt_1c,  txt_2c, txt_3c, txt_4c, txt_5c, txt_6c, init, presentTotal, netcashTotal, arr, payback, npv;
    JButton done, info;
    ArrayList<JTextField> list;
    JComboBox box;
    Integer[] number;
    JLabel tb_1, tb_2, tb_3, tb_4, tb_5, tb_6, tb_7, tb_8, tb_9, tb_10, version;
    JFrame frame;
    final String VER="v0.3.2.3";
    
    public InvestmentCalculator() {
        frame=new JFrame("Investment Calculator");
        JPanel panel=new JPanel();
        frame.setLocationRelativeTo(null);
        panel.setLayout(null);
        number= new Integer[] {0, 1, 2, 3, 4, 5, 6};
        box= new JComboBox(number);
        box.setActionCommand("box");
        box.addActionListener(this);
        
        
        
        
        info = new JButton("I am retarded");
        info.setBounds(5, 150, 120, 25);
        info.setVisible(true);
        info.setActionCommand("info");
        info.addActionListener(this);
        panel.add(info);
        
        
        presentTotal = new JTextField();
        presentTotal.setBounds(540/2+200, 130, 150, 25);
        presentTotal.setVisible(true);
        presentTotal.setEditable(false);
        presentTotal.setVisible(true);
        panel.add(presentTotal);
        
        netcashTotal = new JTextField();
        netcashTotal.setBounds(540/2+200, 210, 150, 25);
        netcashTotal.setVisible(true);
        netcashTotal.setEditable(false);
        netcashTotal.setVisible(true);
        panel.add(netcashTotal);
        
        arr = new JTextField();
        arr.setBounds(540/2+200, 370, 150, 25);
        arr.setVisible(true);
        arr.setEditable(false);
        arr.setVisible(true);
        panel.add(arr);
        
        payback = new JTextField();
        payback.setBounds(540/2+200, 290, 150, 25);
        payback.setVisible(true);
        payback.setEditable(false);
        payback.setVisible(true);
        panel.add(payback);
        
        npv = new JTextField();
        npv.setBounds(540/2, 370, 150, 25);
        npv.setVisible(true);
        npv.setEditable(false);
        npv.setVisible(true);
        panel.add(npv);
        
        
        
        tb_1=new JLabel("Initial Capital Cost");
        tb_1.setBounds(5, 0, 150, 25);
        tb_1.setVisible(true);
        panel.add(tb_1);
        
        
        tb_2=new JLabel("Net Cash Inflow");
        tb_2.setBounds(120, 20, 150, 25);
        tb_2.setVisible(true);
        panel.add(tb_2);
        
        tb_3=new JLabel("Number of Years");
        tb_3.setBounds(540/2+200, 10, 150, 25);
        tb_3.setVisible(true);
        panel.add(tb_3);
        
        
        tb_4=new JLabel("Discount Factor");
        tb_4.setBounds(230, 20, 150, 25);
        tb_4.setVisible(true);
        panel.add(tb_4);
        
        tb_5=new JLabel("Total Present Value");
        tb_5.setBounds(540/2+200, 100, 150, 25);
        tb_5.setVisible(true);
        panel.add(tb_5);
        
        tb_6=new JLabel("Total Net Cash Flow");
        tb_6.setBounds(540/2+200, 180, 150, 25);
        tb_6.setVisible(true);
        panel.add(tb_6);
        
        tb_7=new JLabel("Present Value");
        tb_7.setBounds(340, 20, 150, 25);
        tb_7.setVisible(true);
        panel.add(tb_7);
        
        
        tb_8=new JLabel("PayBack Period (month)");
        tb_8.setBounds(540/2+200, 260, 150, 25);
        tb_8.setVisible(true);
        panel.add(tb_8);
        
        tb_9=new JLabel("ARR");
        tb_9.setBounds(540/2+200, 340, 150, 25);
        tb_9.setVisible(true);
        panel.add(tb_9);
        
        tb_10=new JLabel("NPV");
        tb_10.setBounds(540/2+10, 340, 150, 25);
        tb_10.setVisible(true);
        panel.add(tb_10);
        
        version=new JLabel("Sydna "+VER);
        version.setBounds(540/2+270, 475, 150, 25);
        version.setVisible(true);
        panel.add(version);
        
        done = new JButton("Calculate");
        done.setBounds(540/2-250, 330, 150, 150);
        done.setVisible(true);
        done.setActionCommand("done");
        done.addActionListener(this);
        list = new ArrayList();
        this.iniArrList(panel);
        this.updatetxt(Integer.parseInt(box.getSelectedItem().toString()));
        box.setBounds(540/2+200, 0, 100, 100);
        box.setEditable(false);
        box.setVisible(true);
        panel.add(box);
        panel.add(done);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 520);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        panel.setVisible(true);
}
 
    
    private void iniArrList(JPanel panel) {
        
            init = new JTextField();
            list.add(init);
            init.setBounds(5, 25, 100, 25);
            init.setEditable(true);
            panel.add(init);
            init.setVisible(true);
            
            int x=0;
            txt_1a=new JTextField();
            list.add(txt_1a);
            txt_1a.setBounds(130, 50+(50*x), 80, 25);
            txt_1a.setEditable(true);
            panel.add(txt_1a);
            ++x;
            txt_2a=new JTextField();
            list.add(txt_2a);
            txt_2a.setBounds(130, 50+(50*x), 80, 25);
            txt_2a.setEditable(true);
            panel.add(txt_2a);
            ++x;
            txt_3a=new JTextField();
            list.add(txt_3a);
            txt_3a.setBounds(130, 50+(50*x), 80, 25);
            txt_3a.setEditable(true);
            panel.add(txt_3a);
            ++x;
            txt_4a=new JTextField();
            list.add(txt_4a);
            txt_4a.setBounds(130, 50+(50*x), 80, 25);
            txt_4a.setEditable(true);
            panel.add(txt_4a);
            ++x;
            txt_5a=new JTextField();
            list.add(txt_5a);
            txt_5a.setBounds(130, 50+(50*x), 80, 25);
            txt_5a.setEditable(true);
            panel.add(txt_5a);
            ++x;
            txt_6a=new JTextField();
            list.add(txt_6a);
            txt_6a.setBounds(130, 50+(50*x), 80, 25);
            txt_6a.setEditable(true);
            panel.add(txt_6a);
            x=0;
            txt_1b=new JTextField();
            list.add(txt_1b);
            txt_1b.setBounds(230, 50+(50*x), 80, 25);
            txt_1b.setEditable(true);
            panel.add(txt_1b);
            ++x;
            txt_2b=new JTextField();
            list.add(txt_2b);
            txt_2b.setBounds(230, 50+(50*x), 80, 25);
            txt_2b.setEditable(true);
            panel.add(txt_2b);
            ++x;
            txt_3b=new JTextField();
            list.add(txt_3b);
            txt_3b.setBounds(230, 50+(50*x), 80, 25);
            txt_3b.setEditable(true);
            panel.add(txt_3b);
            ++x;
            txt_4b=new JTextField();
            list.add(txt_4b);
            txt_4b.setBounds(230, 50+(50*x), 80, 25);
            txt_4b.setEditable(true);
            panel.add(txt_4b);
            ++x;
            txt_5b=new JTextField();
            list.add(txt_5b);
            txt_5b.setBounds(230, 50+(50*x), 80, 25);
            txt_5b.setEditable(true);
            panel.add(txt_5b);
            ++x;
            txt_6b=new JTextField();
            list.add(txt_6b);
            txt_6b.setBounds(230, 50+(50*x), 80, 25);
            txt_6b.setEditable(true);
            panel.add(txt_6b);
            x=0;
            txt_1c=new JTextField();
            list.add(txt_1c);
            txt_1c.setBounds(330, 50+(50*x), 80, 25);
            txt_1c.setEditable(false);
            panel.add(txt_1c);
            ++x;
            txt_2c=new JTextField();
            list.add(txt_2c);
            txt_2c.setBounds(330, 50+(50*x), 80, 25);
            txt_2c.setEditable(false);
            panel.add(txt_2c);
            ++x;
            txt_3c=new JTextField();
            list.add(txt_3c);
            txt_3c.setBounds(330, 50+(50*x), 80, 25);
            txt_3c.setEditable(false);
            panel.add(txt_3c);
            ++x;
            txt_4c=new JTextField();
            list.add(txt_4c);
            txt_4c.setBounds(330, 50+(50*x), 80, 25);
            txt_4c.setEditable(false);
            panel.add(txt_4c);
            ++x;
            txt_5c=new JTextField();
            list.add(txt_5c);
            txt_5c.setBounds(330, 50+(50*x), 80, 25);
            txt_5c.setEditable(false);
            panel.add(txt_5c);
            ++x;
            txt_6c=new JTextField();
            list.add(txt_6c);
            txt_6c.setBounds(330, 50+(50*x), 80, 25);
            txt_6c.setEditable(false);
            panel.add(txt_6c);
            ++x;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("box"))
            this.updatetxt(Integer.parseInt(box.getSelectedItem().toString()));
        if(e.getActionCommand().equalsIgnoreCase("done"))
            this.cal();
        if(e.getActionCommand().equalsIgnoreCase("info")) {
            JOptionPane.showMessageDialog(frame, "NPV = Sum of Present Values - Cost of Investments" + "\n" 
                    + "ARR = (total profit during project's lifespan / number of years of project * 100) / inital amount invested" + "\n"
                    + "Payback Period = (inital investment / contribution PER MONTH)" + "\n" 
                    + "Present  Value = net cash inflow * discount factor", "Formulas", JOptionPane.PLAIN_MESSAGE);
        }
            
    }
    private void cal() {
        switch(Integer.parseInt(box.getSelectedItem().toString())) {
            case 1:
                list.get(1+12).setText(((Float.parseFloat(list.get(1).getText()))*(Float.parseFloat(list.get(1+6).getText())))+"");
                presentTotal.setText((Float.parseFloat(list.get(1+12).getText()))+"");
                netcashTotal.setText((Float.parseFloat(list.get(1).getText()))+"");
                arr.setText((((Float.parseFloat(netcashTotal.getText()))-((Float.parseFloat(init.getText()))))/1*100.0)/(Float.parseFloat(init.getText()))+"%");
                break;
            case 2:
                list.get(1+12).setText((Float.parseFloat(list.get(1).getText()))*(Float.parseFloat(list.get(1+6).getText()))+"");
                list.get(2+12).setText((Float.parseFloat(list.get(2).getText()))*(Float.parseFloat(list.get(2+6).getText()))+"");
                netcashTotal.setText((Float.parseFloat(list.get(1).getText()))+(Float.parseFloat(list.get(2).getText()))+"");
                presentTotal.setText((Float.parseFloat(list.get(1+12).getText()))+(Float.parseFloat(list.get(2+12).getText()))+"");
                arr.setText((((Float.parseFloat(netcashTotal.getText()))-((Float.parseFloat(init.getText()))))/2*100.0)/(Float.parseFloat(init.getText()))+"%");
                break;
            case 3:
                list.get(1+12).setText((Float.parseFloat(list.get(1).getText()))*(Float.parseFloat(list.get(1+6).getText()))+"");
                list.get(2+12).setText((Float.parseFloat(list.get(2).getText()))*(Float.parseFloat(list.get(2+6).getText()))+"");
                list.get(3+12).setText((Float.parseFloat(list.get(3).getText()))*(Float.parseFloat(list.get(3+6).getText()))+"");
                netcashTotal.setText((Float.parseFloat(list.get(1).getText()))+(Float.parseFloat(list.get(2).getText()))+(Float.parseFloat(list.get(3).getText()))+"");
                presentTotal.setText((Float.parseFloat(list.get(1+12).getText()))+(Float.parseFloat(list.get(2+12).getText()))+
                        (Float.parseFloat(list.get(3+12).getText()))+"");
                arr.setText((((Float.parseFloat(netcashTotal.getText()))-((Float.parseFloat(init.getText()))))/3*100.0)/(Float.parseFloat(init.getText()))+"%");
                break;
            case 4:
                list.get(1+12).setText((Float.parseFloat(list.get(1).getText()))*(Float.parseFloat(list.get(1+6).getText()))+"");
                list.get(2+12).setText((Float.parseFloat(list.get(2).getText()))*(Float.parseFloat(list.get(2+6).getText()))+"");
                list.get(3+12).setText((Float.parseFloat(list.get(3).getText()))*(Float.parseFloat(list.get(3+6).getText()))+"");
                list.get(4+12).setText((Float.parseFloat(list.get(4).getText()))*(Float.parseFloat(list.get(4+6).getText()))+"");
                netcashTotal.setText((Float.parseFloat(list.get(1).getText()))+(Float.parseFloat(list.get(2).getText()))+(Float.parseFloat(list.get(4).getText()))+(Float.parseFloat(list.get(3).getText()))+"");
                presentTotal.setText((Float.parseFloat(list.get(1+12).getText()))+(Float.parseFloat(list.get(2+12).getText()))+
                        (Float.parseFloat(list.get(4+12).getText()))+(Float.parseFloat(list.get(3+12).getText()))+"");
                arr.setText((((Float.parseFloat(netcashTotal.getText()))-((Float.parseFloat(init.getText()))))/4*100.0)/(Float.parseFloat(init.getText()))+"%");
                break;
            case 5:
                list.get(1+12).setText((Float.parseFloat(list.get(1).getText()))*(Float.parseFloat(list.get(1+6).getText()))+"");
                list.get(2+12).setText((Float.parseFloat(list.get(2).getText()))*(Float.parseFloat(list.get(2+6).getText()))+"");
                list.get(3+12).setText((Float.parseFloat(list.get(3).getText()))*(Float.parseFloat(list.get(3+6).getText()))+"");
                list.get(4+12).setText((Float.parseFloat(list.get(4).getText()))*(Float.parseFloat(list.get(4+6).getText()))+"");
                list.get(5+12).setText((Float.parseFloat(list.get(5).getText()))*(Float.parseFloat(list.get(5+6).getText()))+"");
                netcashTotal.setText((Float.parseFloat(list.get(1).getText()))+(Float.parseFloat(list.get(2).getText()))+
                        (Float.parseFloat(list.get(4).getText()))+(Float.parseFloat(list.get(3).getText()))+
                        (Float.parseFloat(list.get(5).getText()))+"");
                presentTotal.setText((Float.parseFloat(list.get(1+12).getText()))+(Float.parseFloat(list.get(2+12).getText()))+
                        (Float.parseFloat(list.get(4+12).getText()))+(Float.parseFloat(list.get(3+12).getText()))+
                        (Float.parseFloat(list.get(5+12).getText()))+"");
                arr.setText((((Float.parseFloat(netcashTotal.getText()))-((Float.parseFloat(init.getText()))))/5*100.0)/(Float.parseFloat(init.getText()))+"%");
                break;
            case 6:
                list.get(1+12).setText((Float.parseFloat(list.get(1).getText()))*(Float.parseFloat(list.get(1+6).getText()))+"");
                list.get(2+12).setText((Float.parseFloat(list.get(2).getText()))*(Float.parseFloat(list.get(2+6).getText()))+"");
                list.get(3+12).setText((Float.parseFloat(list.get(3).getText()))*(Float.parseFloat(list.get(3+6).getText()))+"");
                list.get(4+12).setText((Float.parseFloat(list.get(4).getText()))*(Float.parseFloat(list.get(4+6).getText()))+"");
                list.get(5+12).setText((Float.parseFloat(list.get(5).getText()))*(Float.parseFloat(list.get(5+6).getText()))+"");
                list.get(6+12).setText((Float.parseFloat(list.get(6).getText()))*(Float.parseFloat(list.get(6+6).getText()))+"");
                netcashTotal.setText((Float.parseFloat(list.get(1).getText()))+(Float.parseFloat(list.get(2).getText()))+
                        (Float.parseFloat(list.get(4).getText()))+(Float.parseFloat(list.get(3).getText()))+
                        (Float.parseFloat(list.get(5).getText()))+(Float.parseFloat(list.get(6).getText()))+"");
                presentTotal.setText((Float.parseFloat(list.get(1+12).getText()))+(Float.parseFloat(list.get(2+12).getText()))+
                        (Float.parseFloat(list.get(4+12).getText()))+(Float.parseFloat(list.get(3+12).getText()))+
                        (Float.parseFloat(list.get(5+12).getText()))+(Float.parseFloat(list.get(6+12).getText()))+"");
                arr.setText((((Float.parseFloat(netcashTotal.getText()))-((Float.parseFloat(init.getText()))))/6*100.0)/(Float.parseFloat(init.getText()))+"%");
                break;
        }
        payback.setText((Float.parseFloat(init.getText()))/((Float.parseFloat(netcashTotal.getText()))/12)+"");
        npv.setText((Float.parseFloat(presentTotal.getText()))-((Float.parseFloat(init.getText()))/12)+"");
        JOptionPane.showMessageDialog(frame, "I am lazy!", "Warning", JOptionPane.ERROR_MESSAGE);
        
    }
    private void updatetxt(int a) {
        
        for(int x=1; x<list.size();x++) {
            list.get(x).setVisible(false);
        }
        if(a==0) {
            return;
        }
        for(int x=1; x<a+1;x++) {
            list.get(x).setVisible(true);
            list.get(x+12).setVisible(true);
            list.get(x+6).setVisible(true);   
        }
        //1 7 13
        //2 8 14
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new InvestmentCalculator();
    }
}
