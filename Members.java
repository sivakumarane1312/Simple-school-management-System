package SchoolManagementSystem;
public abstract class  Members {
   private int id;
    private String name;
    public Members(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
