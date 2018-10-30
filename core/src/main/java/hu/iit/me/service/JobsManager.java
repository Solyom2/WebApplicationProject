package hu.iit.me.service;

import hu.iit.me.model.Job;

import java.util.Collection;

public interface JobsManager {

    Collection<Job> listAllJobs();
    Collection<Job> findJobById(int id);
    Collection<Job> listJobsByName(String name);
    Collection<Job> listJobsByDepartnemt(String department);
    Collection<Job> listJobsByPayment(int payment);

}
