package web.config;

import hu.iit.me.dao.ApplicantDAO;
import hu.iit.me.dao.ApplicantDAOImp;
import hu.iit.me.service.ApplicantsManager;
import hu.iit.me.service.ApplicantsManagerImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicantMethodContext {

    @Bean
    public ApplicantsManager applicantsManager() {
        return new ApplicantsManagerImp();
    }

    @Bean
    public ApplicantDAO applicantDAO() {
        return new ApplicantDAOImp();
    }

}
