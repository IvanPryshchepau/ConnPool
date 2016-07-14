package bean;

/**
 * Created by ivanpryshchepau on 7/14/16.
 */
public class Group {

    private int id;
    private String department;

    public Group(int id, String department) {
        this.id = id;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
