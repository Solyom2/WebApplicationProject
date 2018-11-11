package hu.iit.me.dao;

import hu.iit.me.model.Job;

import java.util.Collection;

public interface JobDAO {

    Collection<Job> searchAllJobs();
    Collection<Job> searchJobById(int jobId);
    Collection<Job> searchJobsByName(String jobName);
    Collection<Job> searchJobsByDepartment(String department);
    Collection<Job> searchJobsByPayment(int payment);

}
