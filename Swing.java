import javax.swing.*;
import java.awt.*;

public class Swing {
    public static void main(String[] args) {

          JFrame f=new JFrame("user Form ");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this is used to actully close the gui and not hide it
          // this basically contains all the object on top of it
        // if we run it rn it will show nothing as swing defalcate set invisible everthing
        f.setVisible(true);
        f.setSize(400,400);

        // now this will give length and width to the form
       // f.setResizable(false);
        // this will not allow the fram to resize
        f.setLayout(new FlowLayout());
        // it makes all the text in center

        JLabel l1=new JLabel("Username");
        // now it wont display for it need to dispaly we need to add ti to the frame
        l1.setForeground(Color.RED);
        f.add(l1);
        JTextField t1=new JTextField(20);
        // now it wont display because as it gets hide as the objects are palced one top of the other so first
        // username is placed and below that textfiled is present so fix this we need to setlayout

        f.add(t1);
        JLabel l2=new JLabel("Password");
        f.add(l2);
        JTextField t2=new JTextField(20);
        f.add(t2);
        JButton b1=new JButton("Submit");
        f.add(b1);

        ImageIcon img=new ImageIcon("C:\\ASA-LAB\\Text editor\\src\\logo.png");
        //this will create an image
        f.setIconImage(img.getImage());// change the icon of frame



    }
}
