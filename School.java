package SchoolManagementSystem;

import java.util.List;

public class School {
    private List<Student>studentList;
    private List<Teacher>teacherList;
    private static int totalSalaryearned;
    private static int totalSalarySpent;

    public int getTotalSalarySpent() {
        return totalSalarySpent;
    }

    public static void updateTotalSalarySpent(int amount) {
        totalSalarySpent-=amount;
    }

    public int getTotalSalaryearned() {
        return totalSalaryearned;
    }

    public static void setTotalSalaryearned(int amount) {
        totalSalaryearned+=amount;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }


    public List<Student> getStudentList() {
        return studentList;
    }
    School(List<Student> l1, List<Teacher>l2){
        this.studentList=l1;
        this.teacherList=l2;
        this.totalSalaryearned=0;
        this.totalSalarySpent=0;
    }



}
