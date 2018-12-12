package hu.iit.me.controller;

import hu.iit.me.dto.JobType;
import hu.iit.me.exceptions.NotFoundException;
import hu.iit.me.model.Job;
import hu.iit.me.service.JobsManager;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public Collection<JobType> listJobById(@RequestParam(value = "id") int jobID) throws NotFoundException {
        Collection<Job> jobs = jobsManager.findJobById(jobID);
        return DTOConverter.jobConverter(jobs);
    }

    @RequestMapping(value = "/listByName", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobType> listJobByName(@RequestParam(value = "name") String jobName) throws NotFoundException {
        Collection<Job> jobs = jobsManager.listJobsByName(jobName);
        return DTOConverter.jobConverter(jobs);
    }

    @RequestMapping(value = "/listByDepartment", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobType> listJobByDepartment(@RequestParam(value = "department") String department) throws NotFoundException {
        Collection<Job> jobs = jobsManager.listJobsByDepartment(department);
        return DTOConverter.jobConverter(jobs);
    }

    @RequestMapping(value = "/listByPayment", method = RequestMethod.GET)
    @ResponseBody
    public Collection<JobType> listJobByPayment(@RequestParam(value = "payment") int payment) throws NotFoundException {
        Collection<Job> jobs = jobsManager.listJobsByPayment(payment);
        return DTOConverter.jobConverter(jobs);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = {NotFoundException.class})
    public void exceptionHandler() {}

}
