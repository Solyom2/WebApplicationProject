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
        Applicant applicant4 = new Applicant(4, "Horváth Róbert", 30, "Miskolc", Degree.UNIVERSITY, "205456565");

        applicants.add(applicant1);
        applicants.add(applicant2);
        applicants.add(applicant3);
        applicants.add(applicant4);
    }

    @Override
    public Collection<Applicant> searchAllApplicants() {
        return this.applicants;
    }

    @Override
    public Collection<Applicant> searchApplicantByName(String name) {
        ArrayList<Applicant> results = new ArrayList<>();
        for(Applicant a : applicants) {
            if(name.equals(a.getName())) results.add(a);
        }
        return results;
    }

    @Override
    public Collection<Applicant> searchApplicantById(int id) {
        ArrayList<Applicant> results = new ArrayList<>();
        for(Applicant a : applicants) {
            if(id == a.getId()) results.add(a);
        }
        return results;
    }

    @Override
    public Collection<Applicant> searchApplicantsByDegree(String degree) {
        ArrayList<Applicant> results = new ArrayList<>();
        for(Applicant a : applicants) {
            Degree d = Degree.valueOf(degree);
            if(d == a.getDegree()) results.add(a);
        }
        return results;
    }

    @Override
    public Collection<Applicant> searchApplicantsByAddress(String address) {
        ArrayList<Applicant> results = new ArrayList<>();
        for(Applicant a : applicants) {
            if(address.equals(a.getAddress())) results.add(a);
        }
        return results;
    }

}
