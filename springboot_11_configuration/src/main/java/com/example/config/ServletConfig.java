package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

//@Component
//在@EnableConfigurationProperties中添加该对象后，就不再需要该注解了
@Data
/*开启对属性值的校验功能，可以在属性上添加专属注解，但是pom中需要添加对应的校验器和hibernate框架*/
@Validated

@ConfigurationProperties(prefix ="servers")
/**
 * 第三方bean属性绑定
 * 可以将当前bean文件的各属性与yml文件中的某项进行绑定
 * 需要 TODO:  @ConfigurationProperties(prefix ="servers")
 */
public class ServletConfig {

    private String ipAddress;

    @Max(value = 8888,message = "最大值不能超过8888")
    private int port;

    private long time;
//    JDK8提供的新的时间单位，可以自定义时间的计量单位
    @DurationUnit(ChronoUnit.HOURS)
    private Duration serverTimeout;
//    类似的存储容量计量单位
    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize dataSize;

    private String passwd;
}
