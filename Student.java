package SchoolManagementSystem;
public class Student extends Members {

    private int totalFees;
    private int feesPaid;
    public  Student(int id,String name){
         super(id,name);
         this.feesPaid=0;
         this.totalFees=10000;
     }
    public int getFeesPaid() {
        return feesPaid;
    }
    public int getTotalFees() {
        return totalFees;
    }
    public void updatefeesPaid(int amount){
        this.feesPaid+=amount;
        this.totalFees-=amount;
        School.setTotalSalaryearned(amount);
    }
    @Override
    public String toString(){
        return("NAME: "+this.getName()+"\n"+"ID"+this.getId()+"\n"+"TOTAL FEES: "+this.getTotalFees()+"\n"+"FEES PAID: "+this.getFeesPaid());
    }




}
