package com.dynamic.datasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.*"})
public class DymamicApplication {

    public static void main(String[] args) {
        SpringApplication.run(DymamicApplication.class);
    }
}
