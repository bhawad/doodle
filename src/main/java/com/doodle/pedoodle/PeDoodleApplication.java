package com.doodle.pedoodle;

import com.doodle.pedoodle.model.Participant;
import com.doodle.pedoodle.model.Poll;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;

import javax.annotation.PostConstruct;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

@SpringBootApplication
public class PeDoodleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeDoodleApplication.class, args);
    }


    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    /**
     * Configure the rest repository to show Ids
     */
    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return RepositoryRestConfigurer.withConfig(config -> config.exposeIdsFor(Participant.class, Poll.class));
    }


}
