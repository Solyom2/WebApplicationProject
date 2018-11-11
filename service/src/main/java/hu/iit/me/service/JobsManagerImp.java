package hu.iit.me.service;

import hu.iit.me.dao.JobDAO;
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
    public Collection<Job> findJobById(int jobId) {
        return jobDAO.searchJobById(jobId);
    }

    @Override
    public Collection<Job> listJobsByName(String jobName) {
        return jobDAO.searchJobsByName(jobName);
    }

    @Override
    public Collection<Job> listJobsByDepartment(String department) {
        return jobDAO.searchJobsByDepartment(department);
    }

    @Override
    public Collection<Job> listJobsByPayment(int payment) {
        return jobDAO.searchJobsByPayment(payment);
    }

}
