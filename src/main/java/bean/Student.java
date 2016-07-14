package bean;

/**
 * Created by ivanpryshchepau on 7/14/16.
 */
public class Student {

    private int id;
    private String surname;
    private String name;
    private int group_id;

    public Student(int id, String surname, String name, int group_id) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.group_id = group_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }
}
