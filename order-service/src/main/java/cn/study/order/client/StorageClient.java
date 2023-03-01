package cn.study.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @Author dinny-xu
 *  Storage 服务
 * @Date 2022/9/15
 * @Time 3:32 下午
 */
@FeignClient("storage-service")
public interface StorageClient {

    /**
     * 扣减库存
     * @param code 商品编号
     * @param count 要扣减的数量
     */
    @PutMapping("/storage/{code}/{count}")
    void deduct(@PathVariable("code") String code, @PathVariable("count") Integer count);
}
