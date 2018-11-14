package web.config;

import hu.iit.me.controller.ApplicantController;
import hu.iit.me.service.ApplicantsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan
public class ApplicantContext {

    private final ApplicantsManager applicantsManager;

    @Autowired
    public ApplicantContext(ApplicantsManager applicantsManager) {
        this.applicantsManager = applicantsManager;
    }

    @Bean
    public ApplicantController applicantController() {
        return new ApplicantController(applicantsManager);
    }

}
