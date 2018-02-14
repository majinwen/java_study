package callback;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/***************************************
 *made by pengyao1207
 * create:2018/02/02 14:38
 ***************************************/
public class TimePrinter {
    public static void main(String...args){
        //ActionListener listener = new TimePrinter();
        Timer t = new Timer(2000,event->System.out.println(new Date()));
        t.start();
        JOptionPane.showMessageDialog(null,"quit?");
        System.exit(0);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println("At the tong,the time is "+new Date());
//        Toolkit.getDefaultToolkit().beep();
//    }
}
