import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class main {
    public main() {
//First page
        Frame frame = new Frame("SIR VISVESVARAYA INSTITUTE OF TECHNOLOGY");
        frame.setSize(600, 600);
        frame.setVisible(true);

//for label
        Label label = new Label("Student Information");
        label.setBackground(Color.GRAY);
        label.setBounds(230, 50, 120, 30);

//for textfield 1
        TextField tushar =new TextField();
        tushar.setBounds(120, 120, 400, 30);

        Label ahire = new Label("Full Name = ");
        ahire.setBounds(30, 120, 80, 40);

// for textfield 2
        TextField textfield = new TextField();
        textfield.setBounds(120,170,400,30);

        Label label1 = new Label("Address = ");
        label1.setBounds(30,170 ,80,30);

// for checkbox label

        Label label2 = new Label("Select Course=");
        label2.setBounds(30,220 ,90,15);

// for checkbox
        Checkbox checkbox=new Checkbox();
        checkbox.setBounds(140, 270, 20, 10);

        Label label5 = new Label("Comp");
        label5.setBounds(135,230 ,45,15);

//for checkbox 1
        Checkbox checkbox1=new Checkbox();
        checkbox1.setBounds(190, 270, 10, 10);

        Label label6 = new Label("IT");
        label6.setBounds(190,230 ,20,15);
//for checkbox 2
        Checkbox checkbox2=new Checkbox();
        checkbox2.setBounds(230, 270, 10, 10);

        Label label7 = new Label("Chem");
        label7.setBounds(230,230 ,45,15);

// for textfield 3
        TextField textfield2=new TextField();
        textfield2.setBounds(120, 320, 400, 30);

        Label label3 = new Label("Date Of Birth = ");
        label3.setBounds(30,320 ,80,30);

//for textfield 4
        TextField textfield3=new TextField();
        textfield3.setBounds(120, 370, 400, 30);

        Label label4 = new Label("Mobile No = ");
        label4.setBounds(30,370 ,80,30);
//for textfield 5
        TextField textfield4=new TextField();
        textfield4.setBounds(120, 420, 400, 30);

        Label label8 = new Label("Email Id = ");
        label8.setBounds(30,420 ,80,30);

//for textfield 6
        TextField textfield5=new TextField();
        textfield5.setBounds(120, 470, 400, 30);

        Label label9 = new Label("Cast = ");
        label9.setBounds(30,470 ,50,30);

//for submit button

        Button button=new Button("Submit");
        button.setBounds(250,520,70,30);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        frame.add(tushar);
        frame.add(label);
        frame.add(ahire);
        frame.add(textfield);
        frame.add(label1);
        frame.add(label2);
        frame.add(textfield2);
        frame.add(label3);
        frame.add(textfield3);
        frame.add(label4);
        frame.add(label5);
        frame.add(checkbox);
        frame.add(label6);
        frame.add(checkbox1);
        frame.add(label7);
        frame.add(checkbox2);
        frame.add(label8);
        frame.add(textfield4);
        frame.add(label9);
        frame.add(textfield5);
        frame.add(button);
    }
    public static void main(String[] args)
    {
        new main();
    }
}
