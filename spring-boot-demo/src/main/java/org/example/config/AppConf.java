package org.example.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {

    //使用Tomcat服务器,并设置端口为8081
    /*@Bean
    public TomcatServletWebServerFactory servletWebServerFactory(){
        TomcatServletWebServerFactory tomcatServletWebServerFactory=new TomcatServletWebServerFactory();
        tomcatServletWebServerFactory.setPort(8081);
        return tomcatServletWebServerFactory;
    }*/

    //更换内嵌web服务器,默认加载Tomcat
    //替换流程(以jetty为例),先在pom中exculde Tomcat,再添加jetty依赖
    //spring-boot支持更换 jetty,tomcat,undertom
    @Bean
    public WebServerFactoryCustomizer customizer(){
        WebServerFactoryCustomizer customizer=new WebServerFactoryCustomizer() {
            @Override
            public void customize(WebServerFactory factory) {


            }
        };
    }
}
