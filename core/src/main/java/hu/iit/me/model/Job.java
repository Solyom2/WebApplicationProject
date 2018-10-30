package hu.iit.me.model;

public class Job {

    private int id;
    private String name;
    private String department;
    private int payment;
    private String description;

    public Job(int id, String name, String department, int payment, String description) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payment = payment;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payment=" + payment +
                ", description='" + description + '\'' +
                '}';
    }

}
