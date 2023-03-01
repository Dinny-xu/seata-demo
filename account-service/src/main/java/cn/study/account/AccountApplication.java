package cn.study.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:30 下午
 */
@MapperScan("cn.study.account.mapper")
@SpringBootApplication
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
