package hu.iit.me.controller;

import hu.iit.me.dto.ApplicantType;
import hu.iit.me.exceptions.NotFoundException;
import hu.iit.me.model.Applicant;
import hu.iit.me.model.Degree;
import hu.iit.me.service.ApplicantsManager;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("/applicant")
public class ApplicantController {

    private ApplicantsManager applicantsManager;

    public ApplicantController(ApplicantsManager applicantsManager) {
        this.applicantsManager = applicantsManager;
    }

    @RequestMapping(value="/listAll", method = RequestMethod.GET)
    @ResponseBody
    public Collection<ApplicantType> listAllApplicants() {
        Collection<Applicant> applicants = applicantsManager.listAllApplicants();
        return DTOConverter.applicantConverter(applicants);
    }

    @RequestMapping(value="/listByName", method = RequestMethod.GET)
    @ResponseBody
    public Collection<ApplicantType> listApplicantByName(@RequestParam(value = "name") String name) throws NotFoundException {
        Collection<Applicant> applicants = applicantsManager.findApplicantByName(name);
        return DTOConverter.applicantConverter(applicants);
    }

    @RequestMapping(value="/listById", method = RequestMethod.GET)
    @ResponseBody
    public Collection<ApplicantType> listApplicantById(@RequestParam(value = "id") int id) throws NotFoundException {
        Collection<Applicant> applicants = applicantsManager.findApplicantById(id);
        return DTOConverter.applicantConverter(applicants);
    }

    @RequestMapping(value="/listByDegree", method = RequestMethod.GET)
    @ResponseBody
    public Collection<ApplicantType> listApplicantByDegree(@RequestParam(value = "degree") String degree) throws NotFoundException {
        Collection<Applicant> applicants = applicantsManager.listApplicantsByDegree(degree);
        return DTOConverter.applicantConverter(applicants);
    }

    @RequestMapping(value="/listByAddress", method = RequestMethod.GET)
    @ResponseBody
    public Collection<ApplicantType> listApplicantByAddress(@RequestParam(value = "address") String address) throws NotFoundException {
        Collection<Applicant> applicants = applicantsManager.listApplicantsByAddress(address);
        return DTOConverter.applicantConverter(applicants);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = {NotFoundException.class})
    public void exceptionHandler() {}

}
