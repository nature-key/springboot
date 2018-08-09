package com.ftjk.spring.springboot;

import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootConfiguration
public class MyConfig {
    @Bean
    public Runnable createRunable(){
        System.out.println("==================");
        return ()->{
            System.out.println("==================");
        };
    }
    @Bean
    @Profile("dev")
    public Runnable createRunable1(){
        System.out.println("=========1=========");
        return ()->{
            System.out.println("=========1=========");
        };
    }
    @Bean
    @Profile("test")
    public Runnable createRunable2(){
        System.out.println("========2==========");
        return ()->{
            System.out.println("========2==========");
        };
    }
}
