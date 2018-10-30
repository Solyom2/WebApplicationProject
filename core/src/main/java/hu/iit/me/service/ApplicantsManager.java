package hu.iit.me.service;

import hu.iit.me.model.Applicant;

import java.util.Collection;

public interface ApplicantsManager {

    Collection<Applicant> listAllApplicants();
    Collection<Applicant> findApplicantByName(String name);
    Collection<Applicant> findApplicantByPhoneNumber(String phoneNUmber);
    Collection<Applicant> findApplicantById(int id);
    Collection<Applicant> listApplicantsByDegree(String degree);
    Collection<Applicant> listApplicantsByAddress(String adress);

}
