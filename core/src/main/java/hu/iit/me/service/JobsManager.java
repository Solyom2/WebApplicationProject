package hu.iit.me.service;

import hu.iit.me.model.Job;

import java.util.Collection;

public interface JobsManager {

    Collection<Job> listAllJobs();
    Collection<Job> findJobById(int jobId);
    Collection<Job> listJobsByName(String jobName);
    Collection<Job> listJobsByDepartment(String department);
    Collection<Job> listJobsByPayment(int payment);

}
