package hu.iit.me.controller;

import hu.iit.me.dto.ApplicantType;
import hu.iit.me.dto.JobType;
import hu.iit.me.model.Applicant;
import hu.iit.me.model.Job;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

public class DTOConverter {

    public static Collection<ApplicantType> applicantConverter(Collection<Applicant> applicants) {
        Collection<ApplicantType> results = new ArrayList<>();

        for(Applicant a : applicants) {
            ApplicantType applicantType = new ApplicantType();
            applicantType.setId(BigInteger.valueOf(a.getId()));
            applicantType.setName(a.getName());
            applicantType.setAge(BigInteger.valueOf(a.getAge()));
            applicantType.setAddress(a.getAddress());
            applicantType.setDegree(String.valueOf(a.getDegree()));
            applicantType.setPhoneNumber(a.getPhoneNumber());
            results.add(applicantType);
        }

        return results;
    }

    public static Collection<JobType> jobConverter(Collection<Job> jobs) {
        Collection<JobType> results = new ArrayList<>();

        for(Job j : jobs) {
            JobType jobType = new JobType();
            jobType.setJobId(BigInteger.valueOf(j.getJobId()));
            jobType.setJobName(j.getJobName());
            jobType.setDepartment(j.getDepartment());
            jobType.setPayment(BigInteger.valueOf(j.getPayment()));
            jobType.setDescription(j.getDescription());
            results.add(jobType);
        }

        return results;
    }

}
