package hu.iit.me.controller;


import hu.iit.me.model.Applicant;
import hu.iit.me.service.ApplicantsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Collection<Applicant> listAllApplicants() {
        return applicantsManager.listAllApplicants();
    }

    @RequestMapping(value="/listByName", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Applicant> listApplicantByName(@RequestParam(value = "name") String name) {
        return applicantsManager.findApplicantByName(name);
    }

}
