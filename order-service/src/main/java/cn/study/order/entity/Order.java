package cn.study.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:32 下午
 */
@Data
@TableName("order_tbl")
public class Order {

    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 商品编码
     */
    private String commodityCode;
    /**
     * 商品库存
     */
    private Integer count;
    /**
     * 商品金额
     */
    private Integer money;
}
