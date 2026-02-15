package mystudent;

public class App {
    public static void main(String[]args) {

        Student myStudent = new Student();
        myStudent.firstName = "Beth";
        myStudent.lastName = "Eisner";
        myStudent.major = "Education";
        myStudent.gpa = 4.0;
        myStudent.age = 20;
        myStudent.onProbation = false;

        Student myStudent2 = new Student();
        myStudent2.firstName = "Eden";
        myStudent2.lastName = "Vasquez";
        myStudent2.major = "Political Science";
        myStudent2.gpa = 4.5;
        myStudent2.age = 18;
        myStudent2.onProbation = false;

        System.out.println(myStudent2.firstName);
    }
    }

