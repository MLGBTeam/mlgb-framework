package cn.mlgbteam.web;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author lujunfeng00
 */
@Configuration
@ComponentScan(basePackages = {
    "cn.mlgbteam.**.controller",
    "cn.mlgbteam.**.service",
    "cn.mlgbteam.**.dao"})
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
    converters.add(converter);
  }

}
