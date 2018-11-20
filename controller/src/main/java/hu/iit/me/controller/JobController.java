package hu.iit.me.controller;

import hu.iit.me.dto.JobType;
import hu.iit.me.model.Job;
import hu.iit.me.service.JobsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
@RequestMapping("/job")
public class JobController {

    private JobsManager jobsManager;

    public JobController(JobsManager jobsManager) {
        this.jobsManager = jobsManager;
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobType> listAllJobs() {
        Collection<Job> jobs = jobsManager.listAllJobs();
        return DTOConverter.jobConverter(jobs);
    }

    @RequestMapping(value = "/listById", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobType> listJobById(@RequestParam(value = "id") int jobID) {
        Collection<Job> jobs = jobsManager.findJobById(jobID);
        return DTOConverter.jobConverter(jobs);
    }

    @RequestMapping(value = "/listByName", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobType> listJobByName(@RequestParam(value = "name") String jobName) {
        Collection<Job> jobs = jobsManager.listJobsByName(jobName);
        return DTOConverter.jobConverter(jobs);
    }

    @RequestMapping(value = "/listByDepartment", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobType> listJobByDepartment(@RequestParam(value = "department") String department) {
        Collection<Job> jobs = jobsManager.listJobsByDepartment(department);
        return DTOConverter.jobConverter(jobs);
    }

    @RequestMapping(value = "/listByPayment", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobType> listJobByPayment(@RequestParam(value = "payment") int payment) {
        Collection<Job> jobs = jobsManager.listJobsByPayment(payment);
        return DTOConverter.jobConverter(jobs);
    }

}
