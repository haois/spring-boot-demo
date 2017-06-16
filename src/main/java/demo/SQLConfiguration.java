package demo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Created by haol on 2017/4/16.
 */
@Configuration
public class SQLConfiguration {

        //DataSource配置
        @Bean
        @ConfigurationProperties(prefix = "spring.datasource")
        public DataSource dataSource() {
                return new DataSource();
        }

        //提供SqlSeesion
        @Bean
        public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
                SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
                sqlSessionFactoryBean.setDataSource(dataSource());
                PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
                //sqlSessionFactoryBean.setMapperLocations(resolver.getResources("demo.module.*.dao.mapper"));
                return sqlSessionFactoryBean.getObject();
        }
        @Bean
        public PlatformTransactionManager transactionManager() {
                return new DataSourceTransactionManager(dataSource());
        }
}
