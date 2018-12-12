package hu.iit.me.service;

import hu.iit.me.exceptions.NotFoundException;
import hu.iit.me.model.Applicant;
import hu.iit.me.model.Degree;

import java.util.Collection;

public interface ApplicantsManager {

    Collection<Applicant> listAllApplicants();
    Collection<Applicant> findApplicantByName(String name) throws NotFoundException;
    Collection<Applicant> findApplicantById(int id) throws NotFoundException;
    Collection<Applicant> listApplicantsByDegree(String degree) throws NotFoundException;
    Collection<Applicant> listApplicantsByAddress(String address) throws NotFoundException;

}
