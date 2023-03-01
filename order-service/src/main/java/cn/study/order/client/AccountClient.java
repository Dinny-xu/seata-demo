package cn.study.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:32 下午
 */
@FeignClient("account-service")
public interface AccountClient {

    @PutMapping("/account/{userId}/{money}")
    void debit(@PathVariable("userId") String userId, @PathVariable("money") Integer money);
}
