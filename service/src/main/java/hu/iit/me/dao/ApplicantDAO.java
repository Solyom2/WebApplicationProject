package hu.iit.me.dao;

import hu.iit.me.model.Applicant;
import hu.iit.me.model.Degree;

import java.util.Collection;

public interface ApplicantDAO {

    Collection<Applicant> searchAllApplicants();
    Collection<Applicant> searchApplicantByName(String name);
    Collection<Applicant> searchApplicantByPhoneNumber(String phoneNumber);
    Collection<Applicant> searchApplicantById(int id);
    Collection<Applicant> searchApplicantsByDegree(Degree degree);
    Collection<Applicant> searchApplicantsByAddress(String address);

}
