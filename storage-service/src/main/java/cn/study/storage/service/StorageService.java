package cn.study.storage.service;

public interface StorageService{

    /**
     * 扣除存储数量
     * @param commodityCode 商品编码
     * @param count
     */
    void deduct(String commodityCode, int count);
}