package com.raves.demo.config;//package com.raves.demo.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import web.model.Role;
//import web.model.User;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//@PropertySource("classpath:db.properties")
//@EnableTransactionManagement
//@ComponentScan("web")
//public class HibernateConfig {
//    private Environment environment;
//
//    @Autowired
//    public void setEnvironment(Environment environment){
//        this.environment = environment;
//    }
//
//    @Bean
//    public DataSource getDataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(environment.getProperty("db.driver"));
//        dataSource.setUrl(environment.getProperty("db.url"));
//        dataSource.setUsername(environment.getProperty("db.username"));
//        dataSource.setPassword(environment.getProperty("db.password"));
//        return dataSource;
//    }
//
//    @Bean
//    public Properties getProperties(){
//        Properties properties = new Properties();
//        properties.getProperty("hibernate.show_sql",environment.getProperty("hibernate.show_sql"));
//        properties.getProperty("hibernate.hbm2ddl.auto",environment.getProperty("hibernate.hbm2ddl.auto"));
//        properties.getProperty("hibernate.dialect",environment.getProperty("hibernate.dialect"));
//        properties.getProperty("hibernate.format_sql",environment.getProperty("hibernate.format_sql"));
//        return properties;
//    }
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactoryBean(){
//        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
//        sessionFactoryBean.setDataSource(getDataSource());
//        sessionFactoryBean.setHibernateProperties(getProperties());
//        sessionFactoryBean.setAnnotatedClasses(User.class, Role.class);
//        return sessionFactoryBean;
//    }
//    @Bean
//    public HibernateTransactionManager getTransactionManager(){
//        HibernateTransactionManager manager = new HibernateTransactionManager();
//        manager.setSessionFactory(sessionFactoryBean().getObject());
//        return manager;
//    }
//}
