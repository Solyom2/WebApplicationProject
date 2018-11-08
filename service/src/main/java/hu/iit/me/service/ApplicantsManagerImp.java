package hu.iit.me.service;

import hu.iit.me.dao.ApplicantDAO;
import hu.iit.me.model.Applicant;
import hu.iit.me.model.Degree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ApplicantsManagerImp implements ApplicantsManager {

    @Autowired
    private ApplicantDAO applicantDAO;

    @Override
    public Collection<Applicant> listAllApplicants() {
        return applicantDAO.searchAllApplicants();
    };

    @Override
    public Collection<Applicant> findApplicantByName(String name) {
        return applicantDAO.searchApplicantByName(name);
    }

    @Override
    public Collection<Applicant> findApplicantByPhoneNumber(String phoneNumber) {
        return applicantDAO.searchApplicantByPhoneNumber(phoneNumber);
    }

    @Override
    public Collection<Applicant> findApplicantById(int id) {
        return applicantDAO.searchApplicantById(id);
    }

    @Override
    public Collection<Applicant> listApplicantsByDegree(Degree degree) {
        return applicantDAO.searchApplicantsByDegree(degree);
    }

    @Override
    public Collection<Applicant> listApplicantsByAddress(String address) {
        return applicantDAO.searchApplicantsByAddress(address);
    }

}
