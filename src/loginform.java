import javax.swing.*;
import javax.swing.plaf.ActionMapUIResource;
import java.awt.event.*;
import java.awt.*;

public class loginform implements ActionListener{
    JFrame f;
    JLabel title,username,password;
    JTextField inuser;
    JPasswordField inpass;
    JButton login, reset ;
    JCheckBox cb;
    loginform(){
        f=new JFrame("Login Page");
        title = new JLabel("Login User");
       username=new JLabel("Username");
       password= new JLabel("Password");
       inuser= new JTextField();
       inpass = new JPasswordField();
       cb= new JCheckBox("Show your password");
       login = new JButton("Login");
       reset = new JButton("Reset");
       f.add(title);

       f.add(username);
       f.add(password);
       f.add(inuser);
       f.add(inpass);
       f.add(cb);
       f.add(login);
       f.add(reset);
       title.setBounds(200,20,100,20);
       username.setBounds(50,50,100,50);
        password.setBounds(50,100,100,50);
       inuser.setBounds(150,70,200,20);
       inpass.setBounds(150,110,200,20);
       cb.setBounds(100,150,200,20);
   login.setBounds(100,200,80,20);
   reset.setBounds(250,200,80,20);
   cb.addActionListener(this);
   login.addActionListener(this);
   reset.addActionListener(this);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);



    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==login){
            if(inuser.getText().equals("Ritik") && inpass.getText().equals("Ritikbhati")){
                JOptionPane.showMessageDialog(f,"Login Succesfull");
            }
            else{
                JOptionPane.showMessageDialog(f,"Invalid user");

            }
        }
        if(e.getSource()==reset){
            inuser.setText(null);
            inpass.setText(null);
        }
        if(e.getSource()==cb){
            if(cb.isSelected())
                inpass.setEchoChar('\u0000');
        }
        else
            inpass.setEchoChar('*');

    }

    public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new loginform();
        }
    });
    }
}
