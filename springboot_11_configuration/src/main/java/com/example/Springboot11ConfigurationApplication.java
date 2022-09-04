package com.example;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.config.ServletConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ServletConfig.class)
//@EnableConfigurationProperties({ServletConfig.class,abc.class})
/**@EnableConfigurationProperties
 *
 *      相当于对第三方Bean对象配置的声明，里面放的就是需要使用springboot来进行
 *      配置的，可以是多个文件
 * 注：
 * TODO
 *     一旦在这里声明某个文件的配置后，该文件的上面就不需要再加注解@Component了
 *     该注解会将文件自动加入spring容器中进行管理，重复添加会报错
 */
public class Springboot11ConfigurationApplication {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DruidDataSource dataSource(){

        DruidDataSource dataSource = new DruidDataSource();

        return dataSource;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Springboot11ConfigurationApplication.class, args);
        ServletConfig bean = ctx.getBean(ServletConfig.class);
        System.out.println(bean);
        DruidDataSource druidDataSource = ctx.getBean(DruidDataSource.class);
        System.out.println(druidDataSource.getDriverClassName());
    }

}
