package cn.study.storage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:33 下午
 */
@Data
@TableName("storage_tbl")
public class Storage {
    @TableId
    private Long id;
    private String commodityCode;
    private Integer count;
}
