package hu.iit.me.dao;

import hu.iit.me.model.Job;

import java.util.ArrayList;
import java.util.Collection;

public class JobDAOImp implements JobDAO {

    private Collection<Job> jobs = new ArrayList<>();

    public JobDAOImp() {
        Job job1 = new Job(1,"Software testing", "IT", 400000, "desc");
        Job job2 = new Job(2, "Night guard", "Security", 250000, "desc");
        Job job3 = new Job(3, "Logistics manager", "Store", 350000, "desc");

        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
    }


    @Override
    public Collection<Job> searchAllJobs() {
        return this.jobs;
    }

    @Override
    public Collection<Job> searchJobById(int jobId) {
        return this.jobs;
    }

    @Override
    public Collection<Job> searchJobsByName(String jobName) {
        return this.jobs;
    }

    @Override
    public Collection<Job> searchJobsByDepartment(String department) {
        return this.jobs;
    }

    @Override
    public Collection<Job> searchJobsByPayment(int payment) {
        return this.jobs;
    }

}
