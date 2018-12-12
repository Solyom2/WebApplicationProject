package hu.iit.me.dao;

import hu.iit.me.exceptions.NotFoundException;
import hu.iit.me.model.Applicant;
import hu.iit.me.model.Degree;

import java.util.Collection;

public interface ApplicantDAO {

    Collection<Applicant> searchAllApplicants();
    Collection<Applicant> searchApplicantByName(String name) throws NotFoundException;
    Collection<Applicant> searchApplicantById(int id) throws NotFoundException;
    Collection<Applicant> searchApplicantsByDegree(String degree) throws NotFoundException;
    Collection<Applicant> searchApplicantsByAddress(String address) throws NotFoundException;

}
