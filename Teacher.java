package SchoolManagementSystem;



public class Teacher extends Members {
    private int salary;
    private int totalSalaryRecivied;
    Teacher(int id,String name,int salary){
        super(id,name);
        this.salary=salary;
        this.totalSalaryRecivied=0;
    }
    public int getSalary() {
        return salary;
    }
    public void updateTotalSalaryRecivied(int totalSalaryRecivied) {
        this.totalSalaryRecivied+=totalSalaryRecivied;
        School.updateTotalSalarySpent(totalSalaryRecivied);
    }
    public int getTotalSalaryRecivied() {
        return totalSalaryRecivied;
    }
    public String toString(){
        return("NAME: "+this.getName()+"\n"+"ID"+this.getId()+"\n"+"SALARY RECIVED: "+this.totalSalaryRecivied+"\n"+"salary"+this.getSalary());
    }

}
