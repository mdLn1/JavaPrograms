package simplefactoryimplementation;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


// in order to see the effects of the factory in this program
// once you click on one of the buttons "Create Student" or "Create Teacher"
// you need to click on "Show Details" button to see the value of the
// currently saved instance of newPerson
// it is specifically done this way so that the check for what kind of 
// object type is newPerson can be done 
public final class SimpleFactoryImplementation {
    
    private JFrame frame;
    private JButton studentButton;
    private JButton teacherButton;
    private JButton showDetailsButton;
    private Person newPerson;
    private JLabel showDetailsLabel;

    public SimpleFactoryImplementation() {
        frame = new JFrame("Factory Example");
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        addComponents();
        frame.setPreferredSize(new Dimension(400, 400));
        frame.pack();
        frame.setVisible(true);
    }
    
    

    public static void main(String[] args) {
        
        SimpleFactoryImplementation simpleFactoryImplementation 
                = new SimpleFactoryImplementation();
    }

    private void addComponents() {
        //student
        studentButton = new JButton("Create Student");
        studentButton.addActionListener((ActionEvent e) -> {
            newPerson = Factory.createObject("Student");
        });
        
        //teacher
        teacherButton = new JButton("Create Teacher");
        teacherButton.addActionListener((ActionEvent e) -> {
            newPerson = Factory.createObject("Teacher");
        });
        
        //show details
        showDetailsLabel = new JLabel("");
        showDetailsButton = new JButton("Show Details");
        showDetailsButton.addActionListener((ActionEvent e) -> {
            // check if newPerson was isntantiated
            if (newPerson != null){
                // get the properties for a person
                String text = newPerson.getName() + " is " +
                        newPerson.getAge() + " years old ";
                
                // check the type of person
                if (newPerson instanceof Student) {
                    // if newPerson is an instance of student, cast it to Student to get years of study
                   Student student = (Student) newPerson;
                    text += "and has been studying for " + student.getYearOfStudy();
                } else if (newPerson instanceof Teacher){
                    // if newPerson is an instance of teacher, cast it to Teacher to get years of teaching
                    Teacher teacher = (Teacher) newPerson;
                    text += "and has been teaching for " + teacher.getYearsOfTeaching();
                }
                // in the end display all the details
                showDetailsLabel.setText(text);
            } else {
                showDetailsLabel.setText("click one of the other buttons to instantiate person");
            }
        });
        
        frame.add(studentButton);
        frame.add(teacherButton);
        frame.add(showDetailsButton);
        frame.add(showDetailsLabel);
    }
    
}
