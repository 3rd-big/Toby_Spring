package com.example.chap01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class CountingDaoFactory {

    @Bean
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setDataSource(dataSource());
        return userDao;
    }

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(oracle.jdbc.driver.OracleDriver.class);
        dataSource.setUrl("jdbc:oracle:thin:@192.168.55.10:11521:direadb");
        dataSource.setUsername("study");
        dataSource.setPassword("1234");

        return dataSource;
    }

//    @Bean
//    public ConnectionMaker connectionMaker() {
//        return new CountingConnectionMaker(realConnectionMaker());
//    }

//    @Bean
//    public ConnectionMaker realConnectionMaker() {
//        return new DConnectionMaker();
//    }
}
