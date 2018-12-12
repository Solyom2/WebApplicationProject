package hu.iit.me.service;

import hu.iit.me.dao.ApplicantDAO;
import hu.iit.me.exceptions.NotFoundException;
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
    }

    @Override
    public Collection<Applicant> findApplicantByName(String name) throws NotFoundException {
        return applicantDAO.searchApplicantByName(name);
    }

    @Override
    public Collection<Applicant> findApplicantById(int id) throws NotFoundException {
        return applicantDAO.searchApplicantById(id);
    }

    @Override
    public Collection<Applicant> listApplicantsByDegree(String degree) throws NotFoundException {
        return applicantDAO.searchApplicantsByDegree(degree);
    }

    @Override
    public Collection<Applicant> listApplicantsByAddress(String address) throws NotFoundException {
        return applicantDAO.searchApplicantsByAddress(address);
    }

}
