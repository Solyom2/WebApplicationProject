package hu.iit.me.controller;

import hu.iit.me.dto.ApplicantType;
import hu.iit.me.dto.JobType;
import hu.iit.me.model.Applicant;
import hu.iit.me.model.Degree;
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

    public static Collection<Applicant> applicantTypeConverter(Collection<ApplicantType> applicantTypes) {
        Collection<Applicant> results = new ArrayList<>();
        BigInteger big;

        for(ApplicantType a : applicantTypes) {
            Applicant applicant = new Applicant();
            big = a.getId();
            applicant.setId(big.intValue());
            applicant.setName(a.getName());
            big = a.getAge();
            applicant.setAge(big.intValue());
            applicant.setAddress(a.getAddress());
            applicant.setDegree(Degree.valueOf(a.getDegree()));
            applicant.setPhoneNumber(a.getPhoneNumber());
            results.add(applicant);
        }

        return results;
    }

    public static Collection<Job> jobTypeConverter(Collection<JobType> jobTypes) {
        Collection<Job> results = new ArrayList<>();
        BigInteger big;

        for(JobType j : jobTypes) {
            Job job = new Job();
            big = j.getJobId();
            job.setJobId(big.intValue());
            job.setJobName(j.getJobName());
            job.setDepartment(j.getDepartment());
            big = j.getPayment();
            job.setPayment(big.intValue());
            job.setDescription(j.getDescription());
            results.add(job);
        }

        return results;
    }

}
