package com.raves.demo.config;//package com.raves.demo.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan("web.controller")
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/WEB-INF/pages/**").addResourceLocations("/pages/");
//    }
//
//    @Bean
//    public InternalResourceViewResolver setupViewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/pages/");
//        resolver.setSuffix(".jsp");
//        resolver.setViewClass(JstlView.class);
//        return resolver;
//    }
////    @Bean
////    @Description("Thymeleaf Template Resolver")
////    public ServletContextTemplateResolver templateResolver() {
////        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
////        templateResolver.setPrefix("/WEB-INF/views/");
////        templateResolver.setSuffix(".html");
////        templateResolver.setTemplateMode("HTML5");
////
////        return templateResolver;
////    }
////
////    @Bean
////    @Description("Thymeleaf Template Engine")
////    public SpringTemplateEngine templateEngine() {
////        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
////        templateEngine.setTemplateResolver(templateResolver());
////        templateEngine.setTemplateEngineMessageSource(messageSource());
////        return templateEngine;
////    }
////@Bean
////@Description("Thymeleaf View Resolver")
////public ThymeleafViewResolver viewResolver() {
////    ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
////    viewResolver.setTemplateEngine(templateEngine());
////    viewResolver.setOrder(1);
////    return viewResolver;
////}
//}
