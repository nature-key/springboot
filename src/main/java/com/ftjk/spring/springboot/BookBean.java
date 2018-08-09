package com.ftjk.spring.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "ds")
public class BookBean {
    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "list=" + list +
                ", str=" + Arrays.toString(str) +
                '}';
    }

    private List<String>  list = new ArrayList<>();
    private String[] str;
}
