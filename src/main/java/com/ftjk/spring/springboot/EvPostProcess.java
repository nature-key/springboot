package com.ftjk.spring.springboot;

import com.sun.xml.internal.stream.buffer.sax.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EvPostProcess implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {


        try (InputStream input = new FileInputStream("/Users/anfu/git/springboot.properties")) {
            java.util.Properties source = new java.util.Properties();
            source.load(input);
            PropertiesPropertySource propertySource = new PropertiesPropertySource("my", source);
            environment.getPropertySources().addLast(propertySource);
        } catch (IOException e) {
            e.printStackTrace();

        }


    }


}
