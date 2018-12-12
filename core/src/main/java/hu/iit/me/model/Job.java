package hu.iit.me.model;

import hu.iit.me.exceptions.EmptyFieldException;
import hu.iit.me.exceptions.InvalidIdException;
import hu.iit.me.exceptions.InvalidPaymentException;

public class Job {

    private int jobId;
    private String jobName;
    private String department;
    private int payment;
    private String description;

    public Job() {}

    public Job(int jobId, String name, String department, int payment, String description) throws InvalidIdException, EmptyFieldException, InvalidPaymentException{
        testId(jobId);
        testEmptyField(name);
        testEmptyField(department);
        testEmptyField(description);
        testPayment(payment);

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

    public void testId(int id) throws InvalidIdException {
        if(id <= 0)
            throw new InvalidIdException("Nem megfelelő ID");
    }

    public void testEmptyField(String field) throws EmptyFieldException {
        if(field.length() == 0)
            throw new EmptyFieldException("Üres mező");
    }

    public void testPayment(int payment) throws InvalidPaymentException {
        if(payment <= 0)
            throw new InvalidPaymentException("Érvénytelen fizetési érték");
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
