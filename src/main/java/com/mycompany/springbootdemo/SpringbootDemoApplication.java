package com.mycompany.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author yp
 */
@SpringBootApplication
public class SpringbootDemoApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(SpringbootDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    @Override
    public void run(String... args)  {
        logger.info("程序启动！");
        logger.info("更新1");
        logger.info("创建分支：Feature-A");
        logger.info("主干添加");
        logger.info("分支添加！");
    }
}
