package cn.study.storage.service.impl;

import cn.study.storage.mapper.StorageMapper;
import cn.study.storage.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:34 下午
 */
@Slf4j
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Transactional
    @Override
    public void deduct(String commodityCode, int count) {
        log.info("开始扣减库存");
        try {
            storageMapper.deduct(commodityCode, count);
        } catch (Exception e) {
            throw new RuntimeException("扣减库存失败，可能是库存不足！");
        }
        log.info("扣减库存成功");
    }
}
