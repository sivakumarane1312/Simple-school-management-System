package SchoolManagementSystem;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher>teachers=new ArrayList<>();
        ArrayList<Student>students=new ArrayList<>();
        Student siva=new Student(01,"siva");
        students.add(siva);
        Student YYY=new Student(02,"YYY");
        students.add(YYY);
        Student xxx=new Student(03,"xxx");
        students.add(xxx);
        Teacher ravi=new Teacher(01,"ravi",2000);
        teachers.add(ravi);
        Teacher sham=new Teacher(02,"sham",2000);
        teachers.add(sham);
        Teacher shaun=new Teacher(03,"shaun",2000);
        teachers.add(shaun);
        School smvec=new School(students,teachers);
        System.out.println(siva.getTotalFees());
        siva.updatefeesPaid(1000);
        System.out.println(siva.getTotalFees());
        System.out.println(siva.getFeesPaid());
        System.out.println(smvec.getTotalSalaryearned());
        ravi.updateTotalSalaryRecivied(1000);
        System.out.println(ravi.getSalary());
        System.out.println(ravi.getTotalSalaryRecivied());
        System.out.println(smvec.getTotalSalarySpent());
        System.out.println(siva);




    }
}