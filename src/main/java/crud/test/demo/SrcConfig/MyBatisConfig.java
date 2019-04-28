package crud.test.demo.SrcConfig;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * @Auther: ${Lime}
 * @Date: 2018/10/24 20:22
 * @Description: 自动转换驼峰模式
 */
@Configuration
public class MyBatisConfig {

  @Bean
  public ConfigurationCustomizer getCustomizer(){
    return new ConfigurationCustomizer() {
      @Override
      public void customize(org.apache.ibatis.session.Configuration configuration) {
        configuration.setMapUnderscoreToCamelCase(true);
        //自动转换成驼峰模式
      }
    };
  }

}
