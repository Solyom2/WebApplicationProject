package hu.iit.me.dao;

import hu.iit.me.model.Applicant;
import hu.iit.me.model.Degree;

import java.util.ArrayList;
import java.util.Collection;

public class ApplicantDAOImp implements ApplicantDAO {

    private Collection<Applicant> applicants = new ArrayList<>();

    public ApplicantDAOImp() {
        Applicant applicant1 = new Applicant(1, "Kovács Béla", 40, "Miskolc", Degree.HIGH_SCHOOL, "06701234567");
        Applicant applicant2 = new Applicant(2, "Szabó jános", 35, "Ózd", Degree.UNIVERSITY, "06301357900");
        Applicant applicant3 = new Applicant(3, "Nagy Géza", 23, "Budapest", Degree.PRIMARY_SCHOOL, "201002000");

        applicants.add(applicant1);
        applicants.add(applicant2);
        applicants.add(applicant3);
    }

    @Override
    public Collection<Applicant> searchAllApplicants() {
        return this.applicants;
    }

    @Override
    public Collection<Applicant> searchApplicantByName(String name) {
        return this.applicants;
    }

    @Override
    public Collection<Applicant> searchApplicantByPhoneNumber(String phoneNumber) {
        return this.applicants;
    }

    @Override
    public Collection<Applicant> searchApplicantById(int id) {
        return this.applicants;
    }

    @Override
    public Collection<Applicant> searchApplicantsByDegree(Degree degree) {
        return this.applicants;
    }

    @Override
    public Collection<Applicant> searchApplicantsByAddress(String address) {
        return this.applicants;
    }

}
