package tr.gov.tpe.base;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tr.gov.tpe.base.service.RoleManagementService;
import tr.gov.tpe.base.service.UserService;

@Configuration
@ComponentScan(basePackages = {"tr.gov.tpe.base.controller"})
public class TestConfig {
  private String utf8 = "UTF-8";

  @Bean
  public RoleManagementService roleManagementService() {
    return Mockito.mock(RoleManagementService.class);
  }
  @Bean
  public UserService userService() {
    return Mockito.mock(UserService.class);
  }
}
