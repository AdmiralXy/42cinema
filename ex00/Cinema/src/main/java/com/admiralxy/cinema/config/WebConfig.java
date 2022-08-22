package com.admiralxy.cinema.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@ComponentScan("com.admiralxy.cinema")
public class WebConfig extends WebMvcConfigurationSupport {
    @Bean
    public FreeMarkerViewResolver freemarkerViewResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
        resolver.setCache(true);
        resolver.setPrefix("");
        resolver.setSuffix(".ftl");
        return resolver;
    }

    @Bean
    public FreeMarkerConfigurer freemarkerConfig() {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/ftl/");
        return freeMarkerConfigurer;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/ico/").setCachePeriod(31556926);
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/").setCachePeriod(31556926);
        registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/img/").setCachePeriod(31556926);
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/").setCachePeriod(31556926);
    }
}
