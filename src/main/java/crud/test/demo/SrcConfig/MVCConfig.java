package crud.test.demo.SrcConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: ${Lime}
 * @Date: 2018/10/24 22:03
 * @Description:
 */
@Configuration
public class MVCConfig implements WebMvcConfigurer {

  @Override
  //统一管理无逻辑页面跳转
  public void addViewControllers(ViewControllerRegistry registry){
    registry.addViewController("/heard").setViewName("heard");
    registry.addViewController("/insert").setViewName("insert");
    registry.addViewController("/fdelete").setViewName("fdelete");
    registry.addViewController("/update").setViewName("update");
    registry.addViewController("/login").setViewName("login");
    registry.addViewController("/registered").setViewName("registered");
  }
}
