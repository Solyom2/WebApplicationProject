package hu.iit.me.service;

import hu.iit.me.exceptions.NotFoundException;
import hu.iit.me.model.Job;

import java.util.Collection;

public interface JobsManager {

    Collection<Job> listAllJobs();
    Collection<Job> findJobById(int jobId) throws NotFoundException;
    Collection<Job> listJobsByName(String jobName) throws NotFoundException;
    Collection<Job> listJobsByDepartment(String department) throws NotFoundException;
    Collection<Job> listJobsByPayment(int payment) throws NotFoundException;

}
