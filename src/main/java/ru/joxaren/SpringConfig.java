package ru.joxaren;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.joxaren")
@PropertySource("classpath:musicPlayer.properties")

public class SpringConfig {
}
