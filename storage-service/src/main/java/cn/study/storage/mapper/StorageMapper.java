package cn.study.storage.mapper;

import cn.study.storage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:33 下午
 */
public interface StorageMapper extends BaseMapper<Storage> {

    /**
     * 扣除存储数量
     *
     * @param commodityCode 商品编码
     * @param count         商品库存
     * @return 影响行数
     */
    @Update("update storage_tbl set `count` = `count` - #{count} where commodity_code = #{code}")
    int deduct(@Param("code") String commodityCode, @Param("count") int count);
}
