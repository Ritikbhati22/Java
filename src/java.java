
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class java {

    public static void main(String[] args) {


        JFrame f=new JFrame("First java Frame");
        JLabel l=new JLabel("Student Genral Form");
        l.setBounds(180, 30,220, 30);
        f.add(l);


        JLabel name=new JLabel("Student Name");
        JTextField name1=new JTextField("");
        name.setBounds(100, 80,200, 30);
        f.add(name);
        name1.setBounds(250, 80, 200, 30);
        f.add(name1);
        JLabel name2=new JLabel("Father's Name");
        JTextField name22=new JTextField("");
        name2.setBounds(100, 130, 100, 30);
        f.add(name2);
        name22.setBounds(250, 130, 200,30);
        f.add(name22);


        JLabel DOB=new JLabel("Date Of Birth");
        DOB.setBounds(100, 180, 100, 30);
        f.add(DOB);


        String g[]= {"date","1","2","3","4","5","6","7","8","9","10","11","12","13"
                ,"14","15","16","17","18","19","20","21","22","23","24","25","26",
                "27","28","29","30","31"};
        JComboBox dobinsert=new JComboBox(g);
        dobinsert.setBounds(250, 180, 60, 30);
        f.add(dobinsert);


        String h[]= {"month","January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        JComboBox dobinsert1=new JComboBox(h);
        dobinsert1.setBounds(320,180,65,30);
        f.add(dobinsert1);


        String i[]= {"year","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990",
                "1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2001","2002","2003",
                "2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
        JComboBox doinsert2=new JComboBox(i);
        doinsert2.setBounds(390, 180, 60, 30);
        f.add(doinsert2);



        JLabel Gender = new JLabel("Gender");
        Gender.setBounds(100, 230, 100, 30);
        f.add(Gender);


        JRadioButton Male=new JRadioButton();
        Male.setBounds(250, 230, 20, 30);
        f.add(Male);

        JLabel male1=new JLabel("Male");
        male1.setBounds(270, 230, 50, 30);
        f.add(male1);

        JRadioButton Female=new JRadioButton();
        Female.setBounds(320, 230, 20, 30);
        f.add(Female);
        JLabel female1=new JLabel("Female");
        female1.setBounds(340, 230, 100, 30);
        f.add(female1);

        ButtonGroup bg=new ButtonGroup();
        bg.add(Male);
        bg.add(Female);




        JLabel email=new JLabel("Email-ID");
        email.setBounds(100, 280, 80, 30);
        f.add(email);

        JTextField email1=new JTextField("");
        email1.setBounds(250, 280, 200, 30);
        f.add(email1);


        JLabel course=new JLabel("Course");
        course.setBounds(100, 330, 80, 30);
        f.add(course);


        String c[]= {"Select course","B.Tech.","B.Sc.","M.BA.","B.Com.","M.Com."};
        JComboBox coursebox=new JComboBox(c);
        coursebox.setBounds(250, 330, 200, 30);
        f.add(coursebox);


        JLabel Branch=new JLabel("Branch");
        Branch.setBounds(100, 370, 90, 30);
        f.add(Branch);




        String d[]={"Slect Branch","B.Tech C.S.","B.Tech I.T.","B.SC. Maths","B.SC. Physics","M.B.A. Marketing","M.B.A. Project Management",
                "B.Com. Eco.","B.Com. Acc.","M.Com. Eco.","M.Com. Acc."};
        JComboBox branchbox=new JComboBox(d);
        branchbox.setBounds(250, 370, 80, 30);
        f.add(branchbox);


        JLabel college=new JLabel("College");
        college.setBounds(100, 430, 80, 30);
        f.add(college);



        String colleges[]= {"Select Colleges","ACEIT kukas","JECRC","NIT kukas","Purnima College","Manipal Uni.","Jaipur University"};

        JComboBox college1=new JComboBox(colleges);
        college1.setBounds(250, 430, 200, 30);
        f.add(college1);

        JButton submit=new JButton("Submit");
        submit.setBounds(100, 520, 80, 30);
        f.add(submit);



        JButton reset=new JButton("Reset");
        reset.setBounds(250, 520, 80, 30);
        f.add(reset);


        JButton close=new JButton("Close");
        close.setBounds(370, 520, 80, 30);
        f.add(close);


        f.setSize(600, 650);
        f.setLayout(null);
        f.setVisible(true);





    }

}