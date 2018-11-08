package hu.iit.me.dao;

import hu.iit.me.model.Job;

import java.util.Collection;

public interface JobDAO {

    Collection<Job> listAllJobs();
    Collection<Job> findJobById(int id);
    Collection<Job> listJobsByName(String name);
    Collection<Job> listJobsByDepartment(String department);
    Collection<Job> listJobsByPayment(int payment);

}
