package com.osiykm.test.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by osiykm on 09.09.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.osiykm.test.server.*")
public class WebConfig {

}
