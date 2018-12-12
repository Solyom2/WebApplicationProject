package hu.iit.me.service;

import hu.iit.me.dao.JobDAO;
import hu.iit.me.exceptions.NotFoundException;
import hu.iit.me.model.Job;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class JobsManagerImp implements JobsManager {

    @Autowired
    private JobDAO jobDAO;

    @Override
    public Collection<Job> listAllJobs() {
        return jobDAO.searchAllJobs();
    }

    @Override
    public Collection<Job> findJobById(int jobId) throws NotFoundException {
        return jobDAO.searchJobById(jobId);
    }

    @Override
    public Collection<Job> listJobsByName(String jobName) throws NotFoundException {
        return jobDAO.searchJobsByName(jobName);
    }

    @Override
    public Collection<Job> listJobsByDepartment(String department) throws NotFoundException {
        return jobDAO.searchJobsByDepartment(department);
    }

    @Override
    public Collection<Job> listJobsByPayment(int payment) throws NotFoundException {
        return jobDAO.searchJobsByPayment(payment);
    }

}
