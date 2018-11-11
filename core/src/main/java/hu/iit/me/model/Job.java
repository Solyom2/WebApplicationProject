package hu.iit.me.model;

public class Job {

    private int jobId;
    private String jobName;
    private String department;
    private int payment;
    private String description;

    public Job(int jobId, String name, String department, int payment, String description) {
        this.jobId = jobId;
        this.jobName = name;
        this.department = department;
        this.payment = payment;
        this.description = description;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
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
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", department='" + department + '\'' +
                ", payment=" + payment +
                ", description='" + description + '\'' +
                '}';
    }

}
