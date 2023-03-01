package cn.study.account.config;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import io.seata.rm.datasource.DataSourceProxy;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * SQL拦截器
 * @Author dinny-xu
 * @Date 2022/9/15
 * @Time 3:21 下午
 */
@Configuration
public class DataSourceProxyConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
        // 订单服务中引入了mybatis-plus，所以要使用特殊的SqlSessionFactoryBean
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        // 代理数据源
        sqlSessionFactoryBean.setDataSource(new DataSourceProxy(dataSource));
        // 生成SqlSessionFactory
        return sqlSessionFactoryBean.getObject();
    }
}