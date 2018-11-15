package web.config;

import hu.iit.me.controller.JobController;
import hu.iit.me.service.JobsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan
public class JobContext {

    private final JobsManager jobsManager;

    @Autowired
    public JobContext(JobsManager jobsManager) {
        this.jobsManager = jobsManager;
    }

    @Bean
    public JobController jobController() {
        return new JobController(jobsManager);
    }

}
