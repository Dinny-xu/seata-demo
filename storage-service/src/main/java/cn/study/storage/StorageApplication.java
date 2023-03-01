package cn.study.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:34 下午
 */
@MapperScan("cn.study.storage.mapper")
@SpringBootApplication
public class StorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class, args);
    }
}
