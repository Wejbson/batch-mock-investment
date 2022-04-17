package com.wejbsom.batchmockinvestment;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableBatchProcessing
@SpringBootApplication
public class BatchMockInvestmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchMockInvestmentApplication.class, args);
    }

}
