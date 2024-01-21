package com.atguigu.admin.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.stat.DruidStatManagerFacade;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;

//@Configuration
public class MyDataSourceConfig {

//    @ConfigurationProperties("spring.datasource")
//    @Bean
//    public DataSource dataSource() throws SQLException {
//
//         DruidDataSource druidDataSource = new DruidDataSource();
//
//         //加入监控功能
//        druidDataSource.setFilters("stat");
//         return druidDataSource;
//    }

    /**
     * 配置druid的监控页功能
     * springboot版本3和druid不兼容，StatViewServlet在druid的javax包下，在spring boot的Jakarta包下
     */
//    @Bean
//    public ServletRegistrationBean statViewServlet(){
//
//        StatViewServlet statViewServlet = new StatViewServlet();
//        ServletRegistrationBean<StatViewServlet> registrationBean;
//        registrationBean = new ServletRegistrationBean<StatViewServlet>(statViewServlet, "/druid/*");
//        return registrationBean;
//    }

}

