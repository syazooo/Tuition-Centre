/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// application team in UTP

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // SCANNER OBJECT
        Scanner cin = new Scanner(System.in);


        // TEACHER DATA
        Name name1 = new Name();

        System.out.println("(INPUT TEACHER'S DATA)");
        System.out.println("Enter first name: ");
        String fname1 = cin.nextLine();
        name1.setfname(fname1);

        System.out.println("Enter middle name: ");
        String mname1 = cin.nextLine();
        name1.setmname(mname1);

        System.out.println("Enter last name: ");
        String lname1 = cin.nextLine();
        name1.setlname(lname1);

        Teacher teach1 = new Teacher();
        teach1.setName(name1);

        System.out.println("Enter IC: ");
        String ic1 = cin.nextLine();
        teach1.setIC(ic1);

        System.out.println("Enter address: ");
        String address1 = cin.nextLine();
        teach1.setAddress(address1);

        System.out.println("Enter experience (years): ");
        int numyearexp1 = cin.nextInt();
        teach1.setNumYearExp(numyearexp1);

        System.out.println("Enter qualification: ");
        String qualification1 = cin.nextLine();
        teach1.setQualification(qualification1);


        // STUDENT DATA
        Name name2 = new Name();

        System.out.println("(INPUT STUDENT'S DATA)");
        System.out.println("Enter first name: ");
        String fname2 = cin.nextLine();
        name1.setfname(fname2);

        System.out.println("Enter middle name: ");
        String mname2 = cin.nextLine();
        name1.setmname(mname2);

        System.out.println("Enter last name: ");
        String lname2 = cin.nextLine();
        name1.setlname(lname2);

        Student stud1 = new Student();
        stud1.setName(name2);

        System.out.println("Enter IC: ");
        String ic2 = cin.nextLine();
        stud1.setIC(ic2);

        System.out.println("Enter address: ");
        String address2 = cin.nextLine();
        stud1.setAddress(address2);

        System.out.println("Enter school name: ");
        String schoolname = cin.nextLine();
        stud1.setSchoolName(schoolname);

        System.out.println("Enter marks:");
        for (int i=0; i<5; i++){
            System.out.println("Mark #" + (i+1) + ": ");
            float mark_inp = cin.nextFloat();
            stud1.setMarks(i, mark_inp);
        }

        float get_avg = stud1.getAvg();
        stud1.setTeacher(get_avg);


        // DISPLAY INDIVIDUAL DATA
        System.out.println();
        System.out.println("(DISPLAY STUDENT DATA)");
        System.out.println("NAME: " + stud1.getName());
        System.out.println("IC: " + stud1.getIC());
        System.out.println("ADDRESS: " + stud1.getAddress());
        System.out.println("SCHOOL NAME: " + stud1.getSchoolName());
        System.out.println("MARKS:");
        for (int i=0; i<5; i++){
            System.out.println("Mark #" + (i+1) + ": " + stud1.getMarks(i));
        }
        System.out.println("ASSIGNED TEACHER: " + stud1.getAssignedTeacher());
        System.out.println();
        System.out.println("(DISPLAY TEACHER DATA)");
        System.out.println("NAME: " + teach1.getName());
        System.out.println("IC: " + teach1.getIC());
        System.out.println("ADDRESS: " + teach1.getAddress());
        System.out.println("EXPERIENCE (YEARS): " + teach1.getNumYearExp());
        System.out.println("QUALIFICATION: " + teach1.getQualification());


        // DISPLAY DATA AS A CENTER
        StudentBatch sb2023 = new StudentBatch();
        TeacherBatch tb2023 = new TeacherBatch();

        System.out.println();
        System.out.println("(DISPLAY PERFORMANCE OF CENTER)");
        System.out.println("NO. OF STUDENTS: " + sb2023.getNumOfStudents());
        System.out.println("NO. OF TEACHERS: " + tb2023.getNumOfTeachers());
        System.out.println("AVG MARK: " + sb2023.getAvg());
        System.out.println("MAX MARK: " + sb2023.getMax());
        System.out.println("MIN MAX: " + sb2023.getMin());
    }
}