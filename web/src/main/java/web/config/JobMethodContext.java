package web.config;

import hu.iit.me.dao.JobDAO;
import hu.iit.me.dao.JobDAOImp;
import hu.iit.me.service.JobsManager;
import hu.iit.me.service.JobsManagerImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobMethodContext {

    @Bean
    public JobsManager jobsManager() {
        return new JobsManagerImp();
    }

    @Bean
    public JobDAO jobDAO() {
        return new JobDAOImp();
    }

}
