package hu.iit.me.dao;

import hu.iit.me.exceptions.NotFoundException;
import hu.iit.me.model.Job;

import java.util.Collection;

public interface JobDAO {

    Collection<Job> searchAllJobs();
    Collection<Job> searchJobById(int jobId) throws NotFoundException;
    Collection<Job> searchJobsByName(String jobName) throws NotFoundException;
    Collection<Job> searchJobsByDepartment(String department) throws NotFoundException;
    Collection<Job> searchJobsByPayment(int payment) throws NotFoundException;

}
