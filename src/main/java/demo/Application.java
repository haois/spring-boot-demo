package demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by ZengYan on 2017/3/12.
 */


@SpringBootApplication
@MapperScan("demo.module.*.dao.mapper")
public class Application  extends SpringBootServletInitializer {


        public static void main(String[] args) {
                SpringApplication.run(Application.class, args);
        }


                /*实现   implements EmbeddedServletContainerCustomizer 接口增加以下代码
                                      即可更改tomcat端口 ，或者在application.properties 中增加 server.port=8080   */
//        @Override
//        public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
//                configurableEmbeddedServletContainer.setPort(8090);
//        }


        //     extends SpringBootServletInitializer
        //     implements EmbeddedServletContainerCustomizer

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
                return application.sources(Application.class);
        }

}
