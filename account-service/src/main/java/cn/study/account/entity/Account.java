package cn.study.account.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:22 下午
 */
@Data
@TableName("account_tbl")
public class Account {
    @TableId
    private Long id;
    private String userId;
    private Integer money;
}
