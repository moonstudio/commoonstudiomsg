package com.moonstudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
//(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
//@EnableJpaRepositories("com.moonstudio")
//@EntityScan("com.moonstudio.pojo")
@SpringBootApplication
@EnableCaching
public class MsgApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsgApplication.class, args);
    }
}
