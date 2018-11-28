package hu.iit.me.dao;

import hu.iit.me.model.Job;

import java.util.ArrayList;
import java.util.Collection;

public class JobDAOImp implements JobDAO {

    private Collection<Job> jobs = new ArrayList<>();

    public JobDAOImp() {
        Job job1 = new Job(1,"Software testing", "IT", 400000, "Test the company's softwares");
        Job job2 = new Job(2, "Night guard", "Security", 250000, "Watch the gates");
        Job job3 = new Job(3, "Logistics manager", "Store", 350000, "Supervise warehouses");
        Job job4 = new Job(4, "Lead developer", "IT", 450000, "Control the software development");

        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        jobs.add(job4);
    }


    @Override
    public Collection<Job> searchAllJobs() {
        return this.jobs;
    }

    @Override
    public Collection<Job> searchJobById(int jobId) {
        ArrayList<Job> results = new ArrayList<>();
        for(Job j : jobs) {
            if(jobId == j.getJobId()) results.add(j);
        }
        return results;
    }

    @Override
    public Collection<Job> searchJobsByName(String jobName) {
        ArrayList<Job> results = new ArrayList<>();
        for(Job j : jobs) {
            if(jobName.equals(j.getJobName())) results.add(j);
        }
        return results;
    }

    @Override
    public Collection<Job> searchJobsByDepartment(String department) {
        ArrayList<Job> results = new ArrayList<>();
        for(Job j : jobs) {
            if(department.equals(j.getDepartment())) results.add(j);
        }
        return results;
    }

    @Override
    public Collection<Job> searchJobsByPayment(int payment) {
        ArrayList<Job> results = new ArrayList<>();
        for(Job j : jobs) {
            if(payment == j.getPayment()) results.add(j);
        }
        return results;
    }

}
