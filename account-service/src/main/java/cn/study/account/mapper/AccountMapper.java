package cn.study.account.mapper;

import cn.study.account.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:22 下午
 */
public interface AccountMapper extends BaseMapper<Account> {

    @Update("update account_tbl set money = money - ${money} where user_id = #{userId}")
    int debit(@Param("userId") String userId, @Param("money") int money);
}
